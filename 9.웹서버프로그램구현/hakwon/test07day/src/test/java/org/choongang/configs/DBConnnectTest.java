package org.choongang.configs;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DBConnnectTest {
    @Test
    @DisplayName("DB Connect Test")
    void dbConnectTest() {
        assertDoesNotThrow(()-> {
            SqlSession session = DBConn.getSqlSession();
            System.out.println(session);
        });
    }
    @Test
    @DisplayName("DB 연결 테스트 - autoCommit X")
    void dbConnectTest2() {
        assertDoesNotThrow(()-> {
            SqlSession session = DBConn.getSqlSession(false);
            System.out.println(session);
        });
    }

}
