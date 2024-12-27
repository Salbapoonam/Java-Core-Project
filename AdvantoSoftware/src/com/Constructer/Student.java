package com.Constructer;

public class Student {
	//initilize the object
	//initlize instance member
	String name;
	int id;
	double Marks;
	public Student(String n, int i,double m) {
		name=n;
		id=i;
		Marks=m;
		
	}
	
	public void disply()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(Marks);
	}

	
	

}
