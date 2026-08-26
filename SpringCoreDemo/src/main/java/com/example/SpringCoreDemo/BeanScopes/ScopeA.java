package com.example.SpringCoreDemo.BeanScopes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.example.SpringCoreDemo.OrderService;

@Component 
public class ScopeA {
	
	private ScopeDemo sd ;
	public ScopeA(@Lazy ScopeDemo sd) {
		this.sd = sd;
		System.out.println("ScopeA Sercvice Created");
	}
	
	public void sayHi() {
		sd.sayDeep();
		System.out.println("Circular dependecy resolved");
	}
	
}
