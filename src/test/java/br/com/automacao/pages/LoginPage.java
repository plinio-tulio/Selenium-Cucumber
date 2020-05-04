package br.com.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.automacao.entity.Usuario;

public class LoginPage {

	final private String campoUsuario = "email";
	final private String campoSenha = "passwd";
	final private String botaoLogin = "SubmitLogin";
	final private String tituloTela = ".page-heading";
	final private String mensagemAlerta = ".alert > p";
	final private String detalhesMensagemAlerta = ".alert > ol > li";

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void preencherCamposDatela(Usuario usuario) {
		driver.findElement(By.id(campoUsuario)).sendKeys(usuario.getUsuario());
		driver.findElement(By.id(campoSenha)).sendKeys(usuario.getSenha());
	}

	public void cliqueBotaoLogin() {
		driver.findElement(By.id(botaoLogin)).click();
	}

	public String obterTituloTela() {
		return driver.findElement(By.cssSelector(tituloTela)).getText();
	}

	public String obterMensagemAlerta() {
		return driver.findElement(By.cssSelector(mensagemAlerta)).getText();
	}

	public String obterDetalhesMensagemAlerta() {
		return driver.findElement(By.cssSelector(detalhesMensagemAlerta)).getText();
	}

}