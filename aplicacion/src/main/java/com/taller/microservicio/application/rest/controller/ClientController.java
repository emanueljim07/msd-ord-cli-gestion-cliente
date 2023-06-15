package com.taller.microservicio.application.rest.controller;

import com.taller.microservicio.application.dto.ClientDTO;
import com.taller.microservicio.application.mapper.AssemblerCliente;
import com.taller.microservicio.application.rest.response.CreateClientResponse;

import com.taller.microservicio.common.exception.GlobalException;

import com.taller.microservicio.common.exception.ResourceNotFoundException;

import com.taller.microservicio.domain.ports.inbound.IActualizarClienteCasoUso;
import com.taller.microservicio.domain.ports.inbound.IConsultarClienteCasoUso;
import com.taller.microservicio.domain.ports.inbound.ICrearClienteCasoUso;
import com.taller.microservicio.domain.ports.inbound.IEliminarClienteCasoUso;


import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pedidos/v1/clientes")
@AllArgsConstructor
public class ClientController {


    
    private final IConsultarClienteCasoUso consultarCliente;
	private final ICrearClienteCasoUso crearCliente;
	private final IActualizarClienteCasoUso actualizarCliente;
	private final IEliminarClienteCasoUso elimnarCliente;
	@Autowired
	private AssemblerCliente mapper;

    
   @GetMapping("/consulta/{filtroNombre}")
    public ResponseEntity<?> consultarClientes(@PathVariable(value = "filtroNombre")  String nombre) throws ResourceNotFoundException, GlobalException {
        return ResponseEntity.ok().body(consultarCliente.consultarCliente(nombre));
    }
    
	@PostMapping
	public ResponseEntity<?> crearCliente(@Valid @RequestBody ClientDTO cliente) {		
	
		crearCliente.crearCliente(mapper.convertClienteDTOAClient(cliente));
		
	return	ResponseEntity.ok().body(CreateClientResponse.builder().numeroIdentificacion(cliente.getNumeroIdentificacion()).build());
	}
	
	@PutMapping
	public ResponseEntity<?> actualizarCliente(@Valid @RequestBody ClientDTO cliente) {		
	
		actualizarCliente.actualizarCliente(mapper.convertClienteDTOAClient(cliente));
		
	return	ResponseEntity.ok().body("OK");
	}
	
	@DeleteMapping
	public ResponseEntity<?> eliminarCliente(@Valid @RequestBody ClientDTO cliente) {		
	
		elimnarCliente.eliminarCliente(mapper.convertClienteDTOAClient(cliente));
		
	return	ResponseEntity.ok().body("OK");
	}
}
