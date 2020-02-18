/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.CodificheService;
import it.csi.siac.siaccorser.model.Codifica;

/**
 * Descrive un tipo di codifica per il servizio generico di ricerca codifiche.
 * 
 * @author Domenico
 * 
 * @see CodificheService#ricercaCodifiche
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TipoCodifica implements Serializable {
	
	private static final long serialVersionUID = 8665730973188695395L;
	
	private Class<? extends Codifica> tipoCodifica;
	private String nomeCodifica;
	
	
	public TipoCodifica() {
		// Costruttore vuoto
	}
	
	public TipoCodifica(Class<? extends Codifica> tipoCodifica, String nomeCodifica){
		this.tipoCodifica = tipoCodifica;
		this.nomeCodifica = nomeCodifica;
	}
	
	public TipoCodifica(Class<? extends Codifica> tipoCodifica){
		this(tipoCodifica,null);
	}
	
	public TipoCodifica(String nomeCodifica){
		this(null,nomeCodifica);
	}


	/**
	 * @return the tipoCodifica
	 */
	public Class<? extends Codifica> getTipoCodifica() {
		return tipoCodifica;
	}
	/**
	 * @param tipoCodifica the tipoCodifica to set
	 */
	public void setTipoCodifica(Class<? extends Codifica> tipoCodifica) {
		this.tipoCodifica = tipoCodifica;
	}
	/**
	 * @return the nomeCodifica
	 */
	public String getNomeCodifica() {
		return nomeCodifica;
	}
	/**
	 * @param nomeCodifica the nomeCodifica to set
	 */
	public void setNomeCodifica(String nomeCodifica) {
		this.nomeCodifica = nomeCodifica;
	}
	
	

}
