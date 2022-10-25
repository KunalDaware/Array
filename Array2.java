// reverse an Array 

import java.io.*;
import java.util.*;

public class Array2
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

  public static void Reverse(int [] arr, int start ,int end)
  {
    while(start < end)
     {
       int temp = arr[start];
       arr[start] = arr[end];
       arr[end] = temp;
       start++;
       end--;
     }
   
   }


   public static void main(String [] args)
   {
     int [] arr = {2,3,4,5,6,7};
     System.out.println("This is an Orignal Array");
     Print(arr);
     Reverse(arr,0 ,arr.length-1);
     System.out.println("This is an Reverse Array");
       Print(arr);
    }















}