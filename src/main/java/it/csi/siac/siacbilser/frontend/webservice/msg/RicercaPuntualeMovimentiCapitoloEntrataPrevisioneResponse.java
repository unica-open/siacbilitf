/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VariazioneCodificaCapitolo;
import it.csi.siac.siacbilser.model.VariazioneImportoCapitolo;
import it.csi.siac.siacbilser.model.VincoloCapitoli;
import it.csi.siac.siaccorser.model.ServiceResponse;


/**
 * Risposta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaPuntualeMovimentiCapitoloEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeMovimentiCapitoloEntrataPrevisioneResponse extends
		ServiceResponse {

	
	private List<VariazioneImportoCapitolo> listaVariazioneImporti = new ArrayList<VariazioneImportoCapitolo>();
	private List<VariazioneCodificaCapitolo> listaVariazioneCodifiche = new ArrayList<VariazioneCodificaCapitolo>();
	private List<VincoloCapitoli> listaVincoli = new ArrayList<VincoloCapitoli>();

	public List<VariazioneImportoCapitolo> getListaVariazioneImporti() {
		return listaVariazioneImporti;
	}

	public void setListaVariazioneImporti(
			List<VariazioneImportoCapitolo> listaVariazioneImporti) {
		this.listaVariazioneImporti = listaVariazioneImporti;
	}

	public List<VariazioneCodificaCapitolo> getListaVariazioneCodifiche() {
		return listaVariazioneCodifiche;
	}

	public void setListaVariazioneCodifiche(
			List<VariazioneCodificaCapitolo> listaVariazioneCodifiche) {
		this.listaVariazioneCodifiche = listaVariazioneCodifiche;
	}

	public List<VincoloCapitoli> getListaVincoli() {
		return listaVincoli;
	}

	public void setListaVincoli(List<VincoloCapitoli> vincoli) {
		this.listaVincoli = vincoli;
	}


}
