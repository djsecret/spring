package com.neu.annotation.dao;

import com.neu.annotation.pojo.User;

/**
 * Created by djsecret on 14-10-29.
 */
public interface MyDAO
{
    User findUserByID(int id);
}
