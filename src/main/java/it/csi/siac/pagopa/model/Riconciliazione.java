/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

@XmlType(namespace = PagoPADataDictionary.NAMESPACE)
public class Riconciliazione extends EntitaEnte{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1431499359131125921L;
	
	private Integer ricId;
	private String  codiceVoce;
	private String  descrizioneVoce; 
	private String  codiceSottovoce; 
	private String  anno;
	private String  numeroAccertamento;
	private BigDecimal   importoRigaRiconciliazione;
	private String flusso;
	private Errore errore;
	//SIAC-8046 CM 19/03/2021
	private FilePagopa file;
	
	

	/**
	 * @return the fileStatoCode
	 */
	public FilePagopa getFile() {
		return file;
	}
	/**
	 * @param fileStatoCode the fileStatoCode to set
	 */
	public void setFile(FilePagopa file) {
		this.file = file;
	}
	//SIAC-8046 CM 19/03/2021
	
	
	/**
	 * @return the ricId
	 */
	public Integer getRicId()
	{
		return ricId;
	}
	/**
	 * @param ricId the ricId to set
	 */
	public void setRicId(Integer ricId)
	{
		this.ricId = ricId;
	}
	/**
	 * @return the codiceVoce
	 */
	public String getCodiceVoce()
	{
		return codiceVoce;
	}
	/**
	 * @param codiceVoce the codiceVoce to set
	 */
	public void setCodiceVoce(String codiceVoce)
	{
		this.codiceVoce = codiceVoce;
	}
	/**
	 * @return the descrizioneVoce
	 */
	public String getDescrizioneVoce()
	{
		return descrizioneVoce;
	}
	/**
	 * @param descrizioneVoce the descrizioneVoce to set
	 */
	public void setDescrizioneVoce(String descrizioneVoce)
	{
		this.descrizioneVoce = descrizioneVoce;
	}
	/**
	 * @return the codiceSottovoce
	 */
	public String getCodiceSottovoce()
	{
		return codiceSottovoce;
	}
	/**
	 * @param codiceSottovoce the codiceSottovoce to set
	 */
	public void setCodiceSottovoce(String codiceSottovoce)
	{
		this.codiceSottovoce = codiceSottovoce;
	}
	/**
	 * @return the anno
	 */
	public String getAnno()
	{
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(String anno)
	{
		this.anno = anno;
	}
	/**
	 * @return the numeroAccertamento
	 */
	public String getNumeroAccertamento()
	{
		return numeroAccertamento;
	}
	/**
	 * @param numeroAccertamento the numeroAccertamento to set
	 */
	public void setNumeroAccertamento(String numeroAccertamento)
	{
		this.numeroAccertamento = numeroAccertamento;
	}
	/**
	 * @return the importoRigaRiconciliazione
	 */
	public BigDecimal getImportoRigaRiconciliazione()
	{
		return importoRigaRiconciliazione;
	}
	/**
	 * @param importoRigaRiconciliazione the importoRigaRiconciliazione to set
	 */
	public void setImportoRigaRiconciliazione(BigDecimal importoRigaRiconciliazione)
	{
		this.importoRigaRiconciliazione = importoRigaRiconciliazione;
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
	
	
	
	


}
