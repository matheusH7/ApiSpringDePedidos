package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.Cliente;
import com.example.demo.repository.ClienteRepository;

@Configuration
public class IniciarBaseDeDados implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		clienteRepository.deleteAll();
		
		Cliente yuri = new Cliente(null, "Yuri", "exemplo2@gmail.com", "123456780", "01/01/1999");
		Cliente gabriel = new Cliente(null, "Gabriel", "exemplo@gmail.com", "123456789", "01/01/2000");
		
		clienteRepository.saveAll(Arrays.asList(yuri, gabriel));
	
	}
	
}
