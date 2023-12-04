/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.RichiestaEconomale;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaRichiestaEconomale extends RicercaSinteticaBaseRequest {
	
	private RichiestaEconomale richiestaEconomale;
	
	// SIAC-4497
	private Date dataCreazioneDa;
	private Date dataCreazioneA;
	
	// SIAC-4552
	private Date dataMovimentoDa;
	private Date dataMovimentoA;

	public RichiestaEconomale getRichiestaEconomale() {
		return richiestaEconomale;
	}

	public void setRichiestaEconomale(RichiestaEconomale richiestaEconomale) {
		this.richiestaEconomale = richiestaEconomale;
	}

	/**
	 * @return the dataCreazioneDa
	 */
	public Date getDataCreazioneDa() {
		return dataCreazioneDa;
	}

	/**
	 * @param dataCreazioneDa the dataCreazioneDa to set
	 */
	public void setDataCreazioneDa(Date dataCreazioneDa) {
		this.dataCreazioneDa = dataCreazioneDa;
	}

	/**
	 * @return the dataCreazioneA
	 */
	public Date getDataCreazioneA() {
		return dataCreazioneA;
	}

	/**
	 * @param dataCreazioneA the dataCreazioneA to set
	 */
	public void setDataCreazioneA(Date dataCreazioneA) {
		this.dataCreazioneA = dataCreazioneA;
	}

	/**
	 * @return the dataMovimentoDa
	 */
	public Date getDataMovimentoDa() {
		return dataMovimentoDa;
	}

	/**
	 * @param dataMovimentoDa the dataMovimentoDa to set
	 */
	public void setDataMovimentoDa(Date dataMovimentoDa) {
		this.dataMovimentoDa = dataMovimentoDa;
	}

	/**
	 * @return the dataMovimentoA
	 */
	public Date getDataMovimentoA() {
		return dataMovimentoA;
	}

	/**
	 * @param dataMovimentoA the dataMovimentoA to set
	 */
	public void setDataMovimentoA(Date dataMovimentoA) {
		this.dataMovimentoA = dataMovimentoA;
	}
	

}
