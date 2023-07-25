package org.tnsif.looping;

public class LeftAngleForExecutor {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-2;j++)
			{
				System.out.println(" ");
			}
				for(int k=1;k<=i;k++)
				{
				System.out.print("*");			}
		}
		System.out.println("");
		}
		}