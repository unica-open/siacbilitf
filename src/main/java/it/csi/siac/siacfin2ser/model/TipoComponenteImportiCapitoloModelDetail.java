/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;


@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoComponenteImportiCapitoloModelDetail implements ModelDetailEnum {
	AmbitoComponenteImportiCapitolo,
	Anno,
	FonteFinanziariaComponenteImportiCapitolo,
	MacrotipoComponenteImportiCapitolo,
	MomentoComponenteImportiCapitolo,
	SottotipoComponenteImportiCapitolo,
	PropostaDefaultComponenteImportiCapitolo,
	//SIAC-7349
	//TipoGestioneComponenteImportiCapitolo,
	ImpegnabileComponenteImportiCapitolo,
	DettaglioComponenteImportiCapitolo, 
	StatoTipoComponenteImportiCapitolo,
	CollegatoACapitoli,
	;
}
