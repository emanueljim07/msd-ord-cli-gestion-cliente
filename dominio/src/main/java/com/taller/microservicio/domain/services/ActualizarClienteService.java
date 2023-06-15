package com.taller.microservicio.domain.services;



import com.taller.microservicio.common.customannotations.UseCase;
import com.taller.microservicio.domain.ports.inbound.IActualizarClienteCasoUso;
import com.taller.microservicio.domain.ports.outbound.IActualizarClientePort;

import com.taller.microserviciol.domain.model.Cliente;

import lombok.AllArgsConstructor;



@AllArgsConstructor
@UseCase
public class ActualizarClienteService implements IActualizarClienteCasoUso {

	
	
	private final IActualizarClientePort actualizar;
	@Override
	public void actualizarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		actualizar.actualizarCliente(cliente);
	}

}
