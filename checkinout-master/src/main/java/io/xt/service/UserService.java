package io.xt.service;


import io.xt.enumeration.CheckType;
import io.xt.po.User;

import java.util.Date;

public interface UserService {
    User selectUserById(String openid);
    void create(User user);
    void checkInOut(String openId, CheckType checkType, Date time);
}
