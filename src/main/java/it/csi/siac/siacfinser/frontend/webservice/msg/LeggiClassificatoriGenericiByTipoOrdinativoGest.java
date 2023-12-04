/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Messaggio di richiesta per la lista dei classificatori per: anno
 * idEnteProprietario e codiceMovimentoGestione
 * 
 * 
 * @author fb
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class LeggiClassificatoriGenericiByTipoOrdinativoGest extends ServiceRequest {

	private int anno;
	private int idEnteProprietario;
	private String codiceTipoOrdinativoGestione;

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
	public String getCodiceTipoOrdinativoGestione() {
		return codiceTipoOrdinativoGestione;
	}
	public void setCodiceTipoOrdinativoGestione(String codiceTipoOrdinativoGestione) {
		this.codiceTipoOrdinativoGestione = codiceTipoOrdinativoGestione;
	}
}
