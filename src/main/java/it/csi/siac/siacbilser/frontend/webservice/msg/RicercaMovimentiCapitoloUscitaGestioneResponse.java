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
 * Risposta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaMovimentiCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaMovimentiCapitoloUscitaGestioneResponse extends
		ServiceResponse {

	List<VariazioneImportoCapitolo> listaVariazioneImporti = new ArrayList<VariazioneImportoCapitolo>();
	List<VariazioneCodificaCapitolo> listaVariazioneCodifiche = new ArrayList<VariazioneCodificaCapitolo>();
	List<VincoloCapitoli> listaVincoli = new ArrayList<VincoloCapitoli>();

	// Se Fase=Esercizio Provvisorio
	List<Impegno> listaImpegni = new ArrayList<Impegno>();
	List<DocumentoDiSpesa> listaDocumentoSpesa = new ArrayList<DocumentoDiSpesa>();

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
