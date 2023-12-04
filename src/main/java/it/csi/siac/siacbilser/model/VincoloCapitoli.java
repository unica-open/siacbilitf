/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

/**
 * VincoliCapitoloUscitaEntrataGestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VincoloCapitoli extends Vincolo {

	private static final long serialVersionUID = -6895451455917779798L;
	
	private List<Capitolo<?,?>> capitoli = new ArrayList<Capitolo<?,?>>();
	
	public void addCapitolo(Capitolo<?,?> capitolo){
		capitoli.add(capitolo);
	}
	
	
	public void addCapitolo(Integer uid, TipoCapitolo tipoCapitolo) {	
		final Capitolo<?, ?> capitolo = tipoCapitolo.newCapitoloInstance();
		capitolo.setUid(uid);
		addCapitolo(capitolo);
	}
	
	
	/**
	 * Elenco dei capitoli associati al vincolo. Ogni elemento contiene l'id ed il tipo di capitolo
	 * @return
	 */
	@XmlElementWrapper(name = "listaCapitoli")     
	@XmlElement(name = "capitolo")
	public List<Capitolo<?,?>> getCapitoli() {
		return capitoli;
	}


	public void setCapitoli(List<Capitolo<?,?>> capitoli) {
		this.capitoli = capitoli;
	}


	/**
	 * @return the capitoliEntrataPrevisione
	 */
	public List<CapitoloEntrataPrevisione> getCapitoliEntrataPrevisione() {
		return getCapitoliByTipo(TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE);
	}
	
	/**
	 * @return the capitoliUscitaPrevisione
	 */
	public List<CapitoloUscitaPrevisione> getCapitoliUscitaPrevisione() {
		return getCapitoliByTipo(TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	
	/**
	 * @return the capitoliEntrataGestione
	 */
	public List<CapitoloEntrataGestione> getCapitoliEntrataGestione() {
		return getCapitoliByTipo(TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE);
	}
	
	/**
	 * @return the capitoliUscitaGestione
	 */
	public List<CapitoloUscitaGestione> getCapitoliUscitaGestione() {
		return getCapitoliByTipo(TipoCapitolo.CAPITOLO_USCITA_GESTIONE);
	}
	
	/**
	 * Restituisce l'elenco dei capitoli associati ad un vincolo avente il tipo passatao come parametro.
	 * 
	 * @param tipoCapitolo
	 * @return
	 */
	public <C extends Capitolo<?,?>> List<C> getCapitoliByTipo(TipoCapitolo tipoCapitolo) {		
		final List<C> result = new ArrayList<C>();
		for(Capitolo<?,?> cap : getCapitoli()){
			if(tipoCapitolo.equals(cap.getTipoCapitolo())){								
				final C capNew = cap.newSpecificInstanceByTipoCapitolo();
				capNew.setUid(cap.getUid());
				result.add(capNew);
			}
		}
		return result;
	}
	
	
}
