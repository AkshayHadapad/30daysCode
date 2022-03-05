package code30days;

import java.util.Scanner;

public class Primehay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number ");
	    int num = sc.nextInt();
	    Boolean isPrime=false;
	    int i=2;
	    if(num>1) {
	    	while(i<=num/2) { //divide by 2 becuz num=17 8 numbera are already even so...
		    	if(num%i==0) {
		    		isPrime=false;
		    		break;
		    	}
		    	i++;
		    	isPrime=true;
		    }
	    } 
	    
	    if(isPrime)
	    	System.out.println("Prime");
	    else if(num==1 || num==0)
	    	System.out.println("Enter number above 1");
	    else
	    	System.out.println("NOT A PRIME");
	}
}
