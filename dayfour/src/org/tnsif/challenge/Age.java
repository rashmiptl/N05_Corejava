package org.tnsif.challenge;
import java.util.Scanner;
/*Ask the user for their birth year encoded as two digit(like"62")and for the current year ,
 * also encoded as two digit(like"99")
 * Write a program to find the users current age in years.*/
public class Age {
static int age(int b,int c)
{
	if(c>b)
	{
		System.out.println("c-b");
	}
	else
	{
		System.out.println((100-b)+c);
	}
	return c;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the birthYear and "+"ccurrentYear");
		int b=s.nextInt();
		int c=s.nextInt();
		age(b,c);
	}

}
