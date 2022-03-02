package code30days;

import java.io.PrintStream;
import java.util.Scanner;

public class Great3num
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number 1");
    int num1 = sc.nextInt();
    System.out.println("Enter the Number 2");
    int num2 = sc.nextInt();
    System.out.println("Enter the Number 3");
    int num3 = sc.nextInt();
    if (num1 > num2)
    {
      if (num1 > num3) {
        System.out.println("This is greatest!! " + num1);
      }
    }
    else if (num2 > num3) {
      System.out.println("This is greatest!! " + num2);
    } else {
      System.out.println("This is greatest!! " + num3);
    }
  }
}