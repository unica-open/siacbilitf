/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg.base;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ImportiCapitolo;
import it.csi.siac.siacbilser.model.ImportiCapitoloEG;
import it.csi.siac.siacbilser.model.ImportiCapitoloEP;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siacbilser.model.ImportiCapitoloUP;
import it.csi.siac.siaccorser.model.ServiceResponse;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public abstract class BaseComponenteImportiCapitoloResponse extends ServiceResponse {

	@XmlElementWrapper(name = "listaImportiCapitolo")
	@XmlElements({
		@XmlElement(name = "importiCapitoloUP", type = ImportiCapitoloUP.class),
		@XmlElement(name = "importiCapitoloUG", type = ImportiCapitoloUG.class),
		@XmlElement(name = "importiCapitoloEP", type = ImportiCapitoloEP.class),
		@XmlElement(name = "importiCapitoloEG", type = ImportiCapitoloEG.class),
		@XmlElement(name = "importiCapitolo", type = ImportiCapitolo.class),
	})
	private List<ImportiCapitolo> listaImportiCapitolo = new ArrayList<ImportiCapitolo>();

	// Per indicare i dati del residuo (che non saprei come indicare diversamente)
	@XmlElements({
		@XmlElement(name = "importiCapitoloResiduoUP", type = ImportiCapitoloUP.class),
		@XmlElement(name = "importiCapitoloResiduoUG", type = ImportiCapitoloUG.class),
		@XmlElement(name = "importiCapitoloResiduoEP", type = ImportiCapitoloEP.class),
		@XmlElement(name = "importiCapitoloResiduoEG", type = ImportiCapitoloEG.class),
		@XmlElement(name = "importiCapitoloResiduo", type = ImportiCapitolo.class),
	})
	private ImportiCapitolo importiCapitoloResiduo;
	// Per indicare gli anni >N+2
	@XmlElements({
		@XmlElement(name = "importiCapitoloAnniSuccessiviUP", type = ImportiCapitoloUP.class),
		@XmlElement(name = "importiCapitoloAnniSuccessiviUG", type = ImportiCapitoloUG.class),
		@XmlElement(name = "importiCapitoloAnniSuccessiviEP", type = ImportiCapitoloEP.class),
		@XmlElement(name = "importiCapitoloAnniSuccessiviEG", type = ImportiCapitoloEG.class),
		@XmlElement(name = "importiCapitoloAnniSuccessivi", type = ImportiCapitolo.class),
	})
	private ImportiCapitolo importiCapitoloAnniSuccessivi;

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

	/**
	 * @return the importiCapitoloResiduo
	 */
	@XmlTransient
	public ImportiCapitolo getImportiCapitoloResiduo() {
		return this.importiCapitoloResiduo;
	}

	/**
	 * @param importiCapitoloResiduo the importiCapitoloResiduo to set
	 */
	public void setImportiCapitoloResiduo(ImportiCapitolo importiCapitoloResiduo) {
		this.importiCapitoloResiduo = importiCapitoloResiduo;
	}

	/**
	 * @return the importiCapitoloAnniSuccessivi
	 */
	@XmlTransient
	public ImportiCapitolo getImportiCapitoloAnniSuccessivi() {
		return this.importiCapitoloAnniSuccessivi;
	}

	/**
	 * @param importiCapitoloAnniSuccessivi the importiCapitoloAnniSuccessivi to set
	 */
	public void setImportiCapitoloAnniSuccessivi(ImportiCapitolo importiCapitoloAnniSuccessivi) {
		this.importiCapitoloAnniSuccessivi = importiCapitoloAnniSuccessivi;
	}

}
