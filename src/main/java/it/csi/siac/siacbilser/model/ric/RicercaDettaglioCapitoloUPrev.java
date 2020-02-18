/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

import it.csi.siac.siacbilser.model.BILDataDictionary;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

/**
 * RicercaDettaglioCapitoloUPrev: entita' di supporto per la ricerca di
 * dettaglio del capUscitaPrevisione, contiene i parametri (obbligatori e/o
 * facoltativi) di ricerca
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaDettaglioCapitoloUPrev implements Serializable {

	private static final long serialVersionUID = 7057732967055020896L;

	private int chiaveCapitolo;

	public int getChiaveCapitolo() {
		return chiaveCapitolo;
	}

	public void setChiaveCapitolo(int chiaveCapitolo) {
		this.chiaveCapitolo = chiaveCapitolo;
	}

}
