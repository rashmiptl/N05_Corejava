package org.tnsif.looping;
import java.util.Scanner;
public class DigitDoWhileExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=s.nextInt();
		int digit=0;
       do
        {
        	System.out.println("Number of digits="+digit);
        	n=n/10;
        	n++;
        }
       while(n<2);
       
	}
    
}
