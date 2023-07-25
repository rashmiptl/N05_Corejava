//driver class
//Program to demonstrate Default and parameterized constructor
package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		Citizen c=new Citizen();
		Citizen c1=new Citizen("Adult",43567892126L,"Female","Nagpur");
        System.out.println(c1);
	}

}
