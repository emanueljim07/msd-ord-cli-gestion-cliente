package com.taller.microservicio.mapper;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.taller.microservicio.adapter.out.entidad.ClienteEntity;
import com.taller.microserviciol.domain.model.Cliente;




@Component
public class MapperCliente {
	
	public ClienteEntity convertClienteAClienteEntity(Cliente cliente)
	{
		ClienteEntity obj=new ClienteEntity();
		obj.setNumeroIdentificacion(cliente.getNumeroIdentificacion());
		obj.setNombre(cliente.getNombre());
		obj.setApellidos(cliente.getApellidos());
		obj.setEdad(cliente.getEdad());
		
		return obj;
	}
	
	public Cliente convertClienteEntityAClient(ClienteEntity clienteEntidad)
	{
		Cliente obj=new Cliente();
		obj.setNumeroIdentificacion(clienteEntidad.getNumeroIdentificacion());
		obj.setNombre(clienteEntidad.getNombre());
		obj.setApellidos(clienteEntidad.getApellidos());
		obj.setEdad(clienteEntidad.getEdad());
		
		return obj;
	}

	
	public List<Cliente> convertListClienteEntityAListCliente(List<ClienteEntity> clientes)
	{

		
		return	clientes.stream().map(reg->{
        	Cliente cli=new Cliente();
        	
        	cli.setApellidos(reg.getApellidos());
        	cli.setNombre(reg.getNombre());
        	cli.setNumeroIdentificacion(reg.getNumeroIdentificacion());
        	cli.setEdad(reg.getEdad());
        	
        	return cli;
        	
        }).collect(Collectors.toList());
		
		
	}
}
