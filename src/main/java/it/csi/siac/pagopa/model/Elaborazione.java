/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnteExt;

@XmlType(namespace = PagoPADataDictionary.NAMESPACE)
public class Elaborazione extends EntitaEnteExt {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8022186472752951714L;
	
	
	private String  numeroProvvisorio;
	private Date dataEmissioneProvvisorio;
	private String  versante;
	private String flusso;
	private BigDecimal importoProvvisorio;
	private Date dataElaborazione;
	private String esitoElaborazione;
	private StatoElaborazione statoElaborazione;
	private String dataEmissioneProvvisorioStr;
	private Errore errore;
	private Integer flussoId;
	
	
	
	
	/**
	 * @return the errore
	 */
	public Errore getErrore()
	{
		return errore;
	}
	/**
	 * @param errore the errore to set
	 */
	public void setErrore(Errore errore)
	{
		this.errore = errore;
	}
	/**
	 * @return the dataEmissioneProvvisorioStr
	 */
	public String getDataEmissioneProvvisorioStr() {
		return dataEmissioneProvvisorioStr;
	}
	/**
	 * @param dataEmissioneProvvisorioStr the dataEmissioneProvvisorioStr to set
	 */
	public void setDataEmissioneProvvisorioStr(String dataEmissioneProvvisorioStr) {
		this.dataEmissioneProvvisorioStr = dataEmissioneProvvisorioStr;
	}
	
	
	
	
	
	
	/**
	 * @return the numeroProvvisorio
	 */
	public String getNumeroProvvisorio()
	{
		return numeroProvvisorio;
	}
	/**
	 * @param numeroProvvisorio the numeroProvvisorio to set
	 */
	public void setNumeroProvvisorio(String numeroProvvisorio)
	{
		this.numeroProvvisorio = numeroProvvisorio;
	}
	/**
	 * @return the dataEmissioneProvvisorio
	 */
	public Date getDataEmissioneProvvisorio()
	{
		return dataEmissioneProvvisorio;
	}
	/**
	 * @param dataEmissioneProvvisorio the dataEmissioneProvvisorio to set
	 */
	public void setDataEmissioneProvvisorio(Date dataEmissioneProvvisorio)
	{
		this.dataEmissioneProvvisorio = dataEmissioneProvvisorio;
	}
	/**
	 * @return the versante
	 */
	public String getVersante()
	{
		return versante;
	}
	/**
	 * @param versante the versante to set
	 */
	public void setVersante(String versante)
	{
		this.versante = versante;
	}
	/**
	 * @return the flusso
	 */
	public String getFlusso()
	{
		return flusso;
	}
	/**
	 * @param flusso the flusso to set
	 */
	public void setFlusso(String flusso)
	{
		this.flusso = flusso;
	}
	/**
	 * @return the importoProvvisorio
	 */
	public BigDecimal getImportoProvvisorio()
	{
		return importoProvvisorio;
	}
	/**
	 * @param importoProvvisorio the importoProvvisorio to set
	 */
	public void setImportoProvvisorio(BigDecimal importoProvvisorio)
	{
		this.importoProvvisorio = importoProvvisorio;
	}
	/**
	 * @return the dataElaborazione
	 */
	public Date getDataElaborazione()
	{
		return dataElaborazione;
	}
	/**
	 * @param dataElaborazione the dataElaborazione to set
	 */
	public void setDataElaborazione(Date dataElaborazione)
	{
		this.dataElaborazione = dataElaborazione;
	}
	/**
	 * @return the esitoElaborazione
	 */
	public String getEsitoElaborazione()
	{
		return esitoElaborazione;
	}
	/**
	 * @param esitoElaborazione the esitoElaborazione to set
	 */
	public void setEsitoElaborazione(String esitoElaborazione)
	{
		this.esitoElaborazione = esitoElaborazione;
	}
	/**
	 * @return the statoElaborazione
	 */
	public StatoElaborazione getStatoElaborazione()
	{
		return statoElaborazione;
	}
	/**
	 * @param statoElaborazione the statoElaborazione to set
	 */
	public void setStatoElaborazione(StatoElaborazione statoElaborazione)
	{
		this.statoElaborazione = statoElaborazione;
	}
	/**
	 * @return the flussoId
	 */
	public Integer getFlussoId() {
		return flussoId;
	}
	/**
	 * @param flussoId the flussoId to set
	 */
	public void setFlussoId(Integer flussoId) {
		this.flussoId = flussoId;
	}
	 
	 
	
	 
	
}
 
