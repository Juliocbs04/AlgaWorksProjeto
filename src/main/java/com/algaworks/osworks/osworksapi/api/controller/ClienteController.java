package com.algaworks.osworks.osworksapi.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.osworksapi.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente = new Cliente();
		cliente.setId(1L);
		cliente.setNome("Testonildo das couve da silva");
		cliente.setEmail("Testonildo@teste.com.br");
		cliente.setTelefone("0000-0000");
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Julio");
		cliente2.setEmail("teste@teste.com.br");
		cliente2.setTelefone("1111-0000");
		
		return Arrays.asList(cliente,cliente2);
	}
}
