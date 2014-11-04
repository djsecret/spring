package com.neu.IoC;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class StageTest
{

    @Test
    public void testShow() throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
        Stage stage = (Stage)context.getBean("theStage");
        stage.show();
    }
}