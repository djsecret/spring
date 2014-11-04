package com.neu.client;

import com.neu.computor.Computor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by djsecret on 14-10-27.
 */
public class Client
{
    private Computor computor;

    public Client()
    {}

    public Client(Computor computor)
    {
        this.computor = computor;
    }

    public int compute(int n1, int n2)
    {
        return computor.compute(n1,n2);
    }

}
