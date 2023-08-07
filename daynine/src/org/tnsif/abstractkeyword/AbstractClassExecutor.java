package org.tnsif.abstractkeyword;
//driver class
//Program to demonstrate on abstract keyword
public class AbstractClassExecutor {
	
	public static void main (String args[]) {
		/*we can't create object of abstract class*/
		Addition a=new Addition();
		a.print(10,20);
		a.operation();
		
	}
}
