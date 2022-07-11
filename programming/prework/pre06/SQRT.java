import java.util.Scanner;

public class SQRT {
 
  // Chapter 7 Exercise 2
  
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double a = in.nextDouble();
		System.out.println(squareRoot(a));

    squareRoot();
	}

  public static double squareRoot(double a) {
    double x0 = a / 2;
		double x1 = x0;

  	do {
      x0 = x1;
  		x1 = (x0 + a / x0) / 2;
    } while (!(Math.abs(x0 - x1) < 0.0001));

    return x1;
  }

  public static void squareRoot() {
    Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double a = in.nextDouble();
    double x0 = a / 2;
		double x1 = x0;

	do {
      x0 = x1;
			x1 = (x0 + a / x0) / 2;
    } while (!(Math.abs(x0 - x1) < 0.0001));

    System.out.println(x1);
  }
}