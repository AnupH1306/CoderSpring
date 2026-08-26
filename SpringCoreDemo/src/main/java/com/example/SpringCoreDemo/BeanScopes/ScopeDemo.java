package com.example.SpringCoreDemo.BeanScopes;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
//@Scope("prototype") //Prototype :- A new object in shared to each class.
@Lazy
public class ScopeDemo {
	
	private ScopeA sa;
	public ScopeDemo(ScopeA sa) {
		this.sa = sa;
		System.out.println("Object is Created........");
	}
	
	public void sayDeep() {
		System.out.println("Im Lazy");
	}
}
