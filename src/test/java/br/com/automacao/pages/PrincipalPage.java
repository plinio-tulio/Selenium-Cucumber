package br.com.automacao.pages;

import br.com.automacao.maps.PrincipalElementMap;

public class PrincipalPage extends PrincipalElementMap {

	public void acessarTelaPrincipal() {

		acessar(BaseURL);
	}

	public void cliqueBotaoLogin() {

		botaoLogin.click();
	}

	public void cliqueMenuSignout() {

		clique(SignOut);
	}

	public void cliqueCadastrarUsuario() {

		botaoCadastrarUsuario.click();
	}

	public void prencherCampoEmailCadastro(String emailCriacao) {

		escrever(campoEmailCreate, emailCriacao);
	}

}