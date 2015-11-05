package net.unit_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {

	@Test
	public void testEmailGenerator01() {
		App app = new App();		
		Assert.assertEquals(app.generate(), "feedback@yoursite.com");
	}
	@Test
	public void testEmailGenerator02() {
		App app = new App();		
		Assert.assertTrue(app.generate().equals("feedback@yoursite.com"), "Emails Does Not Match!");
	}
}
