package com.company;

public class pr4_3 {
        public static void main(String args[]){
            try{

                int num1=25/5;
                System.out.println(num1);
            }

            catch(NullPointerException e){
                System.out.println(e);
            }

            finally {
                System.out.println("Finally block is Executed.");
            }
            System.out.println("This Program is made by 21ce099_Moksh..");
        }

}
