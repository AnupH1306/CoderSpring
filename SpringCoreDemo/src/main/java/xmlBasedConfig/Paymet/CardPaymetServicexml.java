package xmlBasedConfig.Paymet;

public class CardPaymetServicexml implements PaymentServices {

	@Override
	public void pay() {
		System.out.println("Card Based Payment");
	}

}
