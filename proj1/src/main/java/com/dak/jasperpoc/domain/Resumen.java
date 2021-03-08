package com.dak.jasperpoc.domain;

import java.math.BigDecimal;

public class Resumen {
	
	private String entidad_codigo;
	
	private String entidad_nombre;
	
	private String silo_codigo;
	
	private String silo_nombre;
	
	private String cuenta_codigo;
	
	private String cuenta_nombre;
	
	private String tipo;
	
	private BigDecimal entrada_carga;
	
	private BigDecimal entrada_transferencia;
	
	private BigDecimal salida_carga;
	
	private BigDecimal salida_transferencia;
	
	private BigDecimal diferenca;

	public String getSilo_codigo() {
		return silo_codigo;
	}

	public void setSilo_codigo(String silo_codigo) {
		this.silo_codigo = silo_codigo;
	}

	public String getSilo_nombre() {
		return silo_nombre;
	}

	public void setSilo_nombre(String silo_nombre) {
		this.silo_nombre = silo_nombre;
	}

	public String getCuenta_codigo() {
		return cuenta_codigo;
	}

	public void setCuenta_codigo(String cuenta_codigo) {
		this.cuenta_codigo = cuenta_codigo;
	}

	public String getCuenta_nombre() {
		return cuenta_nombre;
	}

	public void setCuenta_nombre(String cuenta_nombre) {
		this.cuenta_nombre = cuenta_nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getEntrada_carga() {
		return entrada_carga;
	}

	public void setEntrada_carga(BigDecimal entrada_carga) {
		this.entrada_carga = entrada_carga;
	}

	public BigDecimal getEntrada_transferencia() {
		return entrada_transferencia;
	}

	public void setEntrada_transferencia(BigDecimal entrada_transferencia) {
		this.entrada_transferencia = entrada_transferencia;
	}

	public BigDecimal getSalida_carga() {
		return salida_carga;
	}

	public void setSalida_carga(BigDecimal salida_carga) {
		this.salida_carga = salida_carga;
	}

	public BigDecimal getSalida_transferencia() {
		return salida_transferencia;
	}

	public void setSalida_transferencia(BigDecimal salida_transferencia) {
		this.salida_transferencia = salida_transferencia;
	}

	public BigDecimal getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(BigDecimal diferenca) {
		this.diferenca = diferenca;
	}

	public String getEntidad_nombre() {
		return entidad_nombre;
	}

	public void setEntidad_nombre(String entidad_nombre) {
		this.entidad_nombre = entidad_nombre;
	}

	public String getEntidad_codigo() {
		return entidad_codigo;
	}

	public void setEntidad_codigo(String entidad_codigo) {
		this.entidad_codigo = entidad_codigo;
	}
	

 
}
