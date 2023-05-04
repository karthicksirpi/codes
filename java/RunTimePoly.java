package com.task;

class Class1 
{
	void run()
	{
	System.out.println("running");
	}
}
  
class RunTimePoly extends Class1
{  
void run()
	{
	System.out.println("running safely with 60km");
	
	}
public static void main(String args[])
{
	Class1 b = new RunTimePoly();
	b.run();  
	}  
}  


