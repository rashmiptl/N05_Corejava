//PROGRAM TO DEMONSTRATE USER INPUT DEMO
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo
{
	
	public static void main(String[]args)
	{
     Scanner s=new Scanner(System.in);
     
     System.out.println("Enter the value of num");
     int num=s.nextInt();
     System.out.println("The value of num is:"+num);
     
     System.out.println("Enter the value of floatnum is:");
     float num1=s.nextFloat();
     System.out.println("The value of floatnum is:"+num1);
     
     System.out.println("Enter the value of char");
     char c=s.next().charAt(0);
     System.out.println("Character is"+c);
     
     System.out.println("Enrter the value of string");
     String str1=s.next();
     s.next();
     System.out.println("String is"+str1);
}
}
