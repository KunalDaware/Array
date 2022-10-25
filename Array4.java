//code for resize the size of an Array in DSA

import java.io.*;
import java.util.*;

public class Array4
{
  public static void Print(int [] arr)
  {
    int n = arr.length;
    for(int i = 0; i < n; i++)
      {
         System.out.print(arr[i] + " |");
       }
          System.out.println(" ");
  }

  public int [] Resize(int [] arr, int Capacity)
  {
    int [] temp = new int[Capacity];
    for(int i = 0; i < arr.length; i++)
      {
        arr[i] = temp[i];
      }
       arr = temp;
       return temp;         
  }

  public static void main(String [] args)
  {
    Array4 aobj = new Array4();
    int [] orignal = new int [] {3,6,7,5,4};
    System.out.println("The size of the array is -" + orignal.length);
    orignal = aobj.Resize( orignal, 10);
     System.out.println("The size of the Resize array is -" + orignal.length);
     
   }

}

