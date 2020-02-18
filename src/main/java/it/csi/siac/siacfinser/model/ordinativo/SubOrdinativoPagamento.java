/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ordinativo;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SubOrdinativoPagamento extends SubOrdinativo {

	private static final long serialVersionUID = 1L;

	private Liquidazione liquidazione;

	private SubdocumentoSpesa subDocumentoSpesa;
	
	private OrdinativoPagamento ordinativoPagamento;

	/**
	 * @return the subDocumentoSpesa
	 */
	public SubdocumentoSpesa getSubDocumentoSpesa() {
		return subDocumentoSpesa;
	}

	/**
	 * @param subDocumentoSpesa
	 *            the subDocumentoSpesa to set
	 */
	public void setSubDocumentoSpesa(SubdocumentoSpesa subDocumentoSpesa) {
		this.subDocumentoSpesa = subDocumentoSpesa;
	}

	public Liquidazione getLiquidazione() {
		return liquidazione;
	}

	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}

	private Date dataEsecuzionePagamento;

	@XmlSchemaType(name = "dateTime")
	public Date getDataEsecuzionePagamento() {
		return dataEsecuzionePagamento;
	}

	public void setDataEsecuzionePagamento(Date dataEsecuzionePagamento) {
		this.dataEsecuzionePagamento = dataEsecuzionePagamento;
	}

	public OrdinativoPagamento getOrdinativoPagamento() {
		return ordinativoPagamento;
	}

	public void setOrdinativoPagamento(OrdinativoPagamento ordinativoPagamento) {
		this.ordinativoPagamento = ordinativoPagamento;
	}

}
