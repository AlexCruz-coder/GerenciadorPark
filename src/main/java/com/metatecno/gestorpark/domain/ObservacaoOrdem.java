package com.metatecno.gestorpark.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.metatecno.gestorpark.domain.enums.TpStatus;

@Entity
public class ObservacaoOrdem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_OBSERVACAO")
	private Integer id;
	
	@OneToOne
	private OrdemServico ordemServico;
	
	@OneToOne
	private Funcionario funcionario;
	
	@Column(name="DESC_OBSERVACAO")
	private String descObservacao;

	public ObservacaoOrdem() {
		
	}
	
	public ObservacaoOrdem(Integer id, OrdemServico ordemServico, Funcionario funcionario, String descObservacao) {
		super();
		this.id = id;
		this.ordemServico = ordemServico;
		this.funcionario = funcionario;
		this.descObservacao = descObservacao;
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
		ObservacaoOrdem other = (ObservacaoOrdem) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getDescObservacao() {
		return descObservacao;
	}

	public void setDescObservacao(String descObservacao) {
		this.descObservacao = descObservacao;
	}

}
