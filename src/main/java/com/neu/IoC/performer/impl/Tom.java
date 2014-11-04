package com.neu.IoC.performer.impl;

import com.neu.IoC.instrument.Instrument;
import com.neu.IoC.performer.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by djsecret on 14-10-28.
 */
public class Tom implements Performer
{
    private Instrument instrument;

    public Instrument getInstrument()
    {
        return instrument;
    }

    @Autowired
    @Qualifier("cymbal")
    public void setInstrument(Instrument instrument)
    {
        this.instrument = instrument;
    }

    @Override
    public void perform()
    {
        instrument.play();
    }

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");
        Tom tom = (Tom)context.getBean("tom");
        tom.perform();
    }
}
