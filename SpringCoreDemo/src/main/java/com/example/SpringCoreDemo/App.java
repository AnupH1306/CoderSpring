package com.example.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.SpringCoreDemo.BeanScopes.ScopeDemo;
import com.example.SpringCoreDemo.curcular.ClassA;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      
//      OrderService os = context.getBean(OrderService.class);
//      os.placeOrder();
//      
//      User1 us = context.getBean(User1.class);
//      System.out.println(us.getAge());
      
      ClassA ca = context.getBean(ClassA.class);
      ca.printA();
      
      
      //Singleton Scope:- Single Object is create And shared refence to all other classes if dependent.
//      ScopeDemo sd = context.getBean(ScopeDemo.class);
//      
//      ScopeDemo sd1 = context.getBean(ScopeDemo.class);
//      System.out.println( sd == sd1);// True
//      
      //Prototype Scope :- Each time new  object is created.
//      ScopeDemo sd = context.getBean(ScopeDemo.class);
//      
//      ScopeDemo sd1 = context.getBean(ScopeDemo.class);
//      System.out.println( sd == sd1); //False
     
    }
}
