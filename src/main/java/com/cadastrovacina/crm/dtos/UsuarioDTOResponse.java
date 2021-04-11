package com.cadastrovacina.crm.dtos;

import java.util.Date;

import com.cadastrovacina.crm.model.Usuario;

public class UsuarioDTOResponse {

	private String nome;
	private String cpf;
	private Date nascimento;
	private String email;

	public UsuarioDTOResponse(Usuario usuario) {
		nome = usuario.getNome();
		cpf = usuario.getCpf();
		nascimento = usuario.getNascimento();
		email = usuario.getEmail();
	}

	public static UsuarioDTOResponse converte(Usuario usuario) {
		UsuarioDTOResponse usuarioDTOResponse = new UsuarioDTOResponse(usuario);
		return usuarioDTOResponse;

	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public String getEmail() {
		return email;
	}

}
