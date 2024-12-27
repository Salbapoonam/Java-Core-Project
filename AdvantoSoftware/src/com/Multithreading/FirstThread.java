package com.Multithreading;

public class FirstThread extends Thread {
	@Override
	public void run()
	{
		int i=1;
		while(i<=50)
		{
			System.out.println(" In First Thread Class");
			i++;
		}
		
	}

	
}
