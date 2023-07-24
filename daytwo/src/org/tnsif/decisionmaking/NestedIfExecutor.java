//Program to Execute Nested if
package org.tnsif.decisionmaking;

import java.util.Scanner;

 public class NestedIfExecutor
 {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	int weight=s.nextInt();
	{
		if(age>=12)
		{
			if(weight>=40)
		{
			System.out.println("Eligible for Bunjee Jumping");
			if(age>110) {
				System.out.println("Extra ropes will be added");
			}
		}
		
		else
		{
			System.out.println("Not Eligible for Bunjee Jumping");
		}
		}
		else
		{
			System.out.println("Not Eligible for Bunjee Jumping");
		}
	}
	}
 }
