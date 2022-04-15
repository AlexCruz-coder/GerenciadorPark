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
public class Especialidade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ESPECIALIDADE")
	private Integer id;
	
	@Column(name="NM_ESPECIALIDADE")
	private String nmEspecialidade;
	
	@OneToMany
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public Especialidade() {
		
	}

	public Especialidade(Integer id, String nmEspecialidade) {
		super();
		this.id = id;
		this.nmEspecialidade = nmEspecialidade;
	}
	

	public Especialidade(Integer id, String nmEspecialidade, List<Funcionario> funcionarios) {
		super();
		this.id = id;
		this.nmEspecialidade = nmEspecialidade;
		this.funcionarios = funcionarios;
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
		Especialidade other = (Especialidade) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNmEspecialidade() {
		return nmEspecialidade;
	}

	public void setNmEspecialidade(String nmEspecialidade) {
		this.nmEspecialidade = nmEspecialidade;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void setFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
