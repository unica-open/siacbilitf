/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * Causali 770. 
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class Causale770 extends Causale {

	private static final long serialVersionUID = 8335816135061337717L;

}
