import java.util.Scanner;

public class Celsius {

  public static void main(String[]args) {
    double C;
    double F;
    Scanner in = new Scanner(System.in);

    System.out.print("What is Celsius? ");
    C = in.nextInt();

    final double C_TO_F = 9.0 / 5.0;
    final double CELSIUS_TO_FARENHEIT = 32;
    F = C * C_TO_F + CELSIUS_TO_FARENHEIT;
    input.nextLine();
   //need input.nextLine() in case multiple inputs are placed 
    System.out.printf("%.1f C = %.1f F\n", C, F);
    }
} 
