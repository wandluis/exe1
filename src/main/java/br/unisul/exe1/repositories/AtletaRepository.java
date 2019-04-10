package br.unisul.exe1.repositories;

import org.springframework.stereotype.Repository;
import br.unisul.exe1.domain.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Integer>{

}
