package Flightbooking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flightbooking.utils.Baseclass;

public class Flight extends Baseclass {
	@FindBy(xpath="//div[@data-testid='flight status-horizontal-nav-tabs']")
	WebElement flight;
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement date;
	@FindBy(xpath="//div[text()='Today']")
	WebElement date1;
	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	@FindBy(xpath="//div[text()='MAA']")
	WebElement location1;
	@FindBy(xpath="//div[text()='DEL']")
	WebElement location2;
	
	@FindBy(xpath="(//div[@data-focusable='true'])[15]")
	WebElement search;
	@FindBy(xpath="(//div[text()='On Time'])[1]")
	WebElement ontime;
	@FindBy(xpath="(//div[text()='On Time'])[2]")
	WebElement ontime2;
	
public void Fli() {
	flight.click();
}
public void Date() {
	date.click();
	date1.click();
	from.click();
	location1.click();
	location2.click();
	search.click();
	ontime.click();
	ontime2.click();
}
}
