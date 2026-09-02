package xmlBasedConfig;

import xmlBasedConfig.Paymet.PaymentServices;

public class Osd {
	
	private PaymentServices paymentservice;
	
	public Osd(PaymentServices paymentservice) {
		this.paymentservice = paymentservice;
			System.out.println("Object is created");
	}
	
	public void palceOrder() {
		paymentservice.pay();
		System.out.println("Order is Placed");
	}

}
