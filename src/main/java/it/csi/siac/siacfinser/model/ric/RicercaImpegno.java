/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

/**
 * Parametri per la ricerca degli Impegni
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaImpegno  implements Serializable{

	private static final long serialVersionUID = 6183357612046251834L;
	
	private Date annoEsercizio;
	private Date annoImpegno;
	private Integer numeroImpegno;
	private Integer capitolo;
	private Integer articolo;
	private Date annoProvvedimento;
	private String numeroProvvedimento;
	private String CIG;
	private String CUP;

	@XmlSchemaType(name = "date")
	public Date getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(Date annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	@XmlSchemaType(name = "date")
	public Date getAnnoImpegno() {
		return annoImpegno;
	}

	public void setAnnoImpegno(Date annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	public Integer getNumeroImpegno() {
		return numeroImpegno;
	}

	public void setNumeroImpegno(Integer numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
	}

	public Integer getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Integer capitolo) {
		this.capitolo = capitolo;
	}

	public Integer getArticolo() {
		return articolo;
	}

	public void setArticolo(Integer articolo) {
		this.articolo = articolo;
	}

	@XmlSchemaType(name = "date")
	public Date getAnnoProvvedimento() {
		return annoProvvedimento;
	}

	public void setAnnoProvvedimento(Date annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}

	public String getNumeroProvvedimento() {
		return numeroProvvedimento;
	}

	public void setNumeroProvvedimento(String numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}

	public String getCIG() {
		return CIG;
	}

	public void setCIG(String cIG) {
		CIG = cIG;
	}

	public String getCUP() {
		return CUP;
	}

	public void setCUP(String cUP) {
		CUP = cUP;
	}

}
