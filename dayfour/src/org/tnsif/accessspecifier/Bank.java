//Program to demonstrate onAccess Specifier
package org.tnsif.accessspecifier;

public class Bank {
	
	public String bankName="SBI";
	private int pinNo;
	long accountNo=345677890132L;
	
	public void displayPublic()
	{
		System.out.println("Bank Name is:"+bankName);
	}
	
   //private method
	private void displayPrivate()
   {
	   System.out.println("Pin No. is:"+pinNo);
   }
   
  //default method
   
   void displayDefault()
   {
	   System.out.println("account no.is:"+accountNo);
   }
}
