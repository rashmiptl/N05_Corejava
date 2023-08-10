package org.tnsif.multidimensionalarray;

import java.util.Scanner;

//Program to demonstrate jagged array
public class JaggedArray {

	public static void main(String[] args) {
	/*In jagged array outside array size is fixed,
	 * but inside size is different
	 * for different outside array index*/	
		Scanner s=new Scanner(System.in);
      //jagged array declaration 
		int arr[][]=new int[2][];
		//for outside array index 0,storing 3 elements
		arr[0]=new int[3];
		//for outside array index 1,storing 2 elements
		arr[1]=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		//for printing an array elements
		for(int i=0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
