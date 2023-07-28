package org.tnsif.challenge;

import java.util.Scanner;

/*There are n people standing in a circle waiting to be executed.
 * The counting out begins at some point in the circle and 
 * proceeds around a circle in a fixed direction.
 * In each step a certain number of people are skipped
 * and the next person is executing.
 * The elimination around the circle(which is becoming smaller and smaller as the executed people are removed),
 * until only the last person remains,who is given freedom.
 * Given the total number of person n and a number k which indicates that k-1 person are skipped and the
 *  kth person is killed in a circle.
 *  The task is to choose the person initial circle that survives*/
public class Circlechallenge {

	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return(survive(n-1,k)+k-1)%n+1;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
		s.close();

	}

}
