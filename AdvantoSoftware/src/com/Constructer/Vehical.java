package com.Constructer;

public class Vehical {
	String Vname;
	int Vno;
	String Vcolor;
	
	Vehical( String name,int no,String color)
	{
		Vname=name;
		Vno=no;
		Vcolor=color;
	}

	Vehical()
	{
		
	}
	
	public void Display()
	{
		System.out.println(" Vehical Name Is" + Vname);
		System.out.println("Vehical No is "+ Vno);
		System.out.println("Vehical Color Is "+ Vcolor);
		
	}
}

