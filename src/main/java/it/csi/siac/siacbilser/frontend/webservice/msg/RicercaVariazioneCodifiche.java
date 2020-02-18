/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoCapitolo;
import it.csi.siac.siacbilser.model.VariazioneCodificaCapitolo;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioneCodifiche extends RicercaSinteticaBaseRequest {
	
	private VariazioneCodificaCapitolo variazioneCodificaCapitolo;
	private List<TipoCapitolo> tipiCapitolo = new ArrayList<TipoCapitolo>();
	/**
	 * @return the variazioneCodificaCapitolo
	 */
	public VariazioneCodificaCapitolo getVariazioneCodificaCapitolo() {
		return variazioneCodificaCapitolo;
	}
	/**
	 * @param variazioneCodificaCapitolo the variazioneCodificaCapitolo to set
	 */
	public void setVariazioneCodificaCapitolo(VariazioneCodificaCapitolo variazioneCodificaCapitolo) {
		this.variazioneCodificaCapitolo = variazioneCodificaCapitolo;
	}
	/**
	 * @return the tipiCapitolo
	 */
	public List<TipoCapitolo> getTipiCapitolo() {
		return tipiCapitolo;
	}
	/**
	 * @param tipiCapitolo the tipiCapitolo to set
	 */
	public void setTipiCapitolo(List<TipoCapitolo> tipiCapitolo) {
		this.tipiCapitolo = tipiCapitolo;
	} 
	
}
