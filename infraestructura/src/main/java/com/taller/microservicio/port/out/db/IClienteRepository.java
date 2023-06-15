package com.taller.microservicio.port.out.db;


import java.util.List;




import com.taller.microservicio.adapter.out.entidad.ClienteEntity;



public interface IClienteRepository {
	
	public void crearCliente(ClienteEntity cliente);
	public void actualizarCliente(ClienteEntity cliente);
	public void eliminarCliente(ClienteEntity cliente);
	public List<ClienteEntity> consultarClientesPorNombre(String nombre);
	
	


}
