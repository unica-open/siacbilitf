/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.BilUtilities;
import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;

/**
 * Accantonamento per i fondi di dubbia e difficile esazione, rendiconto
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class AccantonamentoFondiDubbiaEsigibilitaRendiconto extends AccantonamentoFondiDubbiaEsigibilitaBase<CapitoloEntrataGestione> {

	private static final long serialVersionUID = 3930576642764549216L;
	
	private CapitoloEntrataGestione capitolo;

	// Per ottimizzazione
	private BigDecimal residuoFinaleCapitolo;

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

	@Override
	public TipoAccantonamentoFondiDubbiaEsigibilita getTipoAccantonamentoFondiDubbiaEsigiblita() {
		return TipoAccantonamentoFondiDubbiaEsigibilita.RENDICONTO;
	}

	/**
	 * @return the residuoFinaleCapitolo
	 */
	public BigDecimal getResiduoFinaleCapitolo() {
		return this.residuoFinaleCapitolo;
	}

	/**
	 * @param residuoFinaleCapitolo the residuoFinaleCapitolo to set
	 */
	public void setResiduoFinaleCapitolo(BigDecimal residuoFinaleCapitolo) {
		this.residuoFinaleCapitolo = residuoFinaleCapitolo;
	}

	/**
	 * @return the importo accantonamento fcde
	 */
	@XmlTransient
	public BigDecimal getImportoAccantonamentoFCDE() {
		return residuoFinaleCapitolo == null ? null : residuoFinaleCapitolo.multiply(this.getPercentualeAccantonamentoFCDE(), BilUtilities.MATH_CONTEXT_TWO_HALF_DOWN);
	}
}
