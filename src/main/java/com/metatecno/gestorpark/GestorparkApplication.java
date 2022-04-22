package com.metatecno.gestorpark;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.metatecno.gestorpark.domain.Brinquedo;
import com.metatecno.gestorpark.domain.Categoria;
import com.metatecno.gestorpark.domain.Especialidade;
import com.metatecno.gestorpark.domain.Funcionario;
import com.metatecno.gestorpark.domain.ObservacaoOrdem;
import com.metatecno.gestorpark.domain.OrdemServico;
import com.metatecno.gestorpark.domain.enums.TpStatus;
import com.metatecno.gestorpark.repositories.BrinquedoRepository;
import com.metatecno.gestorpark.repositories.CategoriaRepository;
import com.metatecno.gestorpark.repositories.EspecialidadeRepository;
import com.metatecno.gestorpark.repositories.FuncionarioRepository;
import com.metatecno.gestorpark.repositories.ObservacaoOrdemRepository;
import com.metatecno.gestorpark.repositories.OrdemServicoRepository;

@SpringBootApplication
public class GestorparkApplication implements CommandLineRunner {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@Autowired
	private ObservacaoOrdemRepository observacaoOrdemRepository;
	
	@Autowired
	private BrinquedoRepository brinquedoRepository;
	

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
		
		//Adicionando os Brinquedos e suas Categorias
		Categoria c1 = new Categoria(null, "Familiar");
		Categoria c2 = new Categoria(null, "Radical");
		Categoria c3 = new Categoria(null, "Infantil");
		
		categoriaRepository.save(c1);
		categoriaRepository.save(c2);
		categoriaRepository.save(c3);
		
		Brinquedo b1 = new Brinquedo(null, "Auto Pista", c1);
		Brinquedo b2 = new Brinquedo(null, "Sea Dragon", c2);
		Brinquedo b3 = new Brinquedo(null, "Over Loop", c2);
		Brinquedo b4 = new Brinquedo(null, "Carrossel", c3);
		Brinquedo b5 = new Brinquedo(null, "Montanha Russa", c2);
		
		brinquedoRepository.save(b1);
		brinquedoRepository.save(b2);
		brinquedoRepository.save(b3);
		brinquedoRepository.save(b4);
		brinquedoRepository.save(b5);
		
		//Ordem de Serviço e Observações do Serviço
		
		Calendar dataAberturaOs1 = new GregorianCalendar(2022,04,20);
		OrdemServico os1 = new OrdemServico(
				null, 
				b1,
				func1,
				dataAberturaOs1, 
				null, 
				TpStatus.ABERTO);
		
		
		Calendar dataAberturaOs2 = new GregorianCalendar(2022,04,21);
		OrdemServico os2 = new OrdemServico(
				null, 
				b2,
				func3,
				dataAberturaOs2, 
				null, 
				TpStatus.ABERTO);
		
		ordemServicoRepository.save(os1);
		ordemServicoRepository.save(os2);
		
		ObservacaoOrdem oo1 = new ObservacaoOrdem(null, os1, func2, "Iniciado lubrificação das peças.");
		
		observacaoOrdemRepository.save(oo1);
		}
}
