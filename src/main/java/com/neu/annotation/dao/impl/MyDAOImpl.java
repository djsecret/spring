package com.neu.annotation.dao.impl;

import com.neu.annotation.dao.MyDAO;
import com.neu.annotation.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by djsecret on 14-10-29.
 */
@Repository("myDAO")
public class MyDAOImpl implements MyDAO
{
    @Override
    public User findUserByID(int id)
    {
        User user = null;
        if(1 == id)
        {
            user = new User();
            user.setId(id);
            user.setUsername("a");
        }
        return user;
    }
}
