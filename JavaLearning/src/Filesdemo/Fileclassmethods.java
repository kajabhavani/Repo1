package Filesdemo;

import java.io.File;
import java.io.IOException;

public class Fileclassmethods {
	
	public static void main(String[] args) {
		String location="C:/Users/Donepudi/Desktop/files/dmo.txt";
		
		File fileobj=new File(location);
		System.out.println("is file existed in location or not: "+fileobj.exists());
		try{
			
			boolean isfilecreatedornot=fileobj.createNewFile();
			System.out.println("is file created or not: "+isfilecreatedornot);
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("is location pointed to a file or not: "+fileobj.isFile());

	}

}
