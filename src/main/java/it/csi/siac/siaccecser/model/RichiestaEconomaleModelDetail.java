/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccommon.model.ModelDetailEnum;

/**
 * The Enum RichiestaEconomaleModelDetail.
 * 
 * @author Domenico
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum RichiestaEconomaleModelDetail implements ModelDetailEnum {
	
	CassaEconomale, 
	//Alternativa a CassaEconomale:
	CassaEconomaleMinimal,
	
	StatoOperativo,
	
	Rendiconto,
	//Alternativo a Rendiconto:
	RendicontoConMovimentoBase,
	
	Sospeso,
	Soggetto,
	Movimenti,
	Impegno,
	Classificatori,
	DatiTrasferta,
	Giustificativi,
	Subdocumento,
	DatiStampa,
	
	;
}
