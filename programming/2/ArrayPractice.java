/**
*ArrayPractice
  * Qianhui Vanessa Zou
    *collaborators: Christopher De Silva, Latoya Boland, Seth Adams
    */

import java.util.*;
import java.io.*;

public class ArrayPractice
{
  static int [] data = new int [] {10, 20};
  static int dataSize = 2;

  public static void main(String args[]) {
    int[] data = buildRandomArray(10, 20);
    System.out.print(data);
  }
  
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];
    for(int i =0; i <data.length; i++){
        data [i]= r.nextInt(maxValue);
        
    }
    System.out.print(data);
    return data;
  }
}
    