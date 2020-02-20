package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.GreetService;
public class didapp01 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		GreetService gs=(GreetService) context.getBean("g1");
		System.out.println(gs.greet("Chandra"));
		
		
		GreetService gs2=(GreetService) context.getBean("g2");
		System.out.println(gs2.greet("Chandra"));
		
		
		GreetService gs3=(GreetService) context.getBean("g3");
		System.out.println(gs3.greet("Chandra"));
		
		GreetService gs4=(GreetService) context.getBean("g4");
		System.out.println(gs4.greet("Chandra"));
		
	}
	

}