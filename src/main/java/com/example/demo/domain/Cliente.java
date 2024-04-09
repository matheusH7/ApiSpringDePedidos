package com.example.demo.domain;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	private String telefone;
	private String dataDeNascimento;
	
	public Cliente() {
		
	}

	public Cliente(String id, String nome, String email, String telefone, String dataDeNascimento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataDeNascimento, email, id, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dataDeNascimento, other.dataDeNascimento) && Objects.equals(email, other.email)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}
	
	
}
