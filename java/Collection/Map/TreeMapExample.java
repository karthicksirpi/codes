package com.collection.java;

import java.util.TreeMap;

public class TreeMapExample 
{
	 public static void main(String args[]){  
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(100,"Amit");    
		      map.put(102,"Ravi");    
		      map.put(101,"Vijay");    
		      map.put(103,"Rahul");    
		      System.out.println(map); // it will give sorted order
	 }
}
