package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.domain.Cliente;

public class ClientePedidoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	
	public ClientePedidoDTO() {
		
	}

	public ClientePedidoDTO(Cliente obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
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
	
}