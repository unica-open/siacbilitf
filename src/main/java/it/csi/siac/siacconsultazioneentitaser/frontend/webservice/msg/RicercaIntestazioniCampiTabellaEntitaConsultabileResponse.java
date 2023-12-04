/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.ConsultazioneEntitaSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.model.EntitaConsultabile;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Classe di Action per ottenere la lista delle intestazioni della tabella a partire dalla quale creare la tabella  
 * @author Elisa Chiari
 * @version 1.0.0 - 08/03/2016
 * */
@XmlType(namespace = ConsultazioneEntitaSvcDictionary.NAMESPACE)
public class RicercaIntestazioniCampiTabellaEntitaConsultabileResponse extends ServiceResponse {

	private Class<? extends EntitaConsultabile> entitaConsultabile;

	public Class<? extends EntitaConsultabile> getEntitaConsultabile() {
		return entitaConsultabile;
	}

	public void setEntitaConsultabile(Class<? extends EntitaConsultabile> entitaConsultabile) {
		this.entitaConsultabile = entitaConsultabile;
	}

}
