package org.tnsif.multidimensionalarray;

import java.util.Scanner;

//Program to demonstrate on 2d array
public class TwoDimensionalArrayDemo {

	public static void main(String[] args, int j) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[3][2];
		for(int i=0;i<3;i++)
		{
			for(int j1=0;j1<2;j1++)
			{
			 arr[i][j1]=s.nextInt();
			}
		}
		//for printing a values
		for(int i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
		}

	}

}
