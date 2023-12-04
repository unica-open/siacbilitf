/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.TipoCapitolo;
import it.csi.siac.siacbilser.model.Vincolo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Richiesta al metodo
 * BIL.VincoloCapitoloService.ricercaVincoloCapitoloPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVincolo extends ServiceRequest {
	
	private Vincolo vincolo;
	private List<TipoCapitolo> tipiCapitolo = new ArrayList<TipoCapitolo>();
	private Capitolo<?, ?> capitolo;
	private Bilancio bilancio;
	
	private boolean ricercaCodiceLike = false;
	
	private ParametriPaginazione parametriPaginazione;
	
	public Vincolo getVincolo() {
		return vincolo;
	}
	public void setVincolo(Vincolo vincolo) {
		this.vincolo = vincolo;
	}
	public List<TipoCapitolo> getTipiCapitolo() {
		return tipiCapitolo;
	}
	public void setTipiCapitolo(List<TipoCapitolo> tipiCapitolo) {
		this.tipiCapitolo = tipiCapitolo;
	}
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	public boolean isRicercaCodiceLike() {
		return ricercaCodiceLike;
	}
	public void setRicercaCodiceLike(boolean ricercaCodiceLike) {
		this.ricercaCodiceLike = ricercaCodiceLike;
	}
	
	
	
	
	

}
