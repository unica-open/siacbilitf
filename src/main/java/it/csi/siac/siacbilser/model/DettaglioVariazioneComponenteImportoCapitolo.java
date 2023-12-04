/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * DettaglioVariazioneComponenteImportoCapitolo
 * @author Marchino Alessandro
 * @version 1.0.0 - 03/10/2019
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DettaglioVariazioneComponenteImportoCapitolo extends EntitaEnte {

	/** Per la serializzazione */
	private static final long serialVersionUID = -2471466146440112106L;
	
	private boolean flagEliminaComponenteCapitolo = false;
	private boolean flagNuovaComponenteCapitolo = false;
	
	private BigDecimal importo = BigDecimal.ZERO;
	private ComponenteImportiCapitolo componenteImportiCapitolo;
	private TipoDettaglioComponenteImportiCapitolo tipoDettaglioComponenteImportiCapitolo;
	private DettaglioVariazioneImportoCapitolo dettaglioVariazioneImportoCapitolo;
	/**
	 * @return the flagEliminaComponenteCapitolo
	 */
	public boolean isFlagEliminaComponenteCapitolo() {
		return flagEliminaComponenteCapitolo;
	}
	/**
	 * @param flagEliminaComponenteCapitolo the flagEliminaComponenteCapitolo to set
	 */
	public void setFlagEliminaComponenteCapitolo(boolean flagEliminaComponenteCapitolo) {
		this.flagEliminaComponenteCapitolo = flagEliminaComponenteCapitolo;
	}
	/**
	 * @return the flagNuovaComponenteCapitolo
	 */
	public boolean isFlagNuovaComponenteCapitolo() {
		return flagNuovaComponenteCapitolo;
	}
	/**
	 * @param flagNuovaComponenteCapitolo the flagNuovaComponenteCapitolo to set
	 */
	public void setFlagNuovaComponenteCapitolo(boolean flagNuovaComponenteCapitolo) {
		this.flagNuovaComponenteCapitolo = flagNuovaComponenteCapitolo;
	}
	/**
	 * @return the importo
	 */
	public BigDecimal getImporto() {
		return importo;
	}
	/**
	 * @param importo the importo to set
	 */
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	/**
	 * @return the componenteImportiCapitolo
	 */
	public ComponenteImportiCapitolo getComponenteImportiCapitolo() {
		return componenteImportiCapitolo;
	}
	/**
	 * @param componenteImportiCapitolo the componenteImportiCapitolo to set
	 */
	public void setComponenteImportiCapitolo(ComponenteImportiCapitolo componenteImportiCapitolo) {
		this.componenteImportiCapitolo = componenteImportiCapitolo;
	}
	/**
	 * @return the tipoDettaglioComponenteImportiCapitolo
	 */
	public TipoDettaglioComponenteImportiCapitolo getTipoDettaglioComponenteImportiCapitolo() {
		return tipoDettaglioComponenteImportiCapitolo;
	}
	/**
	 * @param tipoDettaglioComponenteImportiCapitolo the tipoDettaglioComponenteImportiCapitolo to set
	 */
	public void setTipoDettaglioComponenteImportiCapitolo(TipoDettaglioComponenteImportiCapitolo tipoDettaglioComponenteImportiCapitolo) {
		this.tipoDettaglioComponenteImportiCapitolo = tipoDettaglioComponenteImportiCapitolo;
	}
	/**
	 * @return the dettaglioVariazioneImportoCapitolo
	 */
	public DettaglioVariazioneImportoCapitolo getDettaglioVariazioneImportoCapitolo() {
		return this.dettaglioVariazioneImportoCapitolo;
	}
	/**
	 * @param dettaglioVariazioneImportoCapitolo the dettaglioVariazioneImportoCapitolo to set
	 */
	public void setDettaglioVariazioneImportoCapitolo(DettaglioVariazioneImportoCapitolo dettaglioVariazioneImportoCapitolo) {
		this.dettaglioVariazioneImportoCapitolo = dettaglioVariazioneImportoCapitolo;
	}

}
