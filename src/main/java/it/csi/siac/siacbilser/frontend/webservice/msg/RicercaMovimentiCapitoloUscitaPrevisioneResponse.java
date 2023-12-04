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
import it.csi.siac.siacfinser.model.DocumentoDiSpesa;
import it.csi.siac.siacfinser.model.Impegno;

/**
 * Risposta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaMovimentiCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaMovimentiCapitoloUscitaPrevisioneResponse extends
		ServiceResponse {

	private List<VariazioneImportoCapitolo> listaVariazioneImporti = new ArrayList<VariazioneImportoCapitolo>();
	private List<VariazioneCodificaCapitolo> listaVariazioneCodifiche = new ArrayList<VariazioneCodificaCapitolo>();
//	private List<VincoliCapitoloUEPrev> listaVincoli = new ArrayList<VincoliCapitoloUEPrev>();
	private List<VincoloCapitoli> listaVincoli = new ArrayList<VincoloCapitoli>();

	// Se Fase di Bilancio = Esercizio Provvisorio
	private List<Impegno> listaImpegni = new ArrayList<Impegno>();
	private List<DocumentoDiSpesa> listaDocumentoSpesa = new ArrayList<DocumentoDiSpesa>();

	// Se Fase di Bilancio = Esercizio Provvisorio
	// il sistema dovra' effettuare le stesse ricerche (variazioni e vincoli)
	// finalizzate a recuperare l'equivalente capitolo in Gestione
	// (CapitoloUscitaGestione):
	private List<VariazioneImportoCapitolo> listaVariazioneImportiCapUGest = new ArrayList<VariazioneImportoCapitolo>();
	private List<VariazioneCodificaCapitolo> listaVariazioneCodificheCapUGest = new ArrayList<VariazioneCodificaCapitolo>();
	//MODIFICATO RTI
	private List<VincoloCapitoli> listaVincoliCapUGest = new ArrayList<VincoloCapitoli>();

	public List<VariazioneImportoCapitolo> getListaVariazioneImportiCapUGest() {
		return listaVariazioneImportiCapUGest;
	}

	public void setListaVariazioneImportiCapUGest(
			List<VariazioneImportoCapitolo> listaVariazioneImportiCapUGest) {
		this.listaVariazioneImportiCapUGest = listaVariazioneImportiCapUGest;
	}

	public List<VariazioneCodificaCapitolo> getListaVariazioneCodificheCapUGest() {
		return listaVariazioneCodificheCapUGest;
	}

	public void setListaVariazioneCodificheCapUGest(
			List<VariazioneCodificaCapitolo> listaVariazioneCodificheCapUGest) {
		this.listaVariazioneCodificheCapUGest = listaVariazioneCodificheCapUGest;
	}

	public List<VincoloCapitoli> getListaVincoliCapUGest() {
		return listaVincoliCapUGest;
	}

	public void setListaVincoliCapUGest(
			List<VincoloCapitoli> listaVincoliUG) {
		this.listaVincoliCapUGest = listaVincoliUG;
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

	public List<Impegno> getListaImpegni() {
		return listaImpegni;
	}

	public void setListaImpegni(List<Impegno> listaImpegni) {
		this.listaImpegni = listaImpegni;
	}

	public List<DocumentoDiSpesa> getListaDocumentoSpesa() {
		return listaDocumentoSpesa;
	}

	public void setListaDocumentoSpesa(
			List<DocumentoDiSpesa> listaDocumentoSpesa) {
		this.listaDocumentoSpesa = listaDocumentoSpesa;
	}

}
