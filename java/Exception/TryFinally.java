package com.exception;

public class TryFinally 

{
	public static void main(String[] args) 
	{
		try {
			int n=0;
			int x=100/n;
			
		}
		catch (Exception e) {
			System.out.println("The exception is "+e);
		}
		finally {
			System.out.println("This block will always run");
		}
	}
}
