/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;

/**
 * RicercaComponenteCapitolo: entita' di supporto per la ricerca di
 * dettaglio del anagrafica del componente capitolo, contiene i parametri (obbligatori e/o
 * facoltativi) di ricerca
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaDettaglioComponenteCap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6313363334654391456L;
	
	private Integer uid;

	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	
	
	
	

}
