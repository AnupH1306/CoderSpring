package com.example.SpringCoreDemo.curcular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
//	@Autowired
//	private ClassB classb;
	
//	public ClassA(ClassB classb) {
//		this.classb = classb;
//	}
	
//	public void setClassB(ClassB classb) {
//		this.classb=classb;
//	}
	
	public ClassA() {
		System.out.println("A is created");
		ClassB b = new ClassB(); 
	}
	public void printA() {
		classb.printB();
		System.out.println("A is printed");
	}

}
