/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class ProRataEChiusuraGruppoIva extends Entita {
	
	// siac_t_iva_prorata
	
	private static final long serialVersionUID = -6644642513438789631L;

	private BigDecimal percentualeProRata = BigDecimal.ZERO;
	private Integer ultimoMeseDefinito;
	private Ente ente;
	
	// PK
	private Integer annoEsercizio;
	
	
	private GruppoAttivitaIva gruppoAttivitaIva;
	
	private BigDecimal ivaPrecedente = BigDecimal.ZERO;
	/**
	 * @return the percentualeProRata
	 */
	public BigDecimal getPercentualeProRata() {
		return percentualeProRata;
	}
	/**
	 * @param percentualeProRata the percentualeProRata to set
	 */
	public void setPercentualeProRata(BigDecimal percentualeProRata) {
		this.percentualeProRata = percentualeProRata;
	}
	/**
	 * @return the ultimoMeseDefinito
	 */
	public Integer getUltimoMeseDefinito() {
		return ultimoMeseDefinito;
	}
	/**
	 * @param ultimoMeseDefinito the ultimoMeseDefinito to set
	 */
	public void setUltimoMeseDefinito(Integer ultimoMeseDefinito) {
		this.ultimoMeseDefinito = ultimoMeseDefinito;
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
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	
	/**
	 * @return the gruppoAttivitaIva
	 */
	public GruppoAttivitaIva getGruppoAttivitaIva() {
		return gruppoAttivitaIva;
	}
	/**
	 * @param gruppoAttivitaIva the gruppoAttivitaIva to set
	 */
	public void setGruppoAttivitaIva(GruppoAttivitaIva gruppoAttivitaIva) {
		this.gruppoAttivitaIva = gruppoAttivitaIva;
	}
	/**
	 * @return the ivaPrecedente
	 */
	public BigDecimal getIvaPrecedente() {
		return ivaPrecedente;
	}
	/**
	 * @param ivaPrecedente the ivaPrecedente to set
	 */
	public void setIvaPrecedente(BigDecimal ivaPrecedente) {
		this.ivaPrecedente = ivaPrecedente != null ? ivaPrecedente : BigDecimal.ZERO;
	}
	
}
