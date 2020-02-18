/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.StatoOperativoPreDocumento;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaTotaliPredocumentiPerElencoResponse extends ServiceResponse {
	
	private ElencoDocumentiAllegato elencoDocumentiAllegato;

	private Map<StatoOperativoPreDocumento, Long> numeroPreDocumenti = new HashMap<StatoOperativoPreDocumento, Long>();
	private Map<StatoOperativoPreDocumento, BigDecimal> importiPreDocumenti = new HashMap<StatoOperativoPreDocumento, BigDecimal>();
	/**
	 * @return the numeroPreDocumenti
	 */
	public Map<StatoOperativoPreDocumento, Long> getNumeroPreDocumenti() {
		return numeroPreDocumenti;
	}
	/**
	 * @param numeroPreDocumenti the numeroPreDocumenti to set
	 */
	public void setNumeroPreDocumenti(Map<StatoOperativoPreDocumento, Long> numeroPreDocumenti) {
		this.numeroPreDocumenti = numeroPreDocumenti != null ? numeroPreDocumenti : new HashMap<StatoOperativoPreDocumento, Long>();
	}
	/**
	 * @return the importiPreDocumenti
	 */
	public Map<StatoOperativoPreDocumento, BigDecimal> getImportiPreDocumenti() {
		return importiPreDocumenti;
	}
	/**
	 * @param importiPreDocumenti the importiPreDocumenti to set
	 */
	public void setImportiPreDocumenti(Map<StatoOperativoPreDocumento, BigDecimal> importiPreDocumenti) {
		this.importiPreDocumenti = importiPreDocumenti != null ? importiPreDocumenti : new HashMap<StatoOperativoPreDocumento, BigDecimal>();
	}
	/**
	 * @return the elencoDocumentiAllegato
	 */
	public ElencoDocumentiAllegato getElencoDocumentiAllegato() {
		return elencoDocumentiAllegato;
	}
	/**
	 * @param elencoDocumentiAllegato the elencoDocumentiAllegato to set
	 */
	public void setElencoDocumentiAllegato(ElencoDocumentiAllegato elencoDocumentiAllegato) {
		this.elencoDocumentiAllegato = elencoDocumentiAllegato;
	}
}
