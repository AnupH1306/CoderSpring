package com.example.SpringCoreDemo.curcular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
	
//	private ClassA classa;
	
	private ClassA classa;
	
//	public ClassB(ClassA classa) {
//		this.classa = classa;
//	}
	
//	public ClassB() {
//		System.out.println("B is Created");
//		ClassA a = new ClassA();
//	}
//	
	@Autowired
	public void setClassA(ClassA classa) {
		this.classa=classa;
	}
	public void printB() {
		System.out.println("B is printed");
	}

}
