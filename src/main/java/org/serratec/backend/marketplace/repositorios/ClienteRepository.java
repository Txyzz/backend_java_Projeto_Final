package org.serratec.backend.marketplace.repositorios;

import org.serratec.backend.marketplace.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {}
