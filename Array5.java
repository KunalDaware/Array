//code to Given an Array of n-1 distinct numbers in the range of 1to n and find the missing Number 

import java.io.*;
import java.util.*;

public class Array5
{
  public static int MissingNum(int [] arr)
  {
     int n = arr.length +1 ;
     int sum = n*(n+1)/2; // formula for sum of n natural number. // logic
     for(int num : arr)
      {
        sum = sum - num;
      }
       
      return sum;

  }

  public static void main(String [] args)
  {
      int []  arr = {1,2,4,5,6,7,8};
    Array5 aobj = new Array5();
    System.out.println(aobj.MissingNum(arr));
   





  }
















}


