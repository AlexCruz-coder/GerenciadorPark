package com.metatecno.gestorpark.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metatecno.gestorpark.domain.Brinquedo;
import com.metatecno.gestorpark.services.BrinquedoService;

@RestController
@RequestMapping(value="/brinquedos")
public class BrinquedoResource {
	
	@Autowired
	private BrinquedoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Brinquedo obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
