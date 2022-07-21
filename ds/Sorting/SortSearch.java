import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortSearchDriver.java and SortSearch.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
	
    }
    
    public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
	    int smallIndex = start;
      // assigning minValue to compare the value with the minValue
      int minValue = data.get(0);  
	    for (int i = start; i < data.size(); i++){
        if (data.get(i) < minValue) {
          minValue = data.get(i);
          smallIndex = i; 
        }
      }
	    return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	 
       

    */
    public void sort(){
    for(int i = 0; i < data.size()-1; i++) {
      int temp = i;
      for(int j = i + 1; j < data.size(); j++) {
        if (data.get(j) < data.get(temp)) {
          temp = j;
        }
      }
      int minVal = data.get(temp);
      data.set(temp, data.get(i));
      data.set(i, minVal);
    }

    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found. (TA Kevin mention to look at indexOf as well, found first occurence in daily/2/ArrayPractice)(In geeksforgeeks found the following: indexOf(Object O)	The index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.)

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
	  public int linearSearch(int value){
      //i is index: this is comparing the value and returning the i element
	    for(int i =0; i<data.size(); i++) {
      if (data.get(i) == value)
      return i;// return the index of that element once the element is at i then you want to return that position
    
        
      }
      return -1;
// return -1 is if the index at i value is not found then you're telling the computer that this is outside the array loop, it's like an error message
      }
    
	//  return 0; // replace this return
  //  }
	
	return 0; // replace this return
    }
    
    /**
       Implement a binary search as specified by the comments

      find the first occurence without looping through the array the entire arary 
you will still need a loop but search from the middle precondition is arry sorted from bigest to smallest or smallest to biggest
       
       This algorithm only works on sorted ArrayLists.
    */
  public int binarySearch(int value){
    // Kevin: Initialization outside the while loop
  int low = 0;
  int high = data.size() - 1;
	// create assign variables representing the high, low and middle indices 
    while (low < high) {

      // Kevin: you wouldn't want line 190-191 inside the loop because that would make low = 0 everytime it loops, the low and high change in the if conditions you have below
      /*low = 0;
      high = data.size() - 1; */
      int middle = (low + high)/2;
    //error still occurs when we have more than 1 variable name equal to each other  ...I know...trying to figure it out?...cool, was just letting you know cause i tried running it ...the plus side was it was down to nine errors when I ran it before the last chnge...hopefully it's better now...now we are down to 5...awesome! do we need the for loop that is right under this?...i commented it out and i got 2 errors now
      
	// while we're not done:
  //for (int middle = (low + high)/2; middle<data.size(); middle--) {//this is starting the search in the middle of the array
    //int middle = (low + high)/2;// this code is  looking for the middle value and next we will find the middle from the left side of the array
    if (value == data.get(middle)) {
       return middle;
    }
     
    if (value < data.get(middle)){
    //this is finding the middle value of the left side of the array
      high = middle - 1;
      low = low;
    //int middle = (low + high)/2;
    
      // // if (data.get(middle) == value ) {
      // // return middle;
      // }
    }

    else if (value > data.get(middle)) {
      low = middle + 1;
      high = high;
     //int middle = (low +high)/2;

      // Kevin: No need for this if condition, the one found at line 196-198 does the same job
      /*if (value == data.get(middle)) {
        return middle;
      }//204 */
    }//199
          
      
    }

    return -1; // Kevin: return -1 if value was never found inside array, this return is outside the while loop
  
  }//189
} // missing bracket for class
	// if the item is at data.get(middle), return middle
	// otherwise, update high, low, and middle

	//return 0;
	    
   // }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

 //    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// // refer to class discussion
	
	// return 0;
	    
 //    }
    
	
 //    public String toString(){
	// return ""+data;
 //    };


 //    public void builtinSort(){
	// Collections.sort(data);
	
 //    }
    

    
}
