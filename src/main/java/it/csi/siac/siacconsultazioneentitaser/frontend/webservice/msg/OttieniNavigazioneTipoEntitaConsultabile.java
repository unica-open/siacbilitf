/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.ConsultazioneEntitaSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.model.TipoEntitaConsultabile;
import it.csi.siac.siaccorser.model.ServiceRequest;
/**
 * Request per la ricerca delle entita' selezionabili a partire dall'entita selezionabile padre
 *  @author Elisa Chiari
 *  @version 1.0.0 - 08/03/2016
 * */
@XmlType(namespace = ConsultazioneEntitaSvcDictionary.NAMESPACE)
public class OttieniNavigazioneTipoEntitaConsultabile extends ServiceRequest {

	private TipoEntitaConsultabile tipoEntitaConsultabile;

	/**
	 * @return the tipoEntitaConsultabile
	 */
	public TipoEntitaConsultabile getTipoEntitaConsultabile() {
		return tipoEntitaConsultabile;
	}

	/**
	 * @param tipoEntitaConsultabile the tipoEntitaConsultabile to set
	 */
	public void setTipoEntitaConsultabile(TipoEntitaConsultabile tipoEntitaConsultabile) {
		this.tipoEntitaConsultabile = tipoEntitaConsultabile;
	}
	
	
}
