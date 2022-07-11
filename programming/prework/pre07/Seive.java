import java.util.Scanner;

public class Seive {

  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a number to find prime up to: ");
  int n = in.nextInt();

  boolean[] isPrime = new boolean [n];
  isPrime[0] = false;
  for (int a = 1; a < n; a++) {
    isPrime[a] = true;
  }
  for (int b = 2; b <= n; b++) {
    if (isPrime[b - 1] == true) {
      System.out.println(b);
      for (int c = b * b; c <= n; c += b) {
        isPrime[c-1] = false;
      }
    }
  }
}
  
 
  
}