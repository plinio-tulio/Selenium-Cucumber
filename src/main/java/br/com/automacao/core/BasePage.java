package br.com.automacao.core;

import static br.com.automacao.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;
import java.util.Objects;

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

	protected WebElement encontrarElementoByText(java.util.List<WebElement> webElements, String text) {
		return webElements
				.stream()
				.filter(webElement -> Objects.equals(webElement.getText().trim(), text.trim()))
				.findFirst()
				.orElseThrow(() -> new NoSuchElementException("No WebElement found containing " + text));
	}

	protected WebElement encontrarElementoByValue(java.util.List<WebElement> webElements, String text) {
		return webElements
				.stream()
				.filter(webElement -> Objects.equals(webElement.getAttribute("value").trim(), text.trim()))
				.findFirst()
				.orElseThrow(() -> new NoSuchElementException("No WebElement found containing " + text));
	}

}