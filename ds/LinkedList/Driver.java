import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    
    System.out.println(l);
    l.add("test");
    l.add("this");
    l.add("is");
    System.out.println(l);
    l.add(1,"question");
    System.out.println(l);
    l.add(9000,"another");
    System.out.println(l);
  }
}