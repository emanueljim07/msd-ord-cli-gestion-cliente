package com.taller.microservicio.databases.postgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taller.microservicio.domain.ports.outbound.IEliminarClientePort;
import com.taller.microservicio.mapper.MapperCliente;
import com.taller.microservicio.port.out.db.IClienteRepository;
import com.taller.microserviciol.domain.model.Cliente;

@Component
public class EliminarClienteAdapter implements IEliminarClientePort {



	
	   private final IClienteRepository customerRepository;
	    
	   public EliminarClienteAdapter(IClienteRepository customerRepository)
	   {
	 	  this.customerRepository=customerRepository;
	   }
	     
	 	@Autowired
	 	private  MapperCliente  mapperCliente;
	 	@Override
	 	public void eliminarCliente(Cliente cliente) {	
	 	   
	 		customerRepository.eliminarCliente(mapperCliente.convertClienteAClienteEntity(cliente));
	 	
	 	}

}
