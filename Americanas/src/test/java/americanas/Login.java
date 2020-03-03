package americanas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import pages.CadastrarPage;
import pages.IndexPage;
import pages.LoginPage;

public class Login {

	public static void main(String[] args) throws Throwable {
	Hooks Hooks = new Hooks();
	Hooks.primeiroIniciar();
	}
	
	IndexPage objIndexPage;
	LoginPage objLoginPage;
	CadastrarPage objCadastrarPage;
	

	@Dado("^que acessei o site da americanas$")
	public void que_acessei_o_site_da_americanas() throws Throwable {
		Hooks.Print("Acessei o site da Americanas");

		System.out.println("Passo 1 - Acessei o site da Americanas");

	}
	
	@Dado("^Clico em Entrar$")
	public void clico_em_Entrar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		((WebElement) objIndexPage.Cadastrese).click();
		Hooks.Print("Passo 2 - Cliquei em entrar");
		((WebElement) objIndexPage.Entrar).click();
		
		System.out.println("Cliquei em Entrar");
	}

	@Dado("^Digito meu email e senha e clico em continuar$")
	public void digito_meu_email_e_senha_e_clico_em_continuar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		((WebElement) objLoginPage.EmailLogin).sendKeys("eric.castro.lapol@hotmail.com");
		((WebElement) objLoginPage.SenhaLogin).sendKeys("eric060995");
		Hooks.Print("Informei meus dados e cliquei em continuar");
		((WebElement) objLoginPage.ContinuarLogin).click();
		
		System.out.println("Passo 3 - Digitei meu email e senha e cliquei em Continuar");
	}

	@Entao("^Acesso com o meu cadastro$")
	public void acesso_com_o_meu_cadastro() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		assertEquals("Eric", ((WebElement) objCadastrarPage.NomeUsuarioNovo).getText());
		
		Hooks.Print("Acessei com o meu cadastro - Login");
		
		System.out.println("Passo 4 - Acessei com o meu Cadastro");
	}


}
