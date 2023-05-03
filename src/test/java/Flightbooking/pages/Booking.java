package Flightbooking.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flightbooking.utils.Baseclass;

public class Booking extends Baseclass {

	/*@FindBy(xpath="//div[text()='Flights']")
	WebElement flight;
	@FindBy(xpath="//div[text()='one way']")
	WebElement oneway;*/
	@FindBy(xpath="//div[text()='From']")
	WebElement from;
	@FindBy(xpath="//div[text()='DEL']")
	WebElement agra;
	
	//@FindBy(xpath="(//div[@data-focusable='true'])[15]")
	//WebElement to;
	@FindBy(xpath="//div[text()='MAA']")
	WebElement del;
//	@FindBy(xpath="//div[text()='Departure Date']")
	//WebElement fromdate;
	@FindBy(xpath="(//div[text()='10'])[2]")
	WebElement fr;
	

	
   @FindBy(xpath="//div[text()='Passengers']")
   WebElement passenger;
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	WebElement adult;

	@FindBy(xpath="//div[text()='Students']")
	WebElement stu;
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement search;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[2]")
	WebElement check;
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement cont;
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement contin;
	
	@FindBy(xpath="(//input[@autocorrect='on'])[1]")

	WebElement firstname;
	@FindBy(xpath="(//input[@autocorrect='on'])[2]")
	WebElement lasttname;
	@FindBy(xpath="(//input[@autocorrect='on'])[3]")
	WebElement mobile;
	@FindBy(xpath="(//input[@autocorrect='on'])[4]")
	WebElement email;
	@FindBy(xpath="(//input[@autocorrect='on'])[5]")
	WebElement city;
	
	@FindBy(xpath="//div[text()='I prefer not to receive future communication and newsletter from SpiceJet over text, WhatsApp or e-mail.']")
	WebElement checkk;
	
	@FindBy(xpath="//div[text()='I am flying as the primary passenger']")
	WebElement check1;

	@FindBy(xpath="(//input[@autocorrect='on'])[9]")
	WebElement idcard;
	@FindBy(xpath="//div[text()='Next']")
	WebElement next;
	@FindBy(xpath="(//input[@autocorrect='on'])[6]")
	WebElement fname;
	@FindBy(xpath="(//input[@autocorrect='on'])[7]")
	WebElement lname;
	@FindBy(xpath="(//input[@autocorrect='on'])[8]")
	WebElement mobile1;
	@FindBy(xpath="(//input[@autocorrect='on'])[9]")
	WebElement id1;
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement continu;
	
	@FindBy(xpath="(//div[text()='Add'])[5]")
	WebElement ad2;
	@FindBy(xpath="(//div[text()='DEL - MAA'])[1]")
	WebElement box1;
	
	@FindBy(xpath="(//div[text()='DEL - MAA'])[2]")
	WebElement box2;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79']")
	WebElement don;
	@FindBy(xpath="//div[text()='Next:']")
	WebElement move;
	@FindBy(id="at_addon_close_icon")
	WebElement adver;
	@FindBy(xpath="//p[@class='tt_skip_link']")
	WebElement add;
	
	
	
	@FindBy(xpath="(//input[@type='tel'])[1]")
	WebElement atm;
	@FindBy(id="name_on_card")
	WebElement name;
	@FindBy(id="card_exp_month")
	WebElement exp;
	@FindBy(id="card_exp_year")
	WebElement expyear;
	@FindBy(id="security_code")
	WebElement cvv;
	@FindBy(xpath="//div[text()='Proceed to pay']")
	WebElement proceed;
	
	public void From() {
		
		from.click();
		
		
	}
	public void agr() {
		agra.click();
	}
	
		public void dell() {
			del.click();
		}
		public  void Fromdate() {
			//from.click();
			fr.click();
		}		
		public void Passenger() {
			passenger.click();
			}
		public void Adult() {
			adult.click();
			passenger.click();
		}
				
		public void Stud() {
			stu.click();
		}
		public void Search() {
			search.click();
		}
		public void Check() {
			check.click();
		}
		public void Cont() {
			cont.click();
		}
		public void Co() {
			contin.click();
			
		}
		public void Firstname(String a) {
			firstname.sendKeys(a);
		}
		public void Lastname(String b) {
			lasttname.sendKeys(b);
		}
		public void mob(String c) {
			mobile.sendKeys(c);
			
		}
		public void Email(String e) {
			email.sendKeys(e);
		}
		public void City(String d) {
			city.sendKeys(d);
		}
		public void Checkk() {
			checkk.click();
		}
		public void Check1() {
			check1.click();
		}public void Idcardno(String i) {
			idcard.sendKeys(i);
		}
		public void Next() {
			next.click();
		}
		public void Fname(String q) {
			fname.sendKeys(q);
		}
		public void Lname(String w) {
			lname.sendKeys(w);
		}
		public void Mob1(String r) {
			mobile1.sendKeys(r);
		}
		public  void IdCard(String t) {
			id1.sendKeys(t);
		}
		public void Continu() {
			continu.click();
		}
		//public void Adv() {
			//adv.click();
		//}

		public void add2() {

		ad2.click();
		box1.click();
		box2.click();
		
		don.click();
		//move.click();
		}
		public void Add() {
			move.click();
			//add.click();
		}
		public void Adver() {
			adver.click();
		}
		public void advv() {
			add.click();
		}
		public void Atm(String l) {
			atm.sendKeys(l);
		}
		public void Name(String k) {
			name.sendKeys(k);
			
		}
		public void Exp(String h) {
			exp.sendKeys(h);
		}
		public void Expyr(String g) {
			expyear.sendKeys(g);
		}
		public void Cvv(String cv) {
			cvv.sendKeys(cv);
		}
		public void Proceed() {
			proceed.click();
		}
}
