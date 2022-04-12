package com.metatecno.gestorpark.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metatecno.gestorpark.domain.Especialidade;
import com.metatecno.gestorpark.services.EspecialidadeService;

@RestController
@RequestMapping(value="/especialidades")
public class EspecialidadeResource {
	
	@Autowired
	private EspecialidadeService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Especialidade obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
