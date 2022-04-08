package com.metatecno.gestorpark.domain;

import java.io.Serializable;
import java.util.Objects;

public class Especialidade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//@Column(name="ID_ESPECIALIDADE")
	private Integer ID;
	
	//@Column(name="NM_ESPECIALIDADE")
	private String NmEspecialidade;
	
	public Especialidade() {
		
	}

	public Especialidade(Integer iD, String nmEspecialidade) {
		super();
		ID = iD;
		NmEspecialidade = nmEspecialidade;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNmEspecialidade() {
		return NmEspecialidade;
	}

	public void setNmEspecialidade(String nmEspecialidade) {
		NmEspecialidade = nmEspecialidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
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
		return Objects.equals(ID, other.ID);
	}
	
	
}
