package ExceptionHandling;

public class ExcetionHandling {
	public static void Handle()
	{
		System.out.println("Start");
		int a=10,b=0,c=0;
		try{
		c=a/b;

		} catch(ArithmeticException a1)
		{
		  b=5;
		  c=a/b;
		  System.out.println(c);
		  a1.printStackTrace();
		}
		System.out.println("End");
	}
	
	public static void main(String []args)
	{
		ExcetionHandling.Handle();
	}

}
