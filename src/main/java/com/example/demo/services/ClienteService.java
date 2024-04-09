package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repositorio;
	
	public List<Cliente> findAll(){
		return repositorio.findAll();
	}
}
