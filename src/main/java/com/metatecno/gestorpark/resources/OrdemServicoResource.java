package com.metatecno.gestorpark.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metatecno.gestorpark.domain.OrdemServico;
import com.metatecno.gestorpark.services.OrdemServicoService;

@RestController
@RequestMapping(value="/ordemservicos")
public class OrdemServicoResource {

	@Autowired
	private OrdemServicoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		OrdemServico obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
