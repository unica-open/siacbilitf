/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import javax.xml.bind.annotation.XmlType;

/**
 * Codifica per il Tipo di Documento.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class TipoDocumento extends Codifica {
	
	private static final long serialVersionUID = -7600200935355647165L;
		
	//Indica se il tipo di documento supporta le Ritenute
	private Boolean flagRitenute;
	//Indica se il tipo di documento supporta la NotaCredito
	private Boolean flagNotaCredito;
	//Indica se il tipo di documento supporta Penali o Altro
	private Boolean flagPenaleAltro;
	//Indica se il tipo di documento supporta la SpesaCollegata
	private Boolean flagSpesaCollegata;
	//Indica se il tipo di documento supporta il flagIVA
	private Boolean flagIVA;
	//Indica se il tipo di documento supporta il Subordinato
	private Boolean flagSubordinato;
	//Indica se il tipo di documento supporta la Regolarizzazione
	private Boolean flagRegolarizzazione;
	//Indica se il tipo di documento supporta l'integrazione con la Contabilita Generale
	private Boolean flagAttivaGEN;
	//Indica se il tipo di documento supporta l'aggiornamento delle quote dal carica Docuementi (ElaboraFileDocumentiService)
	private Boolean flagAggiornaQuoteDaElenco;
	private Boolean flagSenzaNumero;
	private Boolean flagComunicaPCC;            
	// SIAC-4748
	private Boolean flagRegistroUnico;
	
	private String codiceGruppo;
	private TipoFamigliaDocumento tipoFamigliaDocumento;
	
	//SIAC-6677
	private Boolean flagNumerazioneAutomaticaDaIVA;
	
	
	

	/**
	 * 
	 * @return true se il documento è una nota di credito
	 */
	public boolean isNotaCredito(){
		return TipoGruppoDocumento.NOTA_DI_CREDITO.getCodice().equals(codiceGruppo);
	}
	
	/**
	 * 
	 * @return true se il documento è una fattura
	 */
	public boolean isFattura(){
		return TipoGruppoDocumento.FATTURA.getCodice().equals(codiceGruppo);
	}
	
	/**
	 * 
	 * @return true se il documento è di tipo Carta Contabile
	 */
	public boolean isCartaContabile(){
		return "CCN".equals(getCodice());
	}
	
	/**
	 * 
	 * @return true se il documento è di tipo Disposizione di Pagamento
	 */
	public boolean isDisposizioneDiPagamento(){
		return "DSP".equals(getCodice());
	}
	
	/**
	 * 
	 * @return true se il documento è di tipo Disposizione di Incasso
	 */
	public boolean isDisposizioneDiIncasso(){
		return "DSI".equals(getCodice());
	}
	
	/**
	 *
	 * @return true, se il documeto è di tipo Allegato Atto
	 */
	public boolean isAllegatoAtto(){
		return "ALG".equals(getCodice());
	}
	
	/**
	 * 
	 * Indica se il tipo di documento supporta le Ritenute
	 * 
	 * @return the flagRitenute
	 */
	public Boolean getFlagRitenute() {
		return flagRitenute;
	}
	
	/**
	 * @param flagRitenute the flagRitenute to set
	 */
	public void setFlagRitenute(Boolean flagRitenute) {
		this.flagRitenute = flagRitenute;
	}
	
	/**
	 * 
	 * Indica se il tipo di documento supporta la NotaCredito
	 * @return the flagNotaCredito
	 */
	public Boolean getFlagNotaCredito() {
		return flagNotaCredito;
	}
	
	/**
	 * @param flagNotaCredito the flagNotaCredito to set
	 */
	public void setFlagNotaCredito(Boolean flagNotaCredito) {
		this.flagNotaCredito = flagNotaCredito;
	}
	
	/**
	 * 
	 * Indica se il tipo di documento supporta Penali o Altro
	 * 
	 * @return the flagPenaleAltro
	 */
	public Boolean getFlagPenaleAltro() {
		return flagPenaleAltro;
	}
	
	/**
	 * @param flagPenaleAltro the flagPenaleAltro to set
	 */
	public void setFlagPenaleAltro(Boolean flagPenaleAltro) {
		this.flagPenaleAltro = flagPenaleAltro;
	}
	
	/**
	 * 
	 * Indica se il tipo di documento supporta la SpesaCollegata
	 * 
	 * @return the flagSpesaCollegata
	 */
	public Boolean getFlagSpesaCollegata() {
		return flagSpesaCollegata;
	}
	
	/**
	 * @param flagSpesaCollegata the flagSpesaCollegata to set
	 */
	public void setFlagSpesaCollegata(Boolean flagSpesaCollegata) {
		this.flagSpesaCollegata = flagSpesaCollegata;
	}
	
	/** 
	 * Indica se il tipo di documento supporta il flagIVA
	 * 
	 * @return the flagIVA
	 */
	public Boolean getFlagIVA() {
		return flagIVA;
	}
	
	/**
	 * @param flagIVA the flagIVA to set
	 */
	public void setFlagIVA(Boolean flagIVA) {
		this.flagIVA = flagIVA;
	}
	
	/**
	 * @return the flagSubordinato
	 */
	public Boolean getFlagSubordinato() {
		return flagSubordinato;
	}
	
	/**
	 * Indica se il tipo di documento supporta il Subordinato
	 * 
	 * @param flagSubordinato the flagSubordinato to set
	 */
	public void setFlagSubordinato(Boolean flagSubordinato) {
		this.flagSubordinato = flagSubordinato;
	}
	
	/**
	 * @return the flagRegolarizzazione
	 */
	public Boolean getFlagRegolarizzazione() {
		return flagRegolarizzazione;
	}
	
	/**
	 * Indica se il tipo di documento supporta la Regolarizzazione
	 * 
	 * @param flagRegolarizzazione the flagRegolarizzazione to set
	 */
	public void setFlagRegolarizzazione(Boolean flagRegolarizzazione) {
		this.flagRegolarizzazione = flagRegolarizzazione;
	}

	/**
	 * @return the codiceGruppo
	 */
	public String getCodiceGruppo() {
		return codiceGruppo;
	}

	/**
	 * @param codiceGruppo the codiceGruppo to set
	 */
	public void setCodiceGruppo(String codiceGruppo) {
		this.codiceGruppo = codiceGruppo;
	}

	/**
	 * @return the tipoFamigliaDocumento
	 */
	public TipoFamigliaDocumento getTipoFamigliaDocumento() {
		return tipoFamigliaDocumento;
	}

	/**
	 * @param tipoFamigliaDocumento the tipoFamigliaDocumento to set
	 */
	public void setTipoFamigliaDocumento(TipoFamigliaDocumento tipoFamigliaDocumento) {
		this.tipoFamigliaDocumento = tipoFamigliaDocumento;
	}

	/**
	 * @return the flagAttivaGEN
	 */
	public Boolean getFlagAttivaGEN() {
		return flagAttivaGEN;
	}

	/**
	 * @param flagAttivaGEN the flagAttivaGEN to set
	 */
	public void setFlagAttivaGEN(Boolean flagAttivaGEN) {
		this.flagAttivaGEN = flagAttivaGEN;
	}

	/**
	 * @return the flagAggiornaQuoteDaElenco
	 */
	public Boolean getFlagAggiornaQuoteDaElenco() {
		return flagAggiornaQuoteDaElenco;
	}

	/**
	 * @param flagAggiornaQuoteDaElenco the flagAggiornaQuoteDaElenco to set
	 */
	public void setFlagAggiornaQuoteDaElenco(Boolean flagAggiornaQuoteDaElenco) {
		this.flagAggiornaQuoteDaElenco = flagAggiornaQuoteDaElenco;
	}

	/**
	 * @return the flagSenzaNumero
	 */
	public Boolean getFlagSenzaNumero() {
		return flagSenzaNumero;
	}

	/**
	 * @param flagSenzaNumero the flagSenzaNumero to set
	 */
	public void setFlagSenzaNumero(Boolean flagSenzaNumero) {
		this.flagSenzaNumero = flagSenzaNumero;
	}

	/**
	 * @return the flagComunicaPCC
	 */
	public Boolean getFlagComunicaPCC() {
		return flagComunicaPCC;
	}

	/**
	 * @param flagComunicaPCC the flagComunicaPCC to set
	 */
	public void setFlagComunicaPCC(Boolean flagComunicaPCC) {
		this.flagComunicaPCC = flagComunicaPCC;
	}

	/**
	 * @return the flagRegistroUnico
	 */
	public Boolean getFlagRegistroUnico() {
		return flagRegistroUnico;
	}

	/**
	 * @param flagRegistroUnico the flagRegistroUnico to set
	 */
	public void setFlagRegistroUnico(Boolean flagRegistroUnico) {
		this.flagRegistroUnico = flagRegistroUnico;
	}
	
	public Boolean getFlagNumerazioneAutomaticaDaIVA() {
		return flagNumerazioneAutomaticaDaIVA;
	}

	public void setFlagNumerazioneAutomaticaDaIVA(Boolean flagNumerazioneAutomaticaDaIVA) {
		this.flagNumerazioneAutomaticaDaIVA = flagNumerazioneAutomaticaDaIVA;
	}
	
}
