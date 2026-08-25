package com.example.SpringCoreDemo.curcular;

import org.springframework.stereotype.Component;

@Component
public class ClassB {
	
//	private ClassA classa;
//	
//	public ClassB(ClassA classa) {
//		this.classa = classa;
//	}
	
	public ClassB() {
		System.out.println("B is Created");
		ClassA a = new ClassA();
	}
	
	public void printB() {
		System.out.println("B is printed");
	}

}
