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
		selecionarComboDia("10");
		clique(comboMonth);
		selecionarComboMes("10");
		clique(comboYear);
		selecionarComboAno("2000");
		escrever(campoFirstName, usuario.getNome());
		escrever(campoLastName, usuario.getSobreNome());
		escrever(campoCompany, usuario.getEmpresa());
		escrever(campoAndress, usuario.getEndereco());
		escrever(campoCity, usuario.getCidade());
		clique(comboState);
		selecionarComboState("California");
		escrever(campoPostCode, usuario.getCodigoPostal());
		clique(comboCounty);
		selecionarComboCountry("United States");
		escrever(campoMobilePhone, usuario.getTelefone());
		escrever(campoAlias, usuario.getEnderecoAlternativo());
	}

	public void selecionarComboDia(String valor){
		encontrarElementoByValue(opcoesComboDays, valor).click();
	}

	public void selecionarComboMes(String valor){
		encontrarElementoByValue(opcoesComboMes, valor).click();
	}

	public void selecionarComboAno(String valor){
		encontrarElementoByValue(opcoesComboAno, valor).click();
	}

	public void selecionarComboState(String valor){
		encontrarElementoByText(opcoesComboState, valor).click();
	}

	public void selecionarComboCountry(String valor){
		encontrarElementoByText(opcoesComboCountry, valor).click();
	}

	public void cliqueSalvar() {
		clique(botaoSubmitAccount);
	}

}