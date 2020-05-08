package br.com.automacao.pages;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;
import br.com.automacao.entity.Usuario;

public class LoginPage extends BasePage {

	public void preencherCamposDatela(Usuario usuario) {
		escrever(By.id("email"), usuario.getUsuario());
		escrever(By.id("passwd"), usuario.getSenha());
	}

	public void cliqueBotaoLogin() {
		clique(By.id("SubmitLogin"));
	}

	public String obterTituloTela() {
		return obterTexto(By.cssSelector(".page-heading"));
	}

	public String obterMensagemAlerta() {
		return obterTexto(By.cssSelector(".alert > p"));
	}

	public String obterDetalhesMensagemAlerta() {
		return obterTexto(By.cssSelector(".alert > ol > li"));
	}

}