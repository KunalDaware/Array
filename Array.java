// Code for adding and Printing an Array in Data Structure And Alogrithm

import java.io.*;
import java.util.*;

public class Array
{

  
   public void Print(int [] arr)
   {
     int n = arr.length;
     int i = 0;
     for(i=0; i<n; i++)
       {
          System.out.print(arr[i] + " | ");      
 
        }
           System.out.println(" | ");      
    }

  public void Demo()
  {
    int [ ] arr = new int[5];
    arr[0] = 4;
    arr[1] = 5;
    arr[2] = 6;
    arr[3] = 7;
    arr[4] = 8;
    System.out.println(arr.length);
  }
 public static void main(String arg [ ])
 {
   Array aobj = new Array();
   aobj.Print(arr);
 }


}