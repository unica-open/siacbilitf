/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
@Deprecated
public class DocumentoIva extends Entita {
	
	private static final long serialVersionUID = -5952204276610302500L;
	
	// siac_t_doc_iva
	// PK
	private Integer annoDocumentoIva;
	private String numeroDocumentoIva;
	
	// Obbligatorii
	private BigDecimal importoDocumentoIva = BigDecimal.ZERO;
	private Date dataEmissioneDocumentoIva;
	private String descrizioneDocumentoIva;
	
	private Date dataScadenzaDocumentoIva;
	
	// Ente
	private Ente ente;
	// Soggetto
	// siac_r_doc_iva_sog
	private Soggetto soggetto;
	// TipoDocumento
	private TipoDocumento tipoDocumento;
	// SubdocumentoIva
	private SubdocumentoIva<?, ?, ?> subdocumentoIva;
	
	/**
	 * @return the annoDocumentoIva
	 */
	public Integer getAnnoDocumentoIva() {
		return annoDocumentoIva;
	}
	/**
	 * @param annoDocumentoIva the annoDocumentoIva to set
	 */
	public void setAnnoDocumentoIva(Integer annoDocumentoIva) {
		this.annoDocumentoIva = annoDocumentoIva;
	}
	/**
	 * @return the numeroDocumentoIva
	 */
	public String getNumeroDocumentoIva() {
		return numeroDocumentoIva;
	}
	/**
	 * @param numeroDocumentoIva the numeroDocumentoIva to set
	 */
	public void setNumeroDocumentoIva(String numeroDocumentoIva) {
		this.numeroDocumentoIva = numeroDocumentoIva;
	}
	/**
	 * @return the importoDocumentoIva
	 */
	public BigDecimal getImportoDocumentoIva() {
		return importoDocumentoIva;
	}
	/**
	 * @param importoDocumentoIva the importoDocumentoIva to set
	 */
	public void setImportoDocumentoIva(BigDecimal importoDocumentoIva) {
		this.importoDocumentoIva = importoDocumentoIva != null ? importoDocumentoIva : BigDecimal.ZERO;
	}
	/**
	 * @return the dataEmissioneDocumentoIva
	 */
	public Date getDataEmissioneDocumentoIva() {
		return dataEmissioneDocumentoIva;
	}
	/**
	 * @param dataEmissioneDocumentoIva the dataEmissioneDocumentoIva to set
	 */
	public void setDataEmissioneDocumentoIva(Date dataEmissioneDocumentoIva) {
		this.dataEmissioneDocumentoIva = dataEmissioneDocumentoIva;
	}
	/**
	 * @return the descrizioneDocumentoIva
	 */
	public String getDescrizioneDocumentoIva() {
		return descrizioneDocumentoIva;
	}
	/**
	 * @param descrizioneDocumentoIva the descrizioneDocumentoIva to set
	 */
	public void setDescrizioneDocumentoIva(String descrizioneDocumentoIva) {
		this.descrizioneDocumentoIva = descrizioneDocumentoIva;
	}
	/**
	 * @return the dataScadenzaDocumentoIva
	 */
	public Date getDataScadenzaDocumentoIva() {
		return dataScadenzaDocumentoIva;
	}
	/**
	 * @param dataScadenzaDocumentoIva the dataScadenzaDocumentoIva to set
	 */
	public void setDataScadenzaDocumentoIva(Date dataScadenzaDocumentoIva) {
		this.dataScadenzaDocumentoIva = dataScadenzaDocumentoIva;
	}
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
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
	 * @return the subdocumentoIva
	 */
	public SubdocumentoIva<?, ?, ?> getSubdocumentoIva() {
		return subdocumentoIva;
	}
	/**
	 * @param subdocumentoIva the subdocumentoIva to set
	 */
	public void setSubdocumentoIva(SubdocumentoIva<?, ?, ?> subdocumentoIva) {
		this.subdocumentoIva = subdocumentoIva;
	}
	
}
