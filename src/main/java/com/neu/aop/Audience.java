package com.neu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by djsecret on 14-10-29.
 */
@Component
public class Audience
{
    public void takeSeats()
    {
        System.out.println("take seats");
    }

    public void turnOffCellPhones()
    {
        System.out.println("turn off cellphones");
    }

    public void applaud()
    {
        System.out.println("CLAP CLAP");
    }

    public void demandRefund()
    {
        System.out.println("Boo!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint)
    {
        try
        {
            takeSeats();
            turnOffCellPhones();

            long start = System.currentTimeMillis();

            joinPoint.proceed();//执行被通知的方法

            long end = System.currentTimeMillis();

            applaud();

            System.out.println("the performance took " + (end - start) + " milliseconds.");

        }
        catch (Throwable t)
        {
            demandRefund();
        }
    }
}
