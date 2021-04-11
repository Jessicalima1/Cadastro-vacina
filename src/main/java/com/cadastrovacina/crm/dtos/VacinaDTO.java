package com.cadastrovacina.crm.dtos;

import java.util.Date;

import com.cadastrovacina.crm.model.Vacina;

public class VacinaDTO {

	private String nome;
	private String emailUsuario;
	private Date dataVacina;

	public VacinaDTO(String nome, String emailUsuario, Date dataVacina) {
		this.nome = nome;
		this.emailUsuario = emailUsuario;
		this.dataVacina = dataVacina;
	}

	public Vacina toModel() {
		Vacina vacina = new Vacina(nome, emailUsuario, dataVacina);
		return vacina;
	}
}
