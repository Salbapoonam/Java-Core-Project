package com.Constructer;

public class ThisKeyword {
	int x=12;
	int y=23;
			static int z=67;
			
			public void m2(int x)
			{
				this.x=888;
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(y);
				//System.out.println(this.z);
				
			}
	
	public static void main(String[] args)
	{
	 ThisKeyword t=new ThisKeyword()	;
	 t.m2(999);
	}

}
