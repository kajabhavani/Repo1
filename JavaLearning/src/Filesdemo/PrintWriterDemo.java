package Filesdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;



public class PrintWriterDemo {

	public static void main(String[] args) {
		
		String location="C:/Users/Donepudi/Desktop/files/file1.txt";
		File f1=new File(location);
		
		try
		{
			PrintWriter p1=new PrintWriter(f1); 
			
			p1.println("Hi Hello  !!");
			p1.println("bhavani");
			p1.println(56099);
			p1.println(false);
			p1.close();
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		

	}

}
