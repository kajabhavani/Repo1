package com.donepudi.java.core;

import com.donepudi.java.core.service.Child2Class;
import com.donepudi.java.core.service.ChildClass;
import com.donepudi.java.core.service.ParentClass;
import com.donepudi.java.core.service.User;

public class MainCalss {

	public static void main(String[] args) {
		ParentClass pc = new ChildClass();
		User user = new User();
		user.setId(1213);
		user.setName("Dileep");
		
		pc.print(user);

	}

}
