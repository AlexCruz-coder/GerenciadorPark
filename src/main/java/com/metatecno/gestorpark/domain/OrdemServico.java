package com.metatecno.gestorpark.domain;

import java.io.Serializable;
import java.util.Calendar;
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
public class OrdemServico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ORDEM")
	private Integer id;
	
	@OneToOne
	private Brinquedo brinquedo;
	
	@OneToOne
	private Funcionario funcionario;
	
	@Column(name="DT_ABERTURA")
	private Calendar dataAbertura;
	
	@Column(name="DT_CONCLUSAO")
	private Calendar dataConclusao;
	
	private TpStatus status;
	
	public OrdemServico() {
		
	}

	public OrdemServico(Integer id, Brinquedo brinquedo, Funcionario funcionario, Calendar dataAbertura, Calendar dataConclusao,
			TpStatus status) {
		super();
		this.id = id;
		this.brinquedo = brinquedo;
		this.funcionario = funcionario;
		this.dataAbertura = dataAbertura;
		this.dataConclusao = dataConclusao;
		this.status = status;
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
		OrdemServico other = (OrdemServico) obj;
		return Objects.equals(id, other.id);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Brinquedo getBrinquedo() {
		return brinquedo;
	}

	public void setBrinquedo(Brinquedo brinquedo) {
		this.brinquedo = brinquedo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Calendar getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Calendar dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public TpStatus getStatus() {
		return status;
	}

	public void setStatus(TpStatus status) {
		this.status = status;
	}
	
	
	
	

}
