package com.springdatajpadatasources.primary.mapper;

import com.springdatajpadatasources.primary.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}