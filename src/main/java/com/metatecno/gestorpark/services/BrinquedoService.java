package com.metatecno.gestorpark.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metatecno.gestorpark.domain.Brinquedo;
import com.metatecno.gestorpark.repositories.BrinquedoRepository;

@Service
public class BrinquedoService {
	
	@Autowired
	private BrinquedoRepository repo;
	
	public Brinquedo findById(Integer id) {
		Optional<Brinquedo> obj = repo.findById(id);
		return obj.get();
	}

}
