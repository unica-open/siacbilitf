/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto.sedesecondaria;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.soggetto.Contatto;
import it.csi.siac.siacfinser.model.soggetto.IndirizzoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
/**
 * Le sedi secondarie si comportano come un Soggetto; ad esse verranno associati degli stati tramite il parametro StatoOperativoSedeSecondaria.
 * All'interno di delle sedi secondarie sono presenti le liste degli indirizzi ("indirizzoSoggetto")  e delle modalit&agrave; di 
 * pagamento("modalitaPagamentoSoggettos"), del soggetto al quale fanno riferimento.
 * 
 * @author andrea.colombo
 *
 */
public class SedeSecondariaSoggetto extends EntitaEnte {
	
	private static final long serialVersionUID = -6429611277949190619L;

	private String denominazione;
	
	private Date dataAnnullamento;
	private Date dataBlocco;
	private Date dataProvvisorio;
	private Date dataValidita;
	private Date dataModifica;
	private String utenteCancellazione;
	private String utenteCreazione;
	private String utenteModifica;
	private String utentePropostaModifica;
	
	private boolean inviareAvviso;
	
	private List<IndirizzoSoggetto> indirizzoSoggetto;
	private IndirizzoSoggetto indirizzoSoggettoPrincipale;
	private List<Contatto> contatti;
	private List<ModalitaPagamentoSoggetto> modalitaPagamentoSoggettos;
	
	private StatoOperativoSedeSecondaria statoOperativoSedeSecondaria;
	private String descrizioneStatoOperativoSedeSecondaria;
	private Integer idStatoOperativoSedeSecondaria;
	private Date dataStatoCorrente; 
	private boolean inModifica;
	
	// SIAC-7568
	private String codDestinatario;

	/**
	 * Valori possibili :PROVVISORIO,VALIDO, ANNULLATO, BLOCCATO, SOSPESO, IN_MODIFICA.
	 * @author andrea.colombo
	 *
	 */
	@XmlType(namespace = FINDataDictionary.NAMESPACE)
	public enum StatoOperativoSedeSecondaria{
		PROVVISORIO,VALIDO, ANNULLATO, BLOCCATO, SOSPESO, IN_MODIFICA
	}
	private String codiceSedeSecondaria;
	
	private boolean modificato = false;

	//private List<Contatto>	
	
	
	@XmlSchemaType(name = "dateTime")
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataBlocco() {
		return dataBlocco;
	}

	public void setDataBlocco(Date dataBlocco) {
		this.dataBlocco = dataBlocco;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataProvvisorio() {
		return dataProvvisorio;
	}

	public void setDataProvvisorio(Date dataProvvisorio) {
		this.dataProvvisorio = dataProvvisorio;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataValidita() {
		return dataValidita;
	}

	public void setDataValidita(Date dataValidita) {
		this.dataValidita = dataValidita;
	}

	public String getUtenteCancellazione() {
		return utenteCancellazione;
	}

	public void setUtenteCancellazione(String utenteCancellazione) {
		this.utenteCancellazione = utenteCancellazione;
	}

	public String getUtenteCreazione() {
		return utenteCreazione;
	}

	public void setUtenteCreazione(String utenteCreazione) {
		this.utenteCreazione = utenteCreazione;
	}

	public String getUtenteModifica() {
		return utenteModifica;
	}

	public void setUtenteModifica(String utenteModifica) {
		this.utenteModifica = utenteModifica;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataStatoCorrente() {
		return dataStatoCorrente;
	}

	public void setDataStatoCorrente(Date dataStatoCorrente) {
		this.dataStatoCorrente = dataStatoCorrente;
	}

	public boolean isInModifica() {
		return inModifica;
	}

	public void setInModifica(boolean inModifica) {
		this.inModifica = inModifica;
	}

	public boolean isInviareAvviso() {
		return inviareAvviso;
	}

	public void setInviareAvviso(boolean inviareAvviso) {
		this.inviareAvviso = inviareAvviso;
	}

	public String getUtentePropostaModifica() {
		return utentePropostaModifica;
	}

	public void setUtentePropostaModifica(String utentePropostaModifica) {
		this.utentePropostaModifica = utentePropostaModifica;
	}

	public String getDenominazione() {
		return denominazione;
	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;
	}
	
	public List<IndirizzoSoggetto> getIndirizzoSoggetto() {
		return indirizzoSoggetto;
	}

	public void setIndirizzoSoggetto(List<IndirizzoSoggetto> indirizzoSoggetto) {
		this.indirizzoSoggetto = indirizzoSoggetto;
	}

	public List<Contatto> getContatti() {
		return contatti;
	}

	public void setContatti(List<Contatto> contatti) {
		this.contatti = contatti;
	}

	public List<ModalitaPagamentoSoggetto> getModalitaPagamentoSoggettos() {
		return modalitaPagamentoSoggettos;
	}

	public void setModalitaPagamentoSoggettos(
			List<ModalitaPagamentoSoggetto> modalitaPagamentoSoggettos) {
		this.modalitaPagamentoSoggettos = modalitaPagamentoSoggettos;
	}

	public StatoOperativoSedeSecondaria getStatoOperativoSedeSecondaria() {
		return statoOperativoSedeSecondaria;
	}

	public void setStatoOperativoSedeSecondaria(
			StatoOperativoSedeSecondaria statoOperativoSedeSecondaria) {
		this.statoOperativoSedeSecondaria = statoOperativoSedeSecondaria;
	}

	public IndirizzoSoggetto getIndirizzoSoggettoPrincipale() {
		return indirizzoSoggettoPrincipale;
	}

	public void setIndirizzoSoggettoPrincipale(
			IndirizzoSoggetto indirizzoSoggettoPrincipale) {
		this.indirizzoSoggettoPrincipale = indirizzoSoggettoPrincipale;
	}

	public String getDescrizioneStatoOperativoSedeSecondaria() {
		return descrizioneStatoOperativoSedeSecondaria;
	}

	public void setDescrizioneStatoOperativoSedeSecondaria(
			String descrizioneStatoOperativoSedeSecondaria) {
		this.descrizioneStatoOperativoSedeSecondaria = descrizioneStatoOperativoSedeSecondaria;
	}

	public Integer getIdStatoOperativoSedeSecondaria() {
		return idStatoOperativoSedeSecondaria;
	}

	public void setIdStatoOperativoSedeSecondaria(
			Integer idStatoOperativoSedeSecondaria) {
		this.idStatoOperativoSedeSecondaria = idStatoOperativoSedeSecondaria;
	}

	public String getCodiceSedeSecondaria() {
		return codiceSedeSecondaria;
	}

	public void setCodiceSedeSecondaria(String codiceSedeSecondaria) {
		this.codiceSedeSecondaria = codiceSedeSecondaria;
	}

	public boolean isModificato() {
		return modificato;
	}

	public void setModificato(boolean modificato) {
		this.modificato = modificato;
	}

	@XmlSchemaType(name = "dateTime")
	public Date getDataModifica() {
		return dataModifica;
	}

	public void setDataModifica(Date dataModifica) {
		this.dataModifica = dataModifica;
	}

	public String getCodDestinatario() {
		return codDestinatario;
	}

	public void setCodDestinatario(String codDestinatario) {
		this.codDestinatario = codDestinatario;
	}

}
