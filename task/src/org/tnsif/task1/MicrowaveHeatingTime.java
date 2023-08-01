package org.tnsif.task1;

import java.util.Scanner;

public class MicrowaveHeatingTime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int item=s.nextInt();
		float ht=s.nextFloat();
		switch(item)
		{
		case 1:
			System.out.println(ht);
			break;
		case 2:
			System.out.println((ht/2)+ht);
		case 3:
			System.out.println(2*ht);
			break;
			default:
				System.out.println("Heating more than three items is not reccomended");
		}

	}

}
