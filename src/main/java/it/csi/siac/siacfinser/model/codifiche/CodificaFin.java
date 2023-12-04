/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Classe per il passaggio generalizzato del minor numero possibile di dati relativi alle codifiche 
 * necessarie al frontend
 * 
 * @author luca.romanello
 *
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class CodificaFin extends Codifica implements Comparable<CodificaFin> {
	private static final long serialVersionUID = 1L;

	protected Integer id;
	
	public CodificaFin() {
		// Costruttore vuoto
	}
	
	public CodificaFin(Integer id, String descrizione, String codice) {
		this.id = id;
		setDescrizione(descrizione);
		setCodice(codice);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CodificaFin) {
			CodificaFin that = (CodificaFin)obj;
			return this.id != null && that.id != null && this.id.equals(that.id);
		}
		return false;
	}

	@Override
	public int compareTo(CodificaFin that) {
		if(that == null) {
			return -1;
		}
		String thisDescrizione = this.getDescrizione();
		String thatDescrizione = that.getDescrizione();
		if (thisDescrizione == null && thatDescrizione == null) {
			return 0;
		}
		if (thisDescrizione != null && thatDescrizione == null) {
			return -1;
		}
		if (thisDescrizione == null && thatDescrizione != null) {
			return 1;
		}
		return thisDescrizione.compareTo(thatDescrizione);
	}
	
	@Override
	public int hashCode() {
		/*
		 * Utilizzo HashCodeBuilder (Apache Commons) come metodo di utilita'
		 * per la generazione dell'hashCode in quanto permette di utilizzare
		 * un algoritmo testato e affidabile.
		 * In caso contrario, cfr. Joshua Bloch, Effective Java, item 8
		 */
		HashCodeBuilder hcb = new HashCodeBuilder();
		// Utilizzo tutti e soli i campi presenti nella definizione dell'equals
		hcb.append(this.id);
		
		return hcb.toHashCode();
	}
	
}
