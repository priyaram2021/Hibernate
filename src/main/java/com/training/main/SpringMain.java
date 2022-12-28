package com.training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Mobile;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Mobile.class);
		Mobile mobile = context.getBean("mobile",Mobile.class);
		mobile.makeCall();
	}
}
