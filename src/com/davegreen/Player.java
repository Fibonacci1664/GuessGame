package com.davegreen;

/**
 * Created by daveg on 18/07/2017.
 */
public class Player
{
    int number = 0;

    public void guess()
    {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
