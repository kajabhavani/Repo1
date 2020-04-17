package Filesdemo;
 import java.io.File;

public class ListDemo {

	public static void main(String[] args) {
	
		int noOfFiles=0;
		int noOfFolders=0;
		String location ="C:/Users/Donepudi/GDE/";
		
		File f1=new File(location);
		String[] namesOfAllItems=f1.list();
		System.out.println("no of items in given location are: "+namesOfAllItems.length);
		for(String individualItemName : namesOfAllItems)
		{
			String individualItemLocation = location.concat(individualItemName);
			File individualFileObj =new File(individualItemLocation);
			boolean isFileOrNot = individualFileObj.isFile();
			if(isFileOrNot)
			{
				noOfFiles++;
			}else
			{
				noOfFolders++;
			}
		}
		
		System.out.println("no of items as files are: "+noOfFiles);
		System.out.println("no of items as folders are: "+noOfFolders);
	}

}
