package com.taller.microservicio.domain.services;

import com.taller.microservicio.common.customannotations.UseCase;
import com.taller.microservicio.domain.ports.inbound.ICrearClienteCasoUso;
import com.taller.microservicio.domain.ports.outbound.ICrearClientePort;
import com.taller.microserviciol.domain.model.Cliente;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@UseCase
public class CrearClienteService implements ICrearClienteCasoUso {	
	
	private final ICrearClientePort crear;
	
	@Override
	public void crearCliente(Cliente cliente) {
	
		
		crear.crearCliente(cliente);

	}

}
