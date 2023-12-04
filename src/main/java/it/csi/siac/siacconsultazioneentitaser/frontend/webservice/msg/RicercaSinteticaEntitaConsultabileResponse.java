/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.ConsultazioneEntitaSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.model.EntitaConsultabile;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
/**
 * Classe di response della ricerca sintetica entita consultabili (cruscottino)
 * 
 * @author Elisa Chiari
 * @version 1.0.0 - 08/03/2016
 * 
 * */

@XmlType(namespace = ConsultazioneEntitaSvcDictionary.NAMESPACE)
public class RicercaSinteticaEntitaConsultabileResponse extends ServiceResponse {

//	@XmlElements({
//		@XmlElement(name = "CapitoloSpesaConsultabile", type = CapitoloSpesaConsultabile.class),
//		@XmlElement(name = "CapitoloEntrataConsultabile", type = CapitoloEntrataConsultabile.class),
//		@XmlElement(name = "ProvvedimentoConsultabile", type = ProvvedimentoConsultabile.class),
//		@XmlElement(name = "SoggettoConsultabile", type = SoggettoConsultabile.class),
//	})
	private ListaPaginata<EntitaConsultabile> entitaConsultabili = new ListaPaginataImpl<EntitaConsultabile>();

	
	/**
	 * @return the elencoEntitaConsultabili
	 */
	public ListaPaginata<EntitaConsultabile> getEntitaConsultabili() {
		return entitaConsultabili;
	}

	/**
	 * @param elencoEntitaConsultabili the elencoEntitaConsultabili to set
	 */
	public void setEntitaConsultabili(ListaPaginata<EntitaConsultabile> elencoEntitaConsultabili) {
		this.entitaConsultabili = elencoEntitaConsultabili != null ? elencoEntitaConsultabili : new ListaPaginataImpl<EntitaConsultabile>();
	}

	
	protected ListaPaginataImpl<EntitaConsultabile> getAsListaPaginata() {
		return (ListaPaginataImpl<EntitaConsultabile>) entitaConsultabili;
	}
	
	
	public void setTotaleElementi(int totaleElementi){
		((ListaPaginataImpl<EntitaConsultabile>)entitaConsultabili).setTotaleElementi(totaleElementi);
	}	

	public void setTotalePagine(int totaleElementi){
		((ListaPaginataImpl<EntitaConsultabile>)entitaConsultabili).setTotalePagine(totaleElementi);
	}	

	public void setPaginaCorrente(int totaleElementi){
		((ListaPaginataImpl<EntitaConsultabile>)entitaConsultabili).setPaginaCorrente(totaleElementi);
	}
	
	public int getTotaleElementi(){
		return ((ListaPaginataImpl<EntitaConsultabile>)entitaConsultabili).getTotaleElementi();
	}
	
	public int getTotalePagine(){
		return ((ListaPaginataImpl<EntitaConsultabile>)entitaConsultabili).getTotalePagine();
	}
	
	public int getPaginaCorrente(){
		return ((ListaPaginataImpl<EntitaConsultabile>)entitaConsultabili).getPaginaCorrente();
	}
	
}
