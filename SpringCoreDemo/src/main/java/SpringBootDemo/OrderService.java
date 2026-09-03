package SpringBootDemo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

//@Component
@Service
public class OrderService {
	
	private PaymentService paymentservice;
	
	public OrderService(PaymentService paymentservice) {
		this.paymentservice = paymentservice;
	}
	
//	@PostConstruct
	public void placeOrder() {
		System.out.println("Order Palced");
		paymentservice.pay();
	}

}
