/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ReportServiceResponse;

/**
 * The Class StampaExcelVariazioneImportoResponse.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaExcelVariazioneDiBilancioResponse extends ReportServiceResponse {
	
	private byte[] report;
	private Boolean xlsx;
	private String contentType;
	private String extension;

	/**
	 * @return the report
	 */
	public byte[] getReport() {
		return report;
	}

	/**
	 * @param report the report to set
	 */
	public void setReport(byte[] report) {
		this.report = report;
	}

	/**
	 * @return the xlsx
	 */
	public Boolean getXlsx() {
		return xlsx;
	}

	/**
	 * @param xlsx the xlsx to set
	 */
	public void setXlsx(Boolean xlsx) {
		this.xlsx = xlsx;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

}
