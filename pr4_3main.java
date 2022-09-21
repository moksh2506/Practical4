package com.company;

public class pr4_3main {
    public static void main(String args[])
    {
        try
        {

            throw new UserDefinedException("User done Exception..");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Found the Exception");

            System.out.println(ude.getMessage());
            System.out.println("This Program is made by 21CE099_Moksh..");
        }
    }

}
