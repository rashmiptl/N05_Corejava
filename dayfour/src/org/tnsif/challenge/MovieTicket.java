package org.tnsif.challenge;

import java.util.Scanner;


public class MovieTicket {

	static void ticket (int age,float st)
	{
		//Adult movie ticket
	 if(age>13)	
	 {
		if(st>=13.30 && st<=17.59)
			System.out.println("$5.00");
		else
			System.out.println("$8.00");
	 }
	 //Children Movie Ticket
	 else
	 {
		 if(st>=13.30 && st<=17.59)
				System.out.println("$2.00");
			else
				System.out.println("$4.00"); 
	 }
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		float st=s.nextFloat();
         ticket(age,st);
	}

}
