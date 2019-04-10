package br.unisul.exe1.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.unisul.exe1.domain.Atleta;
import br.unisul.exe1.domain.Competicao;
import br.unisul.exe1.dtos.AtletaDTO;
import br.unisul.exe1.dtos.AtletaNewDTO;
import br.unisul.exe1.repositories.AtletaRepository;


@Service
public class AtletaService {
	
	@Autowired
	private AtletaRepository repo;
	
	public Atleta find(Integer id) {
		Optional<Atleta> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public Atleta update(Atleta obj) {
		Atleta newObj = find(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	public void delete(Integer id) {
		find(id);
		repo.deleteById(id);
	}

	public List<Atleta> findAll() {
		return repo.findAll();
	}
	
	private void updateData(Atleta newObj, Atleta obj) {
		newObj.setNome(obj.getNome());
		newObj.setModalidades(obj.getModalidades());
	}
	
	@Transactional
	public Atleta insert(Atleta obj) {
		obj.setId(null);
		obj = repo.save(obj);
		return obj;
	}
	
	public Atleta fromDTO(AtletaDTO objDto) {
		return new Atleta(objDto.getId(),objDto.getNome(),null,null);
	}
	
	public Atleta fromDTO(AtletaNewDTO objDto) {
		Atleta atl = new Atleta(null, objDto.getCompeticao(), null, null);
		Competicao com = new Competicao(null, objDto.getCompeticao(), objDto.getData(), atl);
		atl.getCompeticoes().add(com);
		atl.getModalidades().add(objDto.getModalidade1());
		if (objDto.getModalidade2() != null)
			atl.getModalidades().add(objDto.getModalidade2());
		if (objDto.getModalidade3() != null)
			atl.getModalidades().add(objDto.getModalidade3());
		return atl;
	}

}
