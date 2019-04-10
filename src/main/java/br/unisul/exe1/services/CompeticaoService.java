package br.unisul.exe1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unisul.exe1.domain.Competicao;
import br.unisul.exe1.repositories.CompeticaoRepository;

@Service
public class CompeticaoService {
	
	@Autowired
	private CompeticaoRepository repo;
	
	public Competicao find(Integer id) {
		Optional<Competicao> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
