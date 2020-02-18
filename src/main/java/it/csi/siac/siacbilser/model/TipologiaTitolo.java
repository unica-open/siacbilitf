/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * TipologiaTitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TipologiaTitolo extends ClassificatoreGerarchico {

	private static final long serialVersionUID = -8037717170496080135L;

	private boolean tipologiaFoglia;

	public TipologiaTitolo() {
		super();
	}

	public TipologiaTitolo(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public boolean isTipologiaFoglia() {
		return tipologiaFoglia;
	}

	public void setTipologiaFoglia(boolean tipologiaFoglia) {
		this.tipologiaFoglia = tipologiaFoglia;
	}
	
	public Date getDataFineValiditaTipologiaTitolo() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaTipologiaTitolo(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
