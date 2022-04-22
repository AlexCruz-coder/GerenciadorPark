package com.metatecno.gestorpark.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metatecno.gestorpark.domain.ObservacaoOrdem;
import com.metatecno.gestorpark.repositories.ObservacaoOrdemRepository;

@Service
public class ObservacaoOrdemService {
	
	@Autowired
	private ObservacaoOrdemRepository repo;
	
	public ObservacaoOrdem findById(Integer id) {
		Optional<ObservacaoOrdem> obj = repo.findById(id);
		return obj.get();
	}

}
