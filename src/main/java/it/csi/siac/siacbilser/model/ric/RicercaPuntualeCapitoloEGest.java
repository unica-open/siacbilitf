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
 * CapitRicercaPuntualeCapitoloEGest: entita' di supporto per la ricerca
 * puntuale del capEntrataGestione, contiene i parametri (obbligatori e/o
 * facoltativi) di ricerca
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloEGest implements Serializable {

	private static final long serialVersionUID = -2839455515564577388L;

	private Integer annoEsercizio;
	private Integer annoCapitolo;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB = 1;

	private StatoOperativoElementoDiBilancio statoOperativoElementoDiBilancio;

	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}

	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}

	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}

	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}

	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
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
