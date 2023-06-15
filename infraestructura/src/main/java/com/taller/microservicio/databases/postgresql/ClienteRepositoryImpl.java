package com.taller.microservicio.databases.postgresql;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;



import com.taller.microservicio.adapter.out.entidad.ClienteEntity;
import com.taller.microservicio.port.out.db.IClienteRepository;


@Transactional
@Repository
public class ClienteRepositoryImpl  implements IClienteRepository {

	  @PersistenceContext	
	  EntityManager entityManager;

	@Override
	public void crearCliente(ClienteEntity cliente) {
		try {
			ClienteEntity clienteBD=	entityManager.find(ClienteEntity.class, cliente.getNumeroIdentificacion());
			if(clienteBD==null)
		      entityManager.persist(cliente);
		}catch (Exception ex)
		{
		  ex.printStackTrace();	
		}
		
	    finally{
	        entityManager.close();
	       
	    }
     
		
	}


	@Override
	public List<ClienteEntity> consultarClientesPorNombre(String nombre) {
		return entityManager.createNamedQuery("ClienteEntity.findAllClientByName", ClienteEntity.class)
	            .setParameter("nombre","%" +nombre+ "%")
	            .getResultList();
	}


	@Override
	public void actualizarCliente(ClienteEntity cliente) {
	try {
			
		
		entityManager.merge(cliente);
		
		
		
        }finally{
            entityManager.close();
           
        }
		
	}

	@Override
	public void eliminarCliente(ClienteEntity cliente) {
		
		
		try {
			
			ClienteEntity clienteBD=	entityManager.find(ClienteEntity.class, cliente.getNumeroIdentificacion());	
		entityManager.remove(clienteBD);
		
		
		
        }finally{
            entityManager.close();
           
        }
	}













	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 /*
	  
	@Override
	public void saveClient(ClienteEntity cliente) {
		// TODO Auto-generated method stub
		try {
		entityManager.persist(cliente);
		}catch (Exception ex)
		{
		  ex.printStackTrace();	
		}

	}
	
	@Override
	public ClienteEntity findClienteById(String id) {

	    return  entityManager.createNamedQuery("Cliente.findClientById", ClienteEntity.class)
	            .setParameter("id", id)
	           .getSingleResult();
	}
	
	
    @Override
	public List<ClienteEntity> findAllClienteByName(String nombre) {

	    return  entityManager.createNamedQuery("Cliente.findAllClientByName", ClienteEntity.class)
	            .setParameter("nombre", nombre)
	            .getResultList();
	            

	}
	 
*/

}
