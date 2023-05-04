package com.exception;

public class TryCatch 
{
	public static void main(String[] args) 
	{
		try
		{  
			int data=100/0;  
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("enter the proper number");
		}
	System.out.println("rest of the code...");  
	}
}

