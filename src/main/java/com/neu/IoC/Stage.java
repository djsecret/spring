package com.neu.IoC;

/**
 * Created by djsecret on 14-10-28.
 */
public class Stage
{
    private Stage()
    {
        System.out.println("constructor stage");
    }



    public void show()
    {
        System.out.println("stage is ready...");
    }
}
