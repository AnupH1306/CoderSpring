package com.example.SpringCoreDemo.BeanLifeCycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Os {
	
	@Autowired
	private Ps ps;
	
//	Os(Ps ps){
//		this.ps = ps;
//	}
	
	public void placeOrderService() {
		System.out.println("Order Palced");
		
	}

}
