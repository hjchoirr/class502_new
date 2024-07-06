package exam01.member.dao;
import exam01.member.entities.Member;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MemberDao {

    private  Map<String, Member> members = new HashMap<>();

    public void register(Member member) {
        members.put(member.getEmail(), member);
    }
    public Member get(String email) {
        return members.get(email);
    }
    public List<Member> getList() {
        List<Member> lsit = new ArrayList<>(members.values());
        return lsit;
    }
}
