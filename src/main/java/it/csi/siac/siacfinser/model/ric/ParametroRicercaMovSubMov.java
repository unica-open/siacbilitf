/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Bean contenente i parametri che soddisfano i criteri di ricerca per impegni e sub-impegni / accertamenti e sub-accertamenti
 * Il parametro anno esercizio e' obbligatorio
 * 
 * @author 
 *
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaMovSubMov  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer annoEsercizio;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	
	private int annoProvvedimento;
	private int numeroProvvedimento;
	private TipoAtto tipoProvvedimento;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;

	
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
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
	public Integer getNumeroUEB() {
		return numeroUEB;
	}
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}
	public int getAnnoProvvedimento() {
		return annoProvvedimento;
	}
	public void setAnnoProvvedimento(int annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}
	public int getNumeroProvvedimento() {
		return numeroProvvedimento;
	}
	public void setNumeroProvvedimento(int numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}
	public TipoAtto getTipoProvvedimento() {
		return tipoProvvedimento;
	}
	public void setTipoProvvedimento(TipoAtto tipoProvvedimento) {
		this.tipoProvvedimento = tipoProvvedimento;
	}
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}
	public void setStrutturaAmministrativoContabile(
			StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}	
}
