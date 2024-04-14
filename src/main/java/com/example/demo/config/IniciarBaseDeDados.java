package com.example.demo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.Cliente;
import com.example.demo.domain.Pedido;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.PedidoRepository;

@Configuration
public class IniciarBaseDeDados implements CommandLineRunner{
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		clienteRepository.deleteAll();
		
		Cliente yuri = new Cliente(null, "Yuri", "exemplo2@gmail.com", "123456780", "01/01/1999");
		Cliente gabriel = new Cliente(null, "Gabriel", "exemplo@gmail.com", "123456789", "01/01/2000");
		
		Pedido pedido1 = new Pedido(null, sdf.parse("13/04/24"), "Iphone 13", 3800.0, "256Gb de memoria", gabriel);
		
		Pedido pedido2 = new Pedido(null, sdf.parse("10/04/24"), "A54", 1500.0, "128Gb de memoria e 6Gb de RAM", yuri);
		
		clienteRepository.saveAll(Arrays.asList(yuri, gabriel));
		pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2));
	}
	
}
