/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
* The Enum DettaglioVariazioneComponenteImportoCapitoloModelDetail.
* 
* @author Alessandro Marchino
*/
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum DettaglioVariazioneComponenteImportoCapitoloModelDetail implements ModelDetailEnum {
	
	Flag,
	ComponenteImportiCapitolo,
	DettaglioVariazioneImportiCapitolo,
	;

}
