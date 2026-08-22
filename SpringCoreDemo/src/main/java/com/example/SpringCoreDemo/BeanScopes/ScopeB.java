package com.example.SpringCoreDemo.BeanScopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("Prototype") //Prototype :- A new object in shared to this class.
public class ScopeB {
	
	
private ScopeDemo sd ;
	
	public ScopeB(ScopeDemo sd) {
		this.sd = sd;
	}

}
