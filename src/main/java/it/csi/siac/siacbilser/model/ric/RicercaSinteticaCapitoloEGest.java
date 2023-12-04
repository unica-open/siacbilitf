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
 * RicercaSinteticaCapitoloEGest: entita' di supporto per la ricerca sintetica
 * del capEntrataGestione, contiene i parametri (obbligatori e/o facoltativi) di
 * ricerca
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloEGest implements Serializable {

	private static final long serialVersionUID = -5945941221677444491L;
	
	//---------------------------
	
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
	//task-90
	private Integer idStrutturaAmmCont;
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
	private String codiceClassificatoreGenerico36;
	//modificato RTI
	private String codiceClassificatoreGenerico37;
	//modificato RTI
	private String codiceClassificatoreGenerico38;
	//modificato RTI
	private String codiceClassificatoreGenerico39;
	//modificato RTI
	private String codiceClassificatoreGenerico40;
	//modificato RTI
	private String codiceClassificatoreGenerico41;
	//modificato RTI
	private String codiceClassificatoreGenerico42;
	//modificato RTI
	private String codiceClassificatoreGenerico43;
	//modificato RTI
	private String codiceClassificatoreGenerico44;
	//modificato RTI	
	private String codiceClassificatoreGenerico45;
	private String codiceClassificatoreGenerico46;
	private String codiceClassificatoreGenerico47;
	private String codiceClassificatoreGenerico48;
	private String codiceClassificatoreGenerico49;
	private String codiceClassificatoreGenerico50;
	
	private String codiceSiopeEntrata;
	private String codiceTipoSiopeEntrata;
	private String codiceRicorrenteEntrata;
	private String codicePerimetroSanitarioEntrata;
	private String codiceTransazioneUnioneEuropeaEntrata;	

	//modificato RTI //solo uscita
//	private String flagFondoPluriennaleVincolato;
	//solo uscita
//	private String flagFondoSvalutazioneCrediti;
	//solo uscita
//	private String flagTrasferimentoOrganiComunitari;
	//solo uscita
//	private String flagAssegnabile;
	//solo uscita
//	private String flagFunzioniDelegate;
	private String flagRilevanteIva;
	
//	private String flagPerMemoria;
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
	
	private CategoriaCapitolo categoriaCapitolo;
	// SIAC-4088
	private Boolean richiediAccantonamentoFondiDubbiaEsigibilita;
	// SIAC-7858
	private String flagEntrataDubbiaEsigFCDE;
	
	//SIAC-8581
	private Integer versioneAccFcde;
	private String tipoAccFcde;
	
	//SIAC-8191
	private Boolean capitoliIndicatiPerPrevisioneImpegnato;
	
	
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
	public String getCodiceClassificatoreGenerico36() {
		return codiceClassificatoreGenerico36;
	}
	public void setCodiceClassificatoreGenerico36(String codiceClassificatoreGenerico36) {
		this.codiceClassificatoreGenerico36 = codiceClassificatoreGenerico36;
	}
	public String getCodiceClassificatoreGenerico37() {
		return codiceClassificatoreGenerico37;
	}
	public void setCodiceClassificatoreGenerico37(String codiceClassificatoreGenerico37) {
		this.codiceClassificatoreGenerico37 = codiceClassificatoreGenerico37;
	}
	public String getCodiceClassificatoreGenerico38() {
		return codiceClassificatoreGenerico38;
	}
	public void setCodiceClassificatoreGenerico38(String codiceClassificatoreGenerico38) {
		this.codiceClassificatoreGenerico38 = codiceClassificatoreGenerico38;
	}
	public String getCodiceClassificatoreGenerico39() {
		return codiceClassificatoreGenerico39;
	}
	public void setCodiceClassificatoreGenerico39(String codiceClassificatoreGenerico39) {
		this.codiceClassificatoreGenerico39 = codiceClassificatoreGenerico39;
	}
	public String getCodiceClassificatoreGenerico40() {
		return codiceClassificatoreGenerico40;
	}
	public void setCodiceClassificatoreGenerico40(String codiceClassificatoreGenerico40) {
		this.codiceClassificatoreGenerico40 = codiceClassificatoreGenerico40;
	}
	public String getCodiceClassificatoreGenerico41() {
		return codiceClassificatoreGenerico41;
	}
	public void setCodiceClassificatoreGenerico41(String codiceClassificatoreGenerico41) {
		this.codiceClassificatoreGenerico41 = codiceClassificatoreGenerico41;
	}
	public String getCodiceClassificatoreGenerico42() {
		return codiceClassificatoreGenerico42;
	}
	public void setCodiceClassificatoreGenerico42(String codiceClassificatoreGenerico42) {
		this.codiceClassificatoreGenerico42 = codiceClassificatoreGenerico42;
	}
	public String getCodiceClassificatoreGenerico43() {
		return codiceClassificatoreGenerico43;
	}
	public void setCodiceClassificatoreGenerico43(String codiceClassificatoreGenerico43) {
		this.codiceClassificatoreGenerico43 = codiceClassificatoreGenerico43;
	}
	public String getCodiceClassificatoreGenerico44() {
		return codiceClassificatoreGenerico44;
	}
	public void setCodiceClassificatoreGenerico44(String codiceClassificatoreGenerico44) {
		this.codiceClassificatoreGenerico44 = codiceClassificatoreGenerico44;
	}
	public String getCodiceClassificatoreGenerico45() {
		return codiceClassificatoreGenerico45;
	}
	public void setCodiceClassificatoreGenerico45(String codiceClassificatoreGenerico45) {
		this.codiceClassificatoreGenerico45 = codiceClassificatoreGenerico45;
	}
	public String getCodiceClassificatoreGenerico46() {
		return codiceClassificatoreGenerico46;
	}
	public void setCodiceClassificatoreGenerico46(String codiceClassificatoreGenerico46) {
		this.codiceClassificatoreGenerico46 = codiceClassificatoreGenerico46;
	}
	public String getCodiceClassificatoreGenerico47() {
		return codiceClassificatoreGenerico47;
	}
	public void setCodiceClassificatoreGenerico47(String codiceClassificatoreGenerico47) {
		this.codiceClassificatoreGenerico47 = codiceClassificatoreGenerico47;
	}
	public String getCodiceClassificatoreGenerico48() {
		return codiceClassificatoreGenerico48;
	}
	public void setCodiceClassificatoreGenerico48(String codiceClassificatoreGenerico48) {
		this.codiceClassificatoreGenerico48 = codiceClassificatoreGenerico48;
	}
	public String getCodiceClassificatoreGenerico49() {
		return codiceClassificatoreGenerico49;
	}
	public void setCodiceClassificatoreGenerico49(String codiceClassificatoreGenerico49) {
		this.codiceClassificatoreGenerico49 = codiceClassificatoreGenerico49;
	}
	public String getCodiceClassificatoreGenerico50() {
		return codiceClassificatoreGenerico50;
	}
	public void setCodiceClassificatoreGenerico50(String codiceClassificatoreGenerico50) {
		this.codiceClassificatoreGenerico50 = codiceClassificatoreGenerico50;
	}
	public String getFlagRilevanteIva() {
		return flagRilevanteIva;
	}
	public void setFlagRilevanteIva(String flagRilevanteIva) {
		this.flagRilevanteIva = flagRilevanteIva;
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
	/**
	 * @return the flagEntrataDubbiaEsigFCDE
	 */
	public String getFlagEntrataDubbiaEsigFCDE() {
		return this.flagEntrataDubbiaEsigFCDE;
	}
	/**
	 * @param flagEntrataDubbiaEsigFCDE the flagEntrataDubbiaEsigFCDE to set
	 */
	public void setFlagEntrataDubbiaEsigFCDE(String flagEntrataDubbiaEsigFCDE) {
		this.flagEntrataDubbiaEsigFCDE = flagEntrataDubbiaEsigFCDE;
	}

	/**
	 * @return the versioneAccFcde
	 */
	public Integer getVersioneAccFcde() {
		return versioneAccFcde;
	}
	/**
	 * @param versioneAccFcde the versioneAccFcde to set
	 */
	public void setVersioneAccFcde(Integer versioneAccFcde) {
		this.versioneAccFcde = versioneAccFcde;
	}
	/**
	 * @return the tipoAccFcde
	 */
	public String getTipoAccFcde() {
		return tipoAccFcde;
	}
	/**
	 * @param tipoAccFcde the tipoAccFcde to set
	 */
	public void setTipoAccFcde(String tipoAccFcde) {
		this.tipoAccFcde = tipoAccFcde;
	}
	public Boolean getCapitoliIndicatiPerPrevisioneImpegnato() {
		return capitoliIndicatiPerPrevisioneImpegnato;
	}
	public void setCapitoliIndicatiPerPrevisioneImpegnato(Boolean capitoliIndicatiPerPrevisioneImpegnato) {
		this.capitoliIndicatiPerPrevisioneImpegnato = capitoliIndicatiPerPrevisioneImpegnato;
	}
	//task-90
	public Integer getIdStrutturaAmmCont() {
		return idStrutturaAmmCont;
	}
	public void setIdStrutturaAmmCont(Integer idStrutturaAmmCont) {
		this.idStrutturaAmmCont = idStrutturaAmmCont;
	}
}
