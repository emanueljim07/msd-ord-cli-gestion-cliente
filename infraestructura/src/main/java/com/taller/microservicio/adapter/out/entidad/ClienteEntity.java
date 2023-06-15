package com.taller.microservicio.adapter.out.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
@NamedQueries(
{
	@NamedQuery(name = "ClienteEntity.findClientById", query = "SELECT c FROM ClienteEntity c  where c.numeroIdentificacion =:id"),
    @NamedQuery(name = "ClienteEntity.findAllClientByName", query = "SELECT c FROM ClienteEntity c  where lower(c.nombre) like lower(:nombre)")
   
	
}
)
public class ClienteEntity {
	
	@Id
	@Column(name = "numeroidentificacion", nullable = false, length = 150)
	private String numeroIdentificacion;
	
	@Column(name = "nombre", nullable = false, length = 150)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false, length = 150)
	private String apellidos;
	
	@Column(name = "edad", nullable = false, length = 150)
	private Integer edad;
	/**
	 * @return the numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
