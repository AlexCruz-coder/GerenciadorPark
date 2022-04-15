package com.metatecno.gestorpark.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metatecno.gestorpark.domain.Funcionario;
import com.metatecno.gestorpark.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repo;
	
	public Funcionario findById(Integer id) {
		
		Optional<Funcionario> obj = repo.findById(id);
			return obj.get();
	}

}
