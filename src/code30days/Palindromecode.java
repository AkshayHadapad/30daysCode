package code30days;

import java.util.Scanner;

public class Palindromecode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number ");
	    int num = sc.nextInt();
	    int num2=num;
	    int rev=0;
	    while(num!=0) {
	    	int temp=num%10;
	    	rev=rev*10+temp;
	    	num=num/10;
	    }
	    if(num2==rev) {
	    	System.out.println(num2+" is Palindrome");
	    }else
	    	System.out.println(num2+" not a Plaindrome");
	}

}
