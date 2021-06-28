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
	
	public By Iframe2 = By.cssSelector("body > section > div.container.center > div > div > div > div.col-xs-11.col-xs-offset-1 > div > ul > li:nth-child(2) > a");
	public By Iframe2Texbox = By.cssSelector("body > section > div > div > div > input[type=text]");
	
	//cenário 3
	
	public By widgetsButton = By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li:nth-child(5) > a");
	public By datePickerButton = By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li.dropdown.open > ul > li:nth-child(3) > a");
	public By datePickerSelectB = By.cssSelector("#datepicker2");
	public By datePickerSelectA = By.cssSelector("#datepicker1");
	public By backButton = By.cssSelector("#ui-datepicker-div > div > a.ui-datepicker-prev.ui-corner-all > span");
	public By dia27 = By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(5) > td.ui-datepicker-week-end.ui-datepicker-days-cell-over.ui-datepicker-today > a");
	public By testeEncontrarElemento = By.className("ui-state-default");
	
	
			//achando elementos do Calendário (enabled)
	public By yearB = By.cssSelector("body > div.datepick-popup > div > div.datepick-month-row > div > div > select:nth-child(2)");
	public By monthB = By.cssSelector("body > div.datepick-popup > div > div.datepick-month-row > div > div > select:nth-child(1)");
	
	public By topArrow = By.cssSelector("body > div.datepick-popup > div > div.datepick-month-row > div > div > select:nth-child(2) > option:nth-child(1)");
	
	//cenário 4
	
	public By sliderButton = By.cssSelector("#header > nav > div > div.navbar-collapse.collapse.navbar-right > ul > li.dropdown.open > ul > li:nth-child(4) > a");
	public By sliderA = By.cssSelector("#slider > a");
	
	
	
	
}
