package com.mongodb.mapper;

import com.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}