package com.neu.aop.performer.impl;

import com.neu.aop.contestant.Contestant;
import com.neu.aop.performer.Performer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TomTest
{

    @Test
    public void testPerform() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Performer tom = (Performer)context.getBean("tom");
        tom.perform();
        Contestant contestant = (Contestant)context.getBean("tom");
        contestant.receiveAward();

    }
}