package com.cadastrovacina.crm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

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
	public ResponseEntity<VacinaDTOResponse> adicionar(@Valid @RequestBody VacinaDTO vacinaDto,
			UriComponentsBuilder uriComponentsBuilder) {

		Vacina vacina = vacinaDto.toModel();
		Vacina save = vacinaRepository.save(vacina);

		return ResponseEntity.created(uriComponentsBuilder.path("/vacinas/{id}").buildAndExpand(save.getId()).toUri())
				.body(VacinaDTOResponse.converte(save));
	}
}
