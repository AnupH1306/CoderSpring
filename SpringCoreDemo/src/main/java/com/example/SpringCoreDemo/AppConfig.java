package com.example.SpringCoreDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.SpringCoreDemo.Payment.CardPayment;
import com.example.SpringCoreDemo.Payment.PaymentService;
import com.example.SpringCoreDemo.Payment.UPIPayment;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public User1 createUser() {
		return new User1("Anup", 23);
	}
	
	//Check in main object created or not.
	
	
	@Bean
	@Primary
	//@Qualifier("creatCard")
	public PaymentService createCardPayment() {
		return new CardPayment();
	}
	
	@Bean
	//@Qualifier("upiPay")
	public PaymentService createUPIPayment() {
		return new UPIPayment();
	}
	
//	@Bean
//	public OrderService createOrder(@Qualifier("creatCard")PaymentService paymentService) {
//		return new OrderService(paymentService);
//	}
	
	//Using filed injection
	//@Bean
////	public OrderService createOrder() {
//		return new OrderService();
//	}
	
	//Or
	@Bean
	public OrderService createOrder() {
		PaymentService pay = createCardPayment();
		OrderService os = new OrderService();
		os.setPaymentservice(pay);
		return os;
	}
}
//@Bean Annotation is used to create object manually And its methods specific. But Managed by Spring.