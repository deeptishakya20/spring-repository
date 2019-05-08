package com.capgemini.spring.test.renderer;
import com.capgemini.spring.test.provider.*;

public class MessageRenderer{

	private MessageProvider provider;

	public void render(){
	
		System.out.println(provider.message());

	}

	public void setMessageProvider(MessageProvider provider){

		this.provider = provider;	

	}

	


}