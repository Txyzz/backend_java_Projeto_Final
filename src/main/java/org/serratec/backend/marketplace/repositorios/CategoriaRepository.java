package org.serratec.backend.marketplace.repositorios;

import org.serratec.backend.marketplace.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{}

