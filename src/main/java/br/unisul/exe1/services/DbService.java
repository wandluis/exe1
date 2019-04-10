package br.unisul.exe1.services;

import java.text.ParseException;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unisul.exe1.domain.Atleta;
import br.unisul.exe1.domain.Competicao;
import br.unisul.exe1.repositories.AtletaRepository;
import br.unisul.exe1.repositories.CompeticaoRepository;

@Service
public class DbService {
	
	@Autowired
	private AtletaRepository atlRep;
	
	private CompeticaoRepository compRep;
	
	
	public void inicializaBancoDeDados() throws ParseException {
		
		
		/*Atleta a1 = new Atleta(1, "Wander");
		Competicao comp = new Competicao(1, "São Silvestre", "31/12/2019", a1);
		compRep.save(comp);
		a1.getCompeticoes().addAll(Arrays.asList(comp));
		atlRep.saveAll(Arrays.asList(a1));*/
	}

}
