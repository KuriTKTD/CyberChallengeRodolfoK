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
		metodos.abrirNavegador( "http://demo.automationtesting.in/Register.html", "Acessando o site");
		
		metodos.maximizarNavegador();	

	}

	@When("I complete action")
	public void i_complete_action() {
		//Cenário 1
		
		
		metodos.escrever("Rodolfo Akihiro", el.firstName);
		metodos.escrever("Kimura", el.lastName);
		metodos.escrever("Rua Fantasia nº01, apto 02, Vila Imaginária, 01122-000 - São Paulo, SP ", el.adress);
		metodos.escrever("rodolfo@gmail.com", el.email);
		metodos.escrever("1234567890", el.phone);
		metodos.clicar(el.maleButton);
		metodos.clicar(el.cricketButton);
		metodos.clicar(el.hockeyButton);
		metodos.clicar(el.languagesButton);
		metodos.clicar(el.languagesEnglish);
		metodos.clicar(el.languagesJapanese);
		metodos.clicar(el.languagesPortuguese);
		metodos.clicar(el.languagesSpanish);
		metodos.menuDropdown1("Adobe Photoshop", "Brazil");
		metodos.clicar(el.countryButton);
		metodos.clicar(el.countryNewZealand);
		metodos.menuDataNascimento("1", "April", "1992");
		metodos.escrever("senhA123", el.password);
		metodos.escrever("senhA123", el.confirmPassword);
		metodos.clicar(el.submitAqui);
		
		
		//---------------------------------------------------------------------------------
		//Cenário 2
		
		
		metodos.clicar(el.switchToButton);
		metodos.clicar(el.framesButton);
		//metodos.clicar(el.Iframe2);
		metodos.switchToEEscrever(el.inputSlot1, "Escrevendo dentro de um Iframe!");
		
		//---------------------------------------------------------------------------------
		//Cenário 3
		
		metodos.clicar(el.widgetsButton);
		metodos.clicar(el.datePickerButton);
		
		metodos.clicar(el.datePickerSelectB);
		metodos.escrever("04/27/1992", el.datePickerSelectB);
		
		metodos.clicar(el.datePickerSelectA);
		
		int cliques = metodos.qtdeCliques(metodos.calculaPeriodo(1992, 4, 27));
		
		
		for (int i = 0; i < cliques; i++) {
		
			metodos.clicar(el.backButton);
			
		}
		
		metodos.clicarData("27");   
		
		//---------------------------------------------------------------------------------
		//Cenário 4
		
		metodos.clicar(el.widgetsButton);
		metodos.clicar(el.sliderButton);
		metodos.moverSlider();
		
	
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
		metodos.fecharNavegador("fechando navegador");
	    
	}
	
}
