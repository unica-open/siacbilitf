/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;


@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum TipoComponenteImportiCapitoloModelDetail implements ModelDetail {
	AmbitoComponenteImportiCapitolo,
	Anno,
	FonteFinanziariaComponenteImportiCapitolo,
	MacrotipoComponenteImportiCapitolo,
	MomentoComponenteImportiCapitolo,
	SottotipoComponenteImportiCapitolo,
	PropostaDefaultComponenteImportiCapitolo,
	TipoGestioneComponenteImportiCapitolo,
	DettaglioComponenteImportiCapitolo, 
	StatoTipoComponenteImportiCapitolo,
	CollegatoACapitoli,
	;
}
