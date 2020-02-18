/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * Classe di base per la gestione dell'accantonamento per i fondi di dubbia e difficile esazione
 * @author Alessandro Marchino
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public abstract class AccantonamentoFondiDubbiaEsigibilitaBase<C extends Capitolo<?, ?>> extends Entita {

	private static final long serialVersionUID = -8616817912407372199L;
	
	private BigDecimal percentualeAccantonamentoFondi;
	private BigDecimal percentualeAccantonamentoFondi1;
	private BigDecimal percentualeAccantonamentoFondi2;
	private BigDecimal percentualeAccantonamentoFondi3;
	private BigDecimal percentualeAccantonamentoFondi4;
	private BigDecimal percentualeMediaAccantonamento;
	
	/**
	 * @return the percentualeAccantonamentoFondi
	 */
	public BigDecimal getPercentualeAccantonamentoFondi() {
		return percentualeAccantonamentoFondi;
	}
	/**
	 * @param percentualeAccantonamentoFondi the percentualeAccantonamentoFondi to set
	 */
	public void setPercentualeAccantonamentoFondi(BigDecimal percentualeAccantonamentoFondi) {
		this.percentualeAccantonamentoFondi = percentualeAccantonamentoFondi;
	}
	/**
	 * @return the percentualeAccantonamentoFondi1
	 */
	public BigDecimal getPercentualeAccantonamentoFondi1() {
		return percentualeAccantonamentoFondi1;
	}
	/**
	 * @param percentualeAccantonamentoFondi1 the percentualeAccantonamentoFondi1 to set
	 */
	public void setPercentualeAccantonamentoFondi1(BigDecimal percentualeAccantonamentoFondi1) {
		this.percentualeAccantonamentoFondi1 = percentualeAccantonamentoFondi1;
	}
	/**
	 * @return the percentualeAccantonamentoFondi2
	 */
	public BigDecimal getPercentualeAccantonamentoFondi2() {
		return percentualeAccantonamentoFondi2;
	}
	/**
	 * @param percentualeAccantonamentoFondi2 the percentualeAccantonamentoFondi2 to set
	 */
	public void setPercentualeAccantonamentoFondi2(BigDecimal percentualeAccantonamentoFondi2) {
		this.percentualeAccantonamentoFondi2 = percentualeAccantonamentoFondi2;
	}
	/**
	 * @return the percentualeAccantonamentoFondi3
	 */
	public BigDecimal getPercentualeAccantonamentoFondi3() {
		return percentualeAccantonamentoFondi3;
	}
	/**
	 * @param percentualeAccantonamentoFondi3 the percentualeAccantonamentoFondi3 to set
	 */
	public void setPercentualeAccantonamentoFondi3(BigDecimal percentualeAccantonamentoFondi3) {
		this.percentualeAccantonamentoFondi3 = percentualeAccantonamentoFondi3;
	}
	/**
	 * @return the percentualeAccantonamentoFondi4
	 */
	public BigDecimal getPercentualeAccantonamentoFondi4() {
		return percentualeAccantonamentoFondi4;
	}
	/**
	 * @param percentualeAccantonamentoFondi4 the percentualeAccantonamentoFondi4 to set
	 */
	public void setPercentualeAccantonamentoFondi4(BigDecimal percentualeAccantonamentoFondi4) {
		this.percentualeAccantonamentoFondi4 = percentualeAccantonamentoFondi4;
	}
	/**
	 * @return the percentualeMediaAccantonamento
	 */
	public BigDecimal getPercentualeMediaAccantonamento() {
		return percentualeMediaAccantonamento;
	}
	/**
	 * @param percentualeMediaAccantonamento the percentualeMediaAccantonamento to set
	 */
	public void setPercentualeMediaAccantonamento(BigDecimal percentualeMediaAccantonamento) {
		this.percentualeMediaAccantonamento = percentualeMediaAccantonamento;
	}

	/**
	 * Estrae il capitolo
	 * @return il capitolo associato
	 */
	public abstract C ottieniCapitolo();
	/**
	 * Imposta il capitolo
	 * @param cap il capitolo
	 */
	public abstract void impostaCapitolo(C cap);
}
