package com.example.my_java_app;

import com.example.my_java_app.Notificvations.NotificationServices;

public class OrderService {
	
	//Tight-Coupling 
	//NotificationEmail ne = new NotificationEmail();
	
	NotificationServices ns;
	public OrderService(NotificationServices ns) {
		this.ns = ns;
	}
	public void placeOrder() {
		System.out.println("Order Placed");
		//ne.sendNotificationEmail();
		ns.sendNotification();
	}
}

//Order class Depend on emailnotification class. And its creating object of that class so it can use it functionality.But this is Against SOLID Principle
