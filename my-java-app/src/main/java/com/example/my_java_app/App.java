package com.example.my_java_app;

import com.example.my_java_app.Notificvations.EmailNotification;
import com.example.my_java_app.Notificvations.NotificationServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//        OrderService os = new OrderService();
//        os.placeOrder();
    	
    	NotificationServices ns = new EmailNotification();
    	OrderService os = new OrderService(ns);
    	
    	
    }
}

/*Here main creating all objects And also maintaining the all objects. 
 * The Dependent classes don't have to create and object or no need to use use Tight-Coupling concept if they are rely(Dependent) other cklasses.
 * its called "Dependency injection". Here we are injecting object through constructor.
 * 
 *  Basic Rule: "A dependent class ask what it need And not creating everything itself".
 *  --------------
 *Ioc--->Inversion of Control.
 *Initial dependent class creating and managing all things that it needed.
 *But now the control is shifted towards other(Like here Main class). 
 *Its called Inversion of Control.
 --------
 *IoC And DI RealtiobnShip;
 *  IoC - its an principle.
 *  DI - its an technique or approach to achieve IoC.
 * ---------- 
 *  
 * Main is behaving like IoC Container.To Overcome this we use Spring Framework.
 * 
 */


