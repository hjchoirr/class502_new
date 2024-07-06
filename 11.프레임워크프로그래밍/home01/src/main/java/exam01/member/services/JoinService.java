package exam01.member.services;

import exam01.member.controllers.RequestJoin;
import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import exam01.member.validators.JoinValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JoinService {
    @Autowired
    private JoinValidator validator;

    @Autowired
    private MemberDao memberDao;

    public void process(RequestJoin form){
        validator.check(form);

        Member member = Member.builder()
            .email(form.getEmail())
            .password(form.getPassword())
            .userName(form.getUserName())
            .regDt(form.getRegDt())
            .build();
        memberDao.register(member);
    }
}
