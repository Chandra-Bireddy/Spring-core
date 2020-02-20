package com.cts.did.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.service.GreetService;
import com.cts.service.GreetServiceAdvancedImpl;
import com.cts.service.GreetServiceEnhancedImpl;
public class didapp02 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
		
		
		GreetServiceEnhancedImpl gs2=(GreetServiceEnhancedImpl) context.getBean("g2");
		
		gs2.setGreeting("Vanakam");
		System.out.println(gs2.greet("Chandra"));
		GreetServiceEnhancedImpl gs3=(GreetServiceEnhancedImpl) context.getBean("g2");
		System.out.println(gs3.greet("Chandra"));
		GreetService gs= (GreetService) context.getBean("g3");
		System.out.println(gs.greet("Chandra"));
	}
	

}