package org.choongang.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.choongang.member.entities.Member;

public class MemberUtil {
    public static boolean isLogin(HttpServletRequest request) {
        //Member member = (Member) request.getSession().getAttribute("member");
        //return member != null;
        return getMember(request) != null; //위 두줄과 동일
    }

    public static Member getMember(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        return member;
    }
}
