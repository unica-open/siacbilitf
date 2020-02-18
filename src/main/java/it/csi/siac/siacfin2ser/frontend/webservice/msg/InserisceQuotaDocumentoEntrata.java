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

/**
 * @author Valentina
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceQuotaDocumentoEntrata extends ServiceRequest {
	
	private SubdocumentoEntrata subdocumentoEntrata;
	private CapitoloEntrataGestione capitolo;
	private boolean aggiornaStatoDocumento = true;
	private boolean quotaContestuale = false;
	private Bilancio bilancio;
	
	// SIAC-4956
	private boolean impostaFlagConvalidaManuale = true;
	// SIAC-5484
	private boolean saltaControlloDisponibilitaAccertamento = false;
	//SIAC-6645
	private boolean gestisciModificaImporto = false;

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

	@XmlTransient
	public boolean isQuotaContestuale() {
		return quotaContestuale;
	}

	public void setQuotaContestuale(boolean quotaContestuale) {
		this.quotaContestuale = quotaContestuale;
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
	 * @return the impostaFlagConvalidaManuale
	 */
	@XmlTransient
	public boolean isImpostaFlagConvalidaManuale() {
		return impostaFlagConvalidaManuale;
	}

	/**
	 * @param impostaFlagConvalidaManuale the impostaFlagConvalidaManuale to set
	 */
	public void setImpostaFlagConvalidaManuale(boolean impostaFlagConvalidaManuale) {
		this.impostaFlagConvalidaManuale = impostaFlagConvalidaManuale;
	}

	/**
	 * @return the withPredocumentiCompletiCollegati
	 */
	@XmlTransient
	public boolean isSaltaControlloDisponibilitaAccertamento() {
		return saltaControlloDisponibilitaAccertamento;
	}

	/**
	 * Sets the salta controllo disponibilita accertamento.
	 *
	 * @param saltaControlloDisponibilitaAccertamento the new salta controllo disponibilita accertamento
	 */
	public void setSaltaControlloDisponibilitaAccertamento(boolean saltaControlloDisponibilitaAccertamento) {
		this.saltaControlloDisponibilitaAccertamento = saltaControlloDisponibilitaAccertamento;
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
