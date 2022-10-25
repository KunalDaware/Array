//Odd and Even problem Solution of Array In DSA

import java.io.*;
import java.util.*;

public class Array1
{
  public static void Print(int [] arr)
  {
     int n = arr.length;
     for(int i = 0; i<n; i++)
       {
          System.out.print(arr[i] + " | ");
        } 
              System.out.println();
  }    

  public static int [] removeEve(int [] arr)          
  {
    int oddcount = 0;
    for(int i = 0; i < arr.length; i++)
    {
       if(arr[i] %2 != 0)
        {
          oddcount++;
        }
    }

     int[] result = new int[oddcount];
     int idx= 0;
     for(int i = 0; i < arr.length; i++)
     {
       if(arr[i] %2 != 0)
        {
          result[idx] = arr[i];
          idx++;
        }
  }
    return result;
}
  public static void main(String[ ] args)
  {
    int [] arr = {2,4,5,6,8,9};
    System.out.println("This is an Orignal Array ");
    Print(arr);
    int [] result = removeEve(arr);
    System.out.println("This is an Array after  ");
    Print(result);
  }
}