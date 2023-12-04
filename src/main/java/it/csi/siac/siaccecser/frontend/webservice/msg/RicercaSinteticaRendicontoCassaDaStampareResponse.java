/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseResponse;
import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.Movimento;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginataImpl;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaRendicontoCassaDaStampareResponse extends RicercaSinteticaBaseResponse<Movimento> {
	
	@XmlElementWrapper(name="movimenti")
	@XmlElement(name="movimento")
	private ListaPaginata<Movimento> listaMovimenti = new ListaPaginataImpl<Movimento>();
	private BigDecimal importoTotale;
	private Integer numeroOperazioniDiCassa = Integer.valueOf(0);
	//SIAC-6450
	private BigDecimal importoTotaleSenzaMovimentiAnnullati;
	
	/**
	 * @return the listaMovimenti
	 */
	@XmlTransient
	public ListaPaginata<Movimento> getListaMovimenti() {
		return listaMovimenti;
	}

	/**
	 * @param listaMovimenti the listaMovimenti to set
	 */
	public void setListaMovimenti(ListaPaginata<Movimento> listaMovimenti) {
		this.listaMovimenti = listaMovimenti;
	}

	@Override
	protected ListaPaginataImpl<Movimento> getAsListaPaginata() {
		return (ListaPaginataImpl<Movimento>) listaMovimenti;
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

	/**
	 * @return the numeroOperazioniDiCassa
	 */
	public Integer getNumeroOperazioniDiCassa() {
		return numeroOperazioniDiCassa;
	}

	/**
	 * @param numeroOperazioniDiCassa the numeroOperazioniDiCassa to set
	 */
	public void setNumeroOperazioniDiCassa(Integer value) {
		numeroOperazioniDiCassa = value;
	}

	/**
	 * @return the importoTotaleSenzaMovimentiAnnullati
	 */
	public BigDecimal getImportoTotaleSenzaMovimentiAnnullati() {
		return importoTotaleSenzaMovimentiAnnullati;
	}

	/**
	 * @param importoTotaleSenzaMovimentiAnnullati the importoTotaleSenzaMovimentiAnnullati to set
	 */
	public void setImportoTotaleSenzaMovimentiAnnullati(BigDecimal importoTotaleSenzaMovimentiAnnullati) {
		this.importoTotaleSenzaMovimentiAnnullati = importoTotaleSenzaMovimentiAnnullati;
	}
	
}
