/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CausaleSpesa;
import it.csi.siac.siacfin2ser.model.TipoFamigliaCausale;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaCausaleSpesa extends ServiceRequest {

	private CausaleSpesa causaleSpesa;
	private ParametriPaginazione parametriPaginazione;
	private TipoFamigliaCausale tipoFamiglia;

	/**
	 * @return the causaleSpesa
	 */
	public CausaleSpesa getCausaleSpesa() {
		return causaleSpesa;
	}

	/**
	 * @param causaleSpesa the causaleSpesa to set
	 */
	public void setCausaleSpesa(CausaleSpesa causaleSpesa) {
		this.causaleSpesa = causaleSpesa;
	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
	/**
	 * @return the tipoFamiglia
	 */
	public TipoFamigliaCausale getTipoFamiglia() {
		return tipoFamiglia;
	}

	/**
	 * @param tipoFamiglia the tipoFamiglia to set
	 */
	public void setTipoFamiglia(TipoFamigliaCausale tipoFamiglia) {
		this.tipoFamiglia = tipoFamiglia;
	}
}
