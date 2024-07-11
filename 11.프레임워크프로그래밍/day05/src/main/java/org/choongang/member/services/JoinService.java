package org.choongang.member.services;


import lombok.RequiredArgsConstructor;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.choongang.member.validators.JoinValidator;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final JoinValidator validator;
    private final MemberMapper memberMapper;

    public void process(RequestJoin form) {
        validator.check(form);

        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));

        Member member = Member.builder().email(form.getEmail())
            .password(hash)
            .userName(form.getUserName())
            .build();
        int result = memberMapper.register(member);
        if(result < 1) {
            throw new BadRequestException("회원가입 실패!");
        }
    }
}
