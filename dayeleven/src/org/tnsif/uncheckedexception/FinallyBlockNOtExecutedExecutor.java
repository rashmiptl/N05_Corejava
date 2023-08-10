package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class FinallyBlockNOtExecutedExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();//12
		int y=s.nextInt();//0
		try
		{
			System.out.println(x/y);
			//When we use system.exit(0)then finally block does not executed
			System.exit(0);
			//catch block is used to handle an exception
		}
		catch(Exception e) 
		{
			System.out.println("Exception handled"+e);
			//When we use system.exit(0)then finally block does not executed
			//System.exit(0);
		}
		finally
		{
			/*When finally block contains exception then finally block does not executed*/
			//System.out.println(4/0);
			System.out.println("Finally Block is always executed");
		}

	}

}
