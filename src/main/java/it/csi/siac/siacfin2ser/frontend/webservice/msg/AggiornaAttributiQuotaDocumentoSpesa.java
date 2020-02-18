/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.EnumMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.TipologiaAttributo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.siopeplus.SiopeAssenzaMotivazione;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaAttributiQuotaDocumentoSpesa extends ServiceRequest {
	
	private SubdocumentoSpesa subdocumentoSpesa;
	private Map<TipologiaAttributo, Object> attributi = new EnumMap<TipologiaAttributo, Object>(TipologiaAttributo.class);
	private SiopeAssenzaMotivazione siopeAssenzaMotivazione;

	/**
	 * @return the subdocumentoSpesa
	 */
	public SubdocumentoSpesa getSubdocumentoSpesa() {
		return subdocumentoSpesa;
	}

	/**
	 * @param subdocumentoSpesa the subdocumentoSpesa to set
	 */
	public void setSubdocumentoSpesa(SubdocumentoSpesa subdocumentoSpesa) {
		this.subdocumentoSpesa = subdocumentoSpesa;
	}

	/**
	 * @return the attributi
	 */
	public Map<TipologiaAttributo, Object> getAttributi() {
		return attributi;
	}

	/**
	 * @param attributi the attributi to set
	 */
	public void setAttributi(Map<TipologiaAttributo, Object> attributi) {
		this.attributi = attributi != null ? attributi : new EnumMap<TipologiaAttributo, Object>(TipologiaAttributo.class);
	}

	/**
	 * @return the siopeAssenzaMotivazione
	 */
	public SiopeAssenzaMotivazione getSiopeAssenzaMotivazione() {
		return siopeAssenzaMotivazione;
	}

	/**
	 * @param siopeAssenzaMotivazione the siopeAssenzaMotivazione to set
	 */
	public void setSiopeAssenzaMotivazione(SiopeAssenzaMotivazione siopeAssenzaMotivazione) {
		this.siopeAssenzaMotivazione = siopeAssenzaMotivazione;
	}

}
