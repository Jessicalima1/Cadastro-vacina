package com.cadastrovacina.crm.dtos;

import java.util.Date;

import com.cadastrovacina.crm.model.Vacina;

public class VacinaDTOResponse {

	private String nomeVacina;
	private String emailUsuario;
	private Date dataAplicacao;

	public VacinaDTOResponse(Vacina vacina) {
		nomeVacina = vacina.getNomeDaVacina();
		emailUsuario = vacina.getEmailDoUsuario();
		dataAplicacao = vacina.getDataDeAplicacao();
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public Date getDataAplicacao() {
		return dataAplicacao;
	}

	public static VacinaDTOResponse converte(Vacina vacina) {
		VacinaDTOResponse vacinaDTOResponse = new VacinaDTOResponse(vacina);
		return vacinaDTOResponse;
	}
}