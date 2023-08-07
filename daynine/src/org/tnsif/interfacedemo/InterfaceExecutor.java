//driver class
/*Program to demonstrate on interface*/
package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		//We can't instantiate an interface
		//DebitCard d=new DebitCard();
		SBIDebitCard s=new SBIDebitCard();
		s.displayCardDetails();
		/*we can call default method of an interface using the object of implementable class*/
		s.display();
		/*print is a static method inside an interface to call
		 *  a print method we have to use interfacename.methodname*/
		DebitCard.print();
		CheesePopCorn c=new CheesePopCorn();
		c.displayRecepie();
		
		Person p=new Person();
		p.showDrinkName();
		
	}

}
