/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaQuotaDocumentoEntrata extends ServiceRequest {
	
	private SubdocumentoEntrata subdocumentoEntrata;
	private boolean aggiornaStatoDocumento = true;
	private CapitoloEntrataGestione capitolo;
	private Bilancio bilancio;
	
	// 	SIAC-4956
	private boolean impostaFlagConvalidaManuale = true;
	//SIAC-6645
	private boolean gestisciModificaImporto;
	/**
	 * @return the subdocumentoEntrata
	 */
	public SubdocumentoEntrata getSubdocumentoEntrata() {
		return subdocumentoEntrata;
	}

	/**
	 * @param subdocumentoEntrata the subdocumentoEntrata to set
	 */
	public void setSubdocumentoEntrata(SubdocumentoEntrata subdocumentoEntrata) {
		this.subdocumentoEntrata = subdocumentoEntrata;
	}
	
	/**
	 * @return the aggiornaStatoDocumento
	 */
	@XmlTransient
	public boolean isAggiornaStatoDocumento() {
		return aggiornaStatoDocumento;
	}

	/**
	 * @param aggiornaStatoDocumento the aggiornaStatoDocumento to set
	 */
	public void setAggiornaStatoDocumento(boolean aggiornaStatoDocumento) {
		this.aggiornaStatoDocumento = aggiornaStatoDocumento;
	}
	
	
	/**
	 * @return the capitolo
	 */
	public CapitoloEntrataGestione getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(CapitoloEntrataGestione capitolo) {
		this.capitolo = capitolo;
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

	/**
	 * @return the impostaFlagConvalidaManuale
	 */
	@XmlTransient
	public boolean isImpostaFlagConvalidaManuale() {
		return this.impostaFlagConvalidaManuale;
	}

	/**
	 * @param impostaFlagConvalidaManuale the impostaFlagConvalidaManuale to set
	 */
	public void setImpostaFlagConvalidaManuale(boolean impostaFlagConvalidaManuale) {
		this.impostaFlagConvalidaManuale = impostaFlagConvalidaManuale;
	}

	/**
	 * @return the gestisciModificaImporto
	 */
	public boolean isGestisciModificaImporto() {
		return gestisciModificaImporto;
	}

	/**
	 * @param gestisciModificaImporto the gestisciModificaImporto to set
	 */
	public void setGestisciModificaImporto(boolean gestisciModificaImporto) {
		this.gestisciModificaImporto = gestisciModificaImporto;
	}
	
}
