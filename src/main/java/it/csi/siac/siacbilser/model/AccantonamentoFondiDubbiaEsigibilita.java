/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * Accantonamento per i fondi di dubbia e difficile esazione
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class AccantonamentoFondiDubbiaEsigibilita extends AccantonamentoFondiDubbiaEsigibilitaBase<CapitoloEntrataPrevisione> {

	private static final long serialVersionUID = 6728169877699986093L;
	
	private BigDecimal percentualeDelta;
	
	// Per rimarcare la mappatura 1-1
	private CapitoloEntrataPrevisione capitolo;
	
	/**
	 * @return the percentualeDelta
	 */
	public BigDecimal getPercentualeDelta() {
		return percentualeDelta;
	}
	/**
	 * @param percentualeDelta the percentualeDelta to set
	 */
	public void setPercentualeDelta(BigDecimal percentualeDelta) {
		this.percentualeDelta = percentualeDelta;
	}
	/**
	 * @return the capitolo
	 */
	public CapitoloEntrataPrevisione getCapitolo() {
		return capitolo;
	}
	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(CapitoloEntrataPrevisione capitolo) {
		this.capitolo = capitolo;
	}
	
	@Override
	public CapitoloEntrataPrevisione ottieniCapitolo() {
		return getCapitolo();
	}
	@Override
	public void impostaCapitolo(CapitoloEntrataPrevisione cap) {
		setCapitolo(cap);
	}

}
