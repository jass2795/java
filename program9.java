package com;
import java.util.*;
public class program9
{
    public static void main(String[]args)
    {  System.out.println("enter any string");
        Scanner scn=new Scanner(System.in);
 int i;


        String str=scn.nextLine();

        int len=str.length();
        System.out.println(len);

        for(i=(len-1);i>=0;i--)
        {
            char ch=str.charAt(i);
            System.out.print(ch);



        }
    }
}
