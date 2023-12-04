/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.TotaliAnnoDiEsercizio;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo
 * BIL.CapitoloService.calcolaTotaliStanziamentiDiPrevisioneResponse()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class CalcolaTotaliStanziamentiDiPrevisioneResponse extends
		ServiceResponse {

	private TotaliAnnoDiEsercizio totaliAnnoEsercizioPassato;
	private TotaliAnnoDiEsercizio totaliAnnoEsercizioAttuale;
	private TotaliAnnoDiEsercizio totaliAnnoEsercizioSuccessivo;

	public TotaliAnnoDiEsercizio getTotaliAnnoEsercizioPassato() {
		return totaliAnnoEsercizioPassato;
	}

	public void setTotaliAnnoEsercizioPassato(
			TotaliAnnoDiEsercizio totaliAnnoEsercizioPassato) {
		this.totaliAnnoEsercizioPassato = totaliAnnoEsercizioPassato;
	}

	public TotaliAnnoDiEsercizio getTotaliAnnoEsercizioAttuale() {
		return totaliAnnoEsercizioAttuale;
	}

	public void setTotaliAnnoEsercizioAttuale(
			TotaliAnnoDiEsercizio totaliAnnoEsercizioAttuale) {
		this.totaliAnnoEsercizioAttuale = totaliAnnoEsercizioAttuale;
	}

	public TotaliAnnoDiEsercizio getTotaliAnnoEsercizioSuccessivo() {
		return totaliAnnoEsercizioSuccessivo;
	}

	public void setTotaliAnnoEsercizioSuccessivo(
			TotaliAnnoDiEsercizio totaliAnnoEsercizioSuccessivo) {
		this.totaliAnnoEsercizioSuccessivo = totaliAnnoEsercizioSuccessivo;
	}

}
