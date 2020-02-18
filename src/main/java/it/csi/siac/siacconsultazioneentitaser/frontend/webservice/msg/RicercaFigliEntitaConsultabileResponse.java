/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.ConsultazioneEntitaSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.model.EntitaConsultabile;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;
/**
 * Classe di response della ricerca sintetica entita consultabili (cruscottino)
 * 
 * @author Elisa Chiari
 * @version 1.0.0 - 08/03/2016
 * 
 */

@XmlType(namespace = ConsultazioneEntitaSvcDictionary.NAMESPACE)
public class RicercaFigliEntitaConsultabileResponse extends RicercaSinteticaBaseResponse<EntitaConsultabile> {

	private ListaPaginata<EntitaConsultabile> entitaConsultabili = new ListaPaginataImpl<EntitaConsultabile>();
	private BigDecimal importoEntitaConsultabili;

	
	/**
	 * @return the elencoEntitaConsultabili
	 */
	public ListaPaginata<EntitaConsultabile> getEntitaConsultabili() {
		return entitaConsultabili;
	}

	/**
	 * @param elencoEntitaConsultabili the elencoEntitaConsultabili to set
	 */
	public void setEntitaConsultabili(ListaPaginata<EntitaConsultabile> entitaConsultabili) {
		this.entitaConsultabili = entitaConsultabili != null ? entitaConsultabili : new ListaPaginataImpl<EntitaConsultabile>();
	}

	
	/**
	 * @return the importoEntitaConsultabili
	 */
	public BigDecimal getImportoEntitaConsultabili() {
		return this.importoEntitaConsultabili;
	}

	/**
	 * @param importoEntitaConsultabili the importoEntitaConsultabili to set
	 */
	public void setImportoEntitaConsultabili(BigDecimal importoEntitaConsultabili) {
		this.importoEntitaConsultabili = importoEntitaConsultabili;
	}

	@Override
	protected ListaPaginataImpl<EntitaConsultabile> getAsListaPaginata() {
		return (ListaPaginataImpl<EntitaConsultabile>) entitaConsultabili;
	}
	
}
