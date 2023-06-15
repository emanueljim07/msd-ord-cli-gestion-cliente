package com.taller.microservicio.application.mapper;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.taller.microservicio.application.dto.ClientDTO;
import com.taller.microserviciol.domain.model.Cliente;





@Component
public class AssemblerCliente {
	
	public ClientDTO convertClienteAClienteDTO(Cliente clienteEntidad)
	{
		ClientDTO obj=new ClientDTO();
		obj.setNumeroIdentificacion(clienteEntidad.getNumeroIdentificacion());
		obj.setNombre(clienteEntidad.getNombre());
		obj.setApellidos(clienteEntidad.getApellidos());
		obj.setEdad(clienteEntidad.getEdad());
		
		return obj;
	}
	
	public Cliente convertClienteDTOAClient(ClientDTO clienteDTO)
	{
		Cliente obj=new Cliente();
		obj.setNumeroIdentificacion(clienteDTO.getNumeroIdentificacion());
		obj.setNombre(clienteDTO.getNombre());
		obj.setApellidos(clienteDTO.getApellidos());
		obj.setEdad(clienteDTO.getEdad());
		
		return obj;
	}
	
	public List<ClientDTO> convertListClienteAListClienteDTO(List<Cliente> clientes)
	{

		
		return	clientes.stream().map(reg->{
			ClientDTO cli=new ClientDTO();
        	
        	cli.setApellidos(reg.getApellidos());
        	cli.setNombre(reg.getNombre());
        	cli.setNumeroIdentificacion(reg.getNumeroIdentificacion());
        	cli.setEdad(reg.getEdad());
        	
        	return cli;
        	
        }).collect(Collectors.toList());
		
		
	}

}
