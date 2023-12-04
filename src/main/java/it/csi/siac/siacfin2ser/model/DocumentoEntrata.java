/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * Documento Entrata.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DocumentoEntrata extends Documento<SubdocumentoEntrata, SubdocumentoIvaEntrata> {

	private static final long serialVersionUID = -5568524829989455059L;
	

	//default F	
	private Boolean flagDebitoreMultiplo = Boolean.FALSE;
	
	//SIAC 6677
	private Date dataOperazione;
	private String codAvvisoPagoPA;
	private String iuv;
	private String docNumeroPrimaAutoIva;
	
	//SIAC-7562 - 25/06/2020 - CM e GM
	private Date dataCambioStatoFel;
	
	//SIAC-7557
	private java.util.List<Ordine> ordini = new java.util.ArrayList<Ordine>();
		
	public String getDocNumeroPrimaAutoIva() {
		return docNumeroPrimaAutoIva;
	}

	public void setDocNumeroPrimaAutoIva(String docNumeroPrimaAutoIva) {
		this.docNumeroPrimaAutoIva = docNumeroPrimaAutoIva;
	}

	public String getCodAvvisoPagoPA() {
	return codAvvisoPagoPA;
	}

	public void setCodAvvisoPagoPA(String codAvvisoPagoPA) {
		this.codAvvisoPagoPA = codAvvisoPagoPA;
	}

	public String getIuv() {
		return iuv;
	}

	public void setIuv(String iuv) {
		this.iuv = iuv;
	}

	/**
	 * @return the dataOperazione
	 */
	public Date getDataOperazione() {
		return dataOperazione;
	}
		
	/**
	 * @param dataOperazione the dataOperazione to set
	 */
	public void setDataOperazione(Date dataOperazione) {
		this.dataOperazione = dataOperazione;
	}

	/**
	 * @return the flagDebitoreMultiplo
	 */
	public Boolean getFlagDebitoreMultiplo() {
		return flagDebitoreMultiplo;
	}

	/**
	 * @param flagDebitoreMultiplo the flagDebitoreMultiplo to set
	 */
	public void setFlagDebitoreMultiplo(Boolean flagDebitoreMultiplo) {
		this.flagDebitoreMultiplo = flagDebitoreMultiplo;
	}

	public Date getDataCambioStatoFel() {
		return dataCambioStatoFel;
	}

	public void setDataCambioStatoFel(Date dataCambioStatoFel) {
		this.dataCambioStatoFel = dataCambioStatoFel;
	}

	public java.util.List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(java.util.List<Ordine> ordini) {
		this.ordini = ordini;
	}
	
}
