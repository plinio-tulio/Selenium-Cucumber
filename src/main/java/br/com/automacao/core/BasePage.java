package br.com.automacao.core;

import static br.com.automacao.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	final protected String BaseURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	public BasePage(){

		PageFactory.initElements(getDriver(),this);
	}

	public void acessar(String texto) {

		getDriver().get(texto);
	}

	public void escrever(WebElement element, String texto) {

		element.sendKeys(texto);
	}

	public String obterTexto(WebElement element) {

		return element.getText();
	}

	public void clique(WebElement element) {

		element.click();
	}

}