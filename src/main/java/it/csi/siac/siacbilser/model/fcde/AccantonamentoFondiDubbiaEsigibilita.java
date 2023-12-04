/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.BilUtilities;
import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;

/**
 * Accantonamento per i fondi di dubbia e difficile esazione
 * @author Alessandro Marchino
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class AccantonamentoFondiDubbiaEsigibilita extends AccantonamentoFondiDubbiaEsigibilitaBase<CapitoloEntrataPrevisione> {

	private static final long serialVersionUID = 6728169877699986093L;
	
	// SIAC-7858
	@Deprecated private BigDecimal percentualeDelta;
	
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
	@Override
	public TipoAccantonamentoFondiDubbiaEsigibilita getTipoAccantonamentoFondiDubbiaEsigiblita() {
		return TipoAccantonamentoFondiDubbiaEsigibilita.PREVISIONE;
	}

	/**
	 * @param accantonamentoGraduale the accantonamento graduale
	 * @return the importo accantonamento fcde
	 */
	public BigDecimal ottieniImportoAccantonamentoFCDE(BigDecimal accantonamentoGraduale) {
		return getStanziamentoCapitolo() == null
			? null
			: getStanziamentoCapitolo()
				.multiply(this.getPercentualeAccantonamentoFCDE())
				.multiply(accantonamentoGraduale == null ? BilUtilities.BIG_DECIMAL_ONE_HUNDRED : accantonamentoGraduale)
				.divide(BilUtilities.BIG_DECIMAL_TEN_THOUSAND, BilUtilities.MATH_CONTEXT_TWO_HALF_DOWN);
	}
	/**
	 * @param accantonamentoGraduale the accantonamento graduale
	 * @return the importo accantonamento fcde 1
	 */
	public BigDecimal ottieniImportoAccantonamentoFCDE1(BigDecimal accantonamentoGraduale) {
		return getStanziamentoCapitolo1() == null
			? null
			: getStanziamentoCapitolo1()
				.multiply(this.getPercentualeAccantonamentoFCDE())
				.multiply(accantonamentoGraduale == null ? BilUtilities.BIG_DECIMAL_ONE_HUNDRED : accantonamentoGraduale)
				.divide(BilUtilities.BIG_DECIMAL_TEN_THOUSAND, BilUtilities.MATH_CONTEXT_TWO_HALF_DOWN);
	}
	/**
	 * @param accantonamentoGraduale the accantonamento graduale
	 * @return the importo accantonamento fcde 2
	 */
	public BigDecimal ottieniImportoAccantonamentoFCDE2(BigDecimal accantonamentoGraduale) {
		return getStanziamentoCapitolo2() == null
			? null
			: getStanziamentoCapitolo2()
				.multiply(this.getPercentualeAccantonamentoFCDE())
				.multiply(accantonamentoGraduale == null ? BilUtilities.BIG_DECIMAL_ONE_HUNDRED : accantonamentoGraduale)
				.divide(BilUtilities.BIG_DECIMAL_TEN_THOUSAND, BilUtilities.MATH_CONTEXT_TWO_HALF_DOWN);
	}
}
