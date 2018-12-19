package com;
import java.util.*;

public class program1
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("enter any number");
        int sum=0,sum1=0;
        int num=scn.nextInt();
        int temp=num;

        while(num>0)
        {
            int rem=num%10;
             sum = sum *10 +rem;
             num=num/10;
        }

         if(temp==sum)
         {
             System.out.print("yes it is a palindrome: SUCCESS");
             while(temp>0)             // checking for even digits in string
             {
                 int rem=temp%10;
                 if(rem%2==0)         //if even,add them all by taking temporary variable
                 {
                     sum1=sum1+rem;
                 }
                 temp=temp/10;
             }

             if(sum1>25)
             {
                 System.out.println("sum is greater than 25: success");
             }
             else
             {
                 System.out.print("but sum is not greater than 25: failure");
             }

         }
         else
         {
             System.out.print("no, it is not a palindrome: FAILURE");
         }


    }
}
