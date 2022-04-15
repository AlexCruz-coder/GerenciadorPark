package com.metatecno.gestorpark;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.metatecno.gestorpark.domain.Especialidade;
import com.metatecno.gestorpark.repositories.EspecialidadeRepository;

@SpringBootApplication
public class GestorparkApplication implements CommandLineRunner {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestorparkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Especialidade esp1 = new Especialidade(null, "Eletricista");
		Especialidade esp2 = new Especialidade(null, "Mecanico");
		
		List<Especialidade> listaEspecialidades = new ArrayList();
		listaEspecialidades.add(esp1);
		listaEspecialidades.add(esp2);
		
		especialidadeRepository.saveAll(listaEspecialidades);
		
	}

}
