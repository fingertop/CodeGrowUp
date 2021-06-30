package com.springdatajpadatasources;

import com.springdatajpadatasources.primary.entity.User;
import com.springdatajpadatasources.primary.mapper.UserRepository;
import com.springdatajpadatasources.secondary.entity.Message;
import com.springdatajpadatasources.secondary.mapper.MessageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDataJpaDataSourcesApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void test() throws Exception {
        userRepository.save(new User("aaa", 10));
        userRepository.save(new User("bbb", 20));
        userRepository.save(new User("ccc", 30));
        userRepository.save(new User("ddd", 40));
        userRepository.save(new User("eee", 50));

        Assert.assertEquals(5, userRepository.findAll().size());

        messageRepository.save(new Message("o1", 11));
        messageRepository.save(new Message("o2", 22));
        messageRepository.save(new Message("o3", 33));

        Assert.assertEquals(3, messageRepository.findAll().size());
    }

}
