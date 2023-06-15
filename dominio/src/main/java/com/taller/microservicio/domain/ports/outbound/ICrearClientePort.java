package com.taller.microservicio.domain.ports.outbound;

import com.taller.microserviciol.domain.model.Cliente;

public interface ICrearClientePort {
	
	void crearCliente(Cliente cliente);

}
