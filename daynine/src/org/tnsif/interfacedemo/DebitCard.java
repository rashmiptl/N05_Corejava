package org.tnsif.interfacedemo;

public interface DebitCard {
  /*By default all the variables inside the interface are public static final
   * and if nit is final then we must have to initialize value for that variable*/
	long cardno=5467877548000L;
	/*We cannot use concrete method in an interface
	 * By default method inside interface is an abstract*/
	void displayCardDetails();
	/*default method and static method is new feature of java8
	which we can use in an interface*/
	default void display()
	{
		System.out.println("Default Method");
	}
	//static method
	static void print() {
		
		System.out.println("Static Method");
		}
}
