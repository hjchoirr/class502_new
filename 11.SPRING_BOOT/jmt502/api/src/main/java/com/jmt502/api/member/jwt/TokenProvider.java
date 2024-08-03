package com.jmt502.api.member.jwt;

import com.jmt502.api.global.exceptions.UnAuthorizedException;
import com.jmt502.api.member.MemberInfo;
import com.jmt502.api.member.services.MemberInfoService;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
@RequiredArgsConstructor
@EnableConfigurationProperties(JwtProperties.class)
public class TokenProvider {

    private final JwtProperties properties;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final MemberInfoService memberInfoService;
    /**
     * @param email
     * @param password
     * @return
     */
    public String CreateToken(String email, String password) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(email, password);
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);

        //로그인 성공시 토큰 발급
        if(authentication != null && authentication.isAuthenticated() && authentication.getPrincipal() instanceof UserDetails) {
            long now = (new Date()).getTime();
            Date validity = new Date(now + properties.getValidSeconds() * 1000);
            return Jwts.builder().setSubject(authentication.getName())
                .signWith(getKey(), SignatureAlgorithm.HS512)// HMAC + SHA512
                .expiration(validity)
                .compact();
        }

        return null;
    }

    /**
     * @param token
     * @return
     */

    public Authentication getAuthentication(String token) {

        //토큰 검증
        validateToken(token);
        Claims claims = Jwts.parser()
            .setSigningKey(getKey())
            .build()
            .parseClaimsJws(token)
            .getPayload();

        String email = claims.getSubject();
        MemberInfo memberInfo = (MemberInfo)memberInfoService.loadUserByUsername(email);
        return new UsernamePasswordAuthenticationToken(memberInfo, token, memberInfo.getAuthorities());
    }

    /**
     * 토큰 유효성 검사
     * @param token
     */
    public void validateToken(String token) {
        String errorCode = null;

        try {
            Jwts.parser().setSigningKey(getKey()).build().parseClaimsJws(token).getPayload();
        }catch(io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {

            //위변조된 JWT 토큰이면
            errorCode = "Malformed.jwt";
            e.printStackTrace();

        }catch (ExpiredJwtException e) {
            // 유효 기간 만료된 토큰
            errorCode = "Expired.jwt";
            e.printStackTrace();

        } catch (UnsupportedJwtException e) {
            //지원 되지 않는 형식의 JWT 토큰
            errorCode = "Unsupported.jwt";
            e.printStackTrace();
        } catch (Exception e) {
            errorCode = "Exception.jwt";
            e.printStackTrace();
        }

        if (errorCode != null) {
            throw new UnAuthorizedException(errorCode);
        }
    }

    private Key getKey() {
        byte[] keyBytes = Decoders.BASE64.decode(properties.getSecret());
        return Keys.hmacShaKeyFor(keyBytes);  //데이터 위변조방지 위해
    }
}
