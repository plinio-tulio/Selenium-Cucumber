package br.com.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrincipalPage {

	WebDriver driver;
	final private String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	public PrincipalPage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarTelaPrincipal() {
		driver.get(URL);
	}

	public void cliqueBotaoLogin() {
		driver.findElement(By.cssSelector(".login")).click();
	}

	public void cliqueMenuSignout() {
		driver.findElement(By.linkText("Sign out")).click();
	}

	public void cliqueCadastrarUsuario() {
		driver.findElement(By.id("SubmitCreate")).click();
	}

	public void prencherCampoEmailCadastro(String emailCriacao) {
		driver.findElement(By.id("email_create")).sendKeys(emailCriacao);
	}

}