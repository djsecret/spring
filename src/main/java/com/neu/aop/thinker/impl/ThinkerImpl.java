package com.neu.aop.thinker.impl;

import com.neu.aop.thinker.Thinker;
import org.springframework.stereotype.Component;

/**
 * Created by djsecret on 14-10-29.
 */
@Component("thinker")
public class ThinkerImpl implements Thinker
{
    private String thoughts;

    @Override
    public void thinking(String thoughts)
    {
        this.thoughts = thoughts;
    }

    public String getThoughts()
    {
        return thoughts;
    }
}
