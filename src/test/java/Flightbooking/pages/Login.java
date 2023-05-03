package Flightbooking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Flightbooking.utils.Baseclass;

public class Login extends Baseclass{
	@FindBy(xpath="//div[text()='Login']")
	WebElement log;
	
	@FindBy(xpath="//input[@type='number'][1]")
	WebElement Num;

	@FindBy(xpath="//input[@type='password']")
	WebElement pas;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement enter;
	@FindBy(xpath="//div[text()='Flights']")
	WebElement flight;
	@FindBy(xpath="//div[text()='one way']")
	WebElement oneway;
	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	@FindBy(xpath="//div[text()='To']")
	WebElement to;
	@FindBy(xpath="//div[text()='Departure Date']")
	WebElement fromdate;
	@FindBy(xpath="(//div[text()='10'])[2]")
	WebElement fr;
	
	@FindBy(xpath="//div[text()='Return Date']")
	WebElement returndate;
	@FindBy(xpath="(//div[text()='10'])[6]")
	WebElement re;
	
	@FindBy(xpath="//div[text()='Passengers']")
	WebElement passenger;
	@FindBy(xpath="(//div[@style='transition-duration: 0.25s; opacity: 1;'])[2]")
	WebElement adult;
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	WebElement child;
	
	@FindBy(xpath="//div[text()='Currency']")
	WebElement currency;
	@FindBy(xpath="//div[text()='Family & Friends']")
	WebElement family;
	@FindBy(xpath="(//div[@data-focusable='true'])[27]")
	WebElement search;
		
	public void Log() {
		log.click();
	}
	public void num(String no) {
		Num.sendKeys(no);
	}
	public void Pass(String code) {
		pas.sendKeys(code);
	}
	public void Enter() {
		enter.click();
	}
	public void Flight() {
		flight.clear();
		
		flight.click();
	}
	public void Oneway() {
		oneway.clear();
		oneway.click();
	}
	public void From(String origin) {
		try {
			Select sel = new Select(from);
			sel.deselectAll();
			sel.selectByValue(origin);
		} catch (Exception ex) {
			ex.printStackTrace();
			}
		
	}
		public void To(String i) {
			try {
				Select sel1 = new Select(to);
				sel1.selectByValue(i);
			} catch (Exception ex) {
				ex.printStackTrace();
			
		}}
		public  void Fromdate() {
			from.click();
			fr.click();
		}
		public void Todate() {
			returndate.click();
			re.click();
			
		}
		public void Passenger() {
			passenger.click();
			adult.click();
			child.click();
			
			
		}
		public void Money(String w) {
			try {
				Select sel2 = new Select(currency);
				sel2.selectByValue(w);
			} catch (Exception ex) {
				ex.printStackTrace();
			
		}
		}
		public void Family() {
			family.click();
		}
		public void Search() {
			search.click();
		}
		

}
