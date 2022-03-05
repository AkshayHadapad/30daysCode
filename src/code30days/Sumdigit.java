package code30days;

import java.util.Scanner;

public class Sumdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number ");
	    int num = sc.nextInt();
	    
	    int rev=0;
	    int sum=0;
	    while(num!=0) {
	    	int temp=num%10;
	    	sum=sum+temp;
	    	rev=rev*10+temp;
	    	num=num/10;
	    	
	    }
	    System.out.println("Sum of digit is "+sum);
	}

}
