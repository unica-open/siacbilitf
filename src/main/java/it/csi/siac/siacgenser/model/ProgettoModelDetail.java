/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siacbilser.model.ModelDetail;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum ProgettoModelDetail implements ModelDetail {	
	
	Cronoprogrammi,
	;

}