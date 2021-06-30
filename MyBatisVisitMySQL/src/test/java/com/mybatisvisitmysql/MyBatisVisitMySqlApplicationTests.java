package com.mybatisvisitmysql;

import com.mybatisvisitmysql.entity.User;
import com.mybatisvisitmysql.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisVisitMySqlApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    //@Transactional
    @Rollback
    public void test() throws Exception {
        userMapper.insert("AAA", 20);

        //Map<String, Object> map = new HashMap<>();
        //map.put("name", "AAA");
        //map.put("age", 20);
        //userMapper.insertByMap(map);

        //userMapper.insertByUser(new User("AAA", 20));

        User u = userMapper.findByName("AAA");
        Assert.assertEquals(20, u.getAge().intValue());
    }

    @Test
    @Rollback
    public void testUserMapper() throws Exception {
        // insert一条数据，并select出来验证
        userMapper.insert("AAA", 20);
        User u = userMapper.findByName("AAA");
        Assert.assertEquals(20, u.getAge().intValue());
        // update一条数据，并select出来验证
        u.setAge(30);
        userMapper.update(u);
        u = userMapper.findByName("AAA");
        Assert.assertEquals(30, u.getAge().intValue());
        // 删除这条数据，并select验证
        userMapper.delete(u.getId());
        u = userMapper.findByName("AAA");
        Assert.assertEquals(null, u);
    }

    @Test
    @Rollback
    public void testFindAll() throws Exception {
        List<User> userList = userMapper.findAll();
        for(User user : userList) {
            Assert.assertEquals(null, user.getId());
            Assert.assertNotEquals(null, user.getName());
        }
    }

}
