package com.metatecno.gestorpark.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metatecno.gestorpark.domain.Funcionario;
import com.metatecno.gestorpark.services.FuncionarioService;

@RestController
@RequestMapping(value="/funcionarios")
public class FuncionarioResource {
	
	@Autowired
	private FuncionarioService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		
		Optional<Funcionario> obj = Optional.of(service.findById(id));	
		if (obj.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok().body(obj);
		}
		
	}
	

}
