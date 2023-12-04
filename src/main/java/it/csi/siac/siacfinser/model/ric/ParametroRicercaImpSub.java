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
public class ParametroRicercaImpSub implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private Integer annoEsercizio;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	private String tipoFinanziamento;
	private String elementoPianoDeiConti;
	private Integer annoImpegno;
	private Integer numeroImpegno;
	private String stato;
	private String cig;
	private String cup;
	private String progetto; //codiceProgetto
	private String flagDaRiaccertamento;
	private String flagSoggettoDurc;
	private Integer annoProvvedimento;
	private Integer numeroProvvedimento;
	private TipoAtto tipoProvvedimento; 
	private Integer uidStrutturaAmministrativoContabile;
	private String codiceCreditore;
	private boolean competenzaCorrente;
	private boolean competenzaCompetenza;
	private boolean competenzaFuturi;
	//SIAC-6997
	private boolean competenzaResiduiRor;
	private Integer annoImpegnoRiaccertato;
	private Integer numeroImpegnoRiaccertato;
	private Integer annoImpegnoOrigine;
	private Integer numeroImpegnoOrigine;
	private Integer uidCapitolo;
	private Integer uidProvvedimento;
	private String codiceClasseSoggetto;
	private boolean ricercaResiduiRorFlag;
	
	// usato da ricerca impegni e subimpegni
	private String tipoImpegno;
	private Boolean isRicercaDaImpegno = Boolean.TRUE;
	private Boolean caricaDisponibilitaALiquidare = Boolean.FALSE;
	
	private String codiceProgetto;
	
	//SIAC-6255
	private Integer uidCronoprogramma;
	
	//SIAC-5253 itroduciamo la possibilita' di escludere stati precisi:
	private List<String> statiDaEscludere;
	
	
	//SIAC-6997
	private Boolean reanno;
	private String strutturaSelezionataCompetente;
	
	//SIAC-7349
	private Integer componenteBilancioUid;
	
	
	/**
	 * @return the caricaDisponibilitaALiquidare
	 */
	public Boolean getCaricaDisponibilitaALiquidare() {
		return caricaDisponibilitaALiquidare;
	}
	/**
	 * @param caricaDisponibilitaALiquidare the caricaDisponibilitaALiquidare to set
	 */
	public void setCaricaDisponibilitaALiquidare(
			Boolean caricaDisponibilitaALiquidare) {
		this.caricaDisponibilitaALiquidare = caricaDisponibilitaALiquidare;
	}
	/**
	 * @return the isRicercaDaImpegno
	 */
	public Boolean getIsRicercaDaImpegno() {
		return isRicercaDaImpegno;
	}
	/**
	 * @param isRicercaDaImpegno the isRicercaDaImpegno to set
	 */
	public void setIsRicercaDaImpegno(Boolean isRicercaDaImpegno) {
		this.isRicercaDaImpegno = isRicercaDaImpegno;
	}
	public Integer getAnnoImpegno() {
		return annoImpegno;
	}
	public void setAnnoImpegno(Integer annoImpegno) {
		this.annoImpegno = annoImpegno;
	}

	public String getTipoImpegno() {
		return tipoImpegno;
	}
	public void setTipoImpegno(String tipoImpegno) {
		this.tipoImpegno = tipoImpegno;
	}
	public String getCig() {
		return cig;
	}
	public void setCig(String cig) {
		this.cig = cig;
	}
	public String getCup() {
		return cup;
	}
	public void setCup(String cup) {
		this.cup = cup;
	}
	public String getProgetto() {
		return progetto;
	}
	public void setProgetto(String progetto) {
		this.progetto = progetto;
	}
	public String getCodiceCreditore() {
		return codiceCreditore;
	}
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
	 * @return the elementoPianoDeiConti
	 */
	public String getElementoPianoDeiConti() {
		return elementoPianoDeiConti;
	}
	/**
	 * @param elementoPianoDeiConti the elementoPianoDeiConti to set
	 */
	public void setElementoPianoDeiConti(String elementoPianoDeiConti) {
		this.elementoPianoDeiConti = elementoPianoDeiConti;
	}
	/**
	 * @return the numeroImpegno
	 */
	public Integer getNumeroImpegno() {
		return numeroImpegno;
	}
	/**
	 * @param numeroImpegno the numeroImpegno to set
	 */
	public void setNumeroImpegno(Integer numeroImpegno) {
		this.numeroImpegno = numeroImpegno;
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
	 * @return the annoImpegnoRiaccertato
	 */
	public Integer getAnnoImpegnoRiaccertato() {
		return annoImpegnoRiaccertato;
	}
	/**
	 * @param annoImpegnoRiaccertato the annoImpegnoRiaccertato to set
	 */
	public void setAnnoImpegnoRiaccertato(Integer annoImpegnoRiaccertato) {
		this.annoImpegnoRiaccertato = annoImpegnoRiaccertato;
	}
	/**
	 * @return the numeroImpegnoRiaccertato
	 */
	public Integer getNumeroImpegnoRiaccertato() {
		return numeroImpegnoRiaccertato;
	}
	/**
	 * @param numeroImpegnoRiaccertato the numeroImpegnoRiaccertato to set
	 */
	public void setNumeroImpegnoRiaccertato(Integer numeroImpegnoRiaccertato) {
		this.numeroImpegnoRiaccertato = numeroImpegnoRiaccertato;
	}
	/**
	 * @return the annoImpegnoOrigine
	 */
	public Integer getAnnoImpegnoOrigine() {
		return annoImpegnoOrigine;
	}
	/**
	 * @param annoImpegnoOrigine the annoImpegnoOrigine to set
	 */
	public void setAnnoImpegnoOrigine(Integer annoImpegnoOrigine) {
		this.annoImpegnoOrigine = annoImpegnoOrigine;
	}
	/**
	 * @return the numeroImpegnoOrigine
	 */
	public Integer getNumeroImpegnoOrigine() {
		return numeroImpegnoOrigine;
	}
	/**
	 * @param numeroImpegnoOrigine the numeroImpegnoOrigine to set
	 */
	public void setNumeroImpegnoOrigine(Integer numeroImpegnoOrigine) {
		this.numeroImpegnoOrigine = numeroImpegnoOrigine;
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
	
	public void setCodiceCreditore(String codiceCreditore) {
		this.codiceCreditore = codiceCreditore;
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
	public String getFlagSoggettoDurc() {
		return flagSoggettoDurc;
	}
	public void setFlagSoggettoDurc(String flagSoggettoDurc) {
		this.flagSoggettoDurc = flagSoggettoDurc;
	}
	/**
	 * @return the uidCronoprogramma
	 */
	public Integer getUidCronoprogramma() {
		return uidCronoprogramma;
	}
	/**
	 * @param uidCronoprogramma the uidCronoprogramma to set
	 */
	public void setUidCronoprogramma(Integer uidCronoprogramma) {
		this.uidCronoprogramma = uidCronoprogramma;
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
	public boolean getRicercaResiduiRorFlag() {
		return ricercaResiduiRorFlag;
	}
	/**
	 * @param ricercaResiduiRorFlag the ricercaResiduiRorFlag to set
	 */
	public void setRicercaResiduiRorFlag(boolean ricercaResiduiRorFlag) {
		this.ricercaResiduiRorFlag = ricercaResiduiRorFlag;
	}
	/**
	 * @return the componenteBilancioUid
	 */
	public Integer getComponenteBilancioUid() {
		return componenteBilancioUid;
	}
	/**
	 * @param componenteBilancioUid the componenteBilancioUid to set
	 */
	public void setComponenteBilancioUid(Integer componenteBilancioUid) {
		this.componenteBilancioUid = componenteBilancioUid;
	}
	
	
	
}
