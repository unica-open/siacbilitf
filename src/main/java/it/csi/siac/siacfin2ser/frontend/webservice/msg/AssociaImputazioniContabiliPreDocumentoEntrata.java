/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaImputazioniContabiliPreDocumentoEntrata extends AsyncServiceRequest {
	
	private List<PreDocumentoEntrata> preDocumentiEntrata = new ArrayList<PreDocumentoEntrata>();
	
	private RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata;
	
	private Bilancio bilancio;
	
	private boolean gestisciModificaImportoAccertamento = false; 

	/**
	 * @return the preDocumentiEntrata
	 */
	public List<PreDocumentoEntrata> getPreDocumentiEntrata() {
		return preDocumentiEntrata;
	}

	/**
	 * @param preDocumentiEntrata the preDocumentiEntrata to set
	 */
	public void setPreDocumentiEntrata(List<PreDocumentoEntrata> preDocumentiSpesa) {
		this.preDocumentiEntrata = preDocumentiSpesa;
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
	public void setRicercaSinteticaPreDocumentoEntrata(RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata) {
		this.ricercaSinteticaPreDocumentoEntrata = ricercaSinteticaPreDocumentoEntrata;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public boolean isGestisciModificaImportoAccertamento() {
		return gestisciModificaImportoAccertamento;
	}

	public void setGestisciModificaImportoAccertamento(boolean gestisciModificaImportoAccertamento) {
		this.gestisciModificaImportoAccertamento = gestisciModificaImportoAccertamento;
	}
	
	
	
	

	

}
