package com.adobe.training.core;

import com.adobe.cq.sightly.WCMUse;

public class HelloWorld extends WCMUse {

	private String currentMsg;
	
	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub
		currentMsg = "Hello World";

	}
	
	public String getCurrentMsg() {
		return currentMsg;
	}

}
