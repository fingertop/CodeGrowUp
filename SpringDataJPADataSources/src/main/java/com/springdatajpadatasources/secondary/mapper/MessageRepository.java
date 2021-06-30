package com.springdatajpadatasources.secondary.mapper;

import com.springdatajpadatasources.secondary.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {

}