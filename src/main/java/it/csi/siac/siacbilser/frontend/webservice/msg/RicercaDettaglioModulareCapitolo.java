/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ImportiCapitoloEnum;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

/**
 * Richiesta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaDettaglioModulareCapitoloEntrataPrevisione()
 * 
 * @author Elisa Chiari
 * @version 1.0.0 - 10/11/2016
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioModulareCapitolo extends ServiceRequest {

	@XmlElementWrapper(name="importiDerivatiRichiesti")
	@XmlElement(name="tipoImporto")
	private Set<ImportiCapitoloEnum> importiDerivatiRichiesti = null;
	
	@XmlElementWrapper(name="tipologieClassificatoriRichiesti")
	@XmlElement(name="tipologiaClassificatore")
	private TipologiaClassificatore[] tipologieClassificatoriRichiesti;
	
	/**
	 * @param importiDerivatiRichiesti the importiDerivatiRichiesti to set
	 */
	public void setImportiDerivatiRichiesti(Set<ImportiCapitoloEnum> importiDerivatiRichiesti) {
		this.importiDerivatiRichiesti = importiDerivatiRichiesti;
	}
	
	/**
	 * @param importiDerivatiRichiesti the importiDerivatiRichiesti to set
	 */
	@XmlTransient
	public Set<ImportiCapitoloEnum> getImportiDerivatiRichiesti() {
		return importiDerivatiRichiesti;
	}

	/**
	 * @return the tipologieClassificatoriRichiesti
	 */
	@XmlTransient
	public TipologiaClassificatore[] getTipologieClassificatoriRichiesti() {
		return tipologieClassificatoriRichiesti;
	}
	
	/**
	 * @param tipologieClassificatoriRichiesti the tipologieClassificatoriRichiesti to set
	 */
	public void setTipologieClassificatoriRichiesti(TipologiaClassificatore... tipologieClassificatoriRichiesti) {
		this.tipologieClassificatoriRichiesti = tipologieClassificatoriRichiesti;
	}
	

	
	/**
	 * Controla se la tipologia classificatore è richiesta.
	 *
	 * @param tc la tipologia classificatore
	 * @return true, if is richiesto
	 */
	public boolean isRichiestoClassificatore(TipologiaClassificatore tc){
		final TipologiaClassificatore[] tcs = getTipologieClassificatoriRichiesti();
		if(tcs ==null ){
			return false;
		}
		for (TipologiaClassificatore tclass : tcs) {
			if(tclass.equals(tc)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Controla se almeno una tipologia classificatore di quelle passate in input è richiesta.
	 *
	 * @param tc la tipologia classificatore
	 * @return true, if is richiesto
	 */
	public boolean isRichiestoAlmenoUnClassificatore(TipologiaClassificatore... tcs){
		for (TipologiaClassificatore tc : tcs) {
			if(isRichiestoClassificatore(tc)){
				return true;
			}
		}
		return false;
	}
	

}
