package exam01.member.services;

import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class InfoService {

    @Autowired
    private MemberDao memberDao;


    public void printMemberInfo() {
        List<Member> members = memberDao.getList();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd");

        members.forEach(m->{
            System.out.println(m.getRegDt().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            System.out.println(formatter.format(m.getRegDt()));
            System.out.println(m.getRegDt().format(formatter));
        });
    }
}
