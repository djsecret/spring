package com.neu.annotation.IoC;

import com.neu.annotation.service.MyService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by djsecret on 14-10-29.
 */
@Component
public class Juggler
{
    @Value("15")
    private int beanBags = 3;

    @Value("#{loginAction.myService}")
    private MyService myService;
    public Juggler()
    {}

    public Juggler(int beanBags)
    {
        this.beanBags = beanBags;
    }

    public void perform()
    {
        if(myService.login(1))
        {
            System.out.println("JUGGLING " + beanBags + " BEANBAGS");
        }
        else
        {
            System.out.println("Fail");
        }

    }
}
