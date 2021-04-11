package com.cadastrovacina.crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cadastrovacina.crm.model.Usuario;
import com.cadastrovacina.crm.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario salvar(Usuario usuario) {

		try {
			return usuarioRepository.save(usuario);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException(e);
		}

	}
}
