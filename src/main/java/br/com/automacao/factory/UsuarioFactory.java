package br.com.automacao.factory;

import br.com.automacao.entity.Usuario;
import br.com.automacao.utils.FakerUtils;

public class UsuarioFactory {

	public static Usuario obterNovoUsuario() {
		Usuario usuario = new Usuario();
		usuario.setSenha("123456");
		usuario.setUsuario(FakerUtils.gerarEmailAleatorio());
		usuario.setNome("Nome");
		usuario.setSobreNome("Sobrenome");
		usuario.setEmpresa("Empresa X");
		usuario.setEndereco("Endereço Y");
		usuario.setCidade("São Paulo");
		usuario.setCodigoPostal("12345");
		usuario.setTelefone("7999998888");
		usuario.setEnderecoAlternativo("Endereco alternativo");
		return usuario;
	}

	public static Usuario obterUsuarioLoginValido() {
		Usuario usuario = new Usuario();
		usuario.setSenha("123456");
		usuario.setUsuario("email2233@email.com");
		return usuario;
	}

	public static Usuario obterUsuarioLoginInvalido() {
		Usuario usuario = new Usuario();
		usuario.setSenha("789456");
		usuario.setUsuario("email2233@email.com");
		return usuario;
	}
}