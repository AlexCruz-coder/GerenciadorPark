package com.metatecno.gestorpark.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metatecno.gestorpark.domain.Especialidade;

@RestController
@RequestMapping(value="/especialidades")
public class EspecialidadeResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Especialidade> listar() {
		
		Especialidade esp1 = new Especialidade(1,"Eletricista");
		Especialidade esp2 = new Especialidade(1,"Mecanico");
		
		List<Especialidade> lista = new ArrayList<>();
		lista.add(esp1);
		lista.add(esp2);
		
		return lista;
	}

}
