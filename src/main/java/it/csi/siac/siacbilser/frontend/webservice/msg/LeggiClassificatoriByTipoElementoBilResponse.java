/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Messaggio di risposta per la lista dei classificatori con livello ricercati per: anno, idEnteProprietario e codiceTipoElementoBilancio (es: cap-up)
 * 
 *  * ritorna una mappa con Key= TipologiaClassificatore (enum che contiene i codici dei tipi dei classificatori)
 * 						 Value = la lista di classificatori associata alla TipologiaClassificatore 	
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriByTipoElementoBilResponse extends
		ServiceResponse {

	private List<Missione> classificatoriMissione = new ArrayList<Missione>();
	private List<TitoloSpesa> classificatoriTitoloSpesa = new ArrayList<TitoloSpesa>();
	private List<TitoloEntrata> classificatoriTitoloEntrata = new ArrayList<TitoloEntrata>();

	public List<Missione> getClassificatoriMissione() {
		return classificatoriMissione;
	}

	public void setClassificatoriMissione(List<Missione> classificatoriMissione) {
		this.classificatoriMissione = classificatoriMissione;
	}

	public List<TitoloSpesa> getClassificatoriTitoloSpesa() {
		return classificatoriTitoloSpesa;
	}

	public void setClassificatoriTitoloSpesa(
			List<TitoloSpesa> classificatoriTitoloSpesa) {
		this.classificatoriTitoloSpesa = classificatoriTitoloSpesa;
	}

	public List<TitoloEntrata> getClassificatoriTitoloEntrata() {
		return classificatoriTitoloEntrata;
	}

	public void setClassificatoriTitoloEntrata(List<TitoloEntrata> classificatoriTitoloEntrata) {
		this.classificatoriTitoloEntrata = classificatoriTitoloEntrata;
	}
	
	
	


}
