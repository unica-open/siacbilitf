/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;
import it.csi.siac.siacfinser.model.Accertamento;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaDocumentoEntrata extends ServiceRequest {
	
	private DocumentoEntrata documentoEntrata;
	private AttoAmministrativo attoAmministrativo;
	private Accertamento accertamento;
	private Boolean rilevanteIva;
	private ParametriPaginazione parametriPaginazione;
	private ElencoDocumentiAllegato elencoDocumenti;
	private Boolean contabilizzaGenPcc;

	//SIAC-6780
	private PreDocumentoEntrata preDocumentoEntrata;
	
	/**
	 * @return the documentoEntrata
	 */
	public DocumentoEntrata getDocumentoEntrata() {
		return documentoEntrata;
	}

	/**
	 * @param documentoEntrata the documentoEntrata to set
	 */
	public void setDocumentoEntrata(DocumentoEntrata documentoEntrata) {
		this.documentoEntrata = documentoEntrata;
	}

	/**
	 * @return the attoAmministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	/**
	 * @param attoAmministrativo the attoAmministrativo to set
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}


	/**
	 * @return the accertamento
	 */
	public Accertamento getAccertamento() {
		return accertamento;
	}

	/**
	 * @param accertamento the accertamento to set
	 */
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	/**
	 * @return the rilevanteIva
	 */
	public Boolean getRilevanteIva() {
		return rilevanteIva;
	}

	/**
	 * @param rilevanteIva the rilevanteIva to set
	 */
	public void setRilevanteIva(Boolean rilevanteIva) {
		this.rilevanteIva = rilevanteIva;
	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the elencoDocumenti
	 */
	public ElencoDocumentiAllegato getElencoDocumenti() {
		return elencoDocumenti;
	}

	/**
	 * @param elencoDocumenti the elencoDocumenti to set
	 */
	public void setElencoDocumenti(ElencoDocumentiAllegato elencoDocumenti) {
		this.elencoDocumenti = elencoDocumenti;
	}

	/**
	 * @return the contabilizzaGenPcc
	 */
	public Boolean getContabilizzaGenPcc() {
		return contabilizzaGenPcc;
	}

	/**
	 * @param contabilizzaGenPcc the contabilizzaGenPcc to set
	 */
	public void setContabilizzaGenPcc(Boolean contabilizzaGenPcc) {
		this.contabilizzaGenPcc = contabilizzaGenPcc;
	}

	/**
	 * @return the preDocumentoEntrata
	 */
	public PreDocumentoEntrata getPreDocumentoEntrata() {
		return preDocumentoEntrata;
	}

	/**
	 * @param preDocumentoEntrata the preDocumentoEntrata to set
	 */
	public void setPreDocumentoEntrata(PreDocumentoEntrata preDocumentoEntrata) {
		this.preDocumentoEntrata = preDocumentoEntrata;
	}

}
