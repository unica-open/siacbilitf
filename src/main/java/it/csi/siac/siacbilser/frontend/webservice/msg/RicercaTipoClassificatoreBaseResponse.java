/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.TipoClassificatore;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

/**
 * Response base della ricerca tipo classificatore
 * @author Marchino Alessandro
 *
 */
public abstract class RicercaTipoClassificatoreBaseResponse extends ServiceResponse {

	@XmlElementWrapper(name = "tipiClassificatore")
	@XmlElement(name = "tipoClassificatore")
	private List<TipoClassificatore> tipiClassificatore = new ArrayList<TipoClassificatore>();

	/**
	 * @return the tipiClassificatore
	 */
	@XmlTransient
	public List<TipoClassificatore> getTipiClassificatore() {
		return tipiClassificatore;
	}

	/**
	 * @param tipiClassificatore the tipiClassificatore to set
	 */
	public void setTipiClassificatore(List<TipoClassificatore> tipiClassificatore) {
		this.tipiClassificatore = tipiClassificatore != null ? tipiClassificatore : new ArrayList<TipoClassificatore>();
	}

	/**
	 * Ottiene il tipo di classificatore dalla tipologia richiesta
	 * @param tipologiaClassificatore la tipologia del classificatore
	 * @return il tipo di classificatore richiesto
	 */
	public TipoClassificatore getTipoClassificatoreByTipologia(TipologiaClassificatore tipologiaClassificatore) {
		if(tipologiaClassificatore == null) {
			// Null-safe
			return null;
		}
		for(TipoClassificatore tc : tipiClassificatore) {
			if(tc != null && tipologiaClassificatore.name().equals(tc.getCodice())) {
				// Classificatore trovato
				return tc;
			}
		}
		// Nessun classificatore per tipologia
		return null;
	}
}
