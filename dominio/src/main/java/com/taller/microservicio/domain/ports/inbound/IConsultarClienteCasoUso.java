package com.taller.microservicio.domain.ports.inbound;

import java.util.List;

import com.taller.microserviciol.domain.model.Cliente;

public interface IConsultarClienteCasoUso {
	
	List<Cliente> consultarCliente(String cliente);

}
