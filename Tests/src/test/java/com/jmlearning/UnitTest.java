package com.jmlearning;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

	@Test
	public void canGoToHomePage() {
		
		Pages.homePage().goTo();
		Assert.assertTrue(Pages.homePage().isAt());
		
	}
	
	@After
	public void cleanUp() {
		
		Browser.close();
	}

}
