/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.ClassificatoreStipendi;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.CodiceBollo;
import it.csi.siac.siacfin2ser.model.CommissioniDocumento;
import it.csi.siac.siacfin2ser.model.ContoTesoreria;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.Distinta;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EmetteOrdinativoDiPagamentoMultiplo extends ServiceRequest {
	
	
	private List<SubdocumentoSpesa> quote = new ArrayList<SubdocumentoSpesa>();
	private Boolean flagConvalidaManuale;
	private Bilancio bilancio;
	private ContoTesoreria contoTesoreria;
	private Distinta distinta;
	private String note;
	private CommissioniDocumento commissioniDocumento;
	private CodiceBollo codiceBollo;
	private Date dataScadenza;
	private Boolean flagNoDataScadenza;

	
	private Map<Integer,Liquidazione> liquidazioniCache = new HashMap<Integer,Liquidazione>();
	private Map<Integer,DocumentoSpesa> documentiCache = new HashMap<Integer,DocumentoSpesa>();
	private Map<Integer,Soggetto> soggettiCache = new HashMap<Integer,Soggetto>();
	
	//SIAC-5937
	private Bilancio bilancioAnnoSuccessivo;
	private boolean bilancioInDoppiaGestione;
	//SIAC-6175
	private Boolean flagDaTrasmettere;
	//SIAC-6206
	private ClassificatoreStipendi classificatoreStipendi;
	
	
	/**
	 * @return the quote
	 */
	public List<SubdocumentoSpesa> getQuote() {
		return quote;
	}

	/**
	 * @param quote the quote to set
	 */
	public void setQuote(List<SubdocumentoSpesa> quote) {
		this.quote = quote;
	}

	/**
	 * @return the flagConvalidaManuale
	 */
	public Boolean getFlagConvalidaManuale() {
		return flagConvalidaManuale;
	}

	/**
	 * @param flagConvalidaManuale the flagConvalidaManuale to set
	 */
	public void setFlagConvalidaManuale(Boolean flagConvalidaManuale) {
		this.flagConvalidaManuale = flagConvalidaManuale;
	}
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the contoTesoreria
	 */
	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}

	/**
	 * @param contoTesoreria the contoTesoreria to set
	 */
	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}

	/**
	 * @return the distinta
	 */
	public Distinta getDistinta() {
		return distinta;
	}

	/**
	 * @param distinta the distinta to set
	 */
	public void setDistinta(Distinta distinta) {
		this.distinta = distinta;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return the commissioniDocumento
	 */
	public CommissioniDocumento getCommissioniDocumento() {
		return commissioniDocumento;
	}

	/**
	 * @param commissioniDocumento the commissioniDocumento to set
	 */
	public void setCommissioniDocumento(CommissioniDocumento commissioniDocumento) {
		this.commissioniDocumento = commissioniDocumento;
	}

	/**
	 * @return the codiceBollo
	 */
	public CodiceBollo getCodiceBollo() {
		return codiceBollo;
	}

	/**
	 * @param codiceBollo the codiceBollo to set
	 */
	public void setCodiceBollo(CodiceBollo codiceBollo) {
		this.codiceBollo = codiceBollo;
	}
	
	/**
	 * @return the dataScadenza
	 */
	public Date getDataScadenza() {
		return dataScadenza;
	}

	/**
	 * @param dataScadenza the dataScadenza to set
	 */
	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	/**
	 * @return the liquidazioniCache
	 */
	public Map<Integer, Liquidazione> getLiquidazioniCache() {
		return liquidazioniCache;
	}
	/**
	 * @param liquidazioniCache the liquidazioniCache to set
	 */
	public void setLiquidazioniCache(Map<Integer, Liquidazione> liquidazioniCache) {
		this.liquidazioniCache = liquidazioniCache;
	}
	/**
	 * @return the documentiCache
	 */
	public Map<Integer, DocumentoSpesa> getDocumentiCache() {
		return documentiCache;
	}
	/**
	 * @param documentiCache the documentiCache to set
	 */
	public void setDocumentiCache(Map<Integer, DocumentoSpesa> documentiCache) {
		this.documentiCache = documentiCache;
	}
	/**
	 * @return the soggettiCache
	 */
	public Map<Integer, Soggetto> getSoggettiCache() {
		return soggettiCache;
	}
	/**
	 * @param soggettiCache the soggettiCache to set
	 */
	public void setSoggettiCache(Map<Integer, Soggetto> soggettiCache) {
		this.soggettiCache = soggettiCache;
	}

	/**
	 * @return the flagNoDataScadenza
	 */
	public Boolean getFlagNoDataScadenza() {
		return flagNoDataScadenza;
	}

	/**
	 * @param flagNoDataScadenza the flagNoDataScadenza to set
	 */
	public void setFlagNoDataScadenza(Boolean flagNoDataScadenza) {
		this.flagNoDataScadenza = flagNoDataScadenza;
	}

	/**
	 * Checks if is bilancio in doppia gestione.
	 *
	 * @return the bilancioInDoppiaGestione
	 */
	public Bilancio getBilancioAnnoSuccessivo() {
		return bilancioAnnoSuccessivo;
	}

	/**
	 * Sets the bilancio in doppia gestione.
	 *
	 * @param bilancioAnnoSuccessivo the new bilancio in doppia gestione
	 */
	public void setBilancioAnnoSuccessivo(Bilancio bilancioAnnoSuccessivo) {
		this.bilancioAnnoSuccessivo = bilancioAnnoSuccessivo;
	}

	/**
	 * Checks if is bilancio in doppia gestione.
	 *
	 * @return the bilancioInDoppiaGestione
	 */
	public boolean isBilancioInDoppiaGestione() {
		return bilancioInDoppiaGestione;
	}

	/**
	 * Sets the bilancio in doppia gestione.
	 *
	 * @param bilancioInDoppiaGestione the bilancioInDoppiaGestione to set
	 */
	public void setBilancioInDoppiaGestione(boolean bilancioInDoppiaGestione) {
		this.bilancioInDoppiaGestione = bilancioInDoppiaGestione;
	}
	/**
	 * @return the flagDaTrasmettere
	 */
	public Boolean getFlagDaTrasmettere() {
		return flagDaTrasmettere;
	}

	/**
	 * @param flagDaTrasmettere the flagDaTrasmettere to set
	 */
	public void setFlagDaTrasmettere(Boolean flagDaTrasmettere) {
		this.flagDaTrasmettere = flagDaTrasmettere;
	}

	/**
	 * @return the classificatoreStipendi
	 */
	public ClassificatoreStipendi getClassificatoreStipendi() {
		return classificatoreStipendi;
	}

	/**
	 * @param classificatoreStipendi the classificatoreStipendi to set
	 */
	public void setClassificatoreStipendi(ClassificatoreStipendi classificatoreStipendi) {
		this.classificatoreStipendi = classificatoreStipendi;
	}
	
	
}
