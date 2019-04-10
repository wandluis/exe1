package br.unisul.exe1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.unisul.exe1.domain.Competicao;

@Repository
public interface CompeticaoRepository extends JpaRepository<Competicao, Integer>{

}
