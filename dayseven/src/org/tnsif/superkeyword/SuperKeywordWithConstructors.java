package org.tnsif.superkeyword;
class Nationality
{
String nationName="Germany";

public Nationality(String nationName) {
	this.nationName = nationName;
	System.out.println(nationName);
}
	
}
class Person extends Nationality
{
	String language;

public Person(String nationName,String language) {
	//calling to parent class constructor
		super(nationName);
		this.language=language;
		System.out.println(language);
}
}
	

public class SuperKeywordWithConstructors {

	public static void main(String[] args) {
		Person p=new Person("Germany","German");
   
	}

}
