package br.unisul.exe1.dtos;

import java.io.Serializable;

public class AtletaNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private String modalidade1;
	private String modalidade2;
	private String modalidade3;
	
	private String competicao;
	private String data;
	
	public AtletaNewDTO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade1() {
		return modalidade1;
	}

	public void setModalidade1(String modalidade1) {
		this.modalidade1 = modalidade1;
	}

	public String getModalidade2() {
		return modalidade2;
	}

	public void setModalidade2(String modalidade2) {
		this.modalidade2 = modalidade2;
	}

	public String getModalidade3() {
		return modalidade3;
	}

	public void setModalidade3(String modalidade3) {
		this.modalidade3 = modalidade3;
	}

	public String getCompeticao() {
		return competicao;
	}

	public void setCompeticao(String competicao) {
		this.competicao = competicao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
