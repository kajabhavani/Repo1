package Filesdemo;

import java.io.File;;

public class FolderDemo {

	public static void main(String[] args) {
		
		String location="C:/Users/Donepudi/Desktop/files/NewFolder"; 
        
		File f1=new File(location);
		System.out.println("is location pointed is a folder or not: "+ f1.isDirectory());
		
		System.out.println("is new folder created or not:  "+f1.mkdir());
	}

}
