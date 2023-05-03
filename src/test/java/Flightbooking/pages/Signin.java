package Flightbooking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Flightbooking.utils.Baseclass;

public class Signin extends Baseclass {
	
	@FindBy(xpath="//div[text()='Signup']")
	WebElement signup;
	
  //  @FindBy(xpath="//select[@class='form-control form-select ']")
	//WebElement option;
	
	@FindBy(xpath="(//input[@class='form-control '])[1]")
	WebElement fname;
	

	@FindBy(xpath="(//input[@class='form-control '])[2]")
	WebElement lname;
	
	//@FindBy(xpath="//option[text()='select country']")
	//WebElement country;
	

	@FindBy(id="dobDate")
	WebElement dob;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement phone;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement email;
	
	@FindBy(id="new-password")
	WebElement newpass;
	
	@FindBy(id="c-password")
	WebElement confirmpass;
	
	@FindBy(id="defaultCheck1")
	WebElement checkbox;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	public void Sign() {
		signup.click();
	}
	/*public void Option(String value) {
		//WaitForElement(option);
	//	DropDownByVisibleText(option,value);
	
		
		try {
			Select sel = new Select(option);
			sel.selectByValue(value);
		} catch (Exception ex) {
			ex.printStackTrace();
		
	}}*/
	
	
	public void Fname( String first) {
		fname.sendKeys(first);
	}
	public void Lname(String Last) {
		lname.sendKeys(Last);
	}
	public void Dob(String bday) {
		dob.sendKeys(bday);
		dob.click();
		
	}
	public void Phone(String ph) {
		phone.sendKeys(ph);
	}
	public void Mail(String em) {
		email.sendKeys(em);
		
	}
	public void Npass(String n) {
		newpass.sendKeys(n);
	}
	public void Cpass(String c) {
		confirmpass.sendKeys(c);
	}
	public void Check() {
		checkbox.click();
	}
	public void Submit() {
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
