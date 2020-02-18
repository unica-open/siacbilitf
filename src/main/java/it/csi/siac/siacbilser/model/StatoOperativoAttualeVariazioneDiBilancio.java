/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaStoricizzata;

/**
 * StatoOperativoAttualeVariazioneBilancio
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class StatoOperativoAttualeVariazioneDiBilancio extends EntitaStoricizzata {

	private static final long serialVersionUID = -1384168346109228563L;

	private StatoOperativoVariazioneDiBilancio statoOperativoVariazioneDiBilancio;

	public StatoOperativoVariazioneDiBilancio getStatoOperativoVariazioneDiBilancio() {
		return statoOperativoVariazioneDiBilancio;
	}

	public void setStatoOperativoVariazioneDiBilancio(StatoOperativoVariazioneDiBilancio statoOperativoVariazioneDiBilancio) {
		this.statoOperativoVariazioneDiBilancio = statoOperativoVariazioneDiBilancio;
	}

	

	

}
