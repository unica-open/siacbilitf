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
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.DocumentoDiEntrata;

/**
 * Risposta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaMovimentiCapitoloEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaMovimentiCapitoloEntrataPrevisioneResponse extends
		ServiceResponse {

	private List<VariazioneImportoCapitolo> listaVariazioneImporti = new ArrayList<VariazioneImportoCapitolo>();
	private List<VariazioneCodificaCapitolo> listaVariazioneCodifiche = new ArrayList<VariazioneCodificaCapitolo>();
//	private List<VincoliCapitoloUEPrev> listaVincoli = new ArrayList<VincoliCapitoloUEPrev>();
	private List<VincoloCapitoli> listaVincoli = new ArrayList<VincoloCapitoli>();

	// Se Fase=Esercizio Provvisorio
	private List<Accertamento> listaAccertamenti = new ArrayList<Accertamento>();
	private List<DocumentoDiEntrata> documentiEntrata = new ArrayList<DocumentoDiEntrata>();

	// Se Fase di Bilancio = Esercizio Provvisorio
	// il sistema dovra' effettuare le stesse ricerche (variazioni e vincoli)
	// finalizzate a recuperare l'equivalente capitolo in Gestione
	// (CapitoloEntrataGestione):
	private List<VariazioneImportoCapitolo> listaVariazioneImportiCapEGest = new ArrayList<VariazioneImportoCapitolo>();
	private List<VariazioneCodificaCapitolo> listaVariazioneCodificheCapEGest = new ArrayList<VariazioneCodificaCapitolo>();
	// modificato RTI
	private List<VincoloCapitoli> listaVincoliCapEGest = new ArrayList<VincoloCapitoli>();

	
	public List<VariazioneImportoCapitolo> getListaVariazioneImportiCapEGest() {
		return listaVariazioneImportiCapEGest;
	}

	public void setListaVariazioneImportiCapEGest(
			List<VariazioneImportoCapitolo> listaVariazioneImportiCapEGest) {
		this.listaVariazioneImportiCapEGest = listaVariazioneImportiCapEGest;
	}

	public List<VariazioneCodificaCapitolo> getListaVariazioneCodificheCapEGest() {
		return listaVariazioneCodificheCapEGest;
	}

	public void setListaVariazioneCodificheCapEGest(
			List<VariazioneCodificaCapitolo> listaVariazioneCodificheCapEGest) {
		this.listaVariazioneCodificheCapEGest = listaVariazioneCodificheCapEGest;
	}

	public List<VincoloCapitoli> getListaVincoliCapEGest() {
		return listaVincoliCapEGest;
	}

	public void setListaVincoliCapEGest(
			List<VincoloCapitoli> listaVincoliEG) {
		this.listaVincoliCapEGest = listaVincoliEG;
	}

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

	public void setListaVincoli(List<VincoloCapitoli> listaVincoli) {
		this.listaVincoli = listaVincoli;
	}

	public List<DocumentoDiEntrata> getDocumentiEntrata() {
		return documentiEntrata;
	}

	public void setDocumentiEntrata(List<DocumentoDiEntrata> documentiEntrata) {
		this.documentiEntrata = documentiEntrata;
	}

	public List<Accertamento> getListaAccertamenti() {
		return listaAccertamenti;
	}

	public void setListaAccertamenti(List<Accertamento> listaAccertamenti) {
		this.listaAccertamenti = listaAccertamenti;
	}

}
