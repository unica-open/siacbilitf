/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ServiceResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * Response del servizio di ricerca provvedimento
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaProvvedimentoResponse extends ServiceResponse {
	
	private List<AttoAmministrativo> listaAttiAmministrativi = new ArrayList<AttoAmministrativo>();

	/**
	 * @return the listaAttiAmministrativi
	 */
	public List<AttoAmministrativo> getListaAttiAmministrativi() {
		return listaAttiAmministrativi;
	}

	/**
	 * @param listaAttiAmministrativi the listaAttiAmministrativi to set
	 */
	public void setListaAttiAmministrativi(List<AttoAmministrativo> listaAttiAmministrativi) {
		this.listaAttiAmministrativi = listaAttiAmministrativi;
	}
	
}
