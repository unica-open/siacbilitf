/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa.TipoProvvisorioDiCassa;

/**
 * Parametri per la ricerca del provvisorio per chiave
 * 
 * @author ccivilla
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class RicercaProvvisorioDiCassaK implements Serializable {
	
	private static final long serialVersionUID = -1L;
	
	
	private Integer annoProvvisorioDiCassa;
	private Integer numeroProvvisorioDiCassa;
	private TipoProvvisorioDiCassa tipoProvvisorioDiCassa;
	
	public Integer getAnnoProvvisorioDiCassa() {
		return annoProvvisorioDiCassa;
	}
	public void setAnnoProvvisorioDiCassa(Integer annoProvvisorioDiCassa) {
		this.annoProvvisorioDiCassa = annoProvvisorioDiCassa;
	}
	public Integer getNumeroProvvisorioDiCassa() {
		return numeroProvvisorioDiCassa;
	}
	public void setNumeroProvvisorioDiCassa(Integer numeroProvvisorioDiCassa) {
		this.numeroProvvisorioDiCassa = numeroProvvisorioDiCassa;
	}
	public TipoProvvisorioDiCassa getTipoProvvisorioDiCassa() {
		return tipoProvvisorioDiCassa;
	}
	public void setTipoProvvisorioDiCassa(
			TipoProvvisorioDiCassa tipoProvvisorioDiCassa) {
		this.tipoProvvisorioDiCassa = tipoProvvisorioDiCassa;
	}


}
