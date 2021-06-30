package com.mybatisplusvisitmysql.service.impl;

import com.mybatisplusvisitmysql.entity.User;
import com.mybatisplusvisitmysql.mapper.UserMapper;
import com.mybatisplusvisitmysql.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tiga
 * @since 2021-06-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
