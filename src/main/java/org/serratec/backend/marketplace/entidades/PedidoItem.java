package org.serratec.backend.marketplace.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;

@Entity
@Table(name="pedido_item")
public class PedidoItem {
	@Id
	@GeneratedValue(strategy = 	GenerationType.IDENTITY)
	private Integer id;
	
	
	@DecimalMin(value = "1", inclusive = true)
	@DecimalMax(value = "999", inclusive = true)
	@Column(name="quantidade", nullable = false, scale = 3)
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name="produto_id", referencedColumnName = "id", nullable = false)
	private Produto produto;
}

