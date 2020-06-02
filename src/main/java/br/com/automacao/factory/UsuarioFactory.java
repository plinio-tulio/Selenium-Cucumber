package br.com.automacao.factory;

import br.com.automacao.entity.Usuario;
import br.com.automacao.utils.FakerUtils;

public class UsuarioFactory {

	public static Usuario obterNovoUsuario() {
		Usuario usuario = Usuario.builder()
				.senha("123456")
				.usuario(FakerUtils.gerarEmailAleatorio())
				.nome("Nome")
				.sobreNome("Sobrenome")
				.empresa("Empresa X")
				.endereco("Endereço Y")
				.cidade("São Paulo")
				.codigoPostal("12345")
				.telefone("7999998888")
				.enderecoAlternativo("Endereco alternativo")
				.build();
		return usuario;
	}

	public static Usuario obterUsuarioLoginValido() {
		Usuario usuario = Usuario.builder()
				.senha("123456")
				.usuario("email2233@email.com")
				.build();
		return usuario;
	}

	public static Usuario obterUsuarioLoginInvalido() {
		Usuario usuario = Usuario.builder()
				.senha("789456")
				.usuario("email2233@email.com")
				.build();
		return usuario;
	}
}