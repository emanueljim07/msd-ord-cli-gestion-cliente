package com.taller.microservicio.databases.postgresql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taller.microservicio.domain.ports.outbound.ICrearClientePort;
import com.taller.microservicio.mapper.MapperCliente;
import com.taller.microservicio.port.out.db.IClienteRepository;
import com.taller.microserviciol.domain.model.Cliente;

@Component
public class CrearClienteAdapter implements ICrearClientePort {

	
	    private final IClienteRepository customerRepository;
	    
	  public CrearClienteAdapter(IClienteRepository customerRepository)
	  {
		  this.customerRepository=customerRepository;
	  }
	    
		@Autowired
	  private  MapperCliente  mapperCliente;
	@Override
	public void crearCliente(Cliente cliente) {

       
		customerRepository.crearCliente(mapperCliente.convertClienteAClienteEntity(cliente));
		
	
		
		
	}

}
