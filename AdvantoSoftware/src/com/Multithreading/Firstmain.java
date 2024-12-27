package com.Multithreading;

public class Firstmain {
	public static void main(String[]args)
	{
		FirstThread f1=new FirstThread();
		f1.start();
		SecondThread s1=new SecondThread();
		s1.start();
		
	}

}
