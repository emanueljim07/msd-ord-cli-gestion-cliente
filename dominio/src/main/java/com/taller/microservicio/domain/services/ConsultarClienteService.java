package com.taller.microservicio.domain.services;

import java.util.List;


import com.taller.microservicio.common.customannotations.UseCase;
import com.taller.microservicio.domain.ports.inbound.IConsultarClienteCasoUso;
import com.taller.microservicio.domain.ports.outbound.IConsultarClientePort;
import com.taller.microserviciol.domain.model.Cliente;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@UseCase
public class ConsultarClienteService implements IConsultarClienteCasoUso {


	
	
	private final IConsultarClientePort consultar;
	@Override
	public List<Cliente> consultarCliente(String cliente) {
		// TODO Auto-generated method stub
		return consultar.consultarCliente(cliente);
	}

}
