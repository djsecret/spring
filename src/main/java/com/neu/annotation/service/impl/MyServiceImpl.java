package com.neu.annotation.service.impl;

import com.neu.annotation.dao.MyDAO;
import com.neu.annotation.service.MyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by djsecret on 14-10-29.
 */
@Service("myService")
public class MyServiceImpl implements MyService
{
    @Resource(name = "myDAO")
    private MyDAO myDAO;
    @Override
    public boolean login(int id)
    {
        return null != myDAO.findUserByID(id);
    }
}
