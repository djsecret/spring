package com.neu.IoC.performer.impl;

import com.neu.IoC.performer.Performer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CollectionImplTest
{

    @Test
    public void testPerform() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");

        Performer performer = (Performer) context.getBean("collectionImpl");
        performer.perform();
    }
}