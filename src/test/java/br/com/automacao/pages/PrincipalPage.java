package br.com.automacao.pages;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;

public class PrincipalPage extends BasePage {

	final private String BaseURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	public void acessarTelaPrincipal() {
		acessar(BaseURL);
	}

	public void cliqueBotaoLogin() {
		clique(By.cssSelector(".login"));
	}

	public void cliqueMenuSignout() {
		clique(By.linkText("Sign out"));
	}

	public void cliqueCadastrarUsuario() {
		clique(By.id("SubmitCreate"));
	}

	public void prencherCampoEmailCadastro(String emailCriacao) {
		escrever(By.id("email_create"), emailCriacao);
	}

}