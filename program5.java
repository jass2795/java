package com;
import java.util.*;

public class program5
{
    public static void main(String[]arg)
    {
        int sum=0;
       while(true)
       {

           Scanner scn=new Scanner(System.in);
           System.out.println("enter any other number");
           int num=scn.nextInt();
           //boolean input=false;
          /* if(!(num>=0 && num<=9))
           {
              System.out.println("WARNING:PLEASE ENTER ANY NUMBER");
           }
*/
           sum=sum+num;
          System.out.println("want to exit ? enter yes for exit");
          String str=scn.next();

          if(str.equalsIgnoreCase("yes"))
          {
              System.exit(0);
          }
           System.out.println("sum is"+ " " +sum);
       }

    }
}
