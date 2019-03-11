package com.njxzc.service.impl;

import com.njxzc.dao.UserMapper;
import com.njxzc.entity.User;
import com.njxzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Context on 2019/3/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired(required=false)
    private UserMapper userMapper;

    @Override
    public User checkUser(User user) {
        return userMapper.checkUser(user);
    }
}
