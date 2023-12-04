/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;

/**
 * @author elisa
 *
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ModalitaAffidamentoProgetto extends Codifica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7287708356471322088L;

	public ModalitaAffidamentoProgetto() {
		super();
	}

	public ModalitaAffidamentoProgetto(String codice, String descrizione) {
		super(codice, descrizione);
		
	}
	
}
