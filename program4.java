package com;
import java.util.*;

public class program4
{
    public static void main(String[]ar)
    {
        int i,j;
        System.out.println("enter any number");
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();

        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
        }




    }
}
