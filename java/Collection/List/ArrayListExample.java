package com.collection.java;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Iterator;


public class ArrayListExample 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> x= new ArrayList<Integer>();
		x.add(10);
		System.out.println("The array list value is "+x);
		System.out.println("enter the any 10 value for Array");
		for(int i=1;i<=10;i++)
		{
			x.add(s.nextInt());
		}
		System.out.println("The array list value is "+x);
		x.add(100);
		System.out.println(x);
		x.set(1, 50);
		System.out.println("After setting the 1 index"+x);
		Iterator<Integer> i=x.iterator();
		System.out.println(i.next());
		System.out.println(x.remove(2));
		
	}
}
