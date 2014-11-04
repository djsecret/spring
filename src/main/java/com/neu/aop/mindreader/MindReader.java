package com.neu.aop.mindreader;

/**
 * Created by djsecret on 14-10-29.
 */
public interface MindReader
{
    void interceptThoughts(String thoughts);

    String getThoughts();
}
