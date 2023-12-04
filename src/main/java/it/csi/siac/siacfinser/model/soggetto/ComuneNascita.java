/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.datigeografici.Comune;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ComuneNascita extends Comune{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4490973948491503837L;

	
	// aggiunto come patch non c'e' nel modello concettuale
	
	private String siglaProvincia;


	public String getSiglaProvincia() {
		return siglaProvincia;
	}


	public void setSiglaProvincia(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
	}
	
	public void setUid(String uid){
		if(null!=uid && !"".equalsIgnoreCase(uid)){
			setUid(Integer.parseInt(uid)); 
		}
		
	}
	
	public static ComuneNascita createWithComuneIstatCode(String comuneIstatCode) {
		ComuneNascita comuneNascita = new ComuneNascita();
		
		comuneNascita.setCodiceIstat(comuneIstatCode);
		
		return comuneNascita;
	}
	
}
