package com.example.SpringCoreDemo.BeanScopes;

import org.springframework.stereotype.Component;

import com.example.SpringCoreDemo.OrderService;

@Component 
public class ScopeA {
	
	private ScopeDemo sd ;
	
	public ScopeA(ScopeDemo sd) {
		this.sd = sd;
	}
	
}
