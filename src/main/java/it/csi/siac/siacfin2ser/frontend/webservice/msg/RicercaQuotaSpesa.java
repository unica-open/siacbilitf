/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.StatoOperativoDocumento;
import it.csi.siac.siacfin2ser.model.TipoDocumento;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * The Class RicercaQuotaSpesa.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaQuotaSpesa extends ServiceRequest {
	
	private Ente ente;
	private Bilancio bilancio;
	
	private Integer uidElenco;
	private Integer annoElenco;
	private Integer numeroElenco;
	
	private Integer annoProvvisorio;
	private Integer numeroProvvisorio;
	private Date dataProvvisorio;
	
	private TipoDocumento tipoDocumento;
	private Integer annoDocumento; 
	private String numeroDocumento;
	private Date dataEmissioneDocumento;
	
	private Integer numeroQuota;	
	
	private BigDecimal numeroMovimento;
	private Integer annoMovimento; 
	
	private Soggetto soggetto;
	
	private Integer uidProvvedimento;
	private Integer annoProvvedimento;
	private Integer numeroProvvedimento;
	private TipoAtto tipoAtto;
	
	private StrutturaAmministrativoContabile struttAmmContabile;
	
	private List<StatoOperativoDocumento> statiOperativoDocumento = new ArrayList<StatoOperativoDocumento>();
	
	private Boolean collegatoAMovimentoDelloStessoBilancio;
	private Boolean associatoAProvvedimentoOAdElenco;
	private Boolean importoDaPagareZero;
	private Boolean rilevatiIvaConRegistrazioneONonRilevantiIva;
	
	
//	private Integer numeroElencoDa;
//	private Integer numeroElencoA;
//	
//	private Integer annoCapitolo;
//	private Integer numeroCapitolo;
//	private Integer numeroArticolo;
//	private Integer numeroUEB;
//	
//	private Boolean flagConvalidaManuale;
//	
//	private String codiceDistinta;
//	private Boolean importoDaPagareMaggioreDiZero;

	private ParametriPaginazione parametriPaginazione;
	
	
	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * Sets the ente.
	 *
	 * @param ente the new ente
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
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
	 * Gets the anno elenco.
	 *
	 * @return the anno elenco
	 */
	public Integer getAnnoElenco() {
		return annoElenco;
	}

	/**
	 * Sets the anno elenco.
	 *
	 * @param annoElenco the new anno elenco
	 */
	public void setAnnoElenco(Integer annoElenco) {
		this.annoElenco = annoElenco;
	}

	/**
	 * Gets the numero elenco.
	 *
	 * @return the numero elenco
	 */
	public Integer getNumeroElenco() {
		return numeroElenco;
	}

	/**
	 * Sets the numero elenco.
	 *
	 * @param numeroElenco the new numero elenco
	 */
	public void setNumeroElenco(Integer numeroElenco) {
		this.numeroElenco = numeroElenco;
	}

	/**
	 * Gets the anno provvisorio.
	 *
	 * @return the anno provvisorio
	 */
	public Integer getAnnoProvvisorio() {
		return annoProvvisorio;
	}

	/**
	 * Sets the anno provvisorio.
	 *
	 * @param annoProvvisorio the new anno provvisorio
	 */
	public void setAnnoProvvisorio(Integer annoProvvisorio) {
		this.annoProvvisorio = annoProvvisorio;
	}

	/**
	 * Gets the numero provvisorio.
	 *
	 * @return the numero provvisorio
	 */
	public Integer getNumeroProvvisorio() {
		return numeroProvvisorio;
	}

	/**
	 * Sets the numero provvisorio.
	 *
	 * @param numeroProvvisorio the new numero provvisorio
	 */
	public void setNumeroProvvisorio(Integer numeroProvvisorio) {
		this.numeroProvvisorio = numeroProvvisorio;
	}

	/**
	 * Gets the data provvisorio.
	 *
	 * @return the data provvisorio
	 */
	public Date getDataProvvisorio() {
		return dataProvvisorio;
	}

	/**
	 * Sets the data provvisorio.
	 *
	 * @param dataProvvisorio the new data provvisorio
	 */
	public void setDataProvvisorio(Date dataProvvisorio) {
		this.dataProvvisorio = dataProvvisorio;
	}

	/**
	 * Gets the tipo documento.
	 *
	 * @return the tipo documento
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * Sets the tipo documento.
	 *
	 * @param tipoDocumento the new tipo documento
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * Gets the anno documento.
	 *
	 * @return the anno documento
	 */
	public Integer getAnnoDocumento() {
		return annoDocumento;
	}

	/**
	 * Sets the anno documento.
	 *
	 * @param annoDocumento the new anno documento
	 */
	public void setAnnoDocumento(Integer annoDocumento) {
		this.annoDocumento = annoDocumento;
	}

	/**
	 * Gets the numero documento.
	 *
	 * @return the numero documento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * Sets the numero documento.
	 *
	 * @param numeroDocumento the new numero documento
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * Gets the data emissione documento.
	 *
	 * @return the data emissione documento
	 */
	public Date getDataEmissioneDocumento() {
		return dataEmissioneDocumento;
	}

	/**
	 * Sets the data emissione documento.
	 *
	 * @param dataEmissioneDocumento the new data emissione documento
	 */
	public void setDataEmissioneDocumento(Date dataEmissioneDocumento) {
		this.dataEmissioneDocumento = dataEmissioneDocumento;
	}

	/**
	 * Gets the numero quota.
	 *
	 * @return the numero quota
	 */
	public Integer getNumeroQuota() {
		return numeroQuota;
	}

	/**
	 * Sets the numero quota.
	 *
	 * @param numeroQuota the new numero quota
	 */
	public void setNumeroQuota(Integer numeroQuota) {
		this.numeroQuota = numeroQuota;
	}

	/**
	 * Gets the numero movimento.
	 *
	 * @return the numero movimento
	 */
	public BigDecimal getNumeroMovimento() {
		return numeroMovimento;
	}

	/**
	 * Sets the numero movimento.
	 *
	 * @param numeroMovimento the new numero movimento
	 */
	public void setNumeroMovimento(BigDecimal numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}

	/**
	 * Gets the anno movimento.
	 *
	 * @return the anno movimento
	 */
	public Integer getAnnoMovimento() {
		return annoMovimento;
	}

	/**
	 * Sets the anno movimento.
	 *
	 * @param annoMovimento the new anno movimento
	 */
	public void setAnnoMovimento(Integer annoMovimento) {
		this.annoMovimento = annoMovimento;
	}

	/**
	 * Gets the soggetto.
	 *
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}

	/**
	 * Sets the soggetto.
	 *
	 * @param soggetto the new soggetto
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	/**
	 * Gets the anno provvedimento.
	 *
	 * @return the anno provvedimento
	 */
	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}

	/**
	 * Sets the anno provvedimento.
	 *
	 * @param annoProvvedimento the new anno provvedimento
	 */
	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}

	/**
	 * Gets the numero provvedimento.
	 *
	 * @return the numero provvedimento
	 */
	public Integer getNumeroProvvedimento() {
		return numeroProvvedimento;
	}

	/**
	 * Sets the numero provvedimento.
	 *
	 * @param numeroProvvedimento the new numero provvedimento
	 */
	public void setNumeroProvvedimento(Integer numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}

	/**
	 * Gets the tipo atto.
	 *
	 * @return the tipo atto
	 */
	public TipoAtto getTipoAtto() {
		return tipoAtto;
	}

	/**
	 * Sets the tipo atto.
	 *
	 * @param tipoAtto the new tipo atto
	 */
	public void setTipoAtto(TipoAtto tipoAtto) {
		this.tipoAtto = tipoAtto;
	}

	/**
	 * Gets the strutt amm contabile.
	 *
	 * @return the strutt amm contabile
	 */
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return struttAmmContabile;
	}

	/**
	 * Sets the strutt amm contabile.
	 *
	 * @param struttAmmContabile the new strutt amm contabile
	 */
	public void setStruttAmmContabile(StrutturaAmministrativoContabile struttAmmContabile) {
		this.struttAmmContabile = struttAmmContabile;
	}

	/**
	 * Gets the parametri paginazione.
	 *
	 * @return the parametri paginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * Sets the parametri paginazione.
	 *
	 * @param parametriPaginazione the new parametri paginazione
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * Gets the stati operativo documento.
	 *
	 * @return the statiOperativoDocumento
	 */
	public List<StatoOperativoDocumento> getStatiOperativoDocumento() {
		return statiOperativoDocumento;
	}

	/**
	 * Sets the stati operativo documento.
	 *
	 * @param statiOperativoDocumento the statiOperativoDocumento to set
	 */
	public void setStatiOperativoDocumento(List<StatoOperativoDocumento> statiOperativoDocumento) {
		this.statiOperativoDocumento = statiOperativoDocumento;
	}

	/**
	 * Gets the collegato a movimento dello stesso bilancio.
	 *
	 * @return the collegatoAMovimentoDelloStessoBilancio
	 */
	public Boolean getCollegatoAMovimentoDelloStessoBilancio() {
		return collegatoAMovimentoDelloStessoBilancio;
	}

	/**
	 * Sets the collegato a movimento dello stesso bilancio.
	 *
	 * @param collegatoAMovimentoDelloStessoBilancio the collegatoAMovimentoDelloStessoBilancio to set
	 */
	public void setCollegatoAMovimentoDelloStessoBilancio(Boolean collegatoAMovimentoDelloStessoBilancio) {
		this.collegatoAMovimentoDelloStessoBilancio = collegatoAMovimentoDelloStessoBilancio;
	}

	/**
	 * Gets the associato a provvedimento o ad elenco.
	 *
	 * @return the associatoAProvvedimentoOAdElenco
	 */
	public Boolean getAssociatoAProvvedimentoOAdElenco() {
		return associatoAProvvedimentoOAdElenco;
	}

	/**
	 * Sets the associato a provvedimento o ad elenco.
	 *
	 * @param associatoAProvvedimentoOAdElenco the associatoAProvvedimentoOAdElenco to set
	 */
	public void setAssociatoAProvvedimentoOAdElenco(Boolean associatoAProvvedimentoOAdElenco) {
		this.associatoAProvvedimentoOAdElenco = associatoAProvvedimentoOAdElenco;
	}

	/**
	 * Gets the importo da pagare zero.
	 *
	 * @return the importoDaPagareZero
	 */
	public Boolean getImportoDaPagareZero() {
		return importoDaPagareZero;
	}

	/**
	 * Sets the importo da pagare zero.
	 *
	 * @param importoDaPagareZero the importoDaPagareZero to set
	 */
	public void setImportoDaPagareZero(Boolean importoDaPagareZero) {
		this.importoDaPagareZero = importoDaPagareZero;
	}

	/**
	 * Gets the rilevati iva con registrazione o non rilevanti iva.
	 *
	 * @return the rilevatiIvaConRegistrazioneONonRilevantiIva
	 */
	public Boolean getRilevatiIvaConRegistrazioneONonRilevantiIva() {
		return rilevatiIvaConRegistrazioneONonRilevantiIva;
	}

	/**
	 * Sets the rilevati iva con registrazione o non rilevanti iva.
	 *
	 * @param rilevatiIvaConRegistrazioneONonRilevantiIva the rilevatiIvaConRegistrazioneONonRilevantiIva to set
	 */
	public void setRilevatiIvaConRegistrazioneONonRilevantiIva(Boolean rilevatiIvaConRegistrazioneONonRilevantiIva) {
		this.rilevatiIvaConRegistrazioneONonRilevantiIva = rilevatiIvaConRegistrazioneONonRilevantiIva;
	}

	/**
	 * @return the uidElenco
	 */
	public Integer getUidElenco() {
		return uidElenco;
	}

	/**
	 * @param uidElenco the uidElenco to set
	 */
	public void setUidElenco(Integer uidElenco) {
		this.uidElenco = uidElenco;
	}

	/**
	 * @return the uidProvvedimento
	 */
	public Integer getUidProvvedimento() {
		return uidProvvedimento;
	}

	/**
	 * @param uidProvvedimento the uidProvvedimento to set
	 */
	public void setUidProvvedimento(Integer uidProvvedimento) {
		this.uidProvvedimento = uidProvvedimento;
	}
	
	
	
	
	
}
