/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
/**
 * Entita' generica consultabile dal cruscottino
 *  
 * @author Elisa Chiari
 */
@XmlType(namespace = ConsultazioneEntitaDataDictionary.NAMESPACE)
public class EntitaConsultabile implements Serializable {

	/** Per la serializzazione */
	private static final long serialVersionUID = -3774993785542330243L;

	private Map<String,Object> campi = new HashMap<String,Object>();
	private TipoEntitaConsultabile tipoEntitaConsultabile;
	
		
	/**
	 * @return mappa dei campi del servizio
	 */
	@XmlJavaTypeAdapter(CampiMapAdapter.class)
	public Map<String,Object> getCampi() {
		return campi;
	}

	/**
	 * @param campi the campi to set
	 */
	public void setCampi(Map<String,Object> campi) {
		this.campi = campi!=null?campi:new HashMap<String,Object>();
	}
	
	/**
	 * @return the tipoEntitaConsultabile
	 */
	public TipoEntitaConsultabile getTipoEntitaConsultabile() {
		return tipoEntitaConsultabile;
	}

	/**
	 * @param tipoEntitaConsultabile the tipoEntitaConsultabile to set
	 */
	public void setTipoEntitaConsultabile(TipoEntitaConsultabile tipoEntitaConsultabile) {
		this.tipoEntitaConsultabile = tipoEntitaConsultabile;
	}
	
	/**
	 * @return the uid
	 */
	public int getUid() {
		final Integer uid = (Integer)campi.get("uid");
		return uid == null ? 0 : uid.intValue();
	}

	/**
	 * @param uid
	 */
	public void setUid(int uid) {
		campi.put("uid",uid);
	}


}


