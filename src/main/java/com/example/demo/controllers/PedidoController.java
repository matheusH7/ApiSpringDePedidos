package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Pedido;
import com.example.demo.services.PedidoService;

@RestController
@RequestMapping(value="pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable String id){
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}