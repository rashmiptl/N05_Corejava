package org.tnsif.challenge;

import java.util.Scanner;

/*Pratik is so much interseted in gardening and hence he plants more trees in his garden.
 * He plants trees in a rectangular fashion with the order of rows and coloumns and
 * numbers the trees in a row wise order.
 * He planted the mango tree only in the first row first coloumn and last coloumn.
 * So,given the tree number and rows and coloumns your task is to find out 
 * wheather the given tree is mango tree or not
 * Input n=5(n is no.of rows and coloumns),
 * t=11(tree number)*/
public class MangoTreeExecutor {

	static int isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
		return t;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
	  

	}

}
