package com.neu.annotation.action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class LoginActionTest
{

    @Test
    public void testExecute() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        LoginAction action = (LoginAction)context.getBean("loginAction");
        System.out.println(action.execute());
    }
}