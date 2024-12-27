package com.Constructer;

public class ConstucterChaining {
	
	String name;
	int id;
	double Marks;
	public ConstucterChaining(String n, int i,double m) {
		name=n;
		id=i;
		Marks=m;
		
	}
	public ConstucterChaining()
	{
		this("Pooja",105,96);
	}
	
	public void disply()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(Marks);
	}

	public static void main(String []args)
	{
		ConstucterChaining c=new ConstucterChaining();
		c.disply();
	}

	

}
