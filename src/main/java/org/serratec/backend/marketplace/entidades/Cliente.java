package org.serratec.backend.marketplace.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Size(min=5, max=50)
	@Column(name="nome", nullable=false, length=50)
	private String nome;
	
	@NotNull
	@Size(min=4, max=20)
	@Column(name="usuario", nullable=false, length=20)
	private String usuario;
	
	@NotNull
	@Size(min=11, max=14)
	@Column(name="cpf", nullable=false, length=14)
	private String cpf;
	
	@NotNull
	@Size(min=3, max=50)
	@Column(name="email", nullable=false, length=50)
	private String email;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name="data_nascimento", nullable = false)
	private Date dataNascimento;
	
	@NotNull
	@Size(min=5, max=15)
	@Column(name= "telefone", nullable=false, length = 15)
	private String telefone;
	
	@NotNull
	@Size(min=5, max=50)
	@Column(name="rua", nullable=false, length=50)
	private String rua;
	
	@NotNull
	@Size(min=1, max=10)
	@Column(name="numero", nullable=false, length=10)
	private String numero;
	
	@Size(min=0, max=30)
	@Column(name="complemento", nullable=true, length=30)
	private String complemento;
	
	@NotNull
	@Size(min=0, max=50)
	@Column(name="bairro", nullable=true, length=50)
	private String bairro;
	
	@NotNull
	@Size(min=5, max=10)
	@Column(name="cep", nullable=false, length=10)
	private String cep;
	
	@NotNull
	@Size(min=3,max=40)
	@Column(name="cidade", nullable=false, length=40)
	private String cidade;
	
	@NotNull
	@Size(min=2, max=2)
	@Column(name="uf", nullable=false, length=2)
	private String estado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getData_nascimento() {
		return dataNascimento;
	}

	public void setData_nascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}


