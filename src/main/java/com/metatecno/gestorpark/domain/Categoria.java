package com.metatecno.gestorpark.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CATEGORIA")
	private Integer id;
	
	@Column(name="NM_CATEGORIA")
	private String nome;
	
	@OneToMany
	private List<Brinquedo> brinquedos = new ArrayList<Brinquedo>(); 
	
	public Categoria() {
	}

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}

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

	public List<Brinquedo> getBrinquedos() {
		return brinquedos;
	}

	public void setBrinquedos(List<Brinquedo> brinquedos) {
		this.brinquedos = brinquedos;
	}
	
	public void setBrinquedos(Brinquedo brinquedo) {
		this.brinquedos.add(brinquedo);
	}
}
