package org.tnsif.operators;
import java.util.Scanner;
public class BloodDonateDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if((age>=18)&&(weight>=50))
				System.out.println("Person is eligible to donate blood");
		else
			System.out.println("Person is not eligible to donate blood");
         
	}

}
