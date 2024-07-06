package exam01.member.services;

import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    @Autowired
    private MemberDao memberDao;

    public void printMemberInfo() {
        List<Member> members = memberDao.getList();
        for(Member member : members) {
            System.out.println(member);
        }
    }
}
