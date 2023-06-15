package com.taller.microservicio.databases.postgresql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taller.microservicio.domain.ports.outbound.IConsultarClientePort;
import com.taller.microservicio.mapper.MapperCliente;
import com.taller.microservicio.port.out.db.IClienteRepository;
import com.taller.microserviciol.domain.model.Cliente;

@Component
public class ConsultarClienteAdapter implements IConsultarClientePort {


	
    private final IClienteRepository customerRepository;
    
  public ConsultarClienteAdapter(IClienteRepository customerRepository)
  {
	  this.customerRepository=customerRepository;
  }
    
	@Autowired
	private  MapperCliente  mapperCliente;
	@Override
	public List<Cliente> consultarCliente(String nombre) {	
	   
		return mapperCliente.convertListClienteEntityAListCliente(customerRepository.consultarClientesPorNombre(nombre));
	
	}

}
