package com.mybatisdatasources.second.mapper;

import com.mybatisdatasources.second.entity.UserSecondary;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

public interface UserMapperSecondary {

    //@Select("SELECT * FROM User WHERE NAME = #{name}")
    UserSecondary findByName(@Param("name") String name);

    //@Insert("INSERT INTO User(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Delete("DELETE FROM User")
    int deleteAll();
}