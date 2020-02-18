/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/*
 * @author Domenico
 */
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;

/**
 * permette di definire il legame tra 2 conti
 * 
 * utilizzato al momento per collegare  conti dello SP Attivo con conti Fondo
 * dello SP Passivo
 * 
 * FONDO - Fondo
 * @author 1080
 * @version 1.0
 * @created 06-mar-2015 16.32.16
 */

@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class TipoLegame extends Codifica {
	//siac_d_pdce_rel_tipo
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6735133350026229180L;

}