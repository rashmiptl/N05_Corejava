package org.tnsif.customexception;

import java.util.Scanner;

//Program to demonstrate on user-defined exception
//driver class
public class CustomExecutionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter an Email and Password");
		String email=s.nextLine();
		String password=s.nextLine();
		try {
		if(email.equals("rashmiptl24@gmail.com") && password.equals("Pass@123"))
		{
			System.out.println("Credentials Matched");
		}
		else
		{
			throw new LoginCredentialsException("Invalid Credentials");
		}
}
		catch (LoginCredentialsException e)
		{
			System.out.println(e);
		}
	}
}

