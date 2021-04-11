package com.cadastrovacina.crm.dtos;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import com.cadastrovacina.crm.model.Usuario;

public class UsuarioDTO {

	@NotEmpty
	private String nome;

	@NotEmpty
	@CPF
	private String cpf;

	@NotNull
	private Date nascimento;

	@NotEmpty
	@Email
	private String email;

	public UsuarioDTO(@NotEmpty String nome, @NotEmpty String cpf, @NotNull Date nascimento,
			@NotEmpty @Email String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.email = email;
	}

	public Usuario toModel() {
		Usuario usuario = new Usuario(nome, cpf, nascimento, email);
		return usuario;
	}

}
