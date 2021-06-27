package elementos;

import org.openqa.selenium.By;


public class ElementosWeb {
		
	public By firstName = By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input");
	public By lastName = By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input");
	public By adress = By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea");
	public By email = By.cssSelector("#eid > input");
	public By phone = By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input");
	public By maleButton = By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input");
	public By femaleButton = By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(2) > input");
	public By cricketButton = By.cssSelector("#checkbox1");
	public By moviesButton = By.cssSelector("#checkbox2");
	public By hockeyButton = By.cssSelector("#checkbox3");
	public By password = By.cssSelector("#firstpassword");
	public By confirmPassword = By.cssSelector("#secondpassword");
	public By languagesButton = By.id("msdd");
	public By languagesEnglish = By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(3)");
	public By languagesJapanese = By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(21)");	
	public By languagesPortuguese = By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(29)");
	public By languagesSpanish = By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(35)");
	public By countryButton = By.cssSelector("#basicBootstrapForm > div:nth-child(10) > div > span > span.selection > span");
	public By countryNewZealand = By.cssSelector("#select2-country-results > li:nth-child(9)");
	public By submitAqui = By.cssSelector("#submitbtn");
	public By submitButton = By.id("#submitbtn");
	
	//cenário 2
		
	public By switchToButton = By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(4) > a");
	public By framesButton = By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(4) > ul > li:nth-child(3) > a");
	public By inputSlot1 = By.cssSelector("body > section > div > div > div > input[type=text]");
	//public By framesButton = By.cssSelector("");
	
	
}
