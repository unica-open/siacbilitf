/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

/**
 * RiepilogoDatiVariazioneImportoCapitoloAnno
 * 
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RiepilogoDatiVariazioneStatoIdVariazione implements Serializable {

	private static final long serialVersionUID = 861361995172032558L;
	
	private String tipo;
	private Integer idVariazione;
	private String anno;
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @return the idVariazione
	 */
	public Integer getIdVariazione() {
		return idVariazione;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @param idVariazione the idVariazione to set
	 */
	public void setIdVariazione(Integer idVariazione) {
		this.idVariazione = idVariazione;
	}
	/**
	 * @return the anno
	 */
	public String getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(String anno) {
		this.anno = anno;
	}
	
	
	

}
