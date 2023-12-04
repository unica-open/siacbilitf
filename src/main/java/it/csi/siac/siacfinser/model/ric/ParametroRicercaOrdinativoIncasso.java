/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaOrdinativoIncasso extends BaseParametroRicercaOrdinativo {

	private static final long serialVersionUID = -1L;

	private String codiceCausale;
	private String codiceCreditore;
	private Integer annoMovimento;
	private Integer numeroMovimento;
	private Integer numeroSubMovimento;
	private Boolean filtraPerCollegaReversali = Boolean.FALSE;

	public String getCodiceCausale() {
		return codiceCausale;
	}

	public void setCodiceCausale(String codiceCausale) {
		this.codiceCausale = codiceCausale;
	}

	public String getCodiceCreditore() {
		return codiceCreditore;
	}

	public void setCodiceCreditore(String codiceCreditore) {
		this.codiceCreditore = codiceCreditore;
	}

	public Integer getAnnoMovimento() {
		return annoMovimento;
	}

	public void setAnnoMovimento(Integer annoMovimento) {
		this.annoMovimento = annoMovimento;
	}

	public Integer getNumeroMovimento() {
		return numeroMovimento;
	}

	public void setNumeroMovimento(Integer numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}

	public Integer getNumeroSubMovimento() {
		return numeroSubMovimento;
	}

	public void setNumeroSubMovimento(Integer numeroSubMovimento) {
		this.numeroSubMovimento = numeroSubMovimento;
	}

	public Boolean getFiltraPerCollegaReversali() {
		return filtraPerCollegaReversali;
	}

	public void setFiltraPerCollegaReversali(Boolean filtraPerCollegaReversali) {
		this.filtraPerCollegaReversali = filtraPerCollegaReversali;
	}

}
