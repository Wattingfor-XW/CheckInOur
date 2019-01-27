package io.xt.dao;

import io.xt.po.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User selectUserById(String openid);
}