package com.mybatisplusvisitmysql.controller;


import com.mybatisplusvisitmysql.entity.User;
import com.mybatisplusvisitmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tiga
 * @since 2021-06-30
 */
//@Controller 用@RestController
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list(){
    	return userService.list();
    }

}

