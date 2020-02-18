/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoDocumento;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * The Class RicercaQuotaEntrata.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaQuotePerProvvisorioEntrata extends ServiceRequest {

	private TipoDocumento tipoDocumento;
	private Integer annoDocumento; 
	private String numeroDocumento;
	private Date dataEmissioneDocumento;
	
	private Integer numeroQuota;	
	
	private BigDecimal numeroMovimento;
	private Integer annoMovimento; 
	
	private Soggetto soggetto;
	
	private Integer annoElenco;
	private Integer numeroElenco;
	
	private Boolean flgEscludiSubDocCollegati = false;
	
	private ParametriPaginazione parametriPaginazione;


	/**
	 * @return the tipoDocumento
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the annoDocumento
	 */
	public Integer getAnnoDocumento() {
		return annoDocumento;
	}

	/**
	 * @param annoDocumento the annoDocumento to set
	 */
	public void setAnnoDocumento(Integer annoDocumento) {
		this.annoDocumento = annoDocumento;
	}

	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	/**
	 * @return the dataEmissioneDocumento
	 */
	public Date getDataEmissioneDocumento() {
		return dataEmissioneDocumento;
	}

	/**
	 * @param dataEmissioneDocumento the dataEmissioneDocumento to set
	 */
	public void setDataEmissioneDocumento(Date dataEmissioneDocumento) {
		this.dataEmissioneDocumento = dataEmissioneDocumento;
	}

	/**
	 * @return the numeroQuota
	 */
	public Integer getNumeroQuota() {
		return numeroQuota;
	}

	/**
	 * @param numeroQuota the numeroQuota to set
	 */
	public void setNumeroQuota(Integer numeroQuota) {
		this.numeroQuota = numeroQuota;
	}

	/**
	 * @return the numeroMovimento
	 */
	public BigDecimal getNumeroMovimento() {
		return numeroMovimento;
	}

	/**
	 * @param numeroMovimento the numeroMovimento to set
	 */
	public void setNumeroMovimento(BigDecimal numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}

	/**
	 * @return the annoMovimento
	 */
	public Integer getAnnoMovimento() {
		return annoMovimento;
	}

	/**
	 * @param annoMovimento the annoMovimento to set
	 */
	public void setAnnoMovimento(Integer annoMovimento) {
		this.annoMovimento = annoMovimento;
	}

	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}

	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	

	/**
	 * @return the annoElenco
	 */
	public Integer getAnnoElenco() {
		return annoElenco;
	}

	/**
	 * @param annoElenco the annoElenco to set
	 */
	public void setAnnoElenco(Integer annoElenco) {
		this.annoElenco = annoElenco;
	}

	/**
	 * @return the numeroElenco
	 */
	public Integer getNumeroElenco() {
		return numeroElenco;
	}

	/**
	 * @param numeroElenco the numeroElenco to set
	 */
	public void setNumeroElenco(Integer numeroElenco) {
		this.numeroElenco = numeroElenco;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}

	/**
	 * @return the flgEscludiSubDocCollegati
	 */
	public Boolean getFlgEscludiSubDocCollegati() {
		return flgEscludiSubDocCollegati;
	}

	/**
	 * @param flgEscludiSubDocCollegati the flgEscludiSubDocCollegati to set
	 */
	public void setFlgEscludiSubDocCollegati(Boolean flgEscludiSubDocCollegati) {
		this.flgEscludiSubDocCollegati = flgEscludiSubDocCollegati;
	}


	
}