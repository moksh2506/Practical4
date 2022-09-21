package com.company;

public class pr4_1 {
    public static void main(String[] args) {
            try {
                int num= 10/0;
            }
            catch(ArithmeticException a)
            {
                System.out.println(a);
            }
            System.out.println("This program is made by 21CE099_Moksh.");
        }
}
