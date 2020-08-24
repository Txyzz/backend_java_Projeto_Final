package org.serratec.backend.marketplace.servicos;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.serratec.backend.marketplace.entidades.Cliente;
import org.serratec.backend.marketplace.exceptions.DataNotFoundException;
import org.serratec.backend.marketplace.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	private Cliente findById(Integer id) throws DataNotFoundException {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if (cliente.isPresent()) {
			return cliente.get();		
		}
		throw new DataNotFoundException(id);
	}
	
	public Cliente buscaPorId(Integer id) throws DataNotFoundException {
		return findById(id);
	}
	
	public List<Cliente> buscaTodos() {
		return clienteRepository.findAll();
	}
	
	@Transactional
	public Cliente incluiCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@Transactional
	public Cliente atualizaCliente(Integer id, Cliente cliente) throws DataNotFoundException { 
		Cliente clienteBanco = findById(id);
		clienteBanco.setNome(cliente.getNome());
		clienteBanco.setTelefone(cliente.getTelefone());
		clienteBanco.setEmail(cliente.getEmail());
		clienteBanco.setCep(cliente.getCep());
		clienteBanco.setCidade(cliente.getCidade());
		clienteBanco.setBairro(cliente.getBairro());
		clienteBanco.setComplemento(cliente.getComplemento());
		clienteBanco.setNumero(cliente.getNumero());
		clienteBanco.setEstado(cliente.getEstado());
		clienteBanco.setRua(cliente.getRua());
		clienteBanco.setCpf(cliente.getCpf());
		clienteBanco.setData_nascimento(cliente.getData_nascimento());
		clienteBanco.setUsuario(cliente.getUsuario());
		return clienteRepository.save(clienteBanco);
	}
	
	public void apagaCliente(Integer id) throws DataNotFoundException {
		Cliente cliente = findById(id);
		clienteRepository.delete(cliente);
	}
	
		
}