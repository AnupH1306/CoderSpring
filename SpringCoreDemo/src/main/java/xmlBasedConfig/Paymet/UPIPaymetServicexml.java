package xmlBasedConfig.Paymet;

import com.example.SpringCoreDemo.Payment.PaymentService;

public class UPIPaymetServicexml implements PaymentServices{

	@Override
	public void pay() {
		System.out.println("UPI Based Paymet");
	}

}
