package com.example.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringCoreDemo.Payment.PaymentService;

//@Component
public class OrderService {
	
	@Autowired
	private PaymentService paymentservice;
	
//	@Autowired
//	public OrderService(PaymentService paymentservice) {
//		this.paymentservice = paymentservice;
//	}
	
//	public OrderService() {
//		
//	}
	public void setPaymentservice(PaymentService paymentservice) {
		this.paymentservice = paymentservice;
	}
	
	public void placeOrder() {
		paymentservice.pay();
		System.out.println("Order Palced");
	}
}
