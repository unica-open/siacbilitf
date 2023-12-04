/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.ContoCorrentePredocumentoEntrata;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.SubAccertamento;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class PreDocumentoEntrata extends PreDocumento<DatiAnagraficiPreDocumento,SubdocumentoEntrata> {
	
	private static final long serialVersionUID = 5907419346759010485L;	

	private CapitoloEntrataGestione capitoloEntrataGestione;
	private Accertamento accertamento;
	private SubAccertamento subAccertamento;
	private CausaleEntrata causaleEntrata;
	
	private ContoCorrentePredocumentoEntrata contoCorrente;
	
	private String codiceIUV;
	
	// SIAC-4383
	private Date dataTrasmissione;

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
	 * @return the causaleEntrata
	 */
	public CausaleEntrata getCausaleEntrata() {
		return causaleEntrata;
	}

	/**
	 * @param causaleEntrata the causaleEntrata to set
	 */
	public void setCausaleEntrata(CausaleEntrata causaleEntrata) {
		this.causaleEntrata = causaleEntrata;
	}

	/**
	 * @return the codiceIUV
	 */
	public String getCodiceIUV() {
		return codiceIUV;
	}

	/**
	 * @param codiceIUV the codiceIUV to set
	 */
	public void setCodiceIUV(String codiceIUV) {
		this.codiceIUV = codiceIUV;
	}

	/**
	 * @return the contoCorrente
	 */
	public ContoCorrentePredocumentoEntrata getContoCorrente() {
		return contoCorrente;
	}

	/**
	 * @param contoCorrente the contoCorrente to set
	 */
	public void setContoCorrente(ContoCorrentePredocumentoEntrata contoCorrente) {
		this.contoCorrente = contoCorrente;
	}
	
	
	/**
	 * @return the dataTrasmissione
	 */
	public Date getDataTrasmissione() {
		return dataTrasmissione;
	}

	/**
	 * @param dataTrasmissione the dataTrasmissione to set
	 */
	public void setDataTrasmissione(Date dataTrasmissione) {
		this.dataTrasmissione = dataTrasmissione;
	}

	@Override
	public boolean controllaCompletabilita() {
		return controllaNotNullUidValorizzato(getSoggetto())
				&& controllaNotNullUidValorizzato(getCapitoloEntrataGestione())
				&& (controllaNotNullUidValorizzato(getAccertamento()) || controllaNotNullUidValorizzato(getSubAccertamento()));
	}
	
}
