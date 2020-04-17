package com.donepudi.java.autoboxing;

import java.util.Objects;

public class AuboxingDemo {

	public static void main(String[] args) {

		int a = 20;
		int b =30;
		
		if (a<=b){
			
		}
		
		Integer aa = 20; // Integer.ValueOf(20); new Integer(20);
		Integer bb = "30";//Integer.valueOf("30"); // 
		
		if(aa==bb){
			System.out.println("aa==bb");
		}else{
			System.out.println("aa!=bb");
		}
		
		Objects.equals(aa, bb);
		
	}
	
	
	

}
