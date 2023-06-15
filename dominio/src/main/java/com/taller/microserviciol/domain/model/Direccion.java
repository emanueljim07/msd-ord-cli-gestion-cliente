package com.taller.microserviciol.domain.model;

public class Direccion {
	
	private String callePrincipal;
	private String calleSecundario;
	private String numeroCasa;
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
	 * @return the calleSecundario
	 */
	public String getCalleSecundario() {
		return calleSecundario;
	}
	/**
	 * @param calleSecundario the calleSecundario to set
	 */
	public void setCalleSecundario(String calleSecundario) {
		this.calleSecundario = calleSecundario;
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
