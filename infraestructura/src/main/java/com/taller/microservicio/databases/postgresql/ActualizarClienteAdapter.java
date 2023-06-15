package com.taller.microservicio.databases.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taller.microservicio.domain.ports.outbound.IActualizarClientePort;
import com.taller.microservicio.mapper.MapperCliente;
import com.taller.microservicio.port.out.db.IClienteRepository;
import com.taller.microserviciol.domain.model.Cliente;

@Component
public class ActualizarClienteAdapter implements IActualizarClientePort {

	
	
    private final IClienteRepository customerRepository;
    
  public ActualizarClienteAdapter(IClienteRepository customerRepository)
  {
	  this.customerRepository=customerRepository;
  }
    
	@Autowired
	private  MapperCliente  mapperCliente;
	@Override
	public void actualizarCliente(Cliente cliente) {	
	   
		customerRepository.actualizarCliente(mapperCliente.convertClienteAClienteEntity(cliente));
	
	}
}
