package br.com.automacao.pages;

import br.com.automacao.maps.CadastroContaElementMap;

import br.com.automacao.entity.Usuario;

public class CadastroContaPage extends CadastroContaElementMap {

	public void preencherCampos(Usuario usuario) {

		clique(checkMr);
		escrever(campoCustumerFirstName, usuario.getNome());
		escrever(campoCustumerLastName, usuario.getSobreNome());
		escrever(campoPassword, usuario.getSenha());
		clique(comboDays);
		clique(opcaoComboDays("10"));
		clique(comboMonth);
		clique(opcaoComboMonth("10"));
		clique(comboYear);
		clique(opcaoComboYear("2000"));
		escrever(campoFirstName, usuario.getNome());
		escrever(campoLastName, usuario.getSobreNome());
		escrever(campoCompany, usuario.getEmpresa());
		escrever(campoAndress, usuario.getEndereco());
		escrever(campoCity, usuario.getCidade());
		clique(comboState);
		clique(opcaoComboState("California"));
		escrever(campoPostCode, usuario.getCodigoPostal());
		clique(comboCounty);
		clique(opcaoComboCountry("United States"));
		escrever(campoMobilePhone, usuario.getTelefone());
		escrever(campoAlias, usuario.getEnderecoAlternativo());
	}

	public void cliqueSalvar() {

		clique(botaoSubmitAccount);
	}

}