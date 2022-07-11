public class Methods {

  /** 
  *Exercise 2: Write a method that takes two integers and returns true if divisible and false otherwise
  */
  
  public static void main(String[] args) {
        System.out.println(isDivisible(4, 1));
      System.out.println(isTriangle(30, 3, 5));
      System.out.println(ack(2, 1));
    }
 
  public static boolean isDivisible(int m, int n) {

     if (n % m == 0) {
            return true;
        } else {
            return false;
        }
}

  /**
  *Exercise 3 Write a method that takes three integers as arguments and returns either true or false, depending on whether any of the three lengths is greater than the sum of the other two, it can not form a triangle.
  */
  
  public static boolean isTriangle(int a, int b, int c) {

     if (a + b > c && b + c > a && c + a > b) {
            return true;
        } else {
            return false;
        }
}

  /**
  *Exercise 8 Write a method that takes two ints as parameters and computes and returns the value of the 
Ackermann function.
  */

  public static int ack(int m, int n) {
    if (m == 0) {
      return n + 1;
    }
    else if (m > 0 && n == 0) {
      return ack(m - 1, 1);
    }
    else if (m > 0 && n > 0) {
      return ack(m - 1, ack(m, n - 1));
    }
  return ack(m, n);
    }
}