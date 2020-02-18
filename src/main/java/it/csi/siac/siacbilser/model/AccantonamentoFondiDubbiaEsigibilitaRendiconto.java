/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Accantonamento per i fondi di dubbia e difficile esazione, rendiconto
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class AccantonamentoFondiDubbiaEsigibilitaRendiconto extends AccantonamentoFondiDubbiaEsigibilitaBase<CapitoloEntrataGestione> {

	private static final long serialVersionUID = 3930576642764549216L;
	
	private CapitoloEntrataGestione capitolo;

	/**
	 * @return the capitolo
	 */
	public CapitoloEntrataGestione getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(CapitoloEntrataGestione capitolo) {
		this.capitolo = capitolo;
	}

	@Override
	public CapitoloEntrataGestione ottieniCapitolo() {
		return getCapitolo();
	}

	@Override
	public void impostaCapitolo(CapitoloEntrataGestione cap) {
		setCapitolo(cap);
	}

}
