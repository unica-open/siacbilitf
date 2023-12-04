/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import javax.xml.bind.annotation.XmlType;

/**
 * Ordine
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class Ordine extends EntitaEnte {
	
	private static final long serialVersionUID = -3850354519349145197L;
	
	private String numeroOrdine;
	private DocumentoSpesa documento; 
	

	/**
	 * @return the numeroOrdine
	 */
	public String getNumeroOrdine() {
		return numeroOrdine;
	}

	/**
	 * @param numeroOrdine the numeroOrdine to set
	 */
	public void setNumeroOrdine(String numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}
	/**
	 * @return the documento
	 */
	public DocumentoSpesa getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(DocumentoSpesa documento) {
		this.documento = documento;
	}

	
	

	
	

	
	
	
}
