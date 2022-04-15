package com.metatecno.gestorpark;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.metatecno.gestorpark.domain.Especialidade;
import com.metatecno.gestorpark.domain.Funcionario;
import com.metatecno.gestorpark.repositories.EspecialidadeRepository;
import com.metatecno.gestorpark.repositories.FuncionarioRepository;

@SpringBootApplication
public class GestorparkApplication implements CommandLineRunner {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestorparkApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Inicializando as especialidades
		Especialidade esp1 = new Especialidade(null, "Eletricista");
		Especialidade esp2 = new Especialidade(null, "Mecanico");
		Especialidade esp3 = new Especialidade(null, "Soldador");
		
		List<Especialidade> listaEspecialidades = new ArrayList();
		listaEspecialidades.add(esp1);
		listaEspecialidades.add(esp2);
		listaEspecialidades.add(esp3);
		
		especialidadeRepository.saveAll(listaEspecialidades);
		
		//Inicializando os funcionarios
		Funcionario func1 = new Funcionario(null, "Major", esp2);
		Funcionario func2 = new Funcionario(null, "Jorge", esp1);
		Funcionario func3 = new Funcionario(null, "Marcos", esp2);
		Funcionario func4 = new Funcionario(null, "Aderbaldo", esp3);
		
		//Adicionando funcionarios nas Listas de Especialidades
		esp1.setFuncionarios(func2);
		esp2.setFuncionarios(func1);
		esp2.setFuncionarios(func3);
		esp3.setFuncionarios(func4);
		
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		listaFuncionarios.add(func1);
		listaFuncionarios.add(func2);
		listaFuncionarios.add(func3);
		listaFuncionarios.add(func4);
		
		funcionarioRepository.saveAll(listaFuncionarios);
		
	}

}
