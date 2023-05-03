package Flightbooking.test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flightbooking.pages.Roundtrip;

public class roundtrip extends Roundtrip {
	@Test
	
	
	
	
	
	public void Round() {
		try {
			launchBrowser("https://www.spicejet.com/");
			Roundtrip round= PageFactory.initElements(driver, Roundtrip.class);
			round.Round();
			round.From();
			round.Delhi();
			round.Pass();
			round.Student();
			round.Search();
			round.Check();
			round.Co();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			round.Contin();
			round.Firstname("Natraj");
			round.Lastname("T");
			round.mob("9876543210");
			round.Email("natraj123@gmail.com");
			round.City("Madurai");
			round.Checkk();
			round.Check1();
			round.Idcardno("1234");
			round.Next();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			round.Fname("Kasi");
			round.Lname("T");
			round.Mob1("9876543120");
			round.IdCard("234");
			round.Continu();
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			//round.Adv();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			//round.add1();
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			round.add2();
			round.Atm("4000123443211234");
			round.Name("natraj");
			round.Exp("10");
			round.Expyr("27");
			round.Cvv("123");
			round.Proceed();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
