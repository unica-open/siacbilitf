/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * DettaglioPagamentoFEL
 * 
 * @author Valentina
 * 
 */
@XmlType(namespace = FELDataDictionary.NAMESPACE)
public class DettaglioPagamentoFEL extends EntitaEnte{
	
	private static final long serialVersionUID = 3424165084906212572L;
	
	
	private Integer progressivoDettaglio;
	private String beneficiario;
	private Integer giorniTerminiPagamento;
	private Date dataRifTerminiPagamento;
	private Date dataScadenzaPagamento;
	private BigDecimal importoPagamento;
	private String codiceUfficioPostale;
	private String cognomeQuietanzante;
	private String nomeQuietanzante;
	private String cfQuietanzante;
	private String titoloQuietanzante;
	private String istitutoFinanziario;
	private String iban;
	private String abi;
	private String cab;
	private String bic;
	private BigDecimal scontoPagamentoAnticipato;
	private Date dataLimitePagamentoAnt;
	private BigDecimal penalitaPagamentiRitardati;
	private Date dataDecorrenzaPenale;
	private String codicePagamento;
	
	private PagamentoFEL pagamento;
	private ModalitaPagamentoFEL modalitaPagamentoFEL;
	/**
	 * @return the progressivoDettaglio
	 */
	public Integer getProgressivoDettaglio() {
		return progressivoDettaglio;
	}
	/**
	 * @param progressivoDettaglio the progressivoDettaglio to set
	 */
	public void setProgressivoDettaglio(Integer progressivoDettaglio) {
		this.progressivoDettaglio = progressivoDettaglio;
	}
	/**
	 * @return the beneficiario
	 */
	public String getBeneficiario() {
		return beneficiario;
	}
	/**
	 * @param beneficiario the beneficiario to set
	 */
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	/**
	 * @return the giorniTerminiPagamento
	 */
	public Integer getGiorniTerminiPagamento() {
		return giorniTerminiPagamento;
	}
	/**
	 * @param giorniTerminiPagamento the giorniTerminiPagamento to set
	 */
	public void setGiorniTerminiPagamento(Integer giorniTerminiPagamento) {
		this.giorniTerminiPagamento = giorniTerminiPagamento;
	}
	/**
	 * @return the dataRifTerminiPagamento
	 */
	public Date getDataRifTerminiPagamento() {
		return dataRifTerminiPagamento;
	}
	/**
	 * @param dataRifTerminiPagamento the dataRifTerminiPagamento to set
	 */
	public void setDataRifTerminiPagamento(Date dataRifTerminiPagamento) {
		this.dataRifTerminiPagamento = dataRifTerminiPagamento;
	}
	/**
	 * @return the dataScadenzaPagamento
	 */
	public Date getDataScadenzaPagamento() {
		return dataScadenzaPagamento;
	}
	/**
	 * @param dataScadenzaPagamento the dataScadenzaPagamento to set
	 */
	public void setDataScadenzaPagamento(Date dataScadenzaPagamento) {
		this.dataScadenzaPagamento = dataScadenzaPagamento;
	}
	/**
	 * @return the importoPagamento
	 */
	public BigDecimal getImportoPagamento() {
		return importoPagamento;
	}
	/**
	 * @param importoPagamento the importoPagamento to set
	 */
	public void setImportoPagamento(BigDecimal importoPagamento) {
		this.importoPagamento = importoPagamento;
	}
	/**
	 * @return the codiceUfficioPostale
	 */
	public String getCodiceUfficioPostale() {
		return codiceUfficioPostale;
	}
	/**
	 * @param codiceUfficioPostale the codiceUfficioPostale to set
	 */
	public void setCodiceUfficioPostale(String codiceUfficioPostale) {
		this.codiceUfficioPostale = codiceUfficioPostale;
	}
	/**
	 * @return the cognomeQuietanzante
	 */
	public String getCognomeQuietanzante() {
		return cognomeQuietanzante;
	}
	/**
	 * @param cognomeQuietanzante the cognomeQuietanzante to set
	 */
	public void setCognomeQuietanzante(String cognomeQuietanzante) {
		this.cognomeQuietanzante = cognomeQuietanzante;
	}
	/**
	 * @return the nomeQuietanzante
	 */
	public String getNomeQuietanzante() {
		return nomeQuietanzante;
	}
	/**
	 * @param nomeQuietanzante the nomeQuietanzante to set
	 */
	public void setNomeQuietanzante(String nomeQuietanzante) {
		this.nomeQuietanzante = nomeQuietanzante;
	}
	/**
	 * @return the cfQuietanzante
	 */
	public String getCfQuietanzante() {
		return cfQuietanzante;
	}
	/**
	 * @param cfQuietanzante the cfQuietanzante to set
	 */
	public void setCfQuietanzante(String cfQuietanzante) {
		this.cfQuietanzante = cfQuietanzante;
	}
	/**
	 * @return the titoloQuietanzante
	 */
	public String getTitoloQuietanzante() {
		return titoloQuietanzante;
	}
	/**
	 * @param titoloQuietanzante the titoloQuietanzante to set
	 */
	public void setTitoloQuietanzante(String titoloQuietanzante) {
		this.titoloQuietanzante = titoloQuietanzante;
	}
	/**
	 * @return the istitutoFinanziario
	 */
	public String getIstitutoFinanziario() {
		return istitutoFinanziario;
	}
	/**
	 * @param istitutoFinanziario the istitutoFinanziario to set
	 */
	public void setIstitutoFinanziario(String istitutoFinanziario) {
		this.istitutoFinanziario = istitutoFinanziario;
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
	 * @return the scontoPagamentoAnticipato
	 */
	public BigDecimal getScontoPagamentoAnticipato() {
		return scontoPagamentoAnticipato;
	}
	/**
	 * @param scontoPagamentoAnticipato the scontoPagamentoAnticipato to set
	 */
	public void setScontoPagamentoAnticipato(BigDecimal scontoPagamentoAnticipato) {
		this.scontoPagamentoAnticipato = scontoPagamentoAnticipato;
	}
	/**
	 * @return the dataLimitePagamentoAnt
	 */
	public Date getDataLimitePagamentoAnt() {
		return dataLimitePagamentoAnt;
	}
	/**
	 * @param dataLimitePagamentoAnt the dataLimitePagamentoAnt to set
	 */
	public void setDataLimitePagamentoAnt(Date dataLimitePagamentoAnt) {
		this.dataLimitePagamentoAnt = dataLimitePagamentoAnt;
	}
	/**
	 * @return the penalitaPagamentiRitardati
	 */
	public BigDecimal getPenalitaPagamentiRitardati() {
		return penalitaPagamentiRitardati;
	}
	/**
	 * @param penalitaPagamentiRitardati the penalitaPagamentiRitardati to set
	 */
	public void setPenalitaPagamentiRitardati(BigDecimal penalitaPagamentiRitardati) {
		this.penalitaPagamentiRitardati = penalitaPagamentiRitardati;
	}
	/**
	 * @return the dataDecorrenzaPenale
	 */
	public Date getDataDecorrenzaPenale() {
		return dataDecorrenzaPenale;
	}
	/**
	 * @param dataDecorrenzaPenale the dataDecorrenzaPenale to set
	 */
	public void setDataDecorrenzaPenale(Date dataDecorrenzaPenale) {
		this.dataDecorrenzaPenale = dataDecorrenzaPenale;
	}
	/**
	 * @return the codicePagamento
	 */
	public String getCodicePagamento() {
		return codicePagamento;
	}
	/**
	 * @param codicePagamento the codicePagamento to set
	 */
	public void setCodicePagamento(String codicePagamento) {
		this.codicePagamento = codicePagamento;
	}
	/**
	 * @return the pagamento
	 */
	public PagamentoFEL getPagamento() {
		return pagamento;
	}
	/**
	 * @param pagamento the pagamento to set
	 */
	public void setPagamento(PagamentoFEL pagamento) {
		this.pagamento = pagamento;
	}
	/**
	 * @return the modalitaPagamentoFEL
	 */
	public ModalitaPagamentoFEL getModalitaPagamentoFEL() {
		return modalitaPagamentoFEL;
	}
	/**
	 * @param modalitaPagamentoFEL the modalitaPagamentoFEL to set
	 */
	public void setModalitaPagamentoFEL(ModalitaPagamentoFEL modalitaPagamentoFEL) {
		this.modalitaPagamentoFEL = modalitaPagamentoFEL;
	}
	
	
	
	
	
}
