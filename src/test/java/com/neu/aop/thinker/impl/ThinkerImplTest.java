package com.neu.aop.thinker.impl;

import com.neu.aop.mindreader.MindReader;
import com.neu.aop.thinker.Thinker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ThinkerImplTest
{

    @Test
    public void testThinking() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Thinker thinker = (Thinker)context.getBean("thinker");
        thinker.thinking("loving");
        MindReader mindReader = (MindReader)context.getBean("mindreader");
        assertEquals("loving",mindReader.getThoughts());
    }
}