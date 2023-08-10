package org.tnsif.singledimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

//Program to demonstrate on run time array and to find out largest element in an array
public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of elements in an array");
		int n=s.nextInt();
		int arr[]=new int[n];
		//array initialization
         for(int i=0;i<n;i++)
         {
        	 arr[i]=s.nextInt();
         }
         System.out.println("Array Elements are:");
         for(int i=0;i<n;i++)
         {
        	 System.out.println(arr[i]+" ");
         }
         int max=arr[0];
         for(int i=0;i<n;i++)
         {
        	 if(arr[i]>max)
        	 {
        		 max=arr[i];
        	 }
        	 System.out.println("The largest element in an array is:"+max);
        	 //Arrays is a class and sort is a build-in method
        	 Arrays.sort(arr);
        	 for(int i1=0;i1<n;i1++)
        	 {
        		System.out.println(arr[i1]+" ");
        	 }
         }
	}

}
