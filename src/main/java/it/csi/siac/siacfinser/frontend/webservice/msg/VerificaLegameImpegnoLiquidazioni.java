/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


/**
 * Richiesta 
 * 
 * @author rnontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class VerificaLegameImpegnoLiquidazioni extends ServiceRequest {
	
	private Ente ente;
	private Integer uidMovimento;
	
	/**
	 * @return the uidMovimento
	 */
	public Integer getUidMovimento() {
		return uidMovimento;
	}

	/**
	 * @param uidMovimento the uidMovimento to set
	 */
	public void setUidMovimento(Integer uidMovimento) {
		this.uidMovimento = uidMovimento;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	

}
