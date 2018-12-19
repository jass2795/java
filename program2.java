package com;
import java.util.*;

public class program2
{
    ;
    public static void main(String[]ar)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter any number between 20 and 30");
        int num=scn.nextInt();

        if(num>=20 && num<=30)
        {
         if((num%2)!=0)
         {
             System.out.println("Tom");
         }
         else
         {
             System.out.println("Jerry");
         }
        }
        else
        {
            System.out.println("enter a number in the specified range");
        }
    }
}
