# DynamicJasperExample
[![Build Status](https://travis-ci.org/davidkey/DynamicJasperExample.svg?branch=master)](https://travis-ci.org/davidkey/DynamicJasperExample)

Short example of a dynamic JasperReport rendered as pdf / xlsx by a Spring Boot application. Uses [JasperReports Library 6.13](https://community.jaspersoft.com/project/jasperreports-library) and [DynamicJasper 5.3](http://dynamicjasper.com/) to generate reports.

## How to run
```bash
git clone https://github.com/davidkey/DynamicJasperExample.git
mvnw spring-boot:run
```
Once the application has started, you can go to one of the following urls to see the reports:

> ListColunas é a lista de colunas a mostrar. Pode ser nehnuma ou a combinação das possíveis colunas.

```bash
http://localhost:8080/employeeReport.pdf?listColunas=name,salary,empNo,commision
```
```bash
http://localhost:8080/employeeReport.xlsx?listColunas=name,salary,empNo,commision
```


![pdf report screenshot](https://raw.githubusercontent.com/davidkey/DynamicJasperExample/master/screenshots/reportPdf.png "pdf report screenshot")

## Próximo passo

Os parâmetros para o report serão passado pelos DTOs :

```java
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

```

```java
public class ReportParam {

	private String empresa;
	private String usuario;
	private String logo;
	private List<String> filtro;
	private List<ReportColumn> columns;

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
	public List<ReportColumn> getColumns() {
		return columns;
	}
	public void setColumns(List<ReportColumn> columns) {
		this.columns = columns;
	}


}
```

```java
public class ReportColumn {

	private String name;
	private Class<?> type;
	private int width;
	private ColumnAlign align;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public ColumnAlign getAlign() {
		return align;
	}
	public void setAlign(ColumnAlign align) {
		this.align = align;
	}


}
```

## Questões para os campos personalidados

- Como implementar formatação dinamicamente ?
- Como implementar colunas com totais ?
- Como implementar visibilidade com expressões ?
