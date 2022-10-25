// Problem statement to find the Minimum Value in the Array

import java.io.*;
import java.util.*;

public class Array3
{
  public static void Print(int[] arr)
  {
     int n = arr.length;
     for(int i = 0; i<n; i++)
      {
         System.out.print(arr[i] + " | ");
         
      }
         System.out.println(" ");

   }
   public int Min(int [] arr)
   {
     int min = arr[0];
     for(int i = 1; i < arr.length; i++)
      {
          if(arr[i] < min)
           {
               min = arr[i];
           }
      
      }
      return min;

   }

   public static void main(String [] args)
   {
     int [] arr = {90,4,66,2,1,5,4,3,27,9};
     Print(arr);
     Array3 aobj = new Array3();
     System.out.println("Minimum value are");
     System.out.println(aobj.Min(arr));
    



   }







}