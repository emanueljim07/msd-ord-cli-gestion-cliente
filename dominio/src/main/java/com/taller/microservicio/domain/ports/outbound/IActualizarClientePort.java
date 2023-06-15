package com.taller.microservicio.domain.ports.outbound;

import com.taller.microserviciol.domain.model.Cliente;

public interface IActualizarClientePort {
	void actualizarCliente(Cliente cliente);

}
