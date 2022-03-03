package code30days;

import java.util.Scanner;

public class GCDcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number1 ");
	    int num1 = sc.nextInt();
	    System.out.println("Enter the Number!2 ");
	    int num2 = sc.nextInt();
	    int gcd=0;
	    for(int i=1;i<=num1 && i<=num2;i++) {
	    	System.out.println(i);
	    	if(num1%i==0 && num2%i==0) {
	    		System.out.println("if stmnt "+i);
	    		gcd=i;
	    		System.out.println("Last GCD "+gcd);
	    	}
	    }
	    System.out.println(gcd);
	}

}
