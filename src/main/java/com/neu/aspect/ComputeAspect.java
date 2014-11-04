package com.neu.aspect;

/**
 * Created by djsecret on 14-10-28.
 */
public class ComputeAspect
{
    public void beforeCompute()
    {
        System.out.println("before...");
    }

    public void afterCompute()
    {
        System.out.println("after...");
    }
}
