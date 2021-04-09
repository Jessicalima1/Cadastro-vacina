package com.cadastrovacina.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastrovacina.crm.model.Vacina;
import com.cadastrovacina.crm.repository.VacinaRepository;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

	@Autowired
	private VacinaRepository vacinaRepository;

	@GetMapping
	public List<Vacina> listar() {
		return vacinaRepository.findAll();
	}
	
}
