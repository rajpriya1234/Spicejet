package Flightbooking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flightbooking.utils.Baseclass;

public class Checkstatus extends Baseclass {
	@FindBy(xpath="//div[text()='check-in']")
	WebElement check;
	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	WebElement pnr;
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	WebElement pnrid;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")
	WebElement search;

public void Check() {
	check.click();
}
public void Pnr(String o) {
	pnr.sendKeys(o);
}
public void Pinid(String id) {
	pnrid.sendKeys(id);
}
public void Search() {
	search.click();
}
}
