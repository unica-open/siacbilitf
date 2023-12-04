/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class DatiOrdinativoTrasmesso extends EntitaEnte {

	 
	private static final long serialVersionUID = 1L;
	
	private Date dataTrasmissione;
	private Date dataQuietanza;
	private String cro;
	private Date dataFirma;
	private String firma;
	//SIAC-7726
	private Integer numeroQuietanza;
	
	
	/**
	 * @return the dataQuietanza
	 */
	public Date getDataQuietanza() {
		return dataQuietanza;
	}

	/**
	 * @param dataQuietanza the dataQuietanza to set
	 */
	public void setDataQuietanza(Date dataQuietanza) {
		this.dataQuietanza = dataQuietanza;
	}

	/**
	 * @return the cro
	 */
	public String getCro() {
		return cro;
	}

	/**
	 * @param cro the cro to set
	 */
	public void setCro(String cro) {
		this.cro = cro;
	}

	/**
	 * @return the dataFirma
	 */
	public Date getDataFirma() {
		return dataFirma;
	}

	/**
	 * @param dataFirma the dataFirma to set
	 */
	public void setDataFirma(Date dataFirma) {
		this.dataFirma = dataFirma;
	}

	/**
	 * @return the firma
	 */
	public String getFirma() {
		return firma;
	}

	/**
	 * @param firma the firma to set
	 */
	public void setFirma(String firma) {
		this.firma = firma;
	}

	public Date getDataTrasmissione() {
		return dataTrasmissione;
	}

	public void setDataTrasmissione(Date dataTrasmissione) {
		this.dataTrasmissione = dataTrasmissione;
	}

	/**
	 * @return the numeroQuietanza
	 */
	public Integer getNumeroQuietanza() {
		return numeroQuietanza;
	}

	/**
	 * @param numeroQuietanza the numeroQuietanza to set
	 */
	public void setNumeroQuietanza(Integer numeroQuietanza) {
		this.numeroQuietanza = numeroQuietanza;
	}
	

}
