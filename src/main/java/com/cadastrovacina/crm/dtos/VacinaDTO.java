package com.cadastrovacina.crm.dtos;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.cadastrovacina.crm.model.Vacina;

public class VacinaDTO {

	@NotEmpty
	private String nome;

	@NotEmpty
	@Email
	private String emailUsuario;

	@NotNull
	private Date dataVacina;

	public VacinaDTO(@NotEmpty String nome, @NotEmpty @Email String emailUsuario, @NotNull Date dataVacina) {
		this.nome = nome;
		this.emailUsuario = emailUsuario;
		this.dataVacina = dataVacina;
	}

	public Vacina toModel() {
		Vacina vacina = new Vacina(nome, emailUsuario, dataVacina);
		return vacina;
	}
}
