package com.mongodb;

import com.mongodb.entity.User;
import com.mongodb.mapper.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoDbApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        userRepository.deleteAll();

        // 创建三个User，并验证User总数
        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        Assert.assertEquals(3, userRepository.findAll().size());

        // 删除一个User，再验证User总数
        User u = userRepository.findById(1L).get();
        userRepository.delete(u);
        Assert.assertEquals(2, userRepository.findAll().size());

        // 删除一个User，再验证User总数
        u = userRepository.findByUsername("mama");
        userRepository.delete(u);
        Assert.assertEquals(1, userRepository.findAll().size());
    }

}
