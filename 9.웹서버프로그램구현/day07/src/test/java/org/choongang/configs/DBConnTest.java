package org.choongang.configs;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DBConnTest {

    @Test
    @DisplayName("DB 연결 테스트")
    void dbConnectionTest() {
        assertDoesNotThrow(() -> {
            SqlSession session = DBConn.getSession();
            System.out.println(session);
        });
    }
    @Test
    @DisplayName("DB 연결 테스트 2")
    void dbConnectionTest2() {
        assertDoesNotThrow(()-> {
            SqlSession session = DBConn.getSession(false);
        });
    }
}
