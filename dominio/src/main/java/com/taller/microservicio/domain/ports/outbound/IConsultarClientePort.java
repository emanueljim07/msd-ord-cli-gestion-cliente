package com.taller.microservicio.domain.ports.outbound;

import java.util.List;

import com.taller.microserviciol.domain.model.Cliente;



public interface IConsultarClientePort {
	
	List<Cliente> consultarCliente(String cliente);

}
