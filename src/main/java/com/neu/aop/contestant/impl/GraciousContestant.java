package com.neu.aop.contestant.impl;

import com.neu.aop.contestant.Contestant;
import org.springframework.stereotype.Component;

/**
 * Created by djsecret on 14-10-29.
 */
@Component
public class GraciousContestant implements Contestant
{
    @Override
    public void receiveAward()
    {
        System.out.println("GraciousContestant");
    }
}
