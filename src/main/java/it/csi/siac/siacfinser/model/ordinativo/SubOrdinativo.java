/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.DettaglioOnere;
import it.csi.siac.siacfin2ser.model.TipoOnere;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SubOrdinativo extends Ordinativo {

	private static final long serialVersionUID = 1L;
	private BigDecimal idSubOrdinativo;
	private BigDecimal importoIniziale;
	private BigDecimal importoAttuale;
	private BigDecimal nuovoImporto;

	private TipoOnere tipoOnere;
	
	private DettaglioOnere dettaglioOnere;

	/**
	 * @return the tipoOnere
	 */
	public TipoOnere getTipoOnere() {
		return tipoOnere;
	}

	/**
	 * @param tipoOnere
	 *            the tipoOnere to set
	 */
	public void setTipoOnere(TipoOnere tipoOnere) {
		this.tipoOnere = tipoOnere;
	}

	public BigDecimal getIdSubOrdinativo() {
		return idSubOrdinativo;
	}

	public void setIdSubOrdinativo(BigDecimal idSubOrdinativo) {
		this.idSubOrdinativo = idSubOrdinativo;
	}

	public BigDecimal getImportoIniziale() {
		return importoIniziale;
	}

	public void setImportoIniziale(BigDecimal importoIniziale) {
		this.importoIniziale = importoIniziale;
	}

	public BigDecimal getImportoAttuale() {
		return importoAttuale;
	}

	public void setImportoAttuale(BigDecimal importoAttuale) {
		this.importoAttuale = importoAttuale;
	}

	public BigDecimal getNuovoImporto() {
		return nuovoImporto;
	}

	public void setNuovoImporto(BigDecimal nuovoImporto) {
		this.nuovoImporto = nuovoImporto;
	}

	/**
	 * @return the dettaglioOnere
	 */
	public DettaglioOnere getDettaglioOnere() {
		return dettaglioOnere;
	}

	/**
	 * @param dettaglioOnere the dettaglioOnere to set
	 */
	public void setDettaglioOnere(DettaglioOnere dettaglioOnere) {
		this.dettaglioOnere = dettaglioOnere;
	}
	
	public Integer getNumeroOrdinativo() {
		  return super.getNumero();
	 }
	 
	 public void setNumeroOrdinativo(Integer numeroOrdinativo) {
	  super.setNumero(numeroOrdinativo);
	 }

}
