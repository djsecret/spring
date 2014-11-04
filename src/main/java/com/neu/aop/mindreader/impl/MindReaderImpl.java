package com.neu.aop.mindreader.impl;

import com.neu.aop.mindreader.MindReader;
import org.springframework.stereotype.Component;

/**
 * Created by djsecret on 14-10-29.
 */
@Component("mindreader")
public class MindReaderImpl implements MindReader
{
    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts)
    {
        System.out.println("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts()
    {
        return thoughts;
    }
}
