/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Messaggio di richiesta per leggere il tree siope
 * 
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiTreeSiope extends ServiceRequest {
	
	private int anno;
	private int idEnteProprietario;
	//private String famigliaTreeCodice;
	private int idCodificaPadre;
	
	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getIdEnteProprietario() {
		return idEnteProprietario;
	}

	public void setIdEnteProprietario(int idEnteProprietario) {
		this.idEnteProprietario = idEnteProprietario;
	}

	public int getIdCodificaPadre() {
		return idCodificaPadre;
	}

	public void setIdCodificaPadre(int idCodificaPadre) {
		this.idCodificaPadre = idCodificaPadre;
	}

	

}
