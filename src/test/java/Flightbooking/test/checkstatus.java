package Flightbooking.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flightbooking.pages.Checkstatus;
import Flightbooking.pages.Roundtrip;

public class checkstatus extends Checkstatus {
	@Test
	
	
public void status() {
	try {
		launchBrowser("https://www.spicejet.com/");
		Checkstatus status= PageFactory.initElements(driver, Checkstatus.class);
		status.Check();
		status.Pnr("12345");
		status.Pinid("natraj.doe@spicejet.com");
		status.Search();
	} catch (Exception e) {
	
		e.printStackTrace();
	}
}
}
