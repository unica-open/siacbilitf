/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Messaggio di richiesta per leggere il tree piano dei conti 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiTreeContoEconomico extends ServiceRequest {

	private Integer anno;
	private Integer idEnteProprietario;
	private Integer idCodificaPadre;
	
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	public Integer getIdEnteProprietario() {
		return idEnteProprietario;
	}
	public void setIdEnteProprietario(Integer idEnteProprietario) {
		this.idEnteProprietario = idEnteProprietario;
	}
	
	public Integer getIdCodificaPadre() {
		return idCodificaPadre;
	}
	public void setIdCodificaPadre(Integer idCodificaPadre) {
		this.idCodificaPadre = idCodificaPadre;
	}

	
}
