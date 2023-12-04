/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

@XmlType(namespace = ConsultazioneEntitaDataDictionary.NAMESPACE)
public class ParametriRicercaProvvedimentoConsultabile extends ParametriRicercaEntitaConsultabile {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5946493896970502134L;
	
	private Integer annoAtto;
	private Integer numeroAtto;
	private TipoAtto tipoAtto;
	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
	/**
	 * @return the annoAtto
	 */
	public Integer getAnnoAtto() {
		return annoAtto;
	}
	/**
	 * @param annoAtto the annoAtto to set
	 */
	public void setAnnoAtto(Integer annoAtto) {
		this.annoAtto = annoAtto;
	}
	/**
	 * @return the numeroAtto
	 */
	public Integer getNumeroAtto() {
		return numeroAtto;
	}
	/**
	 * @param numeroAtto the numeroAtto to set
	 */
	public void setNumeroAtto(Integer numeroAtto) {
		this.numeroAtto = numeroAtto;
	}
	/**
	 * @return the tipoAtto
	 */
	public TipoAtto getTipoAtto() {
		return tipoAtto;
	}
	/**
	 * @param tipoAtto the tipoAtto to set
	 */
	public void setTipoAtto(TipoAtto tipoAtto) {
		this.tipoAtto = tipoAtto;
	}
	/**
	 * @return the strutturaAmministrativoContabile
	 */
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return strutturaAmministrativoContabile;
	}
	/**
	 * @param strutturaAmministrativoContabile the strutturaAmministrativoContabile to set
	 */
	public void setStrutturaAmministrativoContabile(StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
	}
	
	
	
}
