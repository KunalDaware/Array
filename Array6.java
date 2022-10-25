// check the given String is palindrome or not

import java.io.*;
import java.util.*;

public class Array6
{
   public boolean Check(String word)
   {
     char [] charArray = word.toCharArray();
     int start = 0;
     int end = word.length() - 1;

     while(start < end)
        {
          if(charArray[start] != charArray[end])
           {
              return false;
           }   
            start++;
             end--;
        }
    
           return true;


    }

    public static void main(String args[])
    {
      Array6 aobj =new  Array6();
     
     if(aobj.Check("kunal"))
      {
          System.out.println("/////////////ITS AN PALINDROME//////////");
      }
    else
      {
            System.out.println("////////////ITS NOT  AN PALINDROME///////////");
      }




   }
























}