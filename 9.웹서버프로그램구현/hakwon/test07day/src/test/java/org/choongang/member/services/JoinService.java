package org.choongang.member.services;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mapper.MemberMapper;

public class JoinService {

    Validator<RequestJoin> validator;
    MemberMapper mapper;
    Member member;

    public JoinService(Validator<RequestJoin> validator, MemberMapper mapper) {
        this.validator = validator;
        this.mapper = mapper;
    }

    public void process(RequestJoin form) {
        validator.check(form);
        mapper.register(member);

    }
}
