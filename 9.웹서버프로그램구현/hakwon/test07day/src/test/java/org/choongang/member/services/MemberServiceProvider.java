package org.choongang.member.services;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.validators.JoinValidator;

public class MemberServiceProvider {
    private static MemberServiceProvider instance;

    private MemberServiceProvider() {}

    public static MemberServiceProvider getInstance() {
        if(instance == null) {
            instance = new MemberServiceProvider();
        }
        return instance;
    }

    JoinValidator joinValidator() {
        return new JoinValidator();
    }

    SqlSession getSqlSession() {
        return DBConn.getSqlSession();
    }
    MemberMapper memberMapper() {
        return getSqlSession().getMapper(MemberMapper.class);
    }

    JoinService joinservice() {

        return new JoinService(joinValidator(), memberMapper() );
    }
}
