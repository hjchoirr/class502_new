package org.choongang.member.mappers;

import org.choongang.config.MvcConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void test1() {
        long total = memberMapper.getTotal();
        System.out.println("total : " + total);
    }
}
