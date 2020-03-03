package americanas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import pages.CadastrarPage;
import pages.IndexPage;

public class Cadastrar {
	
	public static void main(String[] args) throws Throwable {
	Hooks Hooks = new Hooks();
	Hooks.primeiroIniciar();
	}
	
	CadastrarPage objCadastrarPage;
	IndexPage objIndexPage;
	
	@Dado("^que faco acesso no site da americanas$")
	public void que_faco_acesso_no_site_da_americanas() throws Throwable {
		Hooks.Print("Acessei o site da Americanas");

		System.out.println("Passo 1 - Acessei o site da Americanas");

	}
	
	@Dado("^Clico em Cadastrar$")
	public void clico_em_Cadastrar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		((WebElement) objIndexPage.Cadastrese).click();
		
		Hooks.Print("Passo 2 - Cliquei em cadastrar");
		
		((WebElement) objIndexPage.ClienteNovo).click();
		
		System.out.println("Passo 2 - Cliquei em Cadastrar");
	}

	@Dado("^Preencho Meus Dados e clico em Criar seu Cadastro$")
	public void preencho_Meus_Dados_e_clico_em_Criar_seu_Cadastro() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		
		((WebElement) objCadastrarPage.EmailNovo).sendKeys("eric.castro.lapol@hotmail.com");
		((WebElement) objCadastrarPage.SenhaNovo).sendKeys("eric060995");
		((WebElement) objCadastrarPage.CPFNovo).sendKeys("18835655021");
		((WebElement) objCadastrarPage.NomeNovo).sendKeys("Eric Teste de Castro");
		((WebElement) objCadastrarPage.DatadeNascimentoNovo).sendKeys("06091995");
		((WebElement) objCadastrarPage.SexoNovo).click();
		((WebElement) objCadastrarPage.TelefoneNovo).sendKeys("11940028922");
		Hooks.Print("Passo 3 - Informei os dados de cadastro");
		((WebElement) objCadastrarPage.CadastrarNovo).click();
		
		System.out.println("Preenchi os dados e cliquei em Criar Cadastro");
	}

	@Entao("^Acessei com o meu cadastro$")
	public void acesso_com_o_meu_cadastro() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		assertEquals("Eric", ((WebElement) objCadastrarPage.NomeUsuarioNovo).getText());
		
		Hooks.Print("Acessei com o meu cadastro - Cadastrar");
		
		System.out.println("Passo 4 - Acessei com o meu Cadastro");
	}


}
