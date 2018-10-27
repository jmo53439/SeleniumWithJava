package com.jmlearning;

public class HomePage {

	static String url = "http://www.google.com";
	static String title = "Google";
	
	public void goTo() {
		
		Browser.goTo(url);
		
	}

	public boolean isAt() {
		
		return Browser.title().equals(title);
	}

}
