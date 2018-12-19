package com;
import java.util.*;
public class program3
{
    public static void main(String[]ar)
    {
        int i;
        Scanner scn=new Scanner(System.in);
        System.out.println("enter any string consisting of alphabets only");
        String str=scn.next();
        int len=str.length();

        if(str.equals("") || str==null)
        {
            System.out.println("enter any string consisting of alphabets only");
        }
        else
        {
            for(i=0;i<len;i++)
            {
                char ch=str.charAt(i);
                if((ch>='A' && ch<='Z')  || (ch>='a' && ch<='z') )

                {
                    if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U')

                    {
                        System.out.print("vowel"+" ");
                    }
                    else
                    {
                        System.out.print("consonant"+" ");
                    }
                }
                else
                {
                    System.out.println("WARNING :enter only alphabet");
                }
            }
        }
    }

}
