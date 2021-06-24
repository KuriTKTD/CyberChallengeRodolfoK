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
	
	

	
			
		
	
	
}
