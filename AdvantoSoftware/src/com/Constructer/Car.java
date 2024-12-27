package com.Constructer;

public class Car {
	
	String Carname;
	String Model;
	int Year;
	public Car(String Cname,String model,int year)
	{
		Carname=Cname;
		Model=model;
		Year=year;
		
		}
	
	public void display()
	{
		System.out.println("Car Name :"+Carname);
		System.out.println("Car Model :"+Model);
		System.out.println("Car Year :"+Year);
		
		
	}

}
