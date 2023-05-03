package Flightbooking.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flightbooking.pages.Login;

public class login extends Login {
	@Test
	
	public void Logg() {
		try {
			launchBrowser("https://www.spicejet.com/");
			
			Login logg = PageFactory.initElements(driver, Login.class);
			
			logg.Log();
			logg.num("7339215169");
		logg.Pass("Natraj@237");
			logg.Enter();
			logg.Flight();
			logg.Oneway();
			logg.From("2");
			logg.To("2");
			logg.Fromdate();
			logg.Todate();
			logg.Passenger();
			logg.Money("2");
			logg.Family();
			logg.Search();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}


}
