package org.serratec.backend.marketplace.controllers;

import org.serratec.backend.marketplace.exceptions.DataNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<String> trataProdutoNotFound(DataNotFoundException e) {
		return ResponseEntity
				.notFound()
				.header("error-code", "DADOS_NAO_ENCONTRADOS")
				.header("error-value", String.valueOf(e.getId()))
				.build();
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> trataValidacao(MethodArgumentNotValidException e) {
		return ResponseEntity
				.badRequest()
				.header("error-code", "REGISTRO_INVALIDO")
				.header("error-message", e.getMessage())
				.build();
	}
}
