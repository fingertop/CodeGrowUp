package com.mybatisofxml.mapper;

import com.mybatisofxml.entity.User;
import org.apache.ibatis.annotations.Param;

//@Repository 推荐写 可读性高
public interface UserMapper {

    User findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);

}