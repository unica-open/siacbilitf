/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * Pagamento
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class PagamentoFEL extends Entita{
	
	private static final long serialVersionUID = -6720672099871505845L;
	
	private Ente ente;
	
	private Integer progressivo;
	private String condizioniPagamento;
	
	private FatturaFEL fattura;
	
	@XmlElementWrapper(name = "listaDettaglioPagamento")
	@XmlElement(name = "dettaglioPagamentoFEL")
	private List<DettaglioPagamentoFEL> elencoDettagliPagamento = new ArrayList<DettaglioPagamentoFEL>();
	
	/**
	 * @return the progressivo
	 */
	public Integer getProgressivo() {
		return progressivo;
	}
	/**
	 * @param progressivo the progressivo to set
	 */
	public void setProgressivo(Integer progressivo) {
		this.progressivo = progressivo;
	}
	/**
	 * @return the condizioniPagamento
	 */
	public String getCondizioniPagamento() {
		return condizioniPagamento;
	}
	/**
	 * @param condizioniPagamento the condizioniPagamento to set
	 */
	public void setCondizioniPagamento(String condizioniPagamento) {
		this.condizioniPagamento = condizioniPagamento;
	}
	/**
	 * @return the fattura
	 */
	public FatturaFEL getFattura() {
		return fattura;
	}
	/**
	 * @param fattura the fattura to set
	 */
	public void setFattura(FatturaFEL fattura) {
		this.fattura = fattura;
	}
	/**
	 * @return the elencoDettagliPagamento
	 */
	@XmlTransient
	public List<DettaglioPagamentoFEL> getElencoDettagliPagamento() {
		return elencoDettagliPagamento;
	}
	/**
	 * @param elencoDettagliPagamento the elencoDettagliPagamento to set
	 */
	public void setElencoDettagliPagamento(
			List<DettaglioPagamentoFEL> elencoDettagliPagamento) {
		this.elencoDettagliPagamento = elencoDettagliPagamento;
	}
	
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
}
