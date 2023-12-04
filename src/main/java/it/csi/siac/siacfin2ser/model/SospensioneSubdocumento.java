/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * Sospensione per il subdocumento.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class SospensioneSubdocumento extends EntitaEnte {

	/** Per la serializzazione */
	private static final long serialVersionUID = 1655573211166539515L;
	
	private Date dataSospensione;
	private String causaleSospensione;
	private Date dataRiattivazione;
	
	/**
	 * @return the dataSospensione
	 */
	public Date getDataSospensione() {
		return dataSospensione;
	}
	/**
	 * @param dataSospensione the dataSospensione to set
	 */
	public void setDataSospensione(Date dataSospensione) {
		this.dataSospensione = dataSospensione;
	}
	/**
	 * @return the causaleSospensione
	 */
	public String getCausaleSospensione() {
		return causaleSospensione;
	}
	/**
	 * @param causaleSospensione the causaleSospensione to set
	 */
	public void setCausaleSospensione(String causaleSospensione) {
		this.causaleSospensione = causaleSospensione;
	}
	/**
	 * @return the dataRiattivazione
	 */
	public Date getDataRiattivazione() {
		return dataRiattivazione;
	}
	/**
	 * @param dataRiattivazione the dataRiattivazione to set
	 */
	public void setDataRiattivazione(Date dataRiattivazione) {
		this.dataRiattivazione = dataRiattivazione;
	}
}
