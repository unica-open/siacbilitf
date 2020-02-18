/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.BilUtilities;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

/**
 * <ul>
 *     <li>scontrino fiscale</li>
 *     <li>fattura</li>
 *     <li>c/c postale</li>
 *     <li>biglietto aereo</li>
 *     <li>pedaggio autostradale</li>
 *     <li>ricevuta fiscale</li>
 *     <li>ricevuta taxi</li>
 *     <li>biglietto ferroviario</li>
 *     <li>altro</li>
 * </ul>
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.22
 */


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class TipoGiustificativo extends Codifica {

	private static final long serialVersionUID = -7278135026883150952L;
	
	private Ente ente;
	private BigDecimal percentualeAnticipoTrasferta;
	private BigDecimal percentualeAnticipoMissione;
	
	private StatoOperativoTipoGiustificativo statoOperativoTipoGiustificativo;
	private TipologiaGiustificativo tipologiaGiustificativo;
	
	// Lotto M
	private CassaEconomale cassaEconomale;
	
	// Lotto P
	private BigDecimal importo;
	
	public TipoGiustificativo() {
		super();
	}
	public TipoGiustificativo(Codifica c) {
		super(c);
	}
	public TipoGiustificativo(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the percentualeAnticipoTrasferta
	 */
	public BigDecimal getPercentualeAnticipoTrasferta() {
		return percentualeAnticipoTrasferta;
	}
	/**
	 * @return the percentualeAnticipoTrasferta, not null
	 */
	public BigDecimal getPercentualeAnticipoTrasfertaNotNull() {
		return percentualeAnticipoTrasferta == null ? BigDecimal.ZERO : percentualeAnticipoTrasferta;
	}
	/**
	 * @return the percentualeAnticipoTrasferta, not null
	 */
	public BigDecimal getPercentualeAnticipoTrasfertaDecimal() {
		return getPercentualeAnticipoTrasfertaNotNull().divide(BilUtilities.BIG_DECIMAL_ONE_HUNDRED, BilUtilities.MATH_CONTEXT_TWO_HALF_DOWN);
	}
	/**
	 * @param percentualeAnticipoTrasferta the percentualeAnticipoTrasferta to set
	 */
	public void setPercentualeAnticipoTrasferta(BigDecimal percentualeAnticipoTrasferta) {
		this.percentualeAnticipoTrasferta = percentualeAnticipoTrasferta;
	}
	/**
	 * @return the percentualeAnticipoMissione
	 */
	public BigDecimal getPercentualeAnticipoMissione() {
		return percentualeAnticipoMissione;
	}
	/**
	 * @return the percentualeAnticipoMissione, not null
	 */
	public BigDecimal getPercentualeAnticipoMissioneNotNull() {
		return percentualeAnticipoMissione == null ? BigDecimal.ZERO : percentualeAnticipoMissione;
	}
	/**
	 * @return the percentualeAnticipoMissione, not null
	 */
	public BigDecimal getPercentualeAnticipoMissioneDecimal() {
		return getPercentualeAnticipoMissioneNotNull().divide(BilUtilities.BIG_DECIMAL_ONE_HUNDRED, BilUtilities.MATH_CONTEXT_TWO_HALF_DOWN);
	}
	/**
	 * @param percentualeAnticipoMissione the percentualeAnticipoMissione to set
	 */
	public void setPercentualeAnticipoMissione(BigDecimal percentualeAnticipoMissione) {
		this.percentualeAnticipoMissione = percentualeAnticipoMissione;
	}
	/**
	 * @return the statoOperativoTipoGiustificativo
	 */
	public StatoOperativoTipoGiustificativo getStatoOperativoTipoGiustificativo() {
		return statoOperativoTipoGiustificativo;
	}
	/**
	 * @param statoOperativoTipoGiustificativo the statoOperativoTipoGiustificativo to set
	 */
	public void setStatoOperativoTipoGiustificativo(StatoOperativoTipoGiustificativo statoOperativoTipoGiustificativo) {
		this.statoOperativoTipoGiustificativo = statoOperativoTipoGiustificativo;
	}
	/**
	 * @return the tipologiaGiustificativo
	 */
	public TipologiaGiustificativo getTipologiaGiustificativo() {
		return tipologiaGiustificativo;
	}
	/**
	 * @param tipologiaGiustificativo the tipologiaGiustificativo to set
	 */
	public void setTipologiaGiustificativo(TipologiaGiustificativo tipologiaGiustificativo) {
		this.tipologiaGiustificativo = tipologiaGiustificativo;
	}
	
	// Lotto M
	/**
	 * @return the cassaEconomale
	 */
	public CassaEconomale getCassaEconomale() {
		return cassaEconomale;
	}
	/**
	 * @param cassaEconomale the cassaEconomale to set
	 */
	public void setCassaEconomale(CassaEconomale cassaEconomale) {
		this.cassaEconomale = cassaEconomale;
	}
	
	// Lotto P
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

}