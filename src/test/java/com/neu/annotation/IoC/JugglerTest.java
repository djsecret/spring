package com.neu.annotation.IoC;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerTest
{

    @Test
    public void testPerform() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Juggler juggler = (Juggler)context.getBean("juggler");
        juggler.perform();
    }
}