package com.example.SpringCoreDemo.BeanLifeCycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CartService1 implements InitializingBean,DisposableBean {
	
   Map<Integer, String>	mp;
   
   public CartService1() {
	   mp = new HashMap<>();
	   System.out.println("Constrctour Called CartService");
   }

	@Override
	public void afterPropertiesSet() throws Exception { //---> Initializing Methods.
//	
		mp.put(1, "Anup");
		mp.put(2,  "Aditya");
	}
	
	public void addToCart() {
		System.out.println("Cart Added Successfully");
	}
	
	public void start() {
		mp.put(1, "Anup");
		mp.put(2,  "Aditya");
	}
	
	@PostConstruct
	public void strt2() {
		mp.put(1, "Anup");
		mp.put(2,  "Aditya");
	}
	
	public String getValue(int key) {
		return mp.get(key);
	}

	@Override
	public void destroy() throws Exception {
		mp.clear();
		System.out.println("Bean Destroyed");
		
	}
	
	public void stop() {
		mp.clear();
	}
	
	@PreDestroy
	public void stop2() {
	mp.clear();
	}
}
