/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ImportiCapitoloEnum;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class DatiOpzionaliCapitoli implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@XmlElementWrapper(name="importiDerivatiRichiesti")
	@XmlElement(name="tipoImporto")
	private Set<ImportiCapitoloEnum> importiDerivatiRichiesti = null;
	
	@XmlElementWrapper(name="tipologieClassificatoriRichiesti")
	@XmlElement(name="tipologiaClassificatore")
	private Set<TipologiaClassificatore> tipologieClassificatoriRichiesti;

	@XmlTransient
	public Set<ImportiCapitoloEnum> getImportiDerivatiRichiesti() {
		return importiDerivatiRichiesti;
	}

	public void setImportiDerivatiRichiesti(
			Set<ImportiCapitoloEnum> importiDerivatiRichiesti) {
		this.importiDerivatiRichiesti = importiDerivatiRichiesti;
	}

	@XmlTransient
	public Set<TipologiaClassificatore> getTipologieClassificatoriRichiesti() {
		return tipologieClassificatoriRichiesti;
	}

	public void setTipologieClassificatoriRichiesti(
			Set<TipologiaClassificatore> tipologieClassificatoriRichiesti) {
		this.tipologieClassificatoriRichiesti = tipologieClassificatoriRichiesti;
	}
	
	/**
	 * @param importiDerivatiRichiesti the importiDerivatiRichiesti to set
	 */
	public void setImportiDerivatiRichiesti(ImportiCapitoloEnum... importiCapitoloEnum) {
		this.importiDerivatiRichiesti = EnumSet.copyOf(Arrays.asList(importiCapitoloEnum));
	}
	
	/**
	 * @param tipologieClassificatoriRichiesti the tipologieClassificatoriRichiesti to set
	 */
	public void setTipologieClassificatoriRichiesti(TipologiaClassificatore... tipologieClassificatoriRichiesti) {
		this.tipologieClassificatoriRichiesti = EnumSet.copyOf(Arrays.asList(tipologieClassificatoriRichiesti));
	}
	
}
