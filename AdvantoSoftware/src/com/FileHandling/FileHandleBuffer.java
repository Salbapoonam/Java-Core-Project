package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleBuffer {
	
	
	public static void main(String[]args) throws IOException
	{
		File file=new File("C:\\Users\\ASUS\\Desktop\\FileHandle\\First1.txt");
		/*Boolean res=file.createNewFile();
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
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hello All How Are you ");
		bw.close();
		fw.close();
		FileReader fr=new FileReader(file);
		BufferedReader br =new BufferedReader(fr);
		
		
//		Scanner sc=new Scanner(file);
		int i;
		
		 
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();*/
		
		FileOutputStream output=new FileOutputStream(file);
		String sev="I am Fine What about You.....";
		byte b[]=sev.getBytes();
		output.write(b);
		output.close();
		FileInputStream input =new FileInputStream(file);
		int i;
		while((i=input.read())!=-1)
		{
			System.out.print((char)i);
		}
		input.close();
		
		
				
		
}
}
