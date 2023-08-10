package org.tnsif.uncheckedexception;

import java.io.IOException;

//Program to demonstrate throw and throws keyword
public class ThrowExecutor {
	
	//throw keyword is used to declare an exception
    static void isEligible(int age,int weight)throws IOException
    {
    	if(age>18 && weight>50 )
    	{
    		System.out.println("Eligible to donate blood");
    	}
    	else
    		//throw keyword is used to throw an exception explicitly
    		throw new IOException("Age and Weight criteria is not fullfilled");
    }
	public static void main(String[] args) throws IOException {
		isEligible(12,54);

	}

}
