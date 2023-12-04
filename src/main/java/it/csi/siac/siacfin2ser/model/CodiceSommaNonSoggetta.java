/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;

/**
 * Codice Somma Non Soggetta.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class CodiceSommaNonSoggetta extends Codifica {
	
	private static final long serialVersionUID = 5384254482990390367L;
	
}
