import java.util.Arrays;
import java.util.Random;

public class Array {

  public static void main(String[] args) {

    double[] newArray = randomArray(100);
    System.out.println(powArray(newArray, 2));

    int[] scores = ;
    
  }

  // Chapter 8 Exercise 1.1
  
  public static String powArray(double[] a, int power) {

    double[] newArray = a;
    for (int i = 0; i < a.length; i++) {a[i] = Math.pow(a[i], power);
      }
    return Arrays.toString(a);
  }

  public static double[] randomArray(int size) {
    Random random = new Random();
    double [] a = new double[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(100);
    }
    return a;
  }

  //Chapter 8 Exercise 1.2
  public static int[] histogram(int[] a, int count) {
    int[] counts = new int[100];
    for (int score : scores) {
      counts[score]++;
    }
    return counts;
  }


}