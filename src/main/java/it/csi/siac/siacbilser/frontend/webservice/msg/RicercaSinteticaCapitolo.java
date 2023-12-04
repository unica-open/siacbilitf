/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ImportiCapitoloEnum;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

/**
 * Base di tutte le ricerche sintetiche dei capitoli.
 * 
 * @author Domenico
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitolo extends ServiceRequest {

	private Ente ente;
	private ParametriPaginazione parametriPaginazione;
	
	@XmlElementWrapper(name="importiDerivatiRichiesti")
	@XmlElement(name="tipoImporto")
	private Set<ImportiCapitoloEnum> importiDerivatiRichiesti = null;
	
	@XmlElementWrapper(name="tipologieClassificatoriRichiesti")
	@XmlElement(name="tipologiaClassificatore")
	private Set<TipologiaClassificatore> tipologieClassificatoriRichiesti;
	
	
	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @return the importiDerivatiRichiesti
	 */
	@XmlTransient
	public Set<ImportiCapitoloEnum> getImportiDerivatiRichiesti() {
		return importiDerivatiRichiesti;
	}

	/**
	 * @param importiDerivatiRichiesti the importiDerivatiRichiesti to set
	 */
	public void setImportiDerivatiRichiesti(Set<ImportiCapitoloEnum> importiDerivatiRichiesti) {
		this.importiDerivatiRichiesti = importiDerivatiRichiesti;
	}
	
	/**
	 * @param importiDerivatiRichiesti the importiDerivatiRichiesti to set
	 */
	public void setImportiDerivatiRichiesti(ImportiCapitoloEnum... importiCapitoloEnum) {
		this.importiDerivatiRichiesti = EnumSet.copyOf(Arrays.asList(importiCapitoloEnum));
	}

	/**
	 * @return the tipologieClassificatoriRichiesti
	 */
	@XmlTransient
	public Set<TipologiaClassificatore> getTipologieClassificatoriRichiesti() {
		return tipologieClassificatoriRichiesti;
	}
	
	public Set<TipologiaClassificatore> getTipologieClassificatoriRichiestiNotNull() {
		return tipologieClassificatoriRichiesti!=null?tipologieClassificatoriRichiesti:new HashSet<TipologiaClassificatore>();
	}

	/**
	 * @param tipologieClassificatoriRichiesti the tipologieClassificatoriRichiesti to set
	 */
	public void setTipologieClassificatoriRichiesti(Set<TipologiaClassificatore> tipologieClassificatoriRichiesti) {
		this.tipologieClassificatoriRichiesti = tipologieClassificatoriRichiesti;
	}
	
	/**
	 * @param tipologieClassificatoriRichiesti the tipologieClassificatoriRichiesti to set
	 */
	public void setTipologieClassificatoriRichiesti(TipologiaClassificatore... tipologieClassificatoriRichiesti) {
		this.tipologieClassificatoriRichiesti = EnumSet.copyOf(Arrays.asList(tipologieClassificatoriRichiesti));
	}
	
	/**
	 * Controla se la tipologia classificatore è richiesta.
	 *
	 * @param tc la tipologia classificatore
	 * @return true, if is richiesto
	 */
	public boolean isRichiesto(TipologiaClassificatore tc){
		return getTipologieClassificatoriRichiestiNotNull().contains(tc);
	}
	
	/**
	 * Controla se almeno una tipologia classificatore è richiesta.
	 *
	 * @param tc la tipologia classificatore
	 * @return true, if is richiesto
	 */
	public boolean isRichiestiAlmenoUno(TipologiaClassificatore... tcs){
		for (TipologiaClassificatore tc : tcs) {
			final boolean isRichiesto = isRichiesto(tc);
			if(isRichiesto){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Controla se tutte le tipologia classificatore sono richieste.
	 *
	 * @param tc la tipologia classificatore
	 * @return true, if is richiesto
	 */
	public boolean isRichiesti(TipologiaClassificatore... tcs){
		return getTipologieClassificatoriRichiestiNotNull().containsAll(Arrays.asList(tcs));
	}
}
