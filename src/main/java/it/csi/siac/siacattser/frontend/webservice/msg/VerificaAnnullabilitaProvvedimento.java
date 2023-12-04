/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Request al servizio di verifica anunllabilit&agrave; del provvedimento
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class VerificaAnnullabilitaProvvedimento extends ServiceRequest {
	
	private Ente ente;
	private AttoAmministrativo attoAmministrativo;
	
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
	
	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}
	
	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	
}
