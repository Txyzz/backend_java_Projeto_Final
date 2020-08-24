package org.serratec.backend.marketplace.controllers;

import java.util.List;

import javax.validation.Valid;

import org.serratec.backend.marketplace.entidades.Produto;
import org.serratec.backend.marketplace.exceptions.DataNotFoundException;
import org.serratec.backend.marketplace.servicos.ProdutoService;
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
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> buscaTodos() {
		return produtoService.buscaTodos();
	}
	
	@GetMapping("/{id}")
	public Produto buscaPorId(@PathVariable Integer id) throws DataNotFoundException {
		return produtoService.buscaPorId(id);
	}
	
	@PostMapping
	public Produto inclui(@Valid @RequestBody Produto produto) {
		return produtoService.incluiProduto(produto);
	}
	
	@PutMapping("/{id}")
	public Produto atualiza(@PathVariable Integer id, @Valid @RequestBody Produto produto) throws DataNotFoundException {
		return produtoService.atualizaProduto(id, produto);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity apaga(@PathVariable Integer id) throws DataNotFoundException {
		produtoService.apagaProduto(id);
		return ResponseEntity.ok().build();
	}

}
