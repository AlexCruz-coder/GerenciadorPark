package com.metatecno.gestorpark.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metatecno.gestorpark.domain.Especialidade;
import com.metatecno.gestorpark.repositories.EspecialidadeRepository;

@Service
public class EspecialidadeService {
	
	@Autowired
	private EspecialidadeRepository repo;

	public Especialidade findById(Integer id) {
		
		Optional<Especialidade> obj = repo.findById(id);	
		return obj.get();
	}
}
