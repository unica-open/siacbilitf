/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.CategoriaCapitolo;
import it.csi.siac.siacbilser.model.StatoOperativoElementoDiBilancio;

/**
 * RicercaSinteticaCapitoloEPrev: entita' di supporto per la ricerca sintetica
 * del capEntrataPrevisione, contiene i parametri (obbligatori e/o facoltativi)
 * di ricerca
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloEPrev implements Serializable {

	private static final long serialVersionUID = -5196347292761699891L;
	
	
	private Integer annoEsercizio;
	private Integer annoCapitolo;
	private String faseBilancio;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	
	private String descrizioneCapitolo;
	private String descrizioneArticolo;
	private StatoOperativoElementoDiBilancio statoOperativo;
	
//	private String codiceMissione; //solo uscita
//	private String codiceProgramma; //solo uscita
	
	private String codiceTitoloEntrata; 
	private String codiceTipologia;
	private String codiceCategoria;
	
	
	// solo uscita
	//private String codiceMacroaggregato;
	//sostituito con codiceStrutturaAmmCont RTI
	//private String strutturaOrganizzativaCodice;
	
	//aggiunto RTI
	private String codiceStrutturaAmmCont;
	//aggiunto RTI
	private String codiceTipoStrutturaAmmCont;
	//modificato RTI
	private String codicePianoDeiConti;
	
	//modificato RTI
	private String codiceTipoFinanziamento;
	//modificato RTI
	private String codiceTipoFondo;
	//modificato RTI
	private String codiceTipoVincolo;
	
	//solo uscita
	//private String classificatoreCofog;
	
	//modificato RTI
	private String codiceClassificatoreGenerico1;
	//modificato RTI
	private String codiceClassificatoreGenerico2;
	//modificato RTI
	private String codiceClassificatoreGenerico3;
	//modificato RTI
	private String codiceClassificatoreGenerico4;
	//modificato RTI
	private String codiceClassificatoreGenerico5;
	//modificato RTI
	private String codiceClassificatoreGenerico6;
	//modificato RTI
	private String codiceClassificatoreGenerico7;
	//modificato RTI
	private String codiceClassificatoreGenerico8;
	//modificato RTI
	private String codiceClassificatoreGenerico9;
	//modificato RTI	
	private String codiceClassificatoreGenerico10;
	
	private String codiceSiopeEntrata;
	private String codiceTipoSiopeEntrata;
	private String codiceRicorrenteEntrata;
	private String codicePerimetroSanitarioEntrata;
	private String codiceTransazioneUnioneEuropeaEntrata;	

	//modificato RTI solo uscita
	//private String flagFondoPluriennaleVincolato;
	//solo uscita
	//private String flagFondoSvalutazioneCrediti;
	//solo uscita
	//private String flagTrasferimentoOrganiComunitari;
	//solo uscita
	//private String flagAssegnabile;
	//solo uscita
	//private String flagFunzioniDelegate;
	//solo uscita
	private String flagRilevanteIva;
	
	private String flagPerMemoria;
	private String flagEntrateRicorrenti;
	
	
	
	private String tipoAttoDilegge;
	private Integer annoAttoDilegge;
	private Integer numeroAttoDilegge;
	private String articoloAttoDilegge;
	private String commaAttoDilegge;
	private String puntoAttoDilegge;
	
	private Integer exAnnoCapitolo;
	private Integer exNumeroCapitolo;
	private Integer exNumeroArticolo;
	private Integer exNumeroUEB;
	
	
	
	//------------------------------------------------
	//codiceTipologiaIlivello
	//codiceTipologiaIIlivello
	//--------------------------------------
	
	private CategoriaCapitolo categoriaCapitolo;

	// SIAC-4088
	private Boolean richiediAccantonamentoFondiDubbiaEsigibilita;
	
	
	
	public Integer getAnnoEsercizio() {
		return annoEsercizio;
	}
	public void setAnnoEsercizio(Integer annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	public Integer getAnnoCapitolo() {
		return annoCapitolo;
	}
	public void setAnnoCapitolo(Integer annoCapitolo) {
		this.annoCapitolo = annoCapitolo;
	}
	public String getFaseBilancio() {
		return faseBilancio;
	}
	public void setFaseBilancio(String faseBilancio) {
		this.faseBilancio = faseBilancio;
	}
	public Integer getNumeroCapitolo() {
		return numeroCapitolo;
	}
	public void setNumeroCapitolo(Integer numeroCapitolo) {
		this.numeroCapitolo = numeroCapitolo;
	}
	public Integer getNumeroArticolo() {
		return numeroArticolo;
	}
	public void setNumeroArticolo(Integer numeroArticolo) {
		this.numeroArticolo = numeroArticolo;
	}
	public Integer getNumeroUEB() {
		return numeroUEB;
	}
	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
	}
	public String getDescrizioneCapitolo() {
		return descrizioneCapitolo;
	}
	public void setDescrizioneCapitolo(String descrizioneCapitolo) {
		this.descrizioneCapitolo = descrizioneCapitolo;
	}
	public StatoOperativoElementoDiBilancio getStatoOperativo() {
		return statoOperativo;
	}
	public void setStatoOperativo(StatoOperativoElementoDiBilancio statoOperativo) {
		this.statoOperativo = statoOperativo;
	}
	public String getCodiceTitoloEntrata() {
		return codiceTitoloEntrata;
	}
	public void setCodiceTitoloEntrata(String codiceTitoloEntrata) {
		this.codiceTitoloEntrata = codiceTitoloEntrata;
	}
	public String getCodiceTipologia() {
		return codiceTipologia;
	}
	public void setCodiceTipologia(String codiceTipologia) {
		this.codiceTipologia = codiceTipologia;
	}
	public String getCodiceCategoria() {
		return codiceCategoria;
	}
	public void setCodiceCategoria(String codiceCategoria) {
		this.codiceCategoria = codiceCategoria;
	}
	public String getCodiceStrutturaAmmCont() {
		return codiceStrutturaAmmCont;
	}
	public void setCodiceStrutturaAmmCont(String codiceStrutturaAmmCont) {
		this.codiceStrutturaAmmCont = codiceStrutturaAmmCont;
	}
	public String getCodiceTipoStrutturaAmmCont() {
		return codiceTipoStrutturaAmmCont;
	}
	public void setCodiceTipoStrutturaAmmCont(String codiceTipoStrutturaAmmCont) {
		this.codiceTipoStrutturaAmmCont = codiceTipoStrutturaAmmCont;
	}
	public String getCodicePianoDeiConti() {
		return codicePianoDeiConti;
	}
	public void setCodicePianoDeiConti(String codicePianoDeiConti) {
		this.codicePianoDeiConti = codicePianoDeiConti;
	}
	public String getCodiceTipoFinanziamento() {
		return codiceTipoFinanziamento;
	}
	public void setCodiceTipoFinanziamento(String codiceTipoFinanziamento) {
		this.codiceTipoFinanziamento = codiceTipoFinanziamento;
	}
	public String getCodiceTipoFondo() {
		return codiceTipoFondo;
	}
	public void setCodiceTipoFondo(String codiceTipoFondo) {
		this.codiceTipoFondo = codiceTipoFondo;
	}
	public String getCodiceTipoVincolo() {
		return codiceTipoVincolo;
	}
	public void setCodiceTipoVincolo(String codiceTipoVincolo) {
		this.codiceTipoVincolo = codiceTipoVincolo;
	}
	public String getCodiceClassificatoreGenerico1() {
		return codiceClassificatoreGenerico1;
	}
	public void setCodiceClassificatoreGenerico1(String codiceClassificatoreGenerico1) {
		this.codiceClassificatoreGenerico1 = codiceClassificatoreGenerico1;
	}
	public String getCodiceClassificatoreGenerico2() {
		return codiceClassificatoreGenerico2;
	}
	public void setCodiceClassificatoreGenerico2(String codiceClassificatoreGenerico2) {
		this.codiceClassificatoreGenerico2 = codiceClassificatoreGenerico2;
	}
	public String getCodiceClassificatoreGenerico3() {
		return codiceClassificatoreGenerico3;
	}
	public void setCodiceClassificatoreGenerico3(String codiceClassificatoreGenerico3) {
		this.codiceClassificatoreGenerico3 = codiceClassificatoreGenerico3;
	}
	public String getCodiceClassificatoreGenerico4() {
		return codiceClassificatoreGenerico4;
	}
	public void setCodiceClassificatoreGenerico4(String codiceClassificatoreGenerico4) {
		this.codiceClassificatoreGenerico4 = codiceClassificatoreGenerico4;
	}
	public String getCodiceClassificatoreGenerico5() {
		return codiceClassificatoreGenerico5;
	}
	public void setCodiceClassificatoreGenerico5(String codiceClassificatoreGenerico5) {
		this.codiceClassificatoreGenerico5 = codiceClassificatoreGenerico5;
	}
	public String getCodiceClassificatoreGenerico6() {
		return codiceClassificatoreGenerico6;
	}
	public void setCodiceClassificatoreGenerico6(String codiceClassificatoreGenerico6) {
		this.codiceClassificatoreGenerico6 = codiceClassificatoreGenerico6;
	}
	public String getCodiceClassificatoreGenerico7() {
		return codiceClassificatoreGenerico7;
	}
	public void setCodiceClassificatoreGenerico7(String codiceClassificatoreGenerico7) {
		this.codiceClassificatoreGenerico7 = codiceClassificatoreGenerico7;
	}
	public String getCodiceClassificatoreGenerico8() {
		return codiceClassificatoreGenerico8;
	}
	public void setCodiceClassificatoreGenerico8(String codiceClassificatoreGenerico8) {
		this.codiceClassificatoreGenerico8 = codiceClassificatoreGenerico8;
	}
	public String getCodiceClassificatoreGenerico9() {
		return codiceClassificatoreGenerico9;
	}
	public void setCodiceClassificatoreGenerico9(String codiceClassificatoreGenerico9) {
		this.codiceClassificatoreGenerico9 = codiceClassificatoreGenerico9;
	}
	public String getCodiceClassificatoreGenerico10() {
		return codiceClassificatoreGenerico10;
	}
	public void setCodiceClassificatoreGenerico10(String codiceClassificatoreGenerico10) {
		this.codiceClassificatoreGenerico10 = codiceClassificatoreGenerico10;
	}
	public String getFlagPerMemoria() {
		return flagPerMemoria;
	}
	public void setFlagPerMemoria(String flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria;
	}
	public String getFlagEntrateRicorrenti() {
		return flagEntrateRicorrenti;
	}
	public void setFlagEntrateRicorrenti(String flagEntrateRicorrenti) {
		this.flagEntrateRicorrenti = flagEntrateRicorrenti;
	}
	public String getTipoAttoDilegge() {
		return tipoAttoDilegge;
	}
	public void setTipoAttoDilegge(String tipoAttoDilegge) {
		this.tipoAttoDilegge = tipoAttoDilegge;
	}
	public Integer getAnnoAttoDilegge() {
		return annoAttoDilegge;
	}
	public void setAnnoAttoDilegge(Integer annoAttoDilegge) {
		this.annoAttoDilegge = annoAttoDilegge;
	}
	public Integer getNumeroAttoDilegge() {
		return numeroAttoDilegge;
	}
	public void setNumeroAttoDilegge(Integer numeroAttoDilegge) {
		this.numeroAttoDilegge = numeroAttoDilegge;
	}
	public String getArticoloAttoDilegge() {
		return articoloAttoDilegge;
	}
	public void setArticoloAttoDilegge(String articoloAttoDilegge) {
		this.articoloAttoDilegge = articoloAttoDilegge;
	}
	public String getCommaAttoDilegge() {
		return commaAttoDilegge;
	}
	public void setCommaAttoDilegge(String commaAttoDilegge) {
		this.commaAttoDilegge = commaAttoDilegge;
	}
	public String getPuntoAttoDilegge() {
		return puntoAttoDilegge;
	}
	public void setPuntoAttoDilegge(String puntoAttoDilegge) {
		this.puntoAttoDilegge = puntoAttoDilegge;
	}
	public Integer getExAnnoCapitolo() {
		return exAnnoCapitolo;
	}
	public void setExAnnoCapitolo(Integer exAnnoCapitolo) {
		this.exAnnoCapitolo = exAnnoCapitolo;
	}
	public Integer getExNumeroCapitolo() {
		return exNumeroCapitolo;
	}
	public void setExNumeroCapitolo(Integer exNumeroCapitolo) {
		this.exNumeroCapitolo = exNumeroCapitolo;
	}
	public Integer getExNumeroArticolo() {
		return exNumeroArticolo;
	}
	public void setExNumeroArticolo(Integer exNumeroArticolo) {
		this.exNumeroArticolo = exNumeroArticolo;
	}
	public Integer getExNumeroUEB() {
		return exNumeroUEB;
	}
	public void setExNumeroUEB(Integer exNumeroUEB) {
		this.exNumeroUEB = exNumeroUEB;
	}
	public String getFlagRilevanteIva() {
		return flagRilevanteIva;
	}
	public void setFlagRilevanteIva(String flagRilevanteIva) {
		this.flagRilevanteIva = flagRilevanteIva;
	}
	/**
	 * @return the descrizioneArticolo
	 */
	public String getDescrizioneArticolo() {
		return descrizioneArticolo;
	}
	/**
	 * @param descrizioneArticolo the descrizioneArticolo to set
	 */
	public void setDescrizioneArticolo(String descrizioneArticolo) {
		this.descrizioneArticolo = descrizioneArticolo;
	}
	public String getCodiceSiopeEntrata() {
		return codiceSiopeEntrata;
	}
	public void setCodiceSiopeEntrata(String codiceSiopeEntrata) {
		this.codiceSiopeEntrata = codiceSiopeEntrata;
	}
	public String getCodiceRicorrenteEntrata() {
		return codiceRicorrenteEntrata;
	}
	public void setCodiceRicorrenteEntrata(String codiceRicorrenteEntrata) {
		this.codiceRicorrenteEntrata = codiceRicorrenteEntrata;
	}
	public String getCodicePerimetroSanitarioEntrata() {
		return codicePerimetroSanitarioEntrata;
	}
	public void setCodicePerimetroSanitarioEntrata(String codicePerimetroSanitarioEntrata) {
		this.codicePerimetroSanitarioEntrata = codicePerimetroSanitarioEntrata;
	}
	public String getCodiceTransazioneUnioneEuropeaEntrata() {
		return codiceTransazioneUnioneEuropeaEntrata;
	}
	public void setCodiceTransazioneUnioneEuropeaEntrata(String codiceTransazioneUnioneEuropeaEntrata) {
		this.codiceTransazioneUnioneEuropeaEntrata = codiceTransazioneUnioneEuropeaEntrata;
	}
	public String getCodiceTipoSiopeEntrata() {
		return codiceTipoSiopeEntrata;
	}
	public void setCodiceTipoSiopeEntrata(String codiceTipoSiopeEntrata) {
		this.codiceTipoSiopeEntrata = codiceTipoSiopeEntrata;
	}
	/**
	 * @return the categoriaCapitolo
	 */
	public CategoriaCapitolo getCategoriaCapitolo() {
		return categoriaCapitolo;
	}
	/**
	 * @param categoriaCapitolo the categoriaCapitolo to set
	 */
	public void setCategoriaCapitolo(CategoriaCapitolo categoriaCapitolo) {
		this.categoriaCapitolo = categoriaCapitolo;
	}
	/**
	 * @return the richiediAccantonamentoFondiDubbiaEsigibilita
	 */
	public Boolean getRichiediAccantonamentoFondiDubbiaEsigibilita() {
		return richiediAccantonamentoFondiDubbiaEsigibilita;
	}
	/**
	 * @param richiediAccantonamentoFondiDubbiaEsigibilita the richiediAccantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setRichiediAccantonamentoFondiDubbiaEsigibilita(Boolean richiediAccantonamentoFondiDubbiaEsigibilita) {
		this.richiediAccantonamentoFondiDubbiaEsigibilita = richiediAccantonamentoFondiDubbiaEsigibilita;
	}
	
	

	
	


}
