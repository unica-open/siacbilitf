/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.StatoOperativoElementoDiBilancio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

/**
 * RicercaPuntualeCapitoloUPrev: entita' di supporto per la ricerca puntuale del
 * capUscitaPrevisione, contiene i parametri (obbligatori e/o facoltativi) di
 * ricerca
 * 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloUPrev implements Serializable {

	
	private static final long serialVersionUID = -4626947994606895420L;
	//modificato RTI da int a Integer
	private Integer annoEsercizio;
	//modificato RTI da int a Integer
	private Integer annoCapitolo;
	//modificato RTI da int a Integer
	private Integer numeroCapitolo;
	//modificato RTI da int a Integer
	private Integer numeroArticolo;
	//modificato RTI da int a Integer
	private Integer numeroUEB = 1;

	private StatoOperativoElementoDiBilancio statoOperativoElementoDiBilancio;

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}

	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}

	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}

	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}

	public StatoOperativoElementoDiBilancio getStatoOperativoElementoDiBilancio() {
		return statoOperativoElementoDiBilancio;
	}

	public void setStatoOperativoElementoDiBilancio(
			StatoOperativoElementoDiBilancio statoOperativoElementoDiBilancio) {
		this.statoOperativoElementoDiBilancio = statoOperativoElementoDiBilancio;
	}

	public Integer getNumeroUEB() {
		return numeroUEB;
	}

	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}
}
