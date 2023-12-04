/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.Distinta;
import it.csi.siac.siacfinser.model.SubAccertamento;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * Subdocumento Entrata.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class SubdocumentoEntrata extends Subdocumento<DocumentoEntrata,SubdocumentoIvaEntrata> {

	private static final long serialVersionUID = -5261150736939478840L;
	
	private Accertamento accertamento;
	private SubAccertamento subAccertamento;
	private ContoTesoreria contoTesoreria;
	private Distinta distinta;
	private PreDocumentoEntrata preDocumentoEntrata;
	
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
	 * Ottiene il subAccertamento se valorizzato, altrimenti l'accertamento
	 * 
	 * @return subAccertamento o accertamento.
	 */
	public Accertamento getAccertamentoOSubAccertamento(){
		if(this.getSubAccertamento() != null  && this.getSubAccertamento().getUid() !=0){
			return this.getSubAccertamento();
		} else if(this.getAccertamento() != null && this.getAccertamento().getUid() !=0){
			return this.getAccertamento();
		}
		
		return null;
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
	 * @return the distinta
	 */
	public Distinta getDistinta() {
		return distinta;
	}
	
	/**
	 * @param distinta the distinta to set
	 */
	public void setDistinta(Distinta distinta) {
		this.distinta = distinta;
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
	/**
	 * @return the importoDaIncassare
	 */
	public BigDecimal getImportoDaIncassare() {
		return getImportoNotNull().subtract(getImportoDaDedurreNotNull());
	}
	
}
