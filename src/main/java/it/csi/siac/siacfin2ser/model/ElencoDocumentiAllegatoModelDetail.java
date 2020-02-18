/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ModelDetail;

/**
 * The Enum ElencoDocumentiAllegatoModelDetail.
 * @author Marchino Alessandro
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public enum ElencoDocumentiAllegatoModelDetail implements ModelDetail {
	
	AttoAllegato, //ElencoDocAttoAllegatoConverter
	AttoAllegatoExtended, //ElencoDocAttoAllegatoExtendedConverter
	Stato, //ElencoDocStatoConverter
	Subdocumenti, //ElencoDocSubdocumentiConverter
	SubdocumentiDettaglio, //ElencoDocSubdocumentiDettaglioConverter
	
	ContieneQuoteACopertura, //ElencoDocContieneQuoteACoperturaConverter
	SubdocumentiTotale, // ElencoDocSubdocumentiTotaleConverter
	TotaleDaConvalidareSpesaEntrata, //ElencoDocTotaleDaConvalidareSpesaEntrataConverter
	TotaleDaPagareIncassare, // ElencoDocTotaleDaPagareIncassareConverter
	TotaleQuoteSpesaEntrata, // ElencoDocTotaleQuoteSpesaEntrataConverter
	
	//SIAC-6261
	HasImpegnoConfermaDataFineValiditaDurc, //ElencoDocImpegnoConfermaDataFineValiditaDurcConverter
	;

}
