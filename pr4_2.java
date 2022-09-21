package com.company;

public class pr4_2 {
    public static void main(String args[])
    {
        try
        {
            throw new UserDefinedException("Exception Found....");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Exception Solved!!");
            System.out.println(ude.getMessage());
            System.out.println("This Program is made by 21CE099_Moksh..");

        }
    }
}

class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        super(str);
    }
}

