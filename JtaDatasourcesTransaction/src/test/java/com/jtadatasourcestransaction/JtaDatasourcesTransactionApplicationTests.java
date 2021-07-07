package com.jtadatasourcestransaction;

import com.jtadatasourcestransaction.service.TestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JtaDatasourcesTransactionApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    protected JdbcTemplate primaryJdbcTemplate;
    @Autowired
    protected JdbcTemplate secondaryJdbcTemplate;

    @Autowired
    private TestService testService;

    @Test
    public void test1() throws Exception {
        // 正确更新的情况
        testService.tx();
        Assert.assertEquals(30, primaryJdbcTemplate.queryForObject(
                "select age from newuser where name=?", Integer.class, "aaa").intValue());
        Assert.assertEquals(30, secondaryJdbcTemplate.queryForObject(
                "select age from newuser where name=?", Integer.class, "aaa").intValue());
    }

    @Test
    public void test2() throws Exception {
        // 更新失败的情况
        try {
            testService.tx2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 部分更新失败，test1中的更新应该回滚
            Assert.assertEquals(30, primaryJdbcTemplate.queryForObject(
                    "select age from newuser where name=?", Integer.class, "aaa").intValue());
            Assert.assertEquals(30, secondaryJdbcTemplate.queryForObject(
                    "select age from newuser where name=?", Integer.class, "aaa").intValue());
        }
    }

}
