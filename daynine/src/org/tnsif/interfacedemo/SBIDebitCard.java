package org.tnsif.interfacedemo;
//implementable class
public class SBIDebitCard implements DebitCard {

	@Override
	public void displayCardDetails() {
		System.out.println("Card No is:"+cardno);
		
	}

}
