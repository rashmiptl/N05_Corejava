package org.tnsif.uncheckedexception;
//Program to demonstrate on array index out of bounds exception
public class ArrayIndexOutOfBoundsExceptionExecutor {

	static void print(int arr[])
	{
	try
	{
		System.out.println(arr[4]);
	}
	catch(Exception e) 
	{
		System.out.println("Exception handled"+e);
	}
	finally 
	{
		System.out.println("Finally block is always executed");
	}
	}
	
	public static void main(String[] args) {
		int arr[]= {12,4,5};
        print (arr);
        
        
   }
}