package com.mybatisdatasources.primary.mapper;

import com.mybatisdatasources.primary.entity.UserPrimary;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

public interface UserMapperPrimary {

    @Select("SELECT * FROM User WHERE NAME = #{name}")
    UserPrimary findByName(@Param("name") String name);

    @Insert("INSERT INTO User(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Delete("DELETE FROM User")
    int deleteAll();

}