package com.ehcachecluster;

import com.ehcachecluster.entity.User;
import com.ehcachecluster.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableCaching
@SpringBootApplication
public class EhCacheClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhCacheClusterApplication.class, args);
    }

    @RestController
    static class HelloController {

        @Autowired
        private UserRepository userRepository;

        @GetMapping("/create")
        public void create() {
            userRepository.save(new User("AAA", 10));
        }

        @GetMapping("/find")
        public User find() {
            User u1 = userRepository.findByName("AAA");
            System.out.println("查询AAA用户：" + u1.getAge());
            return u1;
        }

    }

}
