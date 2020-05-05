package br.com.automacao.pages;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;
import br.com.automacao.entity.Usuario;

public class CadastroContaPage extends BasePage {

	public void preencherCampos(Usuario usuario) {
		clique(By.id("id_gender1"));
		escrever(By.id("customer_firstname"), usuario.getNome());
		escrever(By.id("customer_lastname"), usuario.getSobreNome());
		escrever(By.id("passwd"), usuario.getSenha());
		clique(By.id("days"));
		clique(By.cssSelector("#days > option:nth-child(2)"));
		clique(By.id("months"));
		clique(By.cssSelector("#months > option:nth-child(2)"));
		clique(By.id("years"));
		clique(By.cssSelector("#years > option:nth-child(2)"));
		escrever(By.id("firstname"), usuario.getNome());
		escrever(By.id("lastname"), usuario.getSobreNome());
		escrever(By.id("company"), usuario.getEmpresa());
		escrever(By.id("address1"), usuario.getEndereco());
		escrever(By.id("city"), usuario.getCidade());
		clique(By.id("id_state"));
		clique(By.cssSelector("#id_state > option:nth-child(2)"));
		escrever(By.id("postcode"), usuario.getCodigoPostal());
		clique(By.id("id_country"));
		clique(By.cssSelector("#id_country > option:nth-child(2)"));
		escrever(By.id("phone_mobile"), usuario.getTelefone());
		escrever(By.id("alias"), usuario.getEnderecoAlternativo());
	}

	public void cliqueSalvar() {
		clique(By.id("submitAccount"));
	}

}