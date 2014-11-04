package com.neu.aop.performer.impl;

import com.neu.aop.performer.Performer;
import org.springframework.stereotype.Component;

/**
 * Created by djsecret on 14-10-28.
 */
@Component("tom")
public class Tom implements Performer
{

    @Override
    public void perform()
    {
        try
        {
            Thread.sleep(50);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Tom play");
    }
}
