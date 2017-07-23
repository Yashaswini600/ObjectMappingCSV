package com.csv.javaobject.mapping;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mapping
{
	public static void main(String[] args)
	{
		String csvfileName = "info.csv";
		File csvfile= new File(csvfileName);
		try
		{
			Scanner inputStream = new Scanner(csvfile);
			while(inputStream.hasNext())
			{
				String data =inputStream.next();
			System.out.println(data + "  ");	
			}
		inputStream.close();
	
		}
catch (FileNotFoundException e)
{
	e.printStackTrace();
}
	}
}