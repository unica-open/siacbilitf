/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siacfinser.model.FINDataDictionary;
/**
 * Bean contenente i parametri che soddisfano i criteri di ricerca per impegni e subimpegni
 * Il parametro anno esercizio e' obbligatorio
 * 
 * @author 
 *
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaAccSubAcc  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer annoAccertamento;
	private Integer numeroAccertamento;
	
	private Integer annoEsercizio;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	private String tipoFinanziamento;

	private String stato;
	private String cig;
	private String cup;

	private String flagDaRiaccertamento;
	private Integer annoProvvedimento;
	private Integer numeroProvvedimento;
	private TipoAtto tipoProvvedimento; 
	private Integer uidStrutturaAmministrativoContabile;
	private String codiceDebitore;
	private boolean competenzaCorrente;
	private boolean competenzaCompetenza;
	private boolean competenzaFuturi;
	//SIAC-6997
	private boolean competenzaResiduiRor;
	private Integer annoAccertamentoRiaccertato;
	private Integer numeroAccertamentoRiaccertato;
	private Integer annoAccertamentoOrigine;
	private Integer numeroAccertamentoOrigine;
	private Integer uidCapitolo;
	private Integer uidProvvedimento;
	private String codiceClasseSoggetto;
	private Boolean isRicercaDaAccertamento = Boolean.TRUE;
	private boolean disponibilitaAdIncassare = false;
	private boolean ricercaResiduiRorFlag;
	
	private String codiceProgetto;
	
	//SIAC-5253 itroduciamo la possibilita' di escludere stati precisi:
	private List<String> statiDaEscludere;
	
	//SIAC-6997
	private Boolean reanno;
	private String strutturaSelezionataCompetente;

	/**
	 * @return the annoEsercizio
	 */
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}

	/**
	 * @param annoEsercizio the annoEsercizio to set
	 */
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}

	/**
	 * @return the numeroCapitolo
	 */
	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}

	/**
	 * @param numeroCapitolo the numeroCapitolo to set
	 */
	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}

	/**
	 * @return the numeroArticolo
	 */
	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}

	/**
	 * @param numeroArticolo the numeroArticolo to set
	 */
	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}

	/**
	 * @return the numeroUEB
	 */
	public Integer getNumeroUEB() {
		return numeroUEB;
	}

	/**
	 * @param numeroUEB the numeroUEB to set
	 */
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}

	/**
	 * @return the tipoFinanziamento
	 */
	public String getTipoFinanziamento() {
		return tipoFinanziamento;
	}

	/**
	 * @param tipoFinanziamento the tipoFinanziamento to set
	 */
	public void setTipoFinanziamento(String tipoFinanziamento) {
		this.tipoFinanziamento = tipoFinanziamento;
	}

	/**
	 * @return the stato
	 */
	public String getStato() {
		return stato;
	}

	/**
	 * @param stato the stato to set
	 */
	public void setStato(String stato) {
		this.stato = stato;
	}

	/**
	 * @return the cig
	 */
	public String getCig() {
		return cig;
	}

	/**
	 * @param cig the cig to set
	 */
	public void setCig(String cig) {
		this.cig = cig;
	}

	/**
	 * @return the cup
	 */
	public String getCup() {
		return cup;
	}

	/**
	 * @param cup the cup to set
	 */
	public void setCup(String cup) {
		this.cup = cup;
	}

	/**
	 * @return the flagDaRiaccertamento
	 */
	public String getFlagDaRiaccertamento() {
		return flagDaRiaccertamento;
	}

	/**
	 * @param flagDaRiaccertamento the flagDaRiaccertamento to set
	 */
	public void setFlagDaRiaccertamento(String flagDaRiaccertamento) {
		this.flagDaRiaccertamento = flagDaRiaccertamento;
	}

	/**
	 * @return the annoProvvedimento
	 */
	public Integer getAnnoProvvedimento() {
		return annoProvvedimento;
	}

	/**
	 * @param annoProvvedimento the annoProvvedimento to set
	 */
	public void setAnnoProvvedimento(Integer annoProvvedimento) {
		this.annoProvvedimento = annoProvvedimento;
	}

	/**
	 * @return the numeroProvvedimento
	 */
	public Integer getNumeroProvvedimento() {
		return numeroProvvedimento;
	}

	/**
	 * @param numeroProvvedimento the numeroProvvedimento to set
	 */
	public void setNumeroProvvedimento(Integer numeroProvvedimento) {
		this.numeroProvvedimento = numeroProvvedimento;
	}

	/**
	 * @return the tipoProvvedimento
	 */
	public TipoAtto getTipoProvvedimento() {
		return tipoProvvedimento;
	}

	/**
	 * @param tipoProvvedimento the tipoProvvedimento to set
	 */
	public void setTipoProvvedimento(TipoAtto tipoProvvedimento) {
		this.tipoProvvedimento = tipoProvvedimento;
	}

	/**
	 * @return the uidStrutturaAmministrativoContabile
	 */
	public Integer getUidStrutturaAmministrativoContabile() {
		return uidStrutturaAmministrativoContabile;
	}

	/**
	 * @param uidStrutturaAmministrativoContabile the uidStrutturaAmministrativoContabile to set
	 */
	public void setUidStrutturaAmministrativoContabile(
			Integer uidStrutturaAmministrativoContabile) {
		this.uidStrutturaAmministrativoContabile = uidStrutturaAmministrativoContabile;
	}

	/**
	 * @return the competenzaCorrente
	 */
	public boolean isCompetenzaCorrente() {
		return competenzaCorrente;
	}

	/**
	 * @param competenzaCorrente the competenzaCorrente to set
	 */
	public void setCompetenzaCorrente(boolean competenzaCorrente) {
		this.competenzaCorrente = competenzaCorrente;
	}

	/**
	 * @return the competenzaCompetenza
	 */
	public boolean isCompetenzaCompetenza() {
		return competenzaCompetenza;
	}

	/**
	 * @param competenzaCompetenza the competenzaCompetenza to set
	 */
	public void setCompetenzaCompetenza(boolean competenzaCompetenza) {
		this.competenzaCompetenza = competenzaCompetenza;
	}

	/**
	 * @return the competenzaFuturi
	 */
	public boolean isCompetenzaFuturi() {
		return competenzaFuturi;
	}

	/**
	 * @param competenzaFuturi the competenzaFuturi to set
	 */
	public void setCompetenzaFuturi(boolean competenzaFuturi) {
		this.competenzaFuturi = competenzaFuturi;
	}

	/**
	 * @return the annoAccertamentoRiaccertato
	 */
	public Integer getAnnoAccertamentoRiaccertato() {
		return annoAccertamentoRiaccertato;
	}

	/**
	 * @param annoAccertamentoRiaccertato the annoAccertamentoRiaccertato to set
	 */
	public void setAnnoAccertamentoRiaccertato(Integer annoAccertamentoRiaccertato) {
		this.annoAccertamentoRiaccertato = annoAccertamentoRiaccertato;
	}

	/**
	 * @return the numeroAccertamentoRiaccertato
	 */
	public Integer getNumeroAccertamentoRiaccertato() {
		return numeroAccertamentoRiaccertato;
	}

	/**
	 * @param numeroAccertamentoRiaccertato the numeroAccertamentoRiaccertato to set
	 */
	public void setNumeroAccertamentoRiaccertato(
			Integer numeroAccertamentoRiaccertato) {
		this.numeroAccertamentoRiaccertato = numeroAccertamentoRiaccertato;
	}

	/**
	 * @return the annoAccertamentoOrigine
	 */
	public Integer getAnnoAccertamentoOrigine() {
		return annoAccertamentoOrigine;
	}

	/**
	 * @param annoAccertamentoOrigine the annoAccertamentoOrigine to set
	 */
	public void setAnnoAccertamentoOrigine(Integer annoAccertamentoOrigine) {
		this.annoAccertamentoOrigine = annoAccertamentoOrigine;
	}

	/**
	 * @return the numeroAccertamentoOrigine
	 */
	public Integer getNumeroAccertamentoOrigine() {
		return numeroAccertamentoOrigine;
	}

	/**
	 * @param numeroAccertamentoOrigine the numeroAccertamentoOrigine to set
	 */
	public void setNumeroAccertamentoOrigine(Integer numeroAccertamentoOrigine) {
		this.numeroAccertamentoOrigine = numeroAccertamentoOrigine;
	}

	/**
	 * @return the uidCapitolo
	 */
	public Integer getUidCapitolo() {
		return uidCapitolo;
	}

	/**
	 * @param uidCapitolo the uidCapitolo to set
	 */
	public void setUidCapitolo(Integer uidCapitolo) {
		this.uidCapitolo = uidCapitolo;
	}

	/**
	 * @return the uidProvvedimento
	 */
	public Integer getUidProvvedimento() {
		return uidProvvedimento;
	}

	/**
	 * @param uidProvvedimento the uidProvvedimento to set
	 */
	public void setUidProvvedimento(Integer uidProvvedimento) {
		this.uidProvvedimento = uidProvvedimento;
	}

	/**
	 * @return the codiceClasseSoggetto
	 */
	public String getCodiceClasseSoggetto() {
		return codiceClasseSoggetto;
	}

	/**
	 * @param codiceClasseSoggetto the codiceClasseSoggetto to set
	 */
	public void setCodiceClasseSoggetto(String codiceClasseSoggetto) {
		this.codiceClasseSoggetto = codiceClasseSoggetto;
	}

	/**
	 * @return the isRicercaDaAccertamento
	 */
	public Boolean getIsRicercaDaAccertamento() {
		return isRicercaDaAccertamento;
	}

	/**
	 * @param isRicercaDaAccertamento the isRicercaDaAccertamento to set
	 */
	public void setIsRicercaDaAccertamento(Boolean isRicercaDaAccertamento) {
		this.isRicercaDaAccertamento = isRicercaDaAccertamento;
	}

	/**
	 * @return the annoAccertamento
	 */
	public Integer getAnnoAccertamento() {
		return annoAccertamento;
	}
	/**
	 * @param annoAccertamento the annoAccertamento to set
	 */
	public void setAnnoAccertamento(Integer annoAccertamento) {
		this.annoAccertamento = annoAccertamento;
	}


	public Integer getNumeroAccertamento() {
		return numeroAccertamento;
	}

	public void setNumeroAccertamento(Integer numeroAccertamento) {
		this.numeroAccertamento = numeroAccertamento;
	}

	public String getCodiceDebitore() {
		return codiceDebitore;
	}

	public void setCodiceDebitore(String codiceDebitore) {
		this.codiceDebitore = codiceDebitore;
	}

	public boolean isDisponibilitaAdIncassare() {
		return disponibilitaAdIncassare;
	}

	public void setDisponibilitaAdIncassare(boolean disponibilitaAdIncassare) {
		this.disponibilitaAdIncassare = disponibilitaAdIncassare;
	}

	public String getCodiceProgetto() {
		return codiceProgetto;
	}

	public void setCodiceProgetto(String codiceProgetto) {
		this.codiceProgetto = codiceProgetto;
	}

	public List<String> getStatiDaEscludere() {
		return statiDaEscludere;
	}

	public void setStatiDaEscludere(List<String> statiDaEscludere) {
		this.statiDaEscludere = statiDaEscludere;
	}

	/**
	 * @return the reanno
	 */
	public Boolean getReanno() {
		return reanno;
	}

	/**
	 * @return the strutturaSelezionataCompetente
	 */
	public String getStrutturaSelezionataCompetente() {
		return strutturaSelezionataCompetente;
	}

	/**
	 * @param reanno the reanno to set
	 */
	public void setReanno(Boolean reanno) {
		this.reanno = reanno;
	}

	/**
	 * @param strutturaSelezionataCompetente the strutturaSelezionataCompetente to set
	 */
	public void setStrutturaSelezionataCompetente(String strutturaSelezionataCompetente) {
		this.strutturaSelezionataCompetente = strutturaSelezionataCompetente;
	}

	/**
	 * @return the competenzaResiduiRor
	 */
	public boolean isCompetenzaResiduiRor() {
		return competenzaResiduiRor;
	}

	/**
	 * @param competenzaResiduiRor the competenzaResiduiRor to set
	 */
	public void setCompetenzaResiduiRor(boolean competenzaResiduiRor) {
		this.competenzaResiduiRor = competenzaResiduiRor;
	}

	/**
	 * @return the ricercaResiduiRorFlag
	 */
	public boolean isRicercaResiduiRorFlag() {
		return ricercaResiduiRorFlag;
	}

	/**
	 * @param ricercaResiduiRorFlag the ricercaResiduiRorFlag to set
	 */
	public void setRicercaResiduiRorFlag(boolean ricercaResiduiRorFlag) {
		this.ricercaResiduiRorFlag = ricercaResiduiRorFlag;
	}	
	
}
