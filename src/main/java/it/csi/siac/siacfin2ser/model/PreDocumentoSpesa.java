/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class PreDocumentoSpesa extends PreDocumento<DatiAnagraficiPreDocumentoSpesa,SubdocumentoSpesa> {
	
	private static final long serialVersionUID = -1767783706659984686L;
	
	private CapitoloUscitaGestione capitoloUscitaGestione;
	private Impegno impegno;
	private SubImpegno subImpegno;
	private CausaleSpesa causaleSpesa;
	private ContoTesoreria contoTesoreria;
	
	private SedeSecondariaSoggetto sedeSecondariaSoggetto;
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	

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
	 * @return the contoTesoreria
	 */
	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	/**
	 * @param contoTesoreria the contoTesoreria to set
	 */
	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
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
	 * @return the causaleSpesa
	 */
	public CausaleSpesa getCausaleSpesa() {
		return causaleSpesa;
	}

	/**
	 * @param causaleSpesa the causaleSpesa to set
	 */
	public void setCausaleSpesa(CausaleSpesa causaleSpesa) {
		this.causaleSpesa = causaleSpesa;
	}

	

	@Override
	public boolean controllaCompletabilita() {
		return controllaNotNullUidValorizzato(getCausaleSpesa())
				&& controllaNotNullUidValorizzato(getContoTesoreria())
				&& controllaNotNullUidValorizzato(getSoggetto())
				&& controllaNotNullUidValorizzato(getModalitaPagamentoSoggetto())
				&& (controllaNotNullUidValorizzato(getImpegno()) || controllaNotNullUidValorizzato(getSubImpegno()));
	}
}
