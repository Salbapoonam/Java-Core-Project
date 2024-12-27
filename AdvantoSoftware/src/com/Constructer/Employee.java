package com.Constructer;

public class Employee {
	String Name;
	int id;
	int age;
	float Salary;
	long Contact_info;
	public Employee(String N,int i,int a,float S,long Cont)
	{
		Name=N;
		id=i;
		age=a;
		Salary=S;
		Contact_info=Cont;
		
		
	}
	public void display()
	{
		System.out.println("Name: "+ Name);
		System.out.println("Id: "+ id);
		System.out.println("Age: "+ age);
		System.out.println("Salary: "+ Salary);
		System.out.println("Contact_info: "+ Contact_info);
	}
	
	public static void main(String [] args)
	{
		Employee e1=new Employee("Poonam",101,22,63000,9359325330l);
		e1.display();
		Employee e2=new Employee("Pooja",101,22,63000,9359325330l);
		e2.display();
		Employee e3=new Employee("Rutuja",101,22,63000,9359325330l);
		e3.display();
	}

}
