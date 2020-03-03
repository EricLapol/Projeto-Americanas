package americanas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.BuscaPage;
import pages.CestaPage;
import pages.GarantiaPage;
import pages.IndexPage;
import pages.ProdutoSelecionadoPage;

public class Consultar {

	public static void main(String[] args) throws Throwable {
	Hooks Hooks = new Hooks();
	Hooks.primeiroIniciar();
	}
	
	IndexPage objIndexPage;
	BuscaPage objBuscaPage;
	ProdutoSelecionadoPage objProdutoSelecionadoPage;
	GarantiaPage objGarantiaPage;
	CestaPage objCestaPage;
	
	@Dado("^que acessei no site da americanas$")
	public void que_acessei_no_site_da_americanas() throws Throwable {
		Hooks.Print("Acessei o site da Americanas");

		System.out.println("Passo 1 - Acessei o site da Americanas");

	}

	@Quando("^busco pelo produto \"([^\"]*)\"$")
	public void busco_pelo_produto(String termo) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		((WebElement) objIndexPage.PesquisaProduto).click();
		((WebElement) objIndexPage.PesquisaProduto).sendKeys("iphone");
		Hooks.Print("Passo 2 - Busquei o produto");
		((WebElement) objIndexPage.PesquisaProduto).sendKeys(Keys.ENTER);

		System.out.println("Busquei o produto");

	}

	@E("^clico no produto$")
	public void clico_no_produto() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Hooks.Print("Passo 3 - Cliquei no produto");

		((WebElement) objBuscaPage.ProdutoBuscado).click();
		
		System.out.println("Cliquei no produto");

	}

	@E("^clico no botao comprar$")
	public void clico_no_botao_comprar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Hooks.Print("Passo 4 - Cliquei no botao comprar");
		
		((WebElement) objProdutoSelecionadoPage.Comprar).click();

		System.out.println("Cliquei no botao comprar");

	}

	@E("^clico no botao continuar$")
	public void clico_no_botao_continuar() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		Hooks.Print("Passo 5 - Cliquei no botao continuar");
		
		((WebElement) objGarantiaPage.Continuar).click();

		System.out.println("Cliquei no botao continuar");

	}

	@Entao("^o produto aparece no carrinho de compras$")
	public void o_produto_aparece_no_carrinho_de_compras() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		assertEquals("Minha cesta", ((WebElement) objCestaPage.TituloCesta).getText());
		
		Hooks.Print("Produto no carrinho de compras");

		System.out.println("Passo 6 - Verifiquei o produto no carrinho de compras");

	}

}
