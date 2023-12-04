/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.wrapper;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;

//SIAC-7349  - START - MR - SR200 - 07/05/2020 Oggetto di mapping
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiImpegnatoPerComponenteAnniSuccNoStanz implements Serializable {
	
	public ImportiImpegnatoPerComponenteAnniSuccNoStanz() {

	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -4593988640432740271L;
	private Integer idComp;
	private String descrizioneComponente;
	private BigDecimal importo;
	private String descrizioneMacrotipoComponente;
	
	public String getDescrizioneMacrotipoComponente() {
		return descrizioneMacrotipoComponente;
	}
	public void setDescrizioneMacrotipoComponente(String descrizioneMacrotipoComponente) {
		this.descrizioneMacrotipoComponente = descrizioneMacrotipoComponente;
	}
	
	public BigDecimal getImporto() {
		return importo;
	}
	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}
	public Integer getIdComp() {
		return idComp;
	}
	public void setIdComp(Integer idComp) {
		this.idComp = idComp;
	}
	public String getDescrizioneComponente() {
		return descrizioneComponente;
	}
	public void setDescrizioneComponente(String descrizioneComponente) {
		this.descrizioneComponente = descrizioneComponente;
	}
	


}
