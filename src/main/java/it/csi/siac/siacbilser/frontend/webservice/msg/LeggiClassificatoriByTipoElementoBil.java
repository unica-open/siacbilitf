/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Messaggio di richiesta per la lista dei classificatori per: anno
 * idEnteProprietario tipoElementoBilancio
 * 
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class LeggiClassificatoriByTipoElementoBil extends ServiceRequest {

	private int anno;
	private int idEnteProprietario;
	private String tipoElementoBilancio;

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getIdEnteProprietario() {
		return idEnteProprietario;
	}

	public void setIdEnteProprietario(int idEnteProprietario) {
		this.idEnteProprietario = idEnteProprietario;
	}

	public String getTipoElementoBilancio() {
		return tipoElementoBilancio;
	}

	public void setTipoElementoBilancio(String tipoElementoBilancio) {
		this.tipoElementoBilancio = tipoElementoBilancio;
	}

}
