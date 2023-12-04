/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

/**
 * DatiVariazioneImportoCapitoloAnno
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DatiVariazioneImportoCapitoloAnno implements Serializable {

	private static final long serialVersionUID = 861361995172032558L;
	
	private Map<StatoOperativoVariazioneBilancio, DatiVariazioneImportoCapitolo> datiVariazioneCapitolo = new HashMap<StatoOperativoVariazioneBilancio, DatiVariazioneImportoCapitolo>();

	/**
	 * @return the datiVariazioneCapitolo
	 */
	public Map<StatoOperativoVariazioneBilancio, DatiVariazioneImportoCapitolo> getDatiVariazioneCapitolo() {
		return datiVariazioneCapitolo;
	}

	/**
	 * @param datiVariazioneCapitolo the datiVariazioneCapitolo to set
	 */
	public void setDatiVariazioneCapitolo(Map<StatoOperativoVariazioneBilancio, DatiVariazioneImportoCapitolo> datiVariazioneCapitolo) {
		this.datiVariazioneCapitolo = datiVariazioneCapitolo != null ? datiVariazioneCapitolo : new HashMap<StatoOperativoVariazioneBilancio, DatiVariazioneImportoCapitolo>();
	}

}
