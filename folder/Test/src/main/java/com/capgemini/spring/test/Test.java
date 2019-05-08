package com.capgemini.spring.test;
import com.capgemini.spring.test.renderer.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{

	public static void main(String args[]){
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	MessageRenderer renderer = (MessageRenderer)context.getBean("renderer");
	renderer.render();	
		
	}

}