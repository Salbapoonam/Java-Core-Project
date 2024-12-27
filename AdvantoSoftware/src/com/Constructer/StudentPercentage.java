package com.Constructer;

public class StudentPercentage {
	String Name;
	int id;
	int std;
	int sub1,sub2,sub3;
	public StudentPercentage(String name,int i,int s,int s1,int s2,int s3)
	{
		Name=name;
		id=i;
		std=s;
		sub1=s1;
		sub2=s2;
		sub3=s3;
		
	}

	// Method to calculate total marks
	 public int Total()
	 {
		 return sub1+sub2+sub3;
	 }
	 
	 public double percentage()
	 {
		 return (Total()/3.0);
	 }
	 
	 public static void main(String[] args)
	 {
		 StudentPercentage s1  =new StudentPercentage("Poonam",20121011,12,85,96,56 );
		 StudentPercentage s2=new StudentPercentage("Pooja",20121010,13,95,86,76 );
		 StudentPercentage s3=new StudentPercentage("Poonam",20121012,14,80,99,63 );
		 
		 System.out.println("Total: "+ s1.Total() +" Percentage :" + s1.percentage());
		 System.out.println("Total: "+ s2.Total() +" Percentage :" + s2.percentage());
		 System.out.println("Total: "+ s3.Total() +" Percentage :" + s3.percentage());
		 
	 }
}
