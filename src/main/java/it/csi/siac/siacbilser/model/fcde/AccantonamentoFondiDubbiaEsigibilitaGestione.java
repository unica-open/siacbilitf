/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;

/**
 * Accantonamento per i fondi di dubbia e difficile esazione, rendiconto
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class AccantonamentoFondiDubbiaEsigibilitaGestione extends AccantonamentoFondiDubbiaEsigibilitaBase<CapitoloEntrataGestione> {

	private static final long serialVersionUID = 3930576642764549216L;

	private CapitoloEntrataGestione capitolo;
	private BigDecimal mediaConfronto;
	private TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita tipoMediaConfronto;

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

	/**
	 * @return the mediaConfronto
	 */
	public BigDecimal getMediaConfronto() {
		return this.mediaConfronto;
	}

	/**
	 * @param mediaConfronto the mediaConfronto to set
	 */
	public void setMediaConfronto(BigDecimal mediaConfronto) {
		this.mediaConfronto = mediaConfronto;
	}

	/**
	 * @return the tipoMediaConfronto
	 */
	public TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita getTipoMediaConfronto() {
		return this.tipoMediaConfronto;
	}

	/**
	 * @param tipoMediaConfronto the tipoMediaConfronto to set
	 */
	public void setTipoMediaConfronto(TipoMediaConfrontoAccantonamentoFondiDubbiaEsigibilita tipoMediaConfronto) {
		this.tipoMediaConfronto = tipoMediaConfronto;
	}

	@Override
	public CapitoloEntrataGestione ottieniCapitolo() {
		return getCapitolo();
	}

	@Override
	public void impostaCapitolo(CapitoloEntrataGestione cap) {
		setCapitolo(cap);
	}

	@Override
	public TipoAccantonamentoFondiDubbiaEsigibilita getTipoAccantonamentoFondiDubbiaEsigiblita() {
		return TipoAccantonamentoFondiDubbiaEsigibilita.GESTIONE;
	}

}
