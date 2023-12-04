/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaPreDocumentoEntrataResponse extends RicercaSinteticaBaseResponse<PreDocumentoEntrata> {
	
	
	@XmlElementWrapper(name = "listaPreDocumentiEntrata")
	@XmlElement(name = "preDocumentoEntrata")
	private ListaPaginata<PreDocumentoEntrata> preDocumenti = new ListaPaginataImpl<PreDocumentoEntrata>();
	
	private BigDecimal importoTotale;
	
	//SIAC-6780
	private boolean fromCompletaDefinisci = Boolean.FALSE;

	/**
	 * @return the pre documenti
	 */
	@XmlTransient
	public ListaPaginata<PreDocumentoEntrata> getPreDocumenti() {
		return preDocumenti;
	}

	/**
	 * @param preDocumenti the pre documenti to set
	 */
	public void setPreDocumenti(ListaPaginata<PreDocumentoEntrata> preDocumenti) {
		this.preDocumenti = preDocumenti;
	}

	/**
	 * @return the importoTotale
	 */
	public BigDecimal getImportoTotale() {
		return importoTotale;
	}

	/**
	 * @param importoTotale the importoTotale to set
	 */
	public void setImportoTotale(BigDecimal importoTotale) {
		this.importoTotale = importoTotale;
	}
	
	@Override
	protected ListaPaginataImpl<PreDocumentoEntrata> getAsListaPaginata() {
		return (ListaPaginataImpl<PreDocumentoEntrata>) getPreDocumenti();
	}

	/**
	 * @return the fromCompletaDefinisci
	 */
	public boolean isFromCompletaDefinisci() {
		return fromCompletaDefinisci;
	}

	/**
	 * @param fromCompletaDefinisci the fromCompletaDefinisci to set
	 */
	public void setFromCompletaDefinisci(boolean fromCompletaDefinisci) {
		this.fromCompletaDefinisci = fromCompletaDefinisci;
	}

}
