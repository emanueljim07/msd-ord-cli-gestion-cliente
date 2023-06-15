package com.taller.microservicio.domain.services;



import com.taller.microservicio.common.customannotations.UseCase;
import com.taller.microservicio.domain.ports.inbound.IEliminarClienteCasoUso;

import com.taller.microservicio.domain.ports.outbound.IEliminarClientePort;
import com.taller.microserviciol.domain.model.Cliente;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@UseCase
public class EliminarClienteService implements IEliminarClienteCasoUso {

	
	
	
	private final IEliminarClientePort eliminar;
	
	
	@Override
	public void eliminarCliente(Cliente cliente) {
		eliminar.eliminarCliente(cliente);

	}

}
