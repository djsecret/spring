package com.neu.client;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ClientTest
{

    @Test
    public void testCompute() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
        Client client = (Client)context.getBean("client");
        System.out.println(client.compute(1,2));
    }
}