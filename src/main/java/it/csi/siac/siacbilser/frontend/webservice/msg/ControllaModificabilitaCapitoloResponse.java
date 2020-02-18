/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * 
 * @author Domenico
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ControllaModificabilitaCapitoloResponse extends ServiceResponse {
		
	
	private Long stessoNumCap;
	private Long stessoNumCapArt;

	/**
	 * 
	 * @return Numero di Ueb che hanno lo stesso numero di capitolo
	 */
	public Long getStessoNumCap() {
		return stessoNumCap;
	}

	public void setStessoNumCap(Long stessoNumCap) {
		this.stessoNumCap = stessoNumCap;
	}

	/**
	 * 
	 * @return Numero di Ueb che hanno lo stesso numero di capitolo e numero articolo
	 */
	public Long getStessoNumCapArt() {
		return stessoNumCapArt;
	}

	public void setStessoNumCapArt(Long stessoNumCapArt) {
		this.stessoNumCapArt = stessoNumCapArt;
	}
	
	
	
	

}
