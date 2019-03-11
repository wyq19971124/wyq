package com.njxzc.controller;

import com.njxzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Context on 2019/3/8.
 */
@Controller
@RequestMapping("/wyqgym")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "login")
    public String login() {
        return "login";
    }


}
