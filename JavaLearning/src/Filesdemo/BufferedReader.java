package Filesdemo;

import java.io.File;
import java.io.FileReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedReader {
	

	
	public static void main(String[] args) {
		
		String location="C:/Users/Donepudi/Desktop/files/file1.txt"; 
		
		File f1=new File(location);
		
		//BufferedReader b1= new BufferedReader(f1);
		
		try
		{
			FileReader fr1=new FileReader(f1);
			java.io.BufferedReader b1= new java.io.BufferedReader(fr1);
			
			String lineOfData;
			 while(( lineOfData = b1.readLine()) != null)
			 {
				 System.out.println(lineOfData);
			 }
			 b1.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			 
	     }
		
		

	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

}
