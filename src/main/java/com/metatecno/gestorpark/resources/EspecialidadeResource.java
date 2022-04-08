package com.metatecno.gestorpark.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/especialidades")
public class EspecialidadeResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String testar() {
		return "REST funcional";
	}

}
