package com.neu.IoC.instrument.impl;

import com.neu.IoC.instrument.Instrument;

/**
 * Created by djsecret on 14-10-28.
 */
public class Cymbal implements Instrument
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void play()
    {
        System.out.println(name + " playing...");
    }
}
