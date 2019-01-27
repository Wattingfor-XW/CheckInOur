package io.xt.controller;

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
//    @GetMapping("/getById")
//    public User getUserByOpenId(String openId){
//        User user = userService.getById(openId);
//        return user;
//    }
}
