package code30days;

import java.util.Scanner;

public class Reversenum {

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
	    
	    System.out.println("Revrse of "+num2+" is "+rev);
	}

}
