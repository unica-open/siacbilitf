/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ImportiCapitoloEnum;
import it.csi.siac.siacbilser.model.ric.RicercaPuntualeCapitoloUGest;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

/**
 * Richiesta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaPuntualeCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloUscitaGestione extends ServiceRequest {

	private Ente ente;
	private RicercaPuntualeCapitoloUGest ricercaPuntualeCapitoloUGest;
	
	@XmlElementWrapper(name="importiDerivatiRichiesti")
	@XmlElement(name="tipoImporto")
	private Set<ImportiCapitoloEnum> importiDerivatiRichiesti = null;
	
	@XmlElementWrapper(name="tipologieClassificatoriRichiesti")
	@XmlElement(name="tipologiaClassificatore")
	private Set<TipologiaClassificatore> tipologieClassificatoriRichiesti = null;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaPuntualeCapitoloUGest getRicercaPuntualeCapitoloUGest() {
		return ricercaPuntualeCapitoloUGest;
	}

	public void setRicercaPuntualeCapitoloUGest(
			RicercaPuntualeCapitoloUGest ricercaPuntualeCapitoloUGest) {
		this.ricercaPuntualeCapitoloUGest = ricercaPuntualeCapitoloUGest;
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
	 * @return the tipologieClassificatoriRichiesti
	 */
	@XmlTransient
	public Set<TipologiaClassificatore> getTipologieClassificatoriRichiesti() {
		return tipologieClassificatoriRichiesti;
	}

	/**
	 * @param tipologieClassificatoriRichiesti the tipologieClassificatoriRichiesti to set
	 */
	public void setTipologieClassificatoriRichiesti(Set<TipologiaClassificatore> tipologieClassificatoriRichiesti) {
		this.tipologieClassificatoriRichiesti = tipologieClassificatoriRichiesti;
	}
	
	public Set<TipologiaClassificatore> getTipologieClassificatoriRichiestiNotNull() {
		return tipologieClassificatoriRichiesti != null ? tipologieClassificatoriRichiesti : new HashSet<TipologiaClassificatore>();
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
			if(isRichiesto(tc)) {
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
