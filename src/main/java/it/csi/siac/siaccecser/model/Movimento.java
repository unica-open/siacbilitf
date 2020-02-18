/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;


import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;


@XmlType(namespace = CECDataDictionary.NAMESPACE)
public class Movimento extends Entita {

	private static final long serialVersionUID = -2402844101382149692L;
	
	private Ente ente;
	
	private Integer numeroMovimento;
	private Date dataMovimento;
	
	private String abi;
	private String assegnoNumero;
	private String bic;
	private String cab;
	private String cin;
	private String contoCorrente;
	private String contoCorrenteIntestazione;
	private String iban;
	private String dettaglioPagamento;
	
	private RichiestaEconomale richiestaEconomale;
	private RendicontoRichiesta rendicontoRichiesta;
	
	private ModalitaPagamentoCassa modalitaPagamentoCassa;
	
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	private ModalitaPagamentoDipendente modalitaPagamentoDipendente;
	
//	private TipoAccredito tipoAccredito;
//	private ModalitaAccreditoCassaEconomale tipoAccreditoCassaEconomale;

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
	/**
	 * @return the numeroMovimento
	 */
	public Integer getNumeroMovimento() {
		return numeroMovimento;
	}
	/**
	 * @param numeroMovimento the numeroMovimento to set
	 */
	public void setNumeroMovimento(Integer numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}
	/**
	 * @return the dataMovimento
	 */
	public Date getDataMovimento() {
		return dataMovimento;
	}
	/**
	 * @param dataMovimento the dataMovimento to set
	 */
	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}
	/**
	 * @return the abi
	 */
	public String getAbi() {
		return abi;
	}
	/**
	 * @param abi the abi to set
	 */
	public void setAbi(String abi) {
		this.abi = abi;
	}
	/**
	 * @return the assegnoNumero
	 */
	public String getAssegnoNumero() {
		return assegnoNumero;
	}
	/**
	 * @param assegnoNumero the assegnoNumero to set
	 */
	public void setAssegnoNumero(String assegnoNumero) {
		this.assegnoNumero = assegnoNumero;
	}
	/**
	 * @return the bic
	 */
	public String getBic() {
		return bic;
	}
	/**
	 * @param bic the bic to set
	 */
	public void setBic(String bic) {
		this.bic = bic;
	}
	/**
	 * @return the cab
	 */
	public String getCab() {
		return cab;
	}
	/**
	 * @param cab the cab to set
	 */
	public void setCab(String cab) {
		this.cab = cab;
	}
	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	/**
	 * @return the contoCorrente
	 */
	public String getContoCorrente() {
		return contoCorrente;
	}
	/**
	 * @param contoCorrente the contoCorrente to set
	 */
	public void setContoCorrente(String contoCorrente) {
		this.contoCorrente = contoCorrente;
	}
	/**
	 * @return the contoCorrenteIntestazione
	 */
	public String getContoCorrenteIntestazione() {
		return contoCorrenteIntestazione;
	}
	/**
	 * @param contoCorrenteIntestazione the contoCorrenteIntestazione to set
	 */
	public void setContoCorrenteIntestazione(String contoCorrenteIntestazione) {
		this.contoCorrenteIntestazione = contoCorrenteIntestazione;
	}
	/**
	 * @return the iban
	 */
	public String getIban() {
		return iban;
	}
	/**
	 * @param iban the iban to set
	 */
	public void setIban(String iban) {
		this.iban = iban;
	}
	/**
	 * @return the dettaglioPagamento
	 */
	public String getDettaglioPagamento() {
		return dettaglioPagamento;
	}
	/**
	 * @param dettaglioPagamento the dettaglioPagamento to set
	 */
	public void setDettaglioPagamento(String dettaglioPagamento) {
		this.dettaglioPagamento = dettaglioPagamento;
	}
	/**
	 * @return the richiestaEconomale
	 */
	public RichiestaEconomale getRichiestaEconomale() {
		return richiestaEconomale;
	}
	/**
	 * @param richiestaEconomale the richiestaEconomale to set
	 */
	public void setRichiestaEconomale(RichiestaEconomale richiestaEconomale) {
		this.richiestaEconomale = richiestaEconomale;
	}
	/**
	 * @return the rendicontoRichiesta
	 */
	public RendicontoRichiesta getRendicontoRichiesta() {
		return rendicontoRichiesta;
	}
	/**
	 * @param rendicontoRichiesta the rendicontoRichiesta to set
	 */
	public void setRendicontoRichiesta(RendicontoRichiesta rendicontoRichiesta) {
		this.rendicontoRichiesta = rendicontoRichiesta;
	}
	/**
	 * @return the modalitaPagamentoSoggetto
	 */
	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}
	/**
	 * @param modalitaPagamentoSoggetto the modalitaPagamentoSoggetto to set
	 */
	public void setModalitaPagamentoSoggetto(
			ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}
	/**
	 * @return the modalitaPagamentoCassa
	 */
	public ModalitaPagamentoCassa getModalitaPagamentoCassa() {
		return modalitaPagamentoCassa;
	}
	/**
	 * @param modalitaPagamentoCassa the modalitaPagamentoCassa to set
	 */
	public void setModalitaPagamentoCassa(
			ModalitaPagamentoCassa modalitaPagamentoCassa) {
		this.modalitaPagamentoCassa = modalitaPagamentoCassa;
	}
	/**
	 * @return the modalitaPagamentoDipendente
	 */
	public ModalitaPagamentoDipendente getModalitaPagamentoDipendente() {
		return modalitaPagamentoDipendente;
	}
	/**
	 * @param modalitaPagamentoDipendente the modalitaPagamentoDipendente to set
	 */
	public void setModalitaPagamentoDipendente(ModalitaPagamentoDipendente modalitaPagamentoDipendente) {
		this.modalitaPagamentoDipendente = modalitaPagamentoDipendente;
	}

	
	
	
	
}