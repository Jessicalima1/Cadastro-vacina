package com.cadastrovacina.crm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cadastrovacina.crm.dtos.UsuarioDTO;
import com.cadastrovacina.crm.dtos.UsuarioDTOResponse;
import com.cadastrovacina.crm.model.Usuario;
import com.cadastrovacina.crm.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@PostMapping
	public ResponseEntity<UsuarioDTOResponse> adicionar(@Valid @RequestBody UsuarioDTO usuarioDTO,
			UriComponentsBuilder uriComponentsBuilder) {

		Usuario usuario = usuarioDTO.toModel();
		Usuario save = usuarioRepository.save(usuario);

		return ResponseEntity.created(uriComponentsBuilder.path("/usuarios/{id}").buildAndExpand(save.getId()).toUri())
				.body(UsuarioDTOResponse.converte(save));

	}
}
