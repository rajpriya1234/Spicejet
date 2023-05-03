package Flightbooking.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flightbooking.pages.Flight;

public class flight extends Flight {
	@Test
	
public void flit() {
		try {
			launchBrowser("https://www.spicejet.com/");
			  Flight fli= PageFactory.initElements(driver, Flight.class);
			  fli.Fli();
			  fli.Date();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		  
	}
}
