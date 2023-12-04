/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.Subdocumento;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EliminaQuotaDaElenco extends ServiceRequest {
	
	private ElencoDocumentiAllegato elencoDocumentiAllegato;
	
	@XmlElements({
		@XmlElement(name="subdocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name="subdocumentoEntrata", type=SubdocumentoEntrata.class)
	})
	// Subdocumenti di spesa o di entrata
	private Subdocumento<?, ?> subdocumento;
	private Bilancio bilancio;
	
	
	//Opzionale: AllegatoAtto a cui e' associato l'ElencoDocumentiAllegato
	//private AllegatoAtto allegatoAtto;
	
	/**
	 * @return the elencoDocumentiAllegato
	 */
	public ElencoDocumentiAllegato getElencoDocumentiAllegato() {
		return elencoDocumentiAllegato;
	}
	/**
	 * @param elencoDocumentiAllegato the elencoDocumentiAllegato to set
	 */
	public void setElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		this.elencoDocumentiAllegato = elencoDocumentiAllegato;
	}
	
	/**
	 * @return the subdocumento
	 */
	@XmlTransient
	public Subdocumento<?, ?> getSubdocumento() {
		return subdocumento;
	}
	/**
	 * @param subdocumento the subdocumento to set
	 */
	public void setSubdocumento(Subdocumento<?, ?> subdocumento) {
		this.subdocumento = subdocumento;
	}
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	
	
	

}
