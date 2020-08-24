package org.serratec.backend.marketplace.repositorios;

import java.util.Optional;

import org.serratec.backend.marketplace.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>  {
	//@Query("select l from produto 1 where l.id=:id")
	//Optional<Produto> findById(@Param("id") String id);
}
