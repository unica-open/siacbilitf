/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siacfin2ser.model.ImpegnoModelDetail;

@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum ProgettoModelDetail implements ModelDetailEnum {	
	
	Cronoprogrammi,
	Classificatori,
	AttoAmministrativo,
	Attributi,
	Stato,
	MutuiAssociati
	;
	
	public static ProgettoModelDetail[] Dettaglio = new ProgettoModelDetail[] { 
			ProgettoModelDetail.Classificatori,
			ProgettoModelDetail.AttoAmministrativo, 
			ProgettoModelDetail.Attributi, 
		};

}