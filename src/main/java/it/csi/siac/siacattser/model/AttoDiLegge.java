/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model;

import it.csi.siac.siaccorser.model.Entita;

import javax.xml.bind.annotation.XmlType;

/**
 * AttoDiLegge
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = ATTDataDictionary.NAMESPACE)
public class AttoDiLegge extends Entita {

	/** Per la serializzazione */
	private static final long serialVersionUID = -4979715011307801448L;

	private String articolo;
	private String punto;
	private String comma;
	private Integer anno;
	private Integer numero;
	private TipoAtto tipoAtto;
	/**
	 * @return the articolo
	 */
	public String getArticolo() {
		return articolo;
	}
	/**
	 * @param articolo the articolo to set
	 */
	public void setArticolo(String articolo) {
		this.articolo = articolo;
	}
	/**
	 * @return the punto
	 */
	public String getPunto() {
		return punto;
	}
	/**
	 * @param punto the punto to set
	 */
	public void setPunto(String punto) {
		this.punto = punto;
	}
	/**
	 * @return the comma
	 */
	public String getComma() {
		return comma;
	}
	/**
	 * @param comma the comma to set
	 */
	public void setComma(String comma) {
		this.comma = comma;
	}
	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	/**
	 * @return the tipoAtto
	 */
	public TipoAtto getTipoAtto() {
		return tipoAtto;
	}
	/**
	 * @param tipoAtto the tipoAtto to set
	 */
	public void setTipoAtto(TipoAtto tipoAtto) {
		this.tipoAtto = tipoAtto;
	} 

}
