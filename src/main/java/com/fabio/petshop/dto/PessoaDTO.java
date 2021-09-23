package com.fabio.petshop.dto;

import java.io.Serializable;

import com.fabio.petshop.domain.Pessoa;

public class PessoaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String email;
	private String CodNacional;
	
	public PessoaDTO() {
		
	}

	public PessoaDTO(Pessoa obj) {		
		this.nome = obj.getNome();
		this.email = obj.getEmail();
		CodNacional = obj.getCodNacional();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodNacional() {
		return CodNacional;
	}

	public void setCodNacional(String codNacional) {
		CodNacional = codNacional;
	}
	
	

}
