/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

import it.csi.siac.siacbilser.model.BILDataDictionary;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

/**
 * RicercaDettaglioCapitoloUscitaGest: entita' di supporto per la ricerca di
 * dettaglio del capUscitaGestione, contiene i parametri (obbligatori e/o
 * facoltativi) di ricerca
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaDettaglioCapitoloUGest implements Serializable {

	private static final long serialVersionUID = 3360236460390746552L;

	private int chiaveCapitolo;

	public int getChiaveCapitolo() {
		return chiaveCapitolo;
	}

	public void setChiaveCapitolo(int chiaveCapitolo) {
		this.chiaveCapitolo = chiaveCapitolo;
	}

}
