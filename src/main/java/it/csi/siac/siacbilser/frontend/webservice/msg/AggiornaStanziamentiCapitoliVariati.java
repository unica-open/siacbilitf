/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.StatoOperativoAttualeVariazioneDiBilancio;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.CapitoloService.aggiornaStanziamentiCapitoliVariati()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaStanziamentiCapitoliVariati extends ServiceRequest {

	private VariazioneImportoCapitolo variazioneImportoCapitolo;
	private StatoOperativoAttualeVariazioneDiBilancio statoVariazionePrecedente;
	private StatoOperativoAttualeVariazioneDiBilancio statoVariazioneSuccessivo;

	public VariazioneImportoCapitolo getVariazioneImportoCapitolo() {
		return variazioneImportoCapitolo;
	}

	public void setVariazioneImportoCapitolo(
			VariazioneImportoCapitolo variazioneImportoCapitolo) {
		this.variazioneImportoCapitolo = variazioneImportoCapitolo;
	}

	public StatoOperativoAttualeVariazioneDiBilancio getStatoVariazionePrecedente() {
		return statoVariazionePrecedente;
	}

	public void setStatoVariazionePrecedente(
			StatoOperativoAttualeVariazioneDiBilancio statoVariazionePrecedente) {
		this.statoVariazionePrecedente = statoVariazionePrecedente;
	}

	public StatoOperativoAttualeVariazioneDiBilancio getStatoVariazioneSuccessivo() {
		return statoVariazioneSuccessivo;
	}

	public void setStatoVariazioneSuccessivo(
			StatoOperativoAttualeVariazioneDiBilancio statoVariazioneSuccessivo) {
		this.statoVariazioneSuccessivo = statoVariazioneSuccessivo;
	}

}
