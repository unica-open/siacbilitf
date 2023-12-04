/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.EntitaEnte;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * RegistroUnico.
 * 
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class RegistroUnico extends EntitaEnte {
	//maps the SiacTRegistrounicoDoc
	private static final long serialVersionUID = 4308930595316867439L;
	
	//data di inserimento nel registro 
	private Date dateRegistro;
	private Integer anno;
	//progressivo per anno di bilancio 
	private Integer numero;
	
	private Bilancio bilancio;
	
//	@XmlElements({
//		@XmlElement(name="documentoSpesa", type=DocumentoSpesa.class),
//		@XmlElement(name="documentoEntrata", type=DocumentoEntrata.class) 
//	})
//	private Documento<?,?> documento; //forse solo documentoSpesa??
	
	private DocumentoSpesa documentoSpesa;
	
	/**
	 * @return the dateRegistro
	 */
	public Date getDateRegistro() {
		return dateRegistro;
	}
	/**
	 * @param dateRegistro the dateRegistro to set
	 */
	public void setDateRegistro(Date dateRegistro) {
		this.dateRegistro = dateRegistro;
	}
	
	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	/**
	 * @return the numero
	 */
	public Integer getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Integer numero) {
		this.numero = numero;
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
//	/**
//	 * @return the documento
//	 */
//	@XmlTransient
//	public Documento<?, ?> getDocumento() {
//		return documento;
//	}
//	/**
//	 * @param documento the documento to set
//	 */
//	public void setDocumento(Documento<?, ?> documento) {
//		this.documento = documento;
//	}
	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}
	/**
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
	}
	
	
	
	
	
}
