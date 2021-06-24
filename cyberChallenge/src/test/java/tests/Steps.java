package tests;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();
	
	
	@Given("I am at {string}")
	public void i_am_at(String appUrl) {
		metodos.abrirNavegador(appUrl, "Acessando o site");
		

	}

	@When("I complete action")
	public void i_complete_action() {
		
		metodos.escrever("Rodolfo Akihiro", el.firstName);
		metodos.escrever("Kimura", el.lastName);
		metodos.escrever("Rua Fantasia nº01, apto 02, Vila Imaginária, 01122-000 - São Paulo, SP ", el.adress);
		metodos.escrever("rodolfo@gmail.com", el.email);
		metodos.escrever("11 988776655", el.phone);
		metodos.marcarCheckbox(el.maleButton);
		metodos.marcarCheckbox(el.cricketButton);
		metodos.marcarCheckbox(el.hockeyButton);
		metodos.menuDropdown1("Adobe Photoshop", "Brazil");
		metodos.menuDataNascimento("1", "April", "1992");
		metodos.escrever("senha123", el.password);
		metodos.escrever("senha123", el.confirmPassword);
		
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
		//metodos.fecharNavegador("fechando navegador");
	    
	}
	
}
