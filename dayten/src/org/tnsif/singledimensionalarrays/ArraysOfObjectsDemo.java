package org.tnsif.singledimensionalarrays;
//driver class
//Program to demonstrate on array of objects

public class ArraysOfObjectsDemo {
	
	public static void main(String[]args) {
	Employee arr[]=new Employee[2];
	arr[0]=new Employee(101,"Rashmi Patil",50000.8);
	arr[1]=new Employee(102,"Priya Shah",42000.5);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i].getID()+" "+arr[i].getName()+" "
				+arr[i].getSalary());
	}
}
}
