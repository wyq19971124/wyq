package com.njxzc.dao;

import com.njxzc.entity.User;
import org.springframework.stereotype.Component;

/**
 * Created by Context on 2019/3/8.
 */
@Component
public interface UserMapper {
    public String login(User user);

}
