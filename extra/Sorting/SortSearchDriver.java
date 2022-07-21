import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


	// Uncomment these to test part 1
	System.out.println("List:");	
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);
	System.out.println();	
		
	// // Uncomment these to test part 2

  System.out.println("Smallest at Index 0:");
	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
  System.out.println();

  System.out.println("Smallest at Index[]:");
	i = ss.findSmallestIndex(3);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
  System.out.println();
  System.out.println("==========");
  System.out.println();
  
	// // Uncomment these to test part 3
  System.out.println("List:");
	System.out.println(ss);
  System.out.println();
  System.out.println("Sorted List:");
	ss.sort();
	System.out.println(ss);
  System.out.println();
  System.out.println("==========");
  System.out.println();

      

  //Search project
  System.out.print(ss);//testing linearSearch
  System.out.println("value found at index " + ss.linearSearch(3));

  System.out.print(ss);
  System.out.println("index = " + ss.binarySearch(11));
      
    
	


	      

    }
}