package com.practicum2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Driver
{
	private static final String FILE_Name = "C://Users//Mohammed//Documents//Practicumdev//Practicumdev//Pioneers.txt";
	
	public static void main(String[] args)
	{
		new Driver().start();
	}
	
	public void start()
	{
		try{
			readLine();
			} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public void readLine() throws IOException
	{
		
		ArrayList <String> pioneersArr = new ArrayList<String>();
		InputStream input = new BufferedInputStream(new FileInputStream(FILE_Name));
	   	byte[] contents = new byte[1024];
		
	   	int bytesRead=0;
	   	String Pioneers = null; 
	   		while( (bytesRead = input.read(contents)) != -1){ 
		    Pioneers = new String(contents, 0, bytesRead);               
	   	}
	   		System.out.print(Pioneers);
  
	   		Pioneers.split(">");
	   			pioneersArr.add(Pioneers);
	   	    System.out.println(pioneersArr);
	}
}
