package com.neu.annotation.action;

import com.neu.annotation.service.MyService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by djsecret on 14-10-29.
 */
@Controller("loginAction")
public class LoginAction
{
    @Resource(name = "myService")
    private MyService myService;

    /**
     *
     * @return 在Juggler中使用SpEL时，需要获得
     */
    public MyService getMyService()
    {
        return myService;
    }

    public String execute()
    {
        if(myService.login(2))
        {
            return "success";
        }
        else
        {
            return "input";
        }
    }
}
