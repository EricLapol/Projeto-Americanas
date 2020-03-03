package pages;

import org.openqa.selenium.By;

public class CadastrarPage {
	
	public By EmailNovo = By.id("email-input");
	public By SenhaNovo = By.id("password-input");
	public By CPFNovo = By.id("cpf-input");
	public By NomeNovo = By.id("name-input");
	public By DatadeNascimentoNovo = By.id("birthday-input");
	public By SexoNovo = By.cssSelector(".radio:nth-child(2) > label");
	public By TelefoneNovo = By.id("phone-input");
	public By CadastrarNovo = By.cssSelector(".btn");
	public By NomeUsuarioNovo = By.cssSelector("span.usr-nick");

}
