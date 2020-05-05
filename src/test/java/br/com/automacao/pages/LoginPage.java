package br.com.automacao.pages;

import org.openqa.selenium.By;

import br.com.automacao.core.BasePage;
import br.com.automacao.entity.Usuario;

public class LoginPage extends BasePage {

	final private String campoUsuario = "email";
	final private String campoSenha = "passwd";
	final private String botaoLogin = "SubmitLogin";
	final private String tituloTela = ".page-heading";
	final private String mensagemAlerta = ".alert > p";
	final private String detalhesMensagemAlerta = ".alert > ol > li";

	public void preencherCamposDatela(Usuario usuario) {
		escrever(By.id(campoUsuario), usuario.getUsuario());
		escrever(By.id(campoSenha), usuario.getSenha());
	}

	public void cliqueBotaoLogin() {
		clique(By.id(botaoLogin));
	}

	public String obterTituloTela() {
		return obterTexto(By.cssSelector(tituloTela));
	}

	public String obterMensagemAlerta() {
		return obterTexto(By.cssSelector(mensagemAlerta));
	}

	public String obterDetalhesMensagemAlerta() {
		return obterTexto(By.cssSelector(detalhesMensagemAlerta));
	}

}