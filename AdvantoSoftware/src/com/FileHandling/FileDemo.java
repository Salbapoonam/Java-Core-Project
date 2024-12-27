package com.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	
	
	public static void main(String[]args) throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\FileHandle\\First.txt");
		Boolean res=file.createNewFile();
		if(res)
		{
			System.out.println(" File Created Suucefully");
		}
		else
		{
			System.out.println(" File is already Exist in system ");
		}
		

		
		FileWriter fw=new FileWriter(file);
		fw.write("Hello ...........Good...Morning All");
		fw.close();
		FileReader fr=new FileReader(file);
		Scanner sc=new Scanner(file);
		 
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}
		fr.close();
		
}
}
