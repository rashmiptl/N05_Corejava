package org.tnsif.customexception;

//Program to demonstrate on user-defined exception
public class LoginCredentialsException extends Exception{
	
	//Private data member
	private String str;
	
	//getters and setters

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

		//Parameterized Constructors
		public LoginCredentialsException(String str) {
			super();
			this.str=str;
		}
		
	@Override
	public String toString() {
		return "LoggingCredentialsException [str=" + str + "]";
	}
	
	

}
