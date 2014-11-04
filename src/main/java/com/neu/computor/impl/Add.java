package com.neu.computor.impl;

import com.neu.computor.Computor;

/**
 * Created by djsecret on 14-10-27.
 */
public class Add implements Computor
{
    @Override
    public int compute(int n1, int n2)
    {
        return n1 + n2;
    }
}
