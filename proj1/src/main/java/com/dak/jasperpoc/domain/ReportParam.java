package com.dak.jasperpoc.domain;

import java.util.List;

public class ReportParam {

	private String empresa;
	private String usuario;
	private String logo;
	private List<String> filtro;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public List<String> getFiltro() {
		return filtro;
	}
	public void setFiltro(List<String> filtro) {
		this.filtro = filtro;
	}

		
}
