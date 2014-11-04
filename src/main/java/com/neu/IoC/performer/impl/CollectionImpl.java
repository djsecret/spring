package com.neu.IoC.performer.impl;

import com.neu.IoC.instrument.Instrument;
import com.neu.IoC.performer.Performer;

import java.util.Collection;

/**
 * Created by djsecret on 14-10-28.
 */
public class CollectionImpl implements Performer
{
    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments)
    {
        this.instruments = instruments;
    }

    @Override
    public void perform()
    {
        for(Instrument instrument : instruments)
        {
            instrument.play();
        }
    }
}
