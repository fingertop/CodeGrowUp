package com.ldap;

import com.ldap.mapper.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LdapApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void findAll() {

        personRepository.findAll().forEach(p -> {
            System.out.println(p);
        });

    }


}
