/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoGiustificativo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaTipoGiustificativo extends ServiceRequest {

	private TipoGiustificativo tipoGiustificativo;
	private ParametriPaginazione parametriPaginazione;

	/**
	 * @return the tipoGiustificativo
	 */
	public TipoGiustificativo getTipoGiustificativo() {
		return tipoGiustificativo;
	}

	/**
	 * @param tipoGiustificativo the tipGiustificativo to set
	 */
	public void setTipoGiustificativo(TipoGiustificativo tipoGiustificativo) {
		this.tipoGiustificativo = tipoGiustificativo;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	

}
