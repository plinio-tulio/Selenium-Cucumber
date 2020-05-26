package br.com.automacao.pages;

import br.com.automacao.maps.LoginElementMap;

import br.com.automacao.entity.Usuario;

public class LoginPage extends LoginElementMap {

	public void preencherCamposDatela(Usuario usuario) {

		escrever(campoEmail, usuario.getUsuario());
		escrever(campoSenha, usuario.getSenha());
	}

	public void cliqueBotaoLogin() {

		botaoLogin.click();
	}

	public String obterTituloTela() {

		return obterTexto(tituloPagina);
	}

	public String obterMensagemAlerta() {

		return obterTexto(mensagemAlerta);
	}

	public String obterDetalhesMensagemAlerta() {

		return obterTexto(detalheMensagemAlerta);
	}

}