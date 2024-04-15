package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Pedido;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repositorio;
	
	public Pedido findById(String id) {
		Optional<Pedido> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Pedido não encontrado"));
	}
}