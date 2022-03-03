package code30days;

import java.util.Scanner;

public class LCMcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number1 ");
	    int num1 = sc.nextInt();
	    System.out.println("Enter the Number!2 ");
	    int num2 = sc.nextInt();
	    
	    int lcm=0;
	    
	    if(num1>num2)
	    	lcm=num1;
	    else
	    	lcm=num2;
	    
	    while(true) {
	    	if((lcm%num1)==0 && (lcm%num2)==0 ) {
	    		System.out.println("Lcm is "+lcm);
	    		break;
	    		}
	    	lcm++;
	    }
	}

}
