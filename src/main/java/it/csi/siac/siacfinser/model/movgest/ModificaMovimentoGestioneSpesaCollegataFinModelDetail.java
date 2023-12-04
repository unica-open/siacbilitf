/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;
import it.csi.siac.siacfinser.model.FINDataDictionary;


/**
* The Enum AccertamentoModelDetail.
* 
* @author Alessandro Marchino
*/
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public enum ModificaMovimentoGestioneSpesaCollegataFinModelDetail implements ModelDetailEnum {
	
	ModificaMovimentoGestioneSpesa,
	ModificaMovimentoGestioneEntrata,
	VincoloEsplicito,
	ImportoResiduoCollegare,
	;

}
