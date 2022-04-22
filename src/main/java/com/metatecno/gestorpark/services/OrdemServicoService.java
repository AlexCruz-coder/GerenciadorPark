package com.metatecno.gestorpark.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metatecno.gestorpark.domain.OrdemServico;
import com.metatecno.gestorpark.repositories.OrdemServicoRepository;

@Service
public class OrdemServicoService {
	
	@Autowired
	private OrdemServicoRepository repo;
	
	public OrdemServico findById(Integer id) {
		Optional<OrdemServico> obj = repo.findById(id);
		return obj.get();
	}
	

}
