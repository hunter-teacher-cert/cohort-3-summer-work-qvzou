// Chapter 8 Exercise 4:  Enhance for loops are used for accumulating values instead of searching for one single value, which for this exercise would be the max value.  Enhance for loops would not be used to find the max value.

public class Max {

  public static void main(String[] args) {
    int[] a = {5, 16, 22, 11, 8, 54, 12, 7};
    System.out.println(indexOfMax(a));
  }

  public static int indexOfMax(int[] a) {
    int max = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] > max)
        max = a[i];
    }
    return max;
  }
  
}