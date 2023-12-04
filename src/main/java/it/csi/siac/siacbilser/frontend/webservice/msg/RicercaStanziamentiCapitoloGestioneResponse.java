/**
 * SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
 * SPDX-License-Identifier: EUPL-1.2
 */
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.ImportiCapitolo;
import it.csi.siac.siacbilser.model.ImportiCapitoloEG;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siacbilser.model.PrevisioneImpegnatoAccertato;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaStanziamentiCapitoloGestioneResponse extends ServiceResponse {

	private Capitolo<?, ?> capitolo;

	private PrevisioneImpegnatoAccertato previsioneImpegnatoAccertato;
	
	@XmlElementWrapper(name = "listaImportiCapitolo")
	@XmlElements({
		@XmlElement(name = "importiCapitoloUG", type = ImportiCapitoloUG.class),
		@XmlElement(name = "importiCapitoloEG", type = ImportiCapitoloEG.class),
		@XmlElement(name = "importiCapitolo", type = ImportiCapitolo.class),
	})
	private List<ImportiCapitolo> listaImportiCapitolo;

	/**
	 * @return the listaImportiCapitolo
	 */
	@XmlTransient
	public List<ImportiCapitolo> getListaImportiCapitolo() {
		return listaImportiCapitolo;
	}

	/**
	 * @param listaImportiCapitolo the listaImportiCapitolo to set
	 */
	public void setListaImportiCapitolo(List<ImportiCapitolo> listaImportiCapitolo) {
		this.listaImportiCapitolo = listaImportiCapitolo;
	}
	
	public void addImportoCapitolo(ImportiCapitolo importo) {
		if(getListaImportiCapitolo() == null) {
			setListaImportiCapitolo(new ArrayList<ImportiCapitolo>());
		}
		getListaImportiCapitolo().add(importo);
	}

	
	/**
	 * @return the capitolo
	 */
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	public PrevisioneImpegnatoAccertato getPrevisioneImpegnatoAccertato() {
		return previsioneImpegnatoAccertato;
	}

	public void setPrevisioneImpegnatoAccertato(PrevisioneImpegnatoAccertato previsioneImpegnatoAccertato) {
		this.previsioneImpegnatoAccertato = previsioneImpegnatoAccertato;
	}
	
	
	
}
