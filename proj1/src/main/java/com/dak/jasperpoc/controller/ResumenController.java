package com.dak.jasperpoc.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dak.jasperpoc.domain.ResumenWrapper;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

@RestController
@RequestMapping("/carga/")
public class ResumenController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	private static final String PDF = "classpath:resumen.jrxml";

	@Autowired
	private ApplicationContext context;

	@PostMapping("/resumen")
	@ResponseBody
	public void resumen(@RequestBody ResumenWrapper movimento,   HttpServletResponse response) throws IOException, JRException {
		
		byte[] report = { 0 };
		try {
			report = getPDFReport(movimento);
			response.setContentType(MediaType.APPLICATION_PDF_VALUE);
			response.setHeader("Content-Disposition", "attachment; filename=movimientos.pdf");
			response.setContentLength(report.length);
			response.getOutputStream().write(report);

		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}

	}
 
	private byte[] getPDFReport(ResumenWrapper movimentosDetallados) throws JRException, IOException {
		LOGGER.error(">>>getPDFReport");
		byte[] pdf = null;

		JasperPrint jasperPrint = prepararReporte(movimentosDetallados, PDF);

		pdf = JasperExportManager.exportReportToPdf(jasperPrint);

		return pdf;
	}

	private JasperPrint prepararReporte(ResumenWrapper movimentosDetallados, String origen)
			throws IOException, JRException {

		Map<String, Object> params = new HashMap<>();

		params.put("empresa", movimentosDetallados.getReportParam().getEmpresa());
		params.put("usuario", movimentosDetallados.getReportParam().getUsuario());
		params.put("logo", movimentosDetallados.getReportParam().getLogo());
		params.put("filtro", movimentosDetallados.getReportParam().getFiltro());
		
		JRDataSource dataSource = new JRBeanCollectionDataSource(movimentosDetallados.getRegistros());
		params.put("datasource", dataSource);

		Resource resource = context.getResource(PDF);
		Locale locale = new Locale("es", "PY");
		params.put(JRParameter.REPORT_LOCALE, locale);
		InputStream jasperStream = resource.getInputStream();
		JasperDesign design = JRXmlLoader.load(jasperStream);
		JasperReport report = JasperCompileManager.compileReport(design);
		JasperPrint jasperPrint = JasperFillManager.fillReport(report, params, dataSource);

		return jasperPrint;
	}

}
