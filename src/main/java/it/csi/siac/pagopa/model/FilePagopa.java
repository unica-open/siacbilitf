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
public class FilePagopa extends EntitaEnte{


	private static final long serialVersionUID = 1L;
	
	private Integer filePagopaId;
	private String filePagopaCode;
	private Long filePagopaSize;
	private Integer filePagopaAnno;
	private String filePagopaIdPsp;
	private String filePagopaIdFlusso;
	private FilePagopaStato statoFile;
	/**
	 * @return the filePagopaId
	 */
	public Integer getFilePagopaId() {
		return filePagopaId;
	}
	/**
	 * @param filePagopaId the filePagopaId to set
	 */
	public void setFilePagopaId(Integer filePagopaId) {
		this.filePagopaId = filePagopaId;
	}
	/**
	 * @return the filePagopaCode
	 */
	public String getFilePagopaCode() {
		return filePagopaCode;
	}
	/**
	 * @param filePagopaCode the filePagopaCode to set
	 */
	public void setFilePagopaCode(String filePagopaCode) {
		this.filePagopaCode = filePagopaCode;
	}
	/**
	 * @return the filePagopaSize
	 */
	public Long getFilePagopaSize() {
		return filePagopaSize;
	}
	/**
	 * @param filePagopaSize the filePagopaSize to set
	 */
	public void setFilePagopaSize(Long filePagopaSize) {
		this.filePagopaSize = filePagopaSize;
	}
	/**
	 * @return the filePagopaAnno
	 */
	public Integer getFilePagopaAnno() {
		return filePagopaAnno;
	}
	/**
	 * @param filePagopaAnno the filePagopaAnno to set
	 */
	public void setFilePagopaAnno(Integer filePagopaAnno) {
		this.filePagopaAnno = filePagopaAnno;
	}
	/**
	 * @return the filePagopaIdPsp
	 */
	public String getFilePagopaIdPsp() {
		return filePagopaIdPsp;
	}
	/**
	 * @param filePagopaIdPsp the filePagopaIdPsp to set
	 */
	public void setFilePagopaIdPsp(String filePagopaIdPsp) {
		this.filePagopaIdPsp = filePagopaIdPsp;
	}
	/**
	 * @return the filePagopaIdFlusso
	 */
	public String getFilePagopaIdFlusso() {
		return filePagopaIdFlusso;
	}
	/**
	 * @param filePagopaIdFlusso the filePagopaIdFlusso to set
	 */
	public void setFilePagopaIdFlusso(String filePagopaIdFlusso) {
		this.filePagopaIdFlusso = filePagopaIdFlusso;
	}
	/**
	 * @return the filePagopaStato
	 */
	public FilePagopaStato getStatoFile() {
		return statoFile;
	}
	/**
	 * @param filePagopaStato the filePagopaStato to set
	 */
	public void setStatoFile(FilePagopaStato statoFile) {
		this.statoFile = statoFile;
	}
	
	
}
