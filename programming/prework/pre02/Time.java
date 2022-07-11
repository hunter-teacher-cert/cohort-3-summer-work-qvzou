import java.io.*;
import java.util.*;

public class Time {

public static void main(String[] args){{{
  int hour = 23;
  int minute = 23;
  int second = 23;
  System.out.print("The current time is ");
  System.out.print(hour);
  System.out.print(":");
  System.out.print(minute);
  System.out.print(":");
  System.out.print(second);
  System.out.println("."); // number 2 of Exercise 3
  System.out.print("Number of seconds since midnight: ");
  System.out.println(hour * 60 * 60 + minute * 60 + second); // number 3 of Exercise 3
  System.out.print("Number of seconds left until midnight: ");
  System.out.println(24 * 60 * 60 + 60 * 60 + 60 - hour * 60 * 60 + minute * 60 + second); // number 4 of Exercise 3
  }
  double hour = 23;
  double minute = 23;
  double second = 23;
  System.out.print("Percentage of the day that has passed: ");
  System.out.println((hour * 60 * 60 + minute * 60 + second) * 100 / (24 * 60 * 60 + 60 * 60 + 60) + "%"); // number 5 of Exercise 3
  }
  int hour1 = 23;
  int minute1 = 23;
  int second1 = 23;
  int hour = 23;
  int minute = 53;
  int second = 45;
  System.out.print("The elapsed time since I started working on this exercise is: ");
  System.out.print(hour * 60 * 60 + minute * 60 + second - hour1 * 60 * 60 + minute1 * 60 + second1);
  System.out.println(" seconds."); // number 6 of Exercise 3
  }
}

