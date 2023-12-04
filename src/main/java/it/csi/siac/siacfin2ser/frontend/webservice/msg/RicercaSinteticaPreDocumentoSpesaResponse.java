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
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaSinteticaPreDocumentoSpesaResponse extends RicercaSinteticaBaseResponse<PreDocumentoSpesa> {
	
	
	@XmlElementWrapper(name = "listaPreDocumentiSpesa")
	@XmlElement(name = "preDocumentoSpesa")
	private ListaPaginata<PreDocumentoSpesa> preDocumenti = new ListaPaginataImpl<PreDocumentoSpesa>();
	
	private BigDecimal importoTotale;

	/**
	 * @return the pre documenti
	 */
	@XmlTransient
	public ListaPaginata<PreDocumentoSpesa> getPreDocumenti() {
		return preDocumenti;
	}

	/**
	 * @param listaPreDocumentoSpesa the pre documenti to set
	 */
	public void setPreDocumenti( ListaPaginata<PreDocumentoSpesa> listaPreDocumentoSpesa) {
		this.preDocumenti = listaPreDocumentoSpesa;
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
	protected ListaPaginataImpl<PreDocumentoSpesa> getAsListaPaginata() {
		return (ListaPaginataImpl<PreDocumentoSpesa>) getPreDocumenti();
	}


	
	

}
