/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoCodifica;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Request del servizio di Ricerca codifiche.
 *
 * @author Domenico
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaCodifiche extends ServiceRequest {
	
	@XmlElement(name="codifica")
	private Set<TipoCodifica> litaTipoCodifica = new HashSet<TipoCodifica>(); 

	/**
	 * Gets the lita tipo codifica.
	 *
	 * @return the litaTipoCodifica
	 */
	@XmlTransient
	public Set<TipoCodifica> getLitaTipoCodifica() {
		return litaTipoCodifica;
	}

	/**
	 * Sets the lita tipo codifica.
	 *
	 * @param litaTipoCodifica the litaTipoCodifica to set
	 */
	public void setLitaTipoCodifica(Set<TipoCodifica> litaTipoCodifica) {
		this.litaTipoCodifica = litaTipoCodifica;
	}

	/**
	 * Gets the tipi codifiche.
	 *
	 * @return the tipiCodifiche
	 */
	@XmlTransient
	public Set<Class<? extends Codifica>> getTipiCodifiche() {
		final Set<Class<? extends Codifica>> res = new HashSet<Class<? extends Codifica>>();
		for(TipoCodifica tipoCodifica : this.litaTipoCodifica) {
			if(tipoCodifica.getTipoCodifica()!=null){
				res.add(tipoCodifica.getTipoCodifica());
				
			}
		}
		return res;
	}
	
	/**
	 * Sets the tipi codifiche.
	 *
	 * @param tipiCodifiche the tipiCodifiche to set
	 */
	public void setTipiCodifiche(Set<Class<? extends Codifica>> tipiCodifiche) {
		this.litaTipoCodifica = new HashSet<TipoCodifica>();
		
		if(tipiCodifiche==null){
			return;
		}
		
		for (Class<? extends Codifica> codifica : tipiCodifiche) {
			addTipoCodifica(codifica);
		}
		
		
	}

	/**
	 * Adds the tipo codifica.
	 *
	 * @param codifica the codifica
	 */
	public void addTipoCodifica(Class<? extends Codifica> codifica){
		this.litaTipoCodifica.add(new TipoCodifica(codifica));
	}
	
	/**
	 * Adds the tipi codifica.
	 *
	 * @param codifiche the codifiche
	 */
	public void addTipiCodifica(Class<? extends Codifica>... codifiche){
		for(Class<? extends Codifica> codifica : codifiche){
			addTipoCodifica(codifica);
		}
	}
	
	/**
	 * Adds the nome codifica.
	 *
	 * @param nomeCodifica the nome codifica
	 */
	public void addNomeCodifica(String nomeCodifica){
		this.litaTipoCodifica.add(new TipoCodifica(nomeCodifica));
	}
	
	/**
	 * Adds the nomi codifiche.
	 *
	 * @param nomiCodifica the nomi codifica
	 */
	public void addNomiCodifiche(String... nomiCodifica){
		for(String nomeCodifica : nomiCodifica){
			addNomeCodifica(nomeCodifica);
		}
	}
	
	
	/**
	 * Adds the codifiche.
	 *
	 * @param codifiche the codifiche
	 */
	public void addCodifiche(Object... codifiche) {
		for(Object obj : codifiche) {
			if(obj instanceof Class) {
				@SuppressWarnings("unchecked")
				final Class<? extends Codifica> tipoCodifica = (Class<? extends Codifica>) obj;
				addTipoCodifica(tipoCodifica);
			} else if(obj instanceof String) {
				final String nomeCodifica = (String) obj;
				addNomeCodifica(nomeCodifica);
			} else {
				throw new IllegalArgumentException("Parametro errato: Previsto " + String.class.getName() + " oppure " + Class.class.getName()
						+ ", passato: " + (obj != null ? obj.getClass() : "null"));
			}
		}
	}
	
	
	

}
