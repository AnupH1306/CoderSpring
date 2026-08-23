package com.example.SpringCoreDemo.BeanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//@Scope("prototype") //Prototype :- A new object in shared to each class.
public class ScopeDemo {
	
	public ScopeDemo() {
		System.out.println("Object is Created....");
	}
	
	
}
