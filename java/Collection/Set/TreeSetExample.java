package com.collection.java;

import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(20);
		t.add(10);
		t.add(10);
		t.add(5);
		t.add(10);
		t.add(2);
		t.add(10);
		// here also no duplicated allowed 
		//It will send only by sorted manner 			
		System.out.println(t);
		t.remove(1);
		// it will remove the 1 not 1st position
		//here no one is present so output will be 10,20
		System.out.println(t);
		
	}
}
