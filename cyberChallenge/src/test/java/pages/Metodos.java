package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricaoPasso) {

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);

	}

	public void fecharNavegador(String descriPasso) {

		driver.quit();

	}

	public void escrever(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void marcarCheckbox(By elemento) {

		driver.findElement(elemento).click();

	}

	public void menuDropdown1(String texto1, String texto2) {

		WebElement menuSkillsEl = driver.findElement(By.id("Skills"));
		WebElement menuCountriesEl = driver.findElement(By.id("countries"));

		Select menuSkills = new Select(menuSkillsEl);
		Select menuCountries = new Select(menuCountriesEl);

		menuSkills.selectByVisibleText(texto1);
		menuCountries.selectByVisibleText(texto2);

	}

	public void menuDataNascimento(String dia, String mes, String ano) {

		WebElement menuDiaEl = driver.findElement(By.id("daybox"));
		WebElement menuMesEl = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select"));
		WebElement menuAnoEl = driver.findElement(By.id("yearbox"));

		Select menuDia = new Select(menuDiaEl);
		Select menuMes = new Select(menuMesEl);
		Select menuAno = new Select(menuAnoEl);

		menuDia.selectByVisibleText(dia);
		menuMes.selectByVisibleText(mes);
		menuAno.selectByVisibleText(ano);

	}
			

}
