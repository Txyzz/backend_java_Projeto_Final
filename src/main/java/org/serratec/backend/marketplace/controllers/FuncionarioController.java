package org.serratec.backend.marketplace.controllers;

import java.util.List;

import javax.validation.Valid;

import org.serratec.backend.marketplace.entidades.Funcionario;
import org.serratec.backend.marketplace.exceptions.DataNotFoundException;
import org.serratec.backend.marketplace.servicos.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	@Autowired
	FuncionarioService funcionarioService;
	
	@GetMapping
	public List<Funcionario> buscaTodos() {
		return funcionarioService.buscaTodos();
	}
	
	@GetMapping("/{id}")
	public Funcionario buscaPorId(@PathVariable Integer id) throws DataNotFoundException {
		return funcionarioService.buscaPorId(id);
	}
	
	@PostMapping
	public Funcionario inclui(@Valid @RequestBody Funcionario funcionario) {
		return funcionarioService.incluiFuncionario(funcionario);
	}
	
	@PutMapping("/{id}")
	public Funcionario atualiza(@PathVariable Integer id, @Valid @RequestBody Funcionario funcionario) throws DataNotFoundException {
		return funcionarioService.atualizaFuncionario(id, funcionario);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity apaga(@PathVariable Integer id) throws DataNotFoundException {
		funcionarioService.apagaFuncionario(id);
		return ResponseEntity.ok().build();
	}

}
