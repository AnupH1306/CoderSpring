package com.example.SpringCoreDemo.BeanLifeCycle;

import org.springframework.stereotype.Component;

@Component
public class Ps {
	
	public void payService() {
		System.out.println("Payment Done");
	}

}
