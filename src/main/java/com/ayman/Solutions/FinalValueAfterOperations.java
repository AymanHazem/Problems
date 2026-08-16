package com.ayman.Solutions;

public class FinalValueAfterOperations
{
    public static int finalValueAfterOperations(String[] operations)
    {
        int result = 0;
        int size =  operations.length;
        for (int i = 0; i < size; i++)
        {
            if (operations[i].charAt(1)=='+') result++;
            else result--;
        }
        return result;
    }
}
