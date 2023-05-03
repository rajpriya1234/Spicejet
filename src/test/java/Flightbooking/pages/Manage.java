package Flightbooking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flightbooking.utils.Baseclass;

public class Manage extends Baseclass{
	@FindBy(xpath="//div[text()='manage booking']")
	WebElement mbook;
	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	WebElement ticket;
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	WebElement id;
	@FindBy(xpath="//div[text()='Search Booking']")
	WebElement search;
	
	
public void Mbook() {
	mbook.click();
}
public void Ticket(String a) {
	ticket.sendKeys(a);
}

public void Id(String q) {
	id.sendKeys(q);
}
public void Search() {
	search.click();
}
}
