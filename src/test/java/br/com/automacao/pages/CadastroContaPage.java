package br.com.automacao.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.automacao.entity.Usuario;

public class CadastroContaPage {

	static WebDriver driver;

	public CadastroContaPage(WebDriver driver) {
		this.driver = driver;
	}

	public static void preencherCampos(Usuario usuario) {
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys(usuario.getNome());
		driver.findElement(By.id("customer_lastname")).sendKeys(usuario.getSobreNome());
		driver.findElement(By.id("passwd")).sendKeys(usuario.getSenha());
		driver.findElement(By.id("days")).click();
		driver.findElement(By.cssSelector("#days > option:nth-child(2)")).click();
		driver.findElement(By.id("months")).click();
		driver.findElement(By.cssSelector("#months > option:nth-child(2)")).click();
		driver.findElement(By.id("years")).click();
		driver.findElement(By.cssSelector("#years > option:nth-child(2)")).click();
		driver.findElement(By.id("firstname")).sendKeys(usuario.getNome());
		driver.findElement(By.id("lastname")).sendKeys(usuario.getSobreNome());
		driver.findElement(By.id("company")).sendKeys(usuario.getEmpresa());
		driver.findElement(By.id("address1")).sendKeys(usuario.getEndereco());
		driver.findElement(By.id("city")).sendKeys(usuario.getCidade());
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.cssSelector("#id_state > option:nth-child(2)")).click();
		driver.findElement(By.id("postcode")).sendKeys(usuario.getCodigoPostal());
		driver.findElement(By.id("id_country")).click();
		driver.findElement(By.cssSelector("#id_country > option:nth-child(2)")).click();
		driver.findElement(By.id("phone_mobile")).sendKeys(usuario.getTelefone());
		driver.findElement(By.id("alias")).sendKeys(usuario.getEnderecoAlternativo());
	}

	public static void cliqueSalvar() {
		driver.findElement(By.id("submitAccount")).click();
	}

}