package com.taller.microservicio.adapter.out.entidad;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIRECCION")
public class DireccionCliente {
	@Id
	private Integer id;
	private String callePrincipal;
	private String calleSecundaria;
	private String numeroCasa;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the callePrincipal
	 */
	public String getCallePrincipal() {
		return callePrincipal;
	}
	/**
	 * @param callePrincipal the callePrincipal to set
	 */
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	/**
	 * @return the calleSecundaria
	 */
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	/**
	 * @param calleSecundaria the calleSecundaria to set
	 */
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	/**
	 * @return the numeroCasa
	 */
	public String getNumeroCasa() {
		return numeroCasa;
	}
	/**
	 * @param numeroCasa the numeroCasa to set
	 */
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

}
