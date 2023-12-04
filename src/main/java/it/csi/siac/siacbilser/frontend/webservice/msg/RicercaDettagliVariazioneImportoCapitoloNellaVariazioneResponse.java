/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DettaglioVariazioneImportoCapitolo;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

/**
 * Response del servizio di ricerca dettagli variazione importo capitolo
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettagliVariazioneImportoCapitoloNellaVariazioneResponse extends RicercaSinteticaBaseResponse<DettaglioVariazioneImportoCapitolo> {
	
	@XmlElementWrapper(name = "dettagliVariazioneImportoCapitolo")	    
	@XmlElement(name = "dettaglioVariazioneImportoCapitolo")
	private ListaPaginata<DettaglioVariazioneImportoCapitolo> listaDettaglioVariazioneImportoCapitolo = new ListaPaginataImpl<DettaglioVariazioneImportoCapitolo>();
	
	//somma di tutti gli stanziamenti dei capitoli di entrata presente nella variazione
	private BigDecimal totaleStanziamentiEntrata;
	//somma di tutti gli stanziamenti di cassa dei capitoli di entrata presente nella variazione
	private BigDecimal totaleStanziamentiCassaEntrata;
	//somma di tutti gli stanziamenti residui dei capitoli di entrata presente nella variazione
	private BigDecimal totaleStanziamentiResiduiEntrata;
	//somma di tutti gli stanziamenti dei capitoli di spesa presenti nella variazione
	private BigDecimal totaleStanziamentiSpesa;
	//somma di tutti gli stanziamenti di cassa dei capitoli di spesa presente nella variazione
	private BigDecimal totaleStanziamentiCassaSpesa;
	//somma di tutti gli stanziamenti residui dei capitoli di entrata presenti nella variazione
	private BigDecimal totaleStanziamentiResiduiSpesa;

	// SIAC-6883: aggiunti anni del pluriennale - cassa, residuo e FPV previsti ma commentati
	//somma di tutti gli stanziamenti dei capitoli di entrata presente nella variazione per l'anno = anno di bilancio +1
	private BigDecimal totaleStanziamentiEntrata1;
	private BigDecimal totaleStanziamentiSpesa1;
	//somma di tutti gli stanziamenti di cassa dei capitoli di spesa presente nella variazione per l'anno = anno di bilancio +2
	private BigDecimal totaleStanziamentiSpesa2;
	//somma di tutti gli stanziamenti residui dei capitoli di entrata presenti nella variazione
	private BigDecimal totaleStanziamentiEntrata2;
	
	
	/**
	 * @return the variazioniImportiCapitolo
	 */
	@XmlTransient
	public ListaPaginata<DettaglioVariazioneImportoCapitolo> getListaDettaglioVariazioneImportoCapitolo() {
		return listaDettaglioVariazioneImportoCapitolo;
	}

	/**
	 * @param variazioniImportiCapitolo the variazioniImportiCapitolo to set
	 */
	public void setListaDettaglioVariazioneImportoCapitolo(ListaPaginata<DettaglioVariazioneImportoCapitolo> listaDettaglioVariazioneImportoCapitolo) {
		this.listaDettaglioVariazioneImportoCapitolo = listaDettaglioVariazioneImportoCapitolo;
	}

	@Override
	protected ListaPaginataImpl<DettaglioVariazioneImportoCapitolo> getAsListaPaginata() {
		return (ListaPaginataImpl<DettaglioVariazioneImportoCapitolo>) getListaDettaglioVariazioneImportoCapitolo();
	}

	/**
	 * @return the totaleStanziamentiEntrata
	 */
	public BigDecimal getTotaleStanziamentiEntrata() {
		return totaleStanziamentiEntrata;
	}

	/**
	 * @param totaleStanziamentiEntrata the totaleStanziamentiEntrata to set
	 */
	public void setTotaleStanziamentiEntrata(BigDecimal totaleStanziamentiEntrata) {
		this.totaleStanziamentiEntrata = totaleStanziamentiEntrata;
	}

	/**
	 * @return the totaleStanziamentiCassaEntrata
	 */
	public BigDecimal getTotaleStanziamentiCassaEntrata() {
		return totaleStanziamentiCassaEntrata;
	}

	/**
	 * @param totaleStanziamentiCassaEntrata the totaleStanziamentiCassaEntrata to set
	 */
	public void setTotaleStanziamentiCassaEntrata(BigDecimal totaleStanziamentiCassaEntrata) {
		this.totaleStanziamentiCassaEntrata = totaleStanziamentiCassaEntrata;
	}

	/**
	 * @return the totaleStanziamentiResiduiEntrata
	 */
	public BigDecimal getTotaleStanziamentiResiduiEntrata() {
		return totaleStanziamentiResiduiEntrata;
	}

	/**
	 * @param totaleStanziamentiResiduiEntrata the totaleStanziamentiResiduiEntrata to set
	 */
	public void setTotaleStanziamentiResiduiEntrata(BigDecimal totaleStanziamentiResiduiEntrata) {
		this.totaleStanziamentiResiduiEntrata = totaleStanziamentiResiduiEntrata;
	}

	/**
	 * @return the totaleStanziamentiSpesa
	 */
	public BigDecimal getTotaleStanziamentiSpesa() {
		return totaleStanziamentiSpesa;
	}

	/**
	 * @param totaleStanziamentiSpesa the totaleStanziamentiSpesa to set
	 */
	public void setTotaleStanziamentiSpesa(BigDecimal totaleStanziamentiSpesa) {
		this.totaleStanziamentiSpesa = totaleStanziamentiSpesa;
	}

	/**
	 * @return the totaleStanziamentiCassaSpesa
	 */
	public BigDecimal getTotaleStanziamentiCassaSpesa() {
		return totaleStanziamentiCassaSpesa;
	}

	/**
	 * @param totaleStanziamentiCassaSpesa the totaleStanziamentiCassaSpesa to set
	 */
	public void setTotaleStanziamentiCassaSpesa(BigDecimal totaleStanziamentiCassaSpesa) {
		this.totaleStanziamentiCassaSpesa = totaleStanziamentiCassaSpesa;
	}

	/**
	 * @return the totaleStanziamentiResiduiSpesa
	 */
	public BigDecimal getTotaleStanziamentiResiduiSpesa() {
		return totaleStanziamentiResiduiSpesa;
	}

	/**
	 * @param totaleStanziamentiResiduiSpesa the totaleStanziamentiResiduiSpesa to set
	 */
	public void setTotaleStanziamentiResiduiSpesa(BigDecimal totaleStanziamentiResiduiSpesa) {
		this.totaleStanziamentiResiduiSpesa = totaleStanziamentiResiduiSpesa;
	}

	/**
	 * @return the totaleStanziamentiEntrata1
	 */
	public BigDecimal getTotaleStanziamentiEntrata1() {
		return totaleStanziamentiEntrata1;
	}

	/**
	 * @param totaleStanziamentiEntrata1 the totaleStanziamentiEntrata1 to set
	 */
	public void setTotaleStanziamentiEntrata1(BigDecimal totaleStanziamentiEntrata1) {
		this.totaleStanziamentiEntrata1 = totaleStanziamentiEntrata1;
	}

	/**
	 * @return the totaleStanziamentiSpesa1
	 */
	public BigDecimal getTotaleStanziamentiSpesa1() {
		return totaleStanziamentiSpesa1;
	}

	/**
	 * @param totaleStanziamentiSpesa1 the totaleStanziamentiSpesa1 to set
	 */
	public void setTotaleStanziamentiSpesa1(BigDecimal totaleStanziamentiSpesa1) {
		this.totaleStanziamentiSpesa1 = totaleStanziamentiSpesa1;
	}

	/**
	 * @return the totaleStanziamentiSpesa2
	 */
	public BigDecimal getTotaleStanziamentiSpesa2() {
		return totaleStanziamentiSpesa2;
	}

	/**
	 * @param totaleStanziamentiSpesa2 the totaleStanziamentiSpesa2 to set
	 */
	public void setTotaleStanziamentiSpesa2(BigDecimal totaleStanziamentiSpesa2) {
		this.totaleStanziamentiSpesa2 = totaleStanziamentiSpesa2;
	}

	/**
	 * @return the totaleStanziamentiEntrata2
	 */
	public BigDecimal getTotaleStanziamentiEntrata2() {
		return totaleStanziamentiEntrata2;
	}

	/**
	 * @param totaleStanziamentiEntrata2 the totaleStanziamentiEntrata2 to set
	 */
	public void setTotaleStanziamentiEntrata2(BigDecimal totaleStanziamentiEntrata2) {
		this.totaleStanziamentiEntrata2 = totaleStanziamentiEntrata2;
	}
	
}
