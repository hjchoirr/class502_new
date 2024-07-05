package exam01.member.services;

import exam01.member.controllers.RequestJoin;
import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import exam01.member.validators.JoinValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JoinService {
    private final JoinValidator validator;
    private final MemberDao memberDao;
    /*
    public JoinService(JoinValidator validator, MemberDao memberDao) {
        this.validator = validator;
        this.memberDao = memberDao;
    }
    */
    public void process(RequestJoin form) {
        validator.check(form);  //JoinService는 validator객체와 form 객체에 의존함

        //데이터 영구저장 - DAO Data Access Object : 매퍼
        Member member = Member.builder()
            .email(form.getEmail())
            .password(form.getPassword())
            .userName(form.getUserName())
            .regDt(form.getRegDt())
            .build();

        memberDao.register(member);

    }
}
