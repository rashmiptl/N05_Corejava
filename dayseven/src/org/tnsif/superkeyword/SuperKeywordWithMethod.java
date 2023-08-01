package org.tnsif.superkeyword;
//parent class
class Sports
{
	String sportsName;
	void display()
	{
		System.out.println("Sports name is:"+sportsName);
	}
}
//child class
class Cricket extends Sports
{
String noOfPlayers;	
void display()
{
	/*if parent and child class method are same and if we want to call the parent
	 * class method in child class then use
	 * super.methodName*/
	super.display();
	System.out.println("No of Players is:"+noOfPlayers);
}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Cricket c=new Cricket();
		c.display();
	}

}
