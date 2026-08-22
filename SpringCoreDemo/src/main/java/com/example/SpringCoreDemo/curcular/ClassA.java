package com.example.SpringCoreDemo.curcular;

import org.springframework.stereotype.Component;

@Component
public class ClassA {
	
//	private ClassB classb;
//	
//	public ClassA(ClassB classb) {
//		this.classb = classb;
//	}
	
	public void printA() {
		classb.printB();
		System.out.println("A is printed");
	}

}
