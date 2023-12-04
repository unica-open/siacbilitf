/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

/**
 * <ul>
 *     <li>prelievo da cassa, c/c</li>
 *     <li>entrata da cassa contanti</li>
 *     <li>restituzione</li>
 *     <li>integrazione</li>
 *     <li>rimborso liquidazione</li>
 *     <li>fondo di cassa</li>
 *     <li>prelievo</li>
 * </ul>
 * 
 * @author 552
 * @version 1.0
 * @created 01-dic-2014 09.50.23
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class TipoOperazioneCassa extends Codifica {

	private static final long serialVersionUID = -3661632406659355955L;
	
	private Ente ente;
	
	private Boolean inclusoInGiornale;
	private Boolean inclusoInRendiconto;
	private StatoOperativoTipoOperazioneCassa statoOperativoTipoOperazioneCassa;
	
	// Lotto M
	private CassaEconomale cassaEconomale;
	private TipologiaOperazioneCassa tipologiaOperazioneCassa;

	public TipoOperazioneCassa(){
		super();
	}
	
	public TipoOperazioneCassa(Codifica c) {
		super(c);
		this.setUid(c.getUid());
	}

	public TipoOperazioneCassa(String codice, String descrizione) {
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
	 * @return the inclusoInGiornale
	 */
	public Boolean getInclusoInGiornale() {
		return inclusoInGiornale;
	}

	/**
	 * @param inclusoInGiornale the inclusoInGiornale to set
	 */
	public void setInclusoInGiornale(Boolean inclusoInGiornale) {
		this.inclusoInGiornale = inclusoInGiornale;
	}

	/**
	 * @return the inclusoInRendiconto
	 */
	public Boolean getInclusoInRendiconto() {
		return inclusoInRendiconto;
	}

	/**
	 * @param inclusoInRendiconto the inclusoInRendiconto to set
	 */
	public void setInclusoInRendiconto(Boolean inclusoInRendiconto) {
		this.inclusoInRendiconto = inclusoInRendiconto;
	}

	/**
	 * @return the statoOperativoTipoOperazioneCassa
	 */
	public StatoOperativoTipoOperazioneCassa getStatoOperativoTipoOperazioneCassa() {
		return statoOperativoTipoOperazioneCassa;
	}

	/**
	 * @param statoOperativoTipoOperazioneCassa the statoOperativoTipoOperazioneCassa to set
	 */
	public void setStatoOperativoTipoOperazioneCassa(StatoOperativoTipoOperazioneCassa statoOperativoTipoOperazioneCassa) {
		this.statoOperativoTipoOperazioneCassa = statoOperativoTipoOperazioneCassa;
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

	/**
	 * @return the tipologiaOperazioneCassa
	 */
	public TipologiaOperazioneCassa getTipologiaOperazioneCassa() {
		return tipologiaOperazioneCassa;
	}

	/**
	 * @param tipologiaOperazioneCassa the tipologiaOperazioneCassa to set
	 */
	public void setTipologiaOperazioneCassa(
			TipologiaOperazioneCassa tipologiaOperazioneCassa) {
		this.tipologiaOperazioneCassa = tipologiaOperazioneCassa;
	}

}