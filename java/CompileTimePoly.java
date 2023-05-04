package com.task;

public class CompileTimePoly 

	{
	    void talk()
	    {
	        System.out.println("i dont know how to talk");
	    }
	    void talk(String tamil,String english)
	    {
	        System.out.println("I know "+tamil+" "+english);
	    }
	    void talk(String tamil,int x)
	    {
	        System.out.println("I'll speak "+tamil+x+" times per day");
	    }

	    public static void main(String[] args) {
	    	CompileTimePoly p=new CompileTimePoly();
	        p.talk();
	        p.talk("tamil","englisg");
	        p.talk("english", 3);
	    }

	}


