/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.fcde.modeldetail;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccommon.model.ModelDetailEnum;


/**
* The Enum AccantonamentoFondiDubbiaEsigibilitaRendicontoModelDetail.
* 
* @author Alessandro Marchino
*/
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum AccantonamentoFondiDubbiaEsigibilitaGestioneModelDetail implements ModelDetailEnum {
	
	CapitoloEntrataGestione,
	TipoMedia,
	Tipo,
	TipoMediaConfronto,
	StanziamentiCapitolo,
	AttributiBilancio,
	;

}
