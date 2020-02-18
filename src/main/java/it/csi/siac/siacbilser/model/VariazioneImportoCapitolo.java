/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

/**
 * VariazioneImportoCapitolo.
 *
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VariazioneImportoCapitolo extends VariazioneDiBilancio {

	private static final long serialVersionUID = 861361995172032558L;
	
	private List<DettaglioVariazioneImportoCapitolo> listaDettaglioVariazioneImporto = new ArrayList<DettaglioVariazioneImportoCapitolo>();	

	// SIAC-6883: rimosso anno competenza
	//Nuovo (rifacimento 06/2016)
	private ApplicazioneVariazione applicazioneVariazione;
	
	//attoAmministrativoPEG
	private AttoAmministrativo attoAmministrativo;
	
	//Nuovo SIAC-4737
	private AttoAmministrativo attoAmministrativoVariazioneBilancio;
	
	//Nuovo SIAC-4999
	private Date dataInizioValiditaStato;
	//private Date dataAperturaProposta;
	
	/**
	 * Gets the lista dettaglio variazione importo.
	 *
	 * @return the lista dettaglio variazione importo
	 */
	public List<DettaglioVariazioneImportoCapitolo> getListaDettaglioVariazioneImporto() {
		return listaDettaglioVariazioneImporto;
	}

	/**
	 * Sets the lista dettaglio variazione importo.
	 *
	 * @param listaDettaglioVariazioneImporto the new lista dettaglio variazione importo
	 */
	public void setListaDettaglioVariazioneImporto(List<DettaglioVariazioneImportoCapitolo> listaDettaglioVariazioneImporto) {
		this.listaDettaglioVariazioneImporto = listaDettaglioVariazioneImporto != null ? listaDettaglioVariazioneImporto : new ArrayList<DettaglioVariazioneImportoCapitolo>();
	}

	/**
	 * Gets the atto amministrativo.
	 *
	 * @return the atto amministrativo
	 */
	public AttoAmministrativo getAttoAmministrativo() {
		return attoAmministrativo;
	}

	/**
	 * Sets the atto amministrativo.
	 *
	 * @param attoAmministrativo the new atto amministrativo
	 */
	public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo) {
		this.attoAmministrativo = attoAmministrativo;
	}
	
	/**
	 * Gets the applicazione variazione.
	 *
	 * @return the applicazione variazione
	 */
	public ApplicazioneVariazione getApplicazioneVariazione() {
		return applicazioneVariazione;
	}

	/**
	 * Sets the applicazione variazione.
	 *
	 * @param applicazioneVariazione the new applicazione variazione
	 */
	public void setApplicazioneVariazione(ApplicazioneVariazione applicazioneVariazione) {
		this.applicazioneVariazione = applicazioneVariazione;
	}

	/**
	 * Gets the atto amministrativo variazione bilancio.
	 *
	 * @return the atto amministrativo variazione bilancio
	 */
	public AttoAmministrativo getAttoAmministrativoVariazioneBilancio() {
		return attoAmministrativoVariazioneBilancio;
	}

	/**
	 * Sets the atto amministrativo variazione bilancio.
	 *
	 * @param attoAmministrativoVariazioneBilancio the new atto amministrativo variazione bilancio
	 */
	public void setAttoAmministrativoVariazioneBilancio(AttoAmministrativo attoAmministrativoVariazioneBilancio) {
		this.attoAmministrativoVariazioneBilancio = attoAmministrativoVariazioneBilancio;
	}
	
	/**
	 * @return the dataInizioValiditaStato
	 */
	public Date getDataInizioValiditaStato() {
		return dataInizioValiditaStato;
	}

	/**
	 * @param dataInizioValiditaStato the dataInizioValiditaStato to set
	 */
	public void setDataInizioValiditaStato(Date dataInizioValiditaStato) {
		this.dataInizioValiditaStato = dataInizioValiditaStato;
	}
	
	/**
	 * @return the dataInizioValiditaStato
	 */
