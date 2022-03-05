package code30days;

import java.util.Scanner;

public class Armstrongcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number! ");
	    int num = sc.nextInt();
	    
	    int num2=num;
	    int n,temp,sum=0,rev=0;
	    
	    while(num!=0) {
	    	temp=num%10;
	    	sum=sum+(temp*temp*temp);
	    	num=num/10;
	    }
	    System.out.println(sum);
	    if(sum==num2)
	    	System.out.println("Armstrong");
	    
	}

}
