/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

/**
 * Request per l'associazione delle imputazioni contabili variate
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaImputazioniContabiliVariatePreDocumentoSpesa extends ServiceRequest {
	
	private List<PreDocumentoSpesa> preDocumentiSpesa = new ArrayList<PreDocumentoSpesa>();
	private RicercaSinteticaPreDocumentoSpesa ricercaSinteticaPreDocumentoSpesa;
	private Bilancio bilancio;
	
	// Imputazioni contabili
	private CapitoloUscitaGestione capitoloUscitaGestione;
	private Impegno impegno;
	private SubImpegno subImpegno;
	private Soggetto soggetto;
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	private SedeSecondariaSoggetto sedeSecondariaSoggetto;
	private AttoAmministrativo attoAmministrativo;

	/**
	 * @return the preDocumentiSpesa
	 */
	public List<PreDocumentoSpesa> getPreDocumentiSpesa() {
		return preDocumentiSpesa;
	}

	/**
	 * @param preDocumentiSpesa the preDocumentiSpesa to set
	 */
	public void setPreDocumentiSpesa(List<PreDocumentoSpesa> preDocumentiSpesa) {
		this.preDocumentiSpesa = preDocumentiSpesa != null ? preDocumentiSpesa : new ArrayList<PreDocumentoSpesa>();
	}

	/**
	 * @return the ricercaSinteticaPreDocumentoSpesa
	 */
	public RicercaSinteticaPreDocumentoSpesa getRicercaSinteticaPreDocumentoSpesa() {
		return ricercaSinteticaPreDocumentoSpesa;
	}

	/**
	 * @param ricercaSinteticaPreDocumentoSpesa the ricercaSinteticaPreDocumentoSpesa to set
	 */
	public void setRicercaSinteticaPreDocumentoSpesa(RicercaSinteticaPreDocumentoSpesa ricercaSinteticaPreDocumentoSpesa) {
		this.ricercaSinteticaPreDocumentoSpesa = ricercaSinteticaPreDocumentoSpesa;
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
	 * @return the capitoloUscitaGestione
	 */
	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	/**
	 * @param capitoloUscitaGestione the capitoloUscitaGestione to set
	 */
	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
	}

	/**
	 * @return the impegno
	 */
	public Impegno getImpegno() {
		return impegno;
	}

	/**
	 * @param impegno the impegno to set
	 */
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	/**
	 * @return the subImpegno
	 */
	public SubImpegno getSubImpegno() {
		return subImpegno;
	}

	/**
	 * @param subImpegno the subImpegno to set
	 */
	public void setSubImpegno(SubImpegno subImpegno) {
		this.subImpegno = subImpegno;
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
	 * @return the modalitaPagamentoSoggetto
	 */
	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}

	/**
	 * @param modalitaPagamentoSoggetto the modalitaPagamentoSoggetto to set
	 */
	public void setModalitaPagamentoSoggetto(ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}

	/**
	 * @return the sedeSecondariaSoggetto
	 */
	public SedeSecondariaSoggetto getSedeSecondariaSoggetto() {
		return sedeSecondariaSoggetto;
	}

	/**
	 * @param sedeSecondariaSoggetto the sedeSecondariaSoggetto to set
	 */
	public void setSedeSecondariaSoggetto(SedeSecondariaSoggetto sedeSecondariaSoggetto) {
		this.sedeSecondariaSoggetto = sedeSecondariaSoggetto;
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
	
}
