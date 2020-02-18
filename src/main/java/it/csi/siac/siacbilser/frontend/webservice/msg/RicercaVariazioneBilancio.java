/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoCapitolo;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioneBilancio extends RicercaSinteticaBaseRequest {
	
	private VariazioneImportoCapitolo variazioneImportoCapitolo;
	private List<TipoCapitolo> tipiCapitolo = new ArrayList<TipoCapitolo>();
	// SIAC-4815
	// Atto amministrativo per effettuare la ricerca SIA come PEG SIA come atto della variazione
	private AttoAmministrativo attoAmministrativo;
	/**
	 * @return the variazioneImportoCapitolo
	 */
	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}
	/**
	 * @param variazioneImportoCapitolo the variazioneImportoCapitolo to set
	 */
	public void setVariazioneImportoCapitolo(VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
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
