package com.task;

public class Encapsulation
{
    private  String name;
    private int age;
    public String getName()
    {
        return name+" "+age;
    }
    public void setName(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
 public static void main(String[] args) 
 {
	 Encapsulation e=new Encapsulation(); // object of encapsulation
     e.setName("charan",22);
     System.out.println("My name and age are   "+e.getName());
 }
}


