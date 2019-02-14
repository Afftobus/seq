package com.company;

/**
 * Created by afilippov on 14.02.2019.
 */
public class sequence {
    private static sequence single_instance = null;

    public static sequence i()
    {
        if (single_instance == null)
            single_instance = new sequence();

        return single_instance;
    }

    private int value;

    private sequence()
    {
        value = 0;
    }

    public synchronized int nextVal()
    {
        return value++;
    }

    public void setValue(int newValue)
    {
        value = newValue;
    }

    public int getValue()
    {
        return value;
    }
}
