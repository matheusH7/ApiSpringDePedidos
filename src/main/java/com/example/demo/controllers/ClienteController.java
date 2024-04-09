package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Cliente;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {
	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		Cliente yuri = new Cliente("1", "Yuri", "exemplo2@gmail.com", "123456780", "01/01/1999");
		Cliente gabriel = new Cliente("2", "Gabriel", "exemplo@gmail.com", "123456789", "01/01/2000");
		List<Cliente> lista = new ArrayList<>();
		lista.addAll(Arrays.asList(yuri, gabriel));
		return ResponseEntity.ok().body(lista);
	}
}
