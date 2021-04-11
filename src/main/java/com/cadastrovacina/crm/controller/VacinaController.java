package com.cadastrovacina.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cadastrovacina.crm.dtos.VacinaDTO;
import com.cadastrovacina.crm.dtos.VacinaDTOResponse;
import com.cadastrovacina.crm.model.Vacina;
import com.cadastrovacina.crm.repository.VacinaRepository;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

	@Autowired
	private VacinaRepository vacinaRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public VacinaDTOResponse adicionar(@RequestBody VacinaDTO vacinaDto) {

		Vacina vacina = vacinaDto.toModel();
		Vacina save = vacinaRepository.save(vacina);

		return VacinaDTOResponse.converte(save);
	}
}
