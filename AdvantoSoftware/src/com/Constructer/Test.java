package com.Constructer;

public class Test {
	String name;
	int id;
	double marks;
	public Test(String name,int id,double marks)

	{
		System.out.println(" In Parametrized -1");
		
	}
	
	public  Test(int id)
	{
		this("XYZ",105,23.6);
		System.out.println("In Parametrized -2");
		
	}
	public  Test()
	{
		this(6);
		System.out.println("In non  Parametrized ");
		
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(marks);
	}
	public static void main(String[] args)
	{
		Test t1= new Test();
		t1.display();
	}
}
