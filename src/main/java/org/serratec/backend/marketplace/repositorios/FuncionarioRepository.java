package org.serratec.backend.marketplace.repositorios;

import org.serratec.backend.marketplace.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;




public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{}

