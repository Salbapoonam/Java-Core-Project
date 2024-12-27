package com.Constructer;

public class BankManagmnet {
	
	String bname;
	String branch;
	String ifsc;
	String address;
	double balance;
	
	public BankManagmnet(String bna,String Branch,String IfSC,String Addres,double Balance)
	{
		 bname=bna;
		 branch=Branch;
		 ifsc=IfSC;
		 address=Addres;
		 balance=Balance;
	}
	public void display()
	{
		System.out.println("Bank Name:"+bname);
		System.out.println("Bank Branch Name:"+branch);
		System.out.println("Bank Ifsc Name:"+ifsc);
		System.out.println("Bank Addres:"+address);
		System.out.println("Bank Balance:"+balance);
		
	}
	
	public static void main(String[] args)
	{
		BankManagmnet b1=new BankManagmnet("Central Bank Of India"," Shivajinarag ","CBINO28808","Rahuri Factory",5000);
		b1.display();
		
	}

}
