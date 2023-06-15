package com.taller.microservicio.domain.ports.outbound;

import com.taller.microserviciol.domain.model.Cliente;

public interface IEliminarClientePort {
	
	void eliminarCliente(Cliente cliente);

}
