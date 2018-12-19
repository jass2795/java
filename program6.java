package com;
import java.util.*;

public class program6
{
    public static void main(String[]args)throws Exception
    {

        System.out.println("enter any character");
        char ch=(char)System.in.read();

        if(ch>=65 && ch<=90)
        {
           System.out.print("capital letter");
        }

        else if(ch>=97 && ch<=122)
        {
            System.out.print("small letter");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.println("digit");
        }
        else
        {
            System.out.println(" special character");
        }


    }
}
