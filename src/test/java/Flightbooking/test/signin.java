package Flightbooking.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flightbooking.pages.Signin;

public class signin extends Signin {
	@Test
	
	
	public void signIn() throws Throwable {
		
			try {
				launchBrowser("https://www.spicejet.com/");
				Signin sign =PageFactory.initElements(driver, Signin.class);
				sign.Sign();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//sign.Option("2");
				sign.Fname("Natraj");
				sign.Lname("T");
				sign.Dob("23/04/1997");
				sign.Phone("7339215169");
				sign.Mail("rajsank304@gmail.com");
				sign.Npass("Natraj@237");
				sign.Cpass("Natraj@237");
				sign.Check();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	


