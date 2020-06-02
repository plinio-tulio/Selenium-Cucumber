package br.com.automacao.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Usuario {

	private String usuario;
	private String senha;
	private String nome;
	private String sobreNome;
	private String empresa;
	private String endereco;
	private String cidade;
	private String codigoPostal;
	private String telefone;
	private String enderecoAlternativo;

}