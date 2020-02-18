/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.FaseEStatoAttualeBilancio.FaseBilancio;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

@XmlType(namespace = ConsultazioneEntitaDataDictionary.NAMESPACE)
public class ParametriRicercaCapitoloConsultabile extends ParametriRicercaEntitaConsultabile {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1471651417359131768L;
	
	//entrata-spesa
	private String tipoCapitolo;
	//previsione-gestione
	private FaseBilancio faseBilancio;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
    private Integer numeroArticolo;
	private Integer annoCapitolo;
	private Integer numeroCapitolo;
	private String descrizione;
	private Integer numeroUEB;
	
	/**
	 * @return the tipoCapitolo
	 */
	public String getTipoCapitolo() {
		return tipoCapitolo;
	}
	/**
	 * @param tipoCapitolo the tipoCapitolo to set
	 */
	public void setTipoCapitolo(String tipoCapitolo) {
		this.tipoCapitolo = tipoCapitolo;
	}
	/**
	 * @return the faseBilancio
	 */
	public FaseBilancio getFaseBilancio() {
		return faseBilancio;
	}
	/**
	 * @param faseBilancio the faseBilancio to set
	 */
	public void setFaseBilancio(FaseBilancio faseBilancio) {
		this.faseBilancio = faseBilancio;
	}
	/**
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}
	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}
	/**
	 * @return the numeroArticolo
	 */
	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}
	/**
	 * @param numeroArticolo the numeroArticolo to set
	 */
	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}
	/**
	 * @return the annoCapitolo
	 */
	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}
	/**
	 * @param annoCapitolo the annoCapitolo to set
	 */
	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}
	/**
	 * @return the numeroCapitolo
	 */
	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}
	/**
	 * @param numeroCapitolo the numeroCapitolo to set
	 */
	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the numeroUEB
	 */
	public Integer getNumeroUEB() {
		return numeroUEB;
	}
	/**
	 * @param numeroUEB the numeroUEB to set
	 */
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}
	
	
	
}
