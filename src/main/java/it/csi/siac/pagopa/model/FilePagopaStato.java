 /*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/*
 * SIAC-8046 CM 19/03/2021
 * 
 * */
@XmlType(namespace = PagoPADataDictionary.NAMESPACE)
public class FilePagopaStato extends EntitaEnte{


	private static final long serialVersionUID = 1L;
	
	private Integer filePagopaStatoId;
	private String filePagopaStatoCode;
	private String filePagopaStatoDesc;
	/**
	 * @return the filePagopaStatoId
	 */
	public Integer getFilePagopaStatoId() {
		return filePagopaStatoId;
	}
	/**
	 * @param filePagopaStatoId the filePagopaStatoId to set
	 */
	public void setFilePagopaStatoId(Integer filePagopaStatoId) {
		this.filePagopaStatoId = filePagopaStatoId;
	}
	/**
	 * @return the filePagopaStatoCode
	 */
	public String getFilePagopaStatoCode() {
		return filePagopaStatoCode;
	}
	/**
	 * @param filePagopaStatoCode the filePagopaStatoCode to set
	 */
	public void setFilePagopaStatoCode(String filePagopaStatoCode) {
		this.filePagopaStatoCode = filePagopaStatoCode;
	}
	/**
	 * @return the filePagopaStatoDesc
	 */
	public String getFilePagopaStatoDesc() {
		return filePagopaStatoDesc;
	}
	/**
	 * @param filePagopaStatoDesc the filePagopaStatoDesc to set
	 */
	public void setFilePagopaStatoDesc(String filePagopaStatoDesc) {
		this.filePagopaStatoDesc = filePagopaStatoDesc;
	}
	
	
	
}

