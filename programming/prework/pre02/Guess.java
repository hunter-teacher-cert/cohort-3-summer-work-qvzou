import java.util.Random;
import java.util.Scanner;

public class Guess {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    System.out.println("I'm thinking of a number between 1 and 100.  Can you guess what it is?");
    System.out.print("Type a number: ");
    int line = in.nextInt();
    int difference = number - line;
    int value = Math.abs(difference);
    System.out.println("Your guess is: " + line);
    System.out.println("The number I was thinking of is: " + number);
      System.out.println("You were off by: " + value);

  }
} // is there a way to get rid of a negative if the number is smaller than line, try using java abs formula or if 