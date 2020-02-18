/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

/**
 * Request per l'aggiornamento della data di trasmissione per il predocumento di entrata
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaDataTrasmissionePreDocumentoEntrata extends ServiceRequest {
	
	@XmlElementWrapper(name="preDocumentiEntrata")
	@XmlElement(name="preDocumentoEntrata")
	private List<PreDocumentoEntrata> preDocumentiEntrata = new ArrayList<PreDocumentoEntrata>();
	private RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata;
	private Date dataTrasmissione;
	/**
	 * @return the preDocumentiEntrata
	 */
	@XmlTransient
	public List<PreDocumentoEntrata> getPreDocumentiEntrata() {
		return preDocumentiEntrata;
	}
	/**
	 * @param preDocumentiEntrata the preDocumentiEntrata to set
	 */
	public void setPreDocumentiEntrata(List<PreDocumentoEntrata> preDocumentiEntrata) {
		this.preDocumentiEntrata = preDocumentiEntrata;
	}
	/**
	 * @return the ricercaSinteticaPreDocumentoEntrata
	 */
	public RicercaSinteticaPreDocumentoEntrata getRicercaSinteticaPreDocumentoEntrata() {
		return ricercaSinteticaPreDocumentoEntrata;
	}
	/**
	 * @param ricercaSinteticaPreDocumentoEntrata the ricercaSinteticaPreDocumentoEntrata to set
	 */
	public void setRicercaSinteticaPreDocumentoEntrata(
			RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata) {
		this.ricercaSinteticaPreDocumentoEntrata = ricercaSinteticaPreDocumentoEntrata;
	}
	/**
	 * @return the dataTrasmissione
	 */
	public Date getDataTrasmissione() {
		return dataTrasmissione;
	}
	/**
	 * @param dataTrasmissione the dataTrasmissione to set
	 */
	public void setDataTrasmissione(Date dataTrasmissione) {
		this.dataTrasmissione = dataTrasmissione;
	}

}
