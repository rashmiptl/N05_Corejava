//Program to Execute Switch Case
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseExecutor 
{
   public static void main(String[] args)
   {
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Perfect");
			break;
		case 2:
			System.out.println("Oo Antava");
			break;
		case 3:
			System.out.println("Taki Taki");
			break;
			default:
				System.out.println("Invalid input!");
		}

	}

}
