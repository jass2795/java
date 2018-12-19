package com;
import java.util.*;
public class program10
{

    public static void main(String[]args)
    {
        String last;
        Scanner scn=new Scanner(System.in);
            System.out.println("enter any string");
            String str=scn.nextLine();
            System.out.println("enter any number");
            int num=scn.nextInt();
            int len=str.length();

            last=str.substring(len-num);
            System.out.print(str+" ");
              for(int i=0;i<num;i++)
              {
                  System.out.print(last+" ");
              }


    }
}
