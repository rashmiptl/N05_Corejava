//Program to demonstrate on checked exception
package org.tnsif.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\ASUS\\Downloads\\met1");
			System.out.println("File has found");
		}
		catch(FileNotFoundException e) {
			System.out.println("File is not exist:"+e);
		}

	}

}
