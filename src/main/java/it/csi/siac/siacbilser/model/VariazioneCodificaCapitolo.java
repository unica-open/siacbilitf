/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;

/**
 * VariazioneCodificaCapitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VariazioneCodificaCapitolo extends VariazioneDiBilancio {

	
	private static final long serialVersionUID = 6221695763478046439L;
	private List<DettaglioVariazioneCodificaCapitolo> listaDettaglioVariazioneCodifica = new ArrayList<DettaglioVariazioneCodificaCapitolo>();	
	
	private AttoAmministrativo attoAmministrativo;
	

	public List<DettaglioVariazioneCodificaCapitolo> getListaDettaglioVariazioneCodifica() {
		return listaDettaglioVariazioneCodifica;
	}

	public void setListaDettaglioVariazioneCodifica(List<DettaglioVariazioneCodificaCapitolo> listaDettaglioVariazioneCodifica) {
		this.listaDettaglioVariazioneCodifica = listaDettaglioVariazioneCodifica;
	}

	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	
	
	/**
	 * Ottiene la lista dei capitoli presenti nella variazione 
	 * @return
	 */
	public List<Capitolo<?, ?>> getCapitoli() {
		final List<Capitolo<?, ?>> capitoli = new ArrayList<Capitolo<?, ?>>();
		
		for(DettaglioVariazioneCodificaCapitolo dvic : getListaDettaglioVariazioneCodifica()){
			capitoli.add(dvic.getCapitolo());
		}
		
		return capitoli;
	}
	
	/**
	 * Ottiene la lista dei capitoli dei tipi indicati come parametro presenti nella variazione
	 * @param tipiCapitolo
	 * @return
	 */
	public List<Capitolo> getCapitoli(TipoCapitolo... tipiCapitolo) {
		final List<Capitolo> capitoli = new ArrayList<Capitolo>();
		final List<TipoCapitolo> tipiCapitoloList = Arrays.asList(tipiCapitolo);
		
		for(Capitolo c : getCapitoli()){		
			if(tipiCapitoloList.contains(c.getTipoCapitolo())){				
				capitoli.add(c);				
			}			
		}
		
		return capitoli;
	}
	
	
}
