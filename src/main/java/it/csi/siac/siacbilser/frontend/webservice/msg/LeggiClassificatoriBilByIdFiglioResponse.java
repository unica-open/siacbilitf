/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.ClassificazioneCofog;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.TipologiaTitolo;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siaccorser.frontend.webservice.msg.LeggiClassificatoriByIdPadreResponse;

/**
 * Messaggio di risposta per la lista dei classificatori ricercati per: anno, idEnteProprietario e idPadre (es: ricerco i programmi per l'idMissione)
 * 
 * ritorna una mappa con Key= TipologiaClassificatore (enum che contiene i codici dei tipi dei classificatori)
 * 						 Value = la lista di classificatori associata alla TipologiaClassificatore 	
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriBilByIdFiglioResponse extends LeggiClassificatoriByIdPadreResponse {

	private List<Programma> classificatoriProgramma = new ArrayList<Programma>();
	private List<Macroaggregato> classificatoriMacroaggregato = new ArrayList<Macroaggregato>();
	private List<ClassificazioneCofog> classificatoriClassificazioneCofog = new ArrayList<ClassificazioneCofog>();
	private List<TipologiaTitolo> classificatoriTipologiaTitolo = new ArrayList<TipologiaTitolo>();
	private List<CategoriaTipologiaTitolo> classificatoriCategoriaTipologiaTitolo = new ArrayList<CategoriaTipologiaTitolo>();
	
	private List<TitoloSpesa> classificatoriTitoloSpesa = new ArrayList<TitoloSpesa>();
	private List<TitoloEntrata> classificatoriTitoloEntrata = new ArrayList<TitoloEntrata>();
	
	private List<ElementoPianoDeiConti> classificatoriElementoPianoDeiConti = new ArrayList<ElementoPianoDeiConti>();
	
	
	public List<Programma> getClassificatoriProgramma() {
		return classificatoriProgramma;
	}
	public void setClassificatoriProgramma(List<Programma> classificatoriProgramma) {
		this.classificatoriProgramma = classificatoriProgramma;
	}
	public List<Macroaggregato> getClassificatoriMacroaggregato() {
		return classificatoriMacroaggregato;
	}
	public void setClassificatoriMacroaggregato(
			List<Macroaggregato> classificatoriMacroaggregato) {
		this.classificatoriMacroaggregato = classificatoriMacroaggregato;
	}
	public List<ClassificazioneCofog> getClassificatoriClassificazioneCofog() {
		return classificatoriClassificazioneCofog;
	}
	public void setClassificatoriClassificazioneCofog(
			List<ClassificazioneCofog> classificatoriCofog) {
		this.classificatoriClassificazioneCofog = classificatoriCofog;
	}
	public List<TipologiaTitolo> getClassificatoriTipologiaTitolo() {
		return classificatoriTipologiaTitolo;
	}
	public void setClassificatoriTipologiaTitolo(List<TipologiaTitolo> classificatoriTipologiaTitolo) {
		this.classificatoriTipologiaTitolo = classificatoriTipologiaTitolo;
	}
	public List<CategoriaTipologiaTitolo> getClassificatoriCategoriaTipologiaTitolo() {
		return classificatoriCategoriaTipologiaTitolo;
	}
	public void setClassificatoriCategoriaTipologiaTitolo(List<CategoriaTipologiaTitolo> classificatoriCategoriaTipologiaTitolo) {
		this.classificatoriCategoriaTipologiaTitolo = classificatoriCategoriaTipologiaTitolo;
	}
	/**
	 * @return the classificatoriTitoloSpesa
	 */
	public List<TitoloSpesa> getClassificatoriTitoloSpesa() {
		return classificatoriTitoloSpesa;
	}
	/**
	 * @param classificatoriTitoloSpesa the classificatoriTitoloSpesa to set
	 */
	public void setClassificatoriTitoloSpesa(List<TitoloSpesa> classificatoriTitoloSpesa) {
		this.classificatoriTitoloSpesa = classificatoriTitoloSpesa;
	}
	/**
	 * @return the classificatoriTitoloEntrata
	 */
	public List<TitoloEntrata> getClassificatoriTitoloEntrata() {
		return classificatoriTitoloEntrata;
	}
	/**
	 * @param classificatoriTitoloEntrata the classificatoriTitoloEntrata to set
	 */
	public void setClassificatoriTitoloEntrata(List<TitoloEntrata> classificatoriTitoloEntrata) {
		this.classificatoriTitoloEntrata = classificatoriTitoloEntrata;
	}
	/**
	 * @return the classificatoriElementoPianoDeiConti
	 */
	public List<ElementoPianoDeiConti> getClassificatoriElementoPianoDeiConti() {
		return classificatoriElementoPianoDeiConti;
	}
	/**
	 * @param classificatoriElementoPianoDeiConti the classificatoriElementoPianoDeiConti to set
	 */
	public void setClassificatoriElementoPianoDeiConti(List<ElementoPianoDeiConti> classificatoriElementoPianoDeiConti) {
		this.classificatoriElementoPianoDeiConti = classificatoriElementoPianoDeiConti;
	}
	
	
	
	
}
