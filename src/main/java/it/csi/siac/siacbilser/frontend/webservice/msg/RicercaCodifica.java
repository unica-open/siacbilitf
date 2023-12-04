/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TipoCodifica;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Request del servizio di Ricerca codifica.
 *
 * @author Domenico
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaCodifica extends ServiceRequest {
	
	@XmlElement(name="codifica")
	private TipoCodifica tipoCodifica; 
	
	private String codice;

	/**
	 * @return the tipoCodifica
	 */
	@XmlTransient
	public TipoCodifica getTipoCodifica() {
		return tipoCodifica;
	}

	/**
	 * @param tipoCodifica the tipoCodifica to set
	 */
	public void setTipoCodifica(TipoCodifica tipoCodifica) {
		this.tipoCodifica = tipoCodifica;
	}
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * Sets the tipi codifiche.
	 *
	 * @param tipiCodifiche the tipiCodifiche to set
	 */
	public void setTipoCodifica(Class<? extends Codifica> tipoCodificaClass) {
		setTipoCodifica(new TipoCodifica(tipoCodificaClass));
	}

	
	/**
	 * Adds the nome codifica.
	 *
	 * @param nomeCodifica the nome codifica
	 */
	public void setNomeCodifica(String nomeCodifica){
		setTipoCodifica(new TipoCodifica(nomeCodifica));
	}
	
	
	/**
	 * Sets the codifiche.
	 *
	 * @param codifiche the codifiche
	 */
	public void setCodifica(Object obj) {
		if(obj instanceof Class) {
			@SuppressWarnings("unchecked")
			final Class<? extends Codifica> tc = (Class<? extends Codifica>) obj;
			setTipoCodifica(tc);
		} else if(obj instanceof String) {
			final String nomeCodifica = (String) obj;
			setNomeCodifica(nomeCodifica);
		} else {
			throw new IllegalArgumentException("Parametro errato: Previsto " + String.class.getName() + " oppure " + Class.class.getName()
					+ ", passato: " + (obj != null ? obj.getClass() : "null"));
		}
		
	}
	

}
