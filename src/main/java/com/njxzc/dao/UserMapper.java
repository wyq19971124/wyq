package com.njxzc.dao;

import com.njxzc.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * Created by Context on 2019/3/8.
 */
public interface UserMapper {
    User checkUser(@Param("user") User user);

}
