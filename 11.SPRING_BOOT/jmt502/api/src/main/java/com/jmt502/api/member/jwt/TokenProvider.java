package com.jmt502.api.member.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@EnableConfigurationProperties(JwtProperties.class)
public class TokenProvider {
    public String CreateToken() {
        return null;
    }

    public Authentication getAuthentication(String token) {
        return null;
    }
    public void validToken(String token) {

    }
}
