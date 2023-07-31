package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	
	int x;
	//default constructor
	ThisKeywordDemoFour()
	{
		//invoking first parameterized constructor
		this(34);
		System.out.println("Default Constructor");
	}
	ThisKeywordDemoFour(int x){
		this.x=x;
		System.out.println("Parameterized Constructor:" +x);
	}

	public static void main(String[] args) {
		ThisKeywordDemoFour f=new ThisKeywordDemoFour();

	}

}
