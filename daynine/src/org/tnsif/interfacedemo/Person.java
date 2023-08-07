package org.tnsif.interfacedemo;
//Program to demonstrate on multiple Inheritance
public class Person implements ColdDrink,Alcohol {

	@Override
	public void showDrinkName() {
		String alcoholname = "Budweiser";
		System.out.println(brand+" "+alcoholname+" "+name);
		
	}

}
