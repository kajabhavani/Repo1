package com.donepudi.java.core.service;

public class ChildClass implements ParentClass{

	
	public void printChild(){
		System.out.println("Child class print");
	}
	
	public void print(User user){
		System.out.println(user.getId());
		System.out.println(user.getName());
	}

	@Override
	public void printParent() {
		System.out.println("provide defination for parent print");
	}
}
