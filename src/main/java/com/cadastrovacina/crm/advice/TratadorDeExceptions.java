package com.cadastrovacina.crm.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeExceptions {

	@ExceptionHandler
	public ResponseEntity<Map<String, String>> trataIllegalArgumentException(IllegalArgumentException exception) {

		String erro = exception.getMessage();

		if (exception.getMessage().contains("PUBLIC.USUARIO(CPF)")) {
			erro = "Já existe um usuário com esse CPF";
		}

		else if (exception.getMessage().contains("PUBLIC.USUARIO(EMAIL)")) {
			erro = "Já existe um usuário com esse email";
		}

		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Erro", erro);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(hashMap);
	}

}
