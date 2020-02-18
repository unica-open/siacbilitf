/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Azione;
import it.csi.siac.siaccorser.model.GruppoAzioni;
import it.csi.siac.siaccorser.model.ServiceResponse;


/**
 * The Class RicercaCodificheResponse.
 * 
 * @author Domenico
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaAzionePerChiaveResponse extends ServiceResponse {

	private Azione azione;
	// Obbligato in quanto il campo e' XmlTransient sull'azione
	private GruppoAzioni gruppoAzioni;
	/**
	 * @return the azione
	 */
	public Azione getAzione() {
		return azione;
	}
	/**
	 * @param azione the azione to set
	 */
	public void setAzione(Azione azione) {
		this.azione = azione;
	}
	/**
	 * @return the gruppoAzioni
	 */
	public GruppoAzioni getGruppoAzioni() {
		return gruppoAzioni;
	}
	/**
	 * @param gruppoAzioni the gruppoAzioni to set
	 */
	public void setGruppoAzioni(GruppoAzioni gruppoAzioni) {
		this.gruppoAzioni = gruppoAzioni;
	}
	
}
