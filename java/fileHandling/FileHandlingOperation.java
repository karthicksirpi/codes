package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileHandlingOperation {
	static File f= new File("/home/datasirpi/charan/java/FileHandling/new1.txt");
public static void main(String[] args) throws Exception 
{
	// creating new file
	
//	createFile();
	
//	fileInfo(); // to get info of our file

//	writeFile(); // to write the file 
	
//	readFile();
//	deleteFile(); 
}

private static void deleteFile() 
{
	if(f.exists())
	{
		f.delete();
		System.out.println("File deleted successfully");
	}
	else
	{
		System.out.println("File is not exists ");
	}
	
}

private static void writeFile() throws IOException 
{
	FileWriter writer= new FileWriter(f);
	try {
		writer.write("im the new file. I have some info of DATASIRPI");
		writer.close();
		System.out.print("File writted ");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

private static void createFile() throws Exception {
	// TODO Auto-generated method stub
	if(f.createNewFile())
	{
		System.out.println("The new file is created"+f.getName());
	}
	else
	{
		System.out.println("This file already exists");
	}
}

private static void readFile()  
	{
		if(f.exists())
		{
			Scanner read;
			try {
				read = new Scanner(f);
				while(read.hasNextLine())
				{
					String info=read.nextLine();
					System.out.println("The file have -->  "+ info);
				}
				read.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("file is not exits");
		}
		
	}

private static void fileInfo() {
	if(f.exists())
	{
		System.out.println("This file is already exists");
		System.out.println("Isnt readable "+f.canRead());
		System.out.println("Isnt writable "+f.canWrite());
		System.out.println("The absolute path of"+f+" is "+f.getAbsolutePath());
		System.out.println("The size of file in byes "+f.length());
	}
}
}


