package br.com.automacao.core;

import static br.com.automacao.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {

	public void acessar(String texto) {
		getDriver().get(texto);
	}

	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public void clique(By by) {
		getDriver().findElement(by).click();
	}

}