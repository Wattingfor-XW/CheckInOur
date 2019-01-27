package io.xt.service.impl;

import io.xt.dao.UserMapper;
import io.xt.enumeration.CheckType;
import io.xt.po.User;
import io.xt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectUserById(String openid) {
        User user = userMapper.selectUserById(openid);
        return user;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void checkInOut(String openId, CheckType checkType, Date time) {

    }
}
