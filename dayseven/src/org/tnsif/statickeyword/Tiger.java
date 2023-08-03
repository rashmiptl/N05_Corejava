package org.tnsif.statickeyword;
public class Tiger extends Animal{
	void eat()
	{
		System.out.println("eating:Child");
	}
	static void run()
	{
		
		//we can't overridre static method
		System.out.println("sunning:child");
	}
}
