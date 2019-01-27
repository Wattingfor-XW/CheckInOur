package io.xt.controller;

import io.xt.po.User;
import io.xt.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("/selectUserById")
    public User getUserByOpenId(String openid){
        User user = userService.selectUserById(openid);
        return user;
    }
}
