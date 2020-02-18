/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.SubAccertamento;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Request per l'associazione delle imputazioni contabili variate
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaImputazioniContabiliVariatePreDocumentoEntrata extends ServiceRequest {
	
	private List<PreDocumentoEntrata> preDocumentiEntrata = new ArrayList<PreDocumentoEntrata>();
	private RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata;
	private Bilancio bilancio;
	
	// Imputazioni contabili
	private CapitoloEntrataGestione capitoloEntrataGestione;
	private Accertamento accertamento;
	private SubAccertamento subAccertamento;
	private Soggetto soggetto;
	private AttoAmministrativo attoAmministrativo;
	
	private boolean gestisciModificaImportoAccertamento = false;

	/**
	 * @return the preDocumentiEntrata
	 */
	public List<PreDocumentoEntrata> getPreDocumentiEntrata() {
		return preDocumentiEntrata;
	}

	/**
	 * @param preDocumentiEntrata the preDocumentiEntrata to set
	 */
	public void setPreDocumentiEntrata(List<PreDocumentoEntrata> preDocumentiEntrata) {
		this.preDocumentiEntrata = preDocumentiEntrata != null ? preDocumentiEntrata : new ArrayList<PreDocumentoEntrata>();
	}

	/**
	 * @return the ricercaSinteticaPreDocumentoEntrata
	 */
	public RicercaSinteticaPreDocumentoEntrata getRicercaSinteticaPreDocumentoEntrata() {
		return ricercaSinteticaPreDocumentoEntrata;
	}

	/**
	 * @param ricercaSinteticaPreDocumentoEntrata the ricercaSinteticaPreDocumentoEntrata to set
	 */
	public void setRicercaSinteticaPreDocumentoEntrata(RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata) {
		this.ricercaSinteticaPreDocumentoEntrata = ricercaSinteticaPreDocumentoEntrata;
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
	 * @return the capitoloEntrataGestione
	 */
	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}

	/**
	 * @param capitoloEntrataGestione the capitoloEntrataGestione to set
	 */
	public void setCapitoloEntrataGestione(CapitoloEntrataGestione capitoloEntrataGestione) {
		this.capitoloEntrataGestione = capitoloEntrataGestione;
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
	 * @return the subAccertamento
	 */
	public SubAccertamento getSubAccertamento() {
		return subAccertamento;
	}

	/**
	 * @param subAccertamento the subAccertamento to set
	 */
	public void setSubAccertamento(SubAccertamento subAccertamento) {
		this.subAccertamento = subAccertamento;
	}

	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}

	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
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

	public boolean isGestisciModificaImportoAccertamento() {
		return gestisciModificaImportoAccertamento;
	}

	public void setGestisciModificaImportoAccertamento(boolean gestisciModificaImportoAccertamento) {
		this.gestisciModificaImportoAccertamento = gestisciModificaImportoAccertamento;
	}

}
