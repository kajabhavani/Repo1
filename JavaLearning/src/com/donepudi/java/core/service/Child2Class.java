package com.donepudi.java.core.service;

public class Child2Class implements ParentClass{

	@Override
	public void printParent() {
		System.out.println("Child 2");
	}

	@Override
	public void print(User user) {
		System.out.println("Child 2222");
	}

}