//	public Date getDataAperturaProposta() {
//		return dataAperturaProposta;
//	}
//
//	/**
//	 * @param dataAperturaProposta the dataAperturaProposta to set
//	 */
//	public void setDataAperturaProposta(Date dataAperturaProposta) {
//		this.dataAperturaProposta = dataAperturaProposta;
//	}
	
	/**
	 * Ottiene la lista dei capitoli presenti nella variazione 
	 * @return
	 */
	public List<Capitolo<?, ?>> getCapitoli() {
		final List<Capitolo<?, ?>> capitoli = new ArrayList<Capitolo<?, ?>>();
		
		for(DettaglioVariazioneImportoCapitolo dvic : getListaDettaglioVariazioneImporto()){
			capitoli.add(dvic.getCapitolo());
		}
		
		return capitoli;
	}
	
	/**
	 * Ottiene la lista dei capitoli dei tipi indicati come parametro presenti nella variazione
	 * @param tipiCapitolo i tipi capitolo da cercare
	 * @return la lista dei capitoli
	 */
	public List<Capitolo<?, ?>> getCapitoli(TipoCapitolo... tipiCapitolo) {
		final List<Capitolo<?, ?>> capitoli = new ArrayList<Capitolo<?, ?>>();
		final List<TipoCapitolo> tipiCapitoloList = Arrays.asList(tipiCapitolo);
		
		for(Capitolo<?, ?> c : getCapitoli()){
			if(tipiCapitoloList.contains(c.getTipoCapitolo())){
				capitoli.add(c);
			}
		}
		
		return capitoli;
	}
	
	
	
	/**
	 * Calcola somma stanziamento entrata.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoEntrata(){
		return calcolaSommaImporto("Stanziamento", TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE,TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE);
	}
	/**
	 * Calcola somma stanziamento entrata per anno +1.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoEntrata1(){
		return calcolaSommaImporto("Stanziamento1", TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE,TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE);
	}
	/**
	 * Calcola somma stanziamento entrata per anno + 2.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoEntrata2(){
		return calcolaSommaImporto("Stanziamento2", TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE,TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE);
	}
	
	/**
	 * Calcola somma stanziamento uscita.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoUscita(){
		return calcolaSommaImporto("Stanziamento", TipoCapitolo.CAPITOLO_USCITA_GESTIONE,TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	/**
	 * Calcola somma stanziamento uscita per anno + 1.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoUscita1(){
		return calcolaSommaImporto("Stanziamento1", TipoCapitolo.CAPITOLO_USCITA_GESTIONE,TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	/**
	 * Calcola somma stanziamento uscita per anno + 2.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoUscita2(){
		return calcolaSommaImporto("Stanziamento2", TipoCapitolo.CAPITOLO_USCITA_GESTIONE,TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	
	/**
	 * Calcola somma stanziamento cassa entrata.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoCassaEntrata() {
		return calcolaSommaImporto("StanziamentoCassa", TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE,TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE);
	}
	
	/**
	 * Calcola somma stanziamento cassa uscita.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoCassaUscita() {
		return calcolaSommaImporto("StanziamentoCassa", TipoCapitolo.CAPITOLO_USCITA_GESTIONE,TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	
	/**
	 * Calcola somma stanziamento residuo entrata.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoResiduoEntrata(){
		return calcolaSommaImporto("StanziamentoResiduo", TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE,TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE);
	}
	
	/**
	 * Calcola somma stanziamento residuo uscita.
	 *
	 * @return the big decimal
	 */
	public BigDecimal calcolaSommaStanziamentoResiduoUscita(){
		return calcolaSommaImporto("StanziamentoResiduo", TipoCapitolo.CAPITOLO_USCITA_GESTIONE,TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	
	
	/**
	 * Calcola la somma degli stanziamenti presenti nella variazione per tipo importo e per tipo capitolo sommando i vari importi presenti nei dettagli asosciati alla variazione.
	 *
	 * @param importoFieldName the importo field name
	 * @param tipiCapitolo the tipi capitolo
	 * @return the big decimal
	 */
	private BigDecimal calcolaSommaImporto(String importoFieldName, TipoCapitolo... tipiCapitolo){
		BigDecimal result = BigDecimal.ZERO;
		Method getter;
		try {
			getter = DettaglioVariazioneImportoCapitolo.class.getMethod("get"+StringUtils.capitalize(importoFieldName));
		} catch (SecurityException e) {
			throw new IllegalArgumentException("Impossibile ottenere l'importo richiesto: " + importoFieldName + ".", e);
		} catch (NoSuchMethodException e) {
			throw new IllegalArgumentException("Impossibile ottenere l'importo richiesto: " + importoFieldName + ".", e);
		}
		
		for(DettaglioVariazioneImportoCapitolo dettVarImp : this.getListaDettaglioVariazioneImporto()) {
			final TipoCapitolo tipoCapitolo = dettVarImp.getCapitolo().getTipoCapitolo();
			if(tipoCapitolo==null) {
				throw new IllegalStateException("TipoCapitolo non valorizzato.");
			}
			for(TipoCapitolo tc : tipiCapitolo) {
				if(tipoCapitolo.equals(tc)) {
					BigDecimal importo; 
					try {
						importo = (BigDecimal)getter.invoke(dettVarImp);
					} catch (Exception e) {
						throw new IllegalArgumentException("Impossibile ottenere l'importo richiesto: "+importoFieldName+".", e);
					} 
					result = result.add(importo);
				}
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
