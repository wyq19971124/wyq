package com.njxzc.controller;

import com.njxzc.entity.User;
import com.njxzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Context on 2019/3/8.
 */
@Controller
@RequestMapping("/wyqgym")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = "/detail")
    public String detail(Model model,
                         HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user;
        if (userName == null) {return "login";}
        if (userName.equals("admin")) {
            user = new User(userName, password);
            User u = userService.checkUser(user);
            if (u == null) {return "login";}
            model.addAttribute("user", u);
            request.getSession().setAttribute("user", u);
            return "admin/admin";
        } else {
            user = new User(userName, password);
            User u = userService.checkUser(user);
            if (u == null) {return "login";}
            model.addAttribute("user", u);
            request.getSession().setAttribute("user", u);
            return "content";
        }

    }
    @GetMapping(value = "/register")
    public String reg(Model model,
                         HttpServletRequest request) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        User user;
        return "register";
    }

}
