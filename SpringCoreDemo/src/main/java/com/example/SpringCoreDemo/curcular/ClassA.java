package com.example.SpringCoreDemo.curcular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
//	@Autowired
//	private ClassB classb;
	
	
	private ClassB classb;
	
//	public ClassA(ClassB classb) {
//		this.classb = classb;
//	}
	
	@Autowired
	public void setClassB(ClassB classb) {
		this.classb=classb;
	}
	
	//Stack OverFlow Programme A depend on b And b Depend on A;
//	public ClassA() {
//		System.out.println("A is created");
//		ClassB b = new ClassB(); 
//	}
	public void printA() {
		classb.printB();
		System.out.println("A is printed");
	}

}
