/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DettaglioComponenteImportiCapitolo implements Serializable {

	private static final long serialVersionUID = -199471122266590934L;
	
	private BigDecimal importo = BigDecimal.ZERO;
	private boolean editabile;
	private ComponenteImportiCapitolo componenteImportiCapitolo;
	private TipoDettaglioComponenteImportiCapitolo tipoDettaglioComponenteImportiCapitolo;
	//SIAC-7159
	private boolean isPropostaDefault;
	//SIAC-7349
	private String disponibilita;
	private Integer annoCompetenza;
	
	public boolean isPropostaDefault() {
		return isPropostaDefault;
	}
	public void setPropostaDefault(boolean isPropostaDefault) {
		this.isPropostaDefault = isPropostaDefault;
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
	 * @return the editabile
	 */
	public boolean isEditabile() {
		return editabile;
	}
	/**
	 * @param editabile the editabile to set
	 */
	public void setEditabile(boolean editabile) {
		this.editabile = editabile;
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
	public void setTipoDettaglioComponenteImportiCapitolo(
			TipoDettaglioComponenteImportiCapitolo tipoDettaglioComponenteImportiCapitolo) {
		this.tipoDettaglioComponenteImportiCapitolo = tipoDettaglioComponenteImportiCapitolo;
	}
	/**
	 * @return the disponibilita
	 */
	public String getDisponibilita() {
		return disponibilita;
	}
	/**
	 * @param disponibilita the disponibilita to set
	 */
	public void setDisponibilita(String disponibilita) {
		this.disponibilita = disponibilita;
	}
	/**
	 * @return the annoCompetenza
	 */
	public Integer getAnnoCompetenza() {
		return annoCompetenza;
	}
	/**
	 * @param annoCompetenza the annoCompetenza to set
	 */
	public void setAnnoCompetenza(Integer annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}
	
	
}
