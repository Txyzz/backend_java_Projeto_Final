package org.serratec.backend.marketplace.servicos;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.serratec.backend.marketplace.entidades.Produto;
import org.serratec.backend.marketplace.exceptions.DataNotFoundException;
import org.serratec.backend.marketplace.repositorios.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	private Produto findById(Integer id) throws DataNotFoundException {
		Optional<Produto> produto = produtoRepository.findById(id);
		if (produto.isPresent()) {
			return produto.get();		
		}
		throw new DataNotFoundException(id);
	}
	
	public Produto buscaPorId(Integer id) throws DataNotFoundException {
		return findById(id);
	}
	
	public List<Produto> buscaTodos() {
		return produtoRepository.findAll();
	}
	
	@Transactional
	public Produto incluiProduto(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@Transactional
	public Produto atualizaProduto(Integer id, Produto produto) throws DataNotFoundException { 
		Produto produtoBanco = findById(id);
		produtoBanco.setNome(produto.getNome());
		produtoBanco.setDescricao(produto.getDescricao());
		produtoBanco.setDataFabricacao(produto.getDataFabricacao());
		produtoBanco.setQuantidadeEstoque(produto.getQuantidadeEstoque());
		produtoBanco.setValorUnitario(produto.getValorUnitario());
		return produtoRepository.save(produtoBanco);
	}
	
	public void apagaProduto(Integer id) throws DataNotFoundException {
		Produto produto = findById(id);
		produtoRepository.delete(produto);
	}
	
}
