package com.dak.jasperpoc.domain;

import java.util.List;

public class ResumenWrapper {

	private ReportParam reportParam;
	
	private List<Resumen> registros;

	private  String[]  columns;
	
	public ReportParam getReportParam() {
		return reportParam;
	}

	public void setReportParam(ReportParam reportParam) {
		this.reportParam = reportParam;
	}

	public List<Resumen> getRegistros() {
		return registros;
	}

	public void setRegistros(List<Resumen> registros) {
		this.registros = registros;
	}

	public String[] getColumns() {
		return columns;
	}

	public void setColumns(String[] columns) {
		this.columns = columns;
	}
	
	
}
