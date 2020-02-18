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
public class RiepilogoDatiVariazioneImportoCapitoloAnno implements Serializable {

	private static final long serialVersionUID = 861361995172032558L;
	
	private Map<Integer, DatiVariazioneImportoCapitoloAnno> datiVariazioneImportiCapitoloPerAnno = new HashMap<Integer, DatiVariazioneImportoCapitoloAnno>();

	/**
	 * @return the datiVariazioneImportiCapitoloPerAnno
	 */
	public Map<Integer, DatiVariazioneImportoCapitoloAnno> getDatiVariazioneImportiCapitoloPerAnno() {
		return datiVariazioneImportiCapitoloPerAnno;
	}

	/**
	 * @param datiVariazioneImportiCapitoloPerAnno the datiVariazioneImportiCapitoloPerAnno to set
	 */
	public void setDatiVariazioneImportiCapitoloPerAnno(Map<Integer, DatiVariazioneImportoCapitoloAnno> datiVariazioneImportiCapitoloPerAnno) {
		this.datiVariazioneImportiCapitoloPerAnno = datiVariazioneImportiCapitoloPerAnno;
	}

}
