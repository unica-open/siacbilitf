/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siaccommon.model.ModelDetailEnum;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum MutuoModelDetail implements ModelDetailEnum {	
	
	PeriodoRimborso,
	Stato,
	PianoAmmortamento,
	Soggetto,
	AttoAmministrativo,
	DebitoResiduo,
	ContoTesoreria,
	TotaliPianoAmmortamento,
	MovimentiGestioneAssociati,
	TotaliMovimentiGestioneAssociati,
	TipoFinanziamento,
	RipartizioneCapitoliConTotali,
	ProgettiAssociati,
	TotaliProgettiAssociati,
	;
	
	public static final MutuoModelDetail[] Sintetico = new MutuoModelDetail[] { PeriodoRimborso, Stato, Soggetto, AttoAmministrativo };
	public static final MutuoModelDetail[] Dettaglio = new MutuoModelDetail[] { PeriodoRimborso, Stato, Soggetto, AttoAmministrativo, ContoTesoreria, DebitoResiduo, TipoFinanziamento };
	public static final MutuoModelDetail[] AssociatoAEntita = new MutuoModelDetail[] { PeriodoRimborso, Stato, Soggetto, TipoFinanziamento };
	public static final MutuoModelDetail[] PianoAmmortamentoConTotali = new MutuoModelDetail[] { PianoAmmortamento, TotaliPianoAmmortamento };
	public static final MutuoModelDetail[] MovimentiGestioneAssociatiConTotali = new MutuoModelDetail[] { MovimentiGestioneAssociati, TotaliMovimentiGestioneAssociati };
	public static final MutuoModelDetail[] ProgettiAssociatiConTotali = new MutuoModelDetail[] { ProgettiAssociati, TotaliProgettiAssociati };
	
}