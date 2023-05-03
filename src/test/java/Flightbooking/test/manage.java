package Flightbooking.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flightbooking.pages.Manage;

public class manage extends Manage {
	@Test
	
	
public void Managebook() {
	try {
		launchBrowser("https://www.spicejet.com/");
		Manage book= PageFactory.initElements(driver, Manage.class);
		book.Mbook();
		book.Ticket("W3X3H8");
		book.Id("natraj123@spicejet.com");
		Thread.sleep(2000);
		book.Search();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
}
}
