/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;

/**
 * Utilizzato per richiesta ANTICIPO_SPESE_MISSIONE
 * 
 * Valori possibili:
 * <ul>
 *     <li>Assessore</li>
 *     <li>Presidente</li>
 * </ul>
 * @author prologicMMA
 * @version 1.0
 * @created 01-dic-2014 09.50.21
 */

@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class TipoAmministratore extends Codifica {

	private static final long serialVersionUID = -3424966352464639782L;

	public TipoAmministratore() {
		super();
	}

	public TipoAmministratore(Codifica c) {
		super(c);
	}

	public TipoAmministratore(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
}