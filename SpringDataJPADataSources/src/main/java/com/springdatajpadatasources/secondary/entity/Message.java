package com.springdatajpadatasources.secondary.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Integer age;

    public Message(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}