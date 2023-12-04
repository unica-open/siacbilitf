/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Trova i classificatori B associati ad un classificatore A
 * nella tabella di relazione tra due classificatori (vedi siac_r_class)
 *  
 *
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriByRelazione extends ServiceRequest {
	
	private Ente ente;
	private Integer idClassif;
	private Integer anno;
	
	/**
	 * Indica il verso della ricerca del classificatore:
	 * Default cerca i B a partire dagli A. (i figli sostanzialemente).
	 * Impostare a false per cercare da B ad A (i padri).
	 */
	private boolean fromAToB = true;
	
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public Integer getIdClassif() {
		return idClassif;
	}
	
	/**
	 * L'id del classificatore A di cui si vogliono ottenere i classificatori B
	 * @param idClassif
	 */
	public void setIdClassif(Integer idClassif) {
		this.idClassif = idClassif;
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
	 * @return the fromAToB
	 */
	public boolean isFromAToB() {
		return fromAToB;
	}
	/**
	 * @param fromAToB the fromAToB to set
	 */
	public void setFromAToB(boolean fromAToB) {
		this.fromAToB = fromAToB;
	}

	
	
	
	
	

}
