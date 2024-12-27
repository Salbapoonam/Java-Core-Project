package com.Multithreading;

public class SecondThread extends Thread {
	public void run()
	{
		int i=1;
		while(i<=50)
		{
			System.out.println(" In Second Thread Class");
			i++;
		}
		
	}

}
