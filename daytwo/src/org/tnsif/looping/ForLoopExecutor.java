//Program to demonstrate on * pattern using for loop
package org.tnsif.looping;

import java.util.Scanner;
public class ForLoopExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num;j++)
			{
				System.out.println("*");
			}
			System.out.println(" ");
		}

	}

}
