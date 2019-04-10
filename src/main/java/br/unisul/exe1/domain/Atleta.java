package br.unisul.exe1.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Atleta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	
	@ManyToMany(mappedBy="atleta")
	private List<Competicao> competicoes = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name="MODALIDADE")
	private Set<String> modalidades = new HashSet<>();
	
	public Atleta() {
	}

	public Atleta(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Atleta(Integer id, String nome, List<Competicao> competicoes, Set<String> modalidades) {
		super();
		this.id = id;
		this.nome = nome;
		this.competicoes = competicoes;
		this.modalidades = modalidades;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Competicao> getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(List<Competicao> competicoes) {
		this.competicoes = competicoes;
	}

	public Set<String> getModalidades() {
		return modalidades;
	}

	public void setModalidades(Set<String> modalidades) {
		this.modalidades = modalidades;
	}
}
