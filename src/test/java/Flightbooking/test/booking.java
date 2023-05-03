package Flightbooking.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Flightbooking.pages.Booking;

public class booking extends Booking{
	@Test
	
	
	
	
	
	
	
	
	public void book() {
		try {
			launchBrowser("https://www.spicejet.com/");
			Booking bookin= PageFactory.initElements(driver, Booking.class);
			//bookin.Flight();
			//bookin.Oneway();
			bookin.From();
			bookin.agr();
			//bookin.To();
			bookin.dell();
			bookin.Fromdate();
			bookin.Passenger();
			bookin.Adult();
			
			//bookin.Child();
			//bookin.Money("3");
			bookin.Stud();
			bookin.Search();
			bookin.Check();
			bookin.Cont();
			bookin.Co();
			bookin.Firstname("natraj");
			bookin.Lastname("T");
			bookin.mob("9876543210");
			bookin.Email("natraj123@gmail.com");
			bookin.City("madurai");
			bookin.Checkk();
			bookin.Check1();
			bookin.Idcardno("123");
			bookin.Next();
			bookin.Fname("nattu");
			bookin.Lname("T");
			bookin.Mob1("9876543211");
			bookin.IdCard("321");
			bookin.Continu();
			bookin.add2();
			bookin.Add();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			bookin.Adver();
            bookin.advv();
			bookin.Atm("4000567887651234");
			bookin.Name("natrajan");
			bookin.Exp("10");
			bookin.Expyr("27");
			bookin.Cvv("123");
			bookin.Proceed();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

}
