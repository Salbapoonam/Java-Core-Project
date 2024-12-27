package com.Multithreading;

public class MyThread2 implements Runnable {
	@Override
	public void run()
	{
		int i=1;
		while(i<=50)
		{
			System.out.println(" Second method of Runnable");
			i++;
		}
	}

}
