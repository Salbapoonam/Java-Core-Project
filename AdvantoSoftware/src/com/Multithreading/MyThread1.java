package com.Multithreading;

public class MyThread1  implements Runnable{
	@Override
	public void run()
	{
		int i=1;
		while(i<=50)
		{
			System.out.println(" First method of Runnable");
			i++;
		}
	}

}
