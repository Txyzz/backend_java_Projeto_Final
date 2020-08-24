package org.serratec.backend.marketplace.servicos;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.serratec.backend.marketplace.entidades.Pedido;
import org.serratec.backend.marketplace.exceptions.DataNotFoundException;
import org.serratec.backend.marketplace.repositorios.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	private Pedido findById(Integer id) throws DataNotFoundException {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		if (pedido.isPresent()) {
			return pedido.get();		
		}
		throw new DataNotFoundException(id);
	}
	
	public Pedido buscaPorId(Integer id) throws DataNotFoundException {
		return findById(id);
	}
	
	public List<Pedido> buscaTodos() {
		return pedidoRepository.findAll();
	}
	
	@Transactional
	public Pedido incluiPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	@Transactional
	public Pedido atualizaPedido(Integer id, Pedido pedido) throws DataNotFoundException { 
		Pedido pedidoBanco = findById(id);
		pedidoBanco.setDataPedido(pedido.getDataPedido());
		return pedidoRepository.save(pedidoBanco);
	}
	
	public void apagaPedido(Integer id) throws DataNotFoundException {
		Pedido pedido = findById(id);
		pedidoRepository.delete(pedido);
	}
	
}
