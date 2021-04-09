package com.cadastrovacina.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Vacina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(nullable = false)
	private String Nome_da_vacina;

	@Column(nullable = false)
	private String Nome_do_usuário;

	@Column(nullable = false)
	private String Data_de_aplicação;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome_da_vacina() {
		return Nome_da_vacina;
	}

	public void setNome_da_vacina(String nome_da_vacina) {
		Nome_da_vacina = nome_da_vacina;
	}

	public String getNome_do_usuário() {
		return Nome_do_usuário;
	}

	public void setNome_do_usuário(String nome_do_usuário) {
		Nome_do_usuário = nome_do_usuário;
	}

	public String getData_de_aplicação() {
		return Data_de_aplicação;
	}

	public void setData_de_aplicação(String data_de_aplicação) {
		Data_de_aplicação = data_de_aplicação;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vacina other = (Vacina) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

}
