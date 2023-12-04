/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.ric;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.CategoriaCapitolo;
import it.csi.siac.siacbilser.model.StatoOperativoElementoDiBilancio;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

/**
 * RicercaSinteticaCapitoloUPrev: entita' di supporto per la ricerca sintetica
 * del capUscitaPrevisione, contiene i parametri (obbligatori e/o facoltativi)
 * di ricerca
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloUPrev implements Serializable {

	private static final long serialVersionUID = -1707154019942607685L;

	private Integer annoEsercizio;
	private Integer annoCapitolo;
	private String faseBilancio;
	private Integer numeroCapitolo;
	private Integer numeroArticolo;
	private Integer numeroUEB;
	
	private String descrizioneCapitolo;
	private String descrizioneArticolo;
	private StatoOperativoElementoDiBilancio statoOperativo;
	private String codiceMissione;
	private String codiceProgramma;
	private String codiceTitoloUscita;
	private String codiceMacroaggregato;
	//sostituito con codiceStrutturaAmmCont RTI
	//private String strutturaOrganizzativaCodice;
	
	//aggiunto RTI
	private String codiceStrutturaAmmCont;
	//aggiunto RTI
	private String codiceTipoStrutturaAmmCont;
	//task-90
	private Integer idStrutturaAmmCont;
	//modificato RTI
	private String codicePianoDeiConti;
	
	//modificato RTI
	private String codiceTipoFinanziamento;
	//modificato RTI
	private String codiceTipoFondo;
	//modificato RTI
	private String codiceTipoVincolo;
	
	//modificato RTI
	private String codiceCofog;
	//modificato RTI
	private String codiceTipoCofog;
	
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
	
	private String codiceSiopeSpesa;
	private String codiceTipoSiopeSpesa;
	private String codiceRicorrenteSpesa;
	private String codicePerimetroSanitarioSpesa;
	private String codiceTransazioneUnioneEuropeaSpesa;
	private String codicePoliticheRegionaliUnitarie;
	
	private String codiceRisorsaAccantonata;

	//modificato RTI
	private String flagFondoPluriennaleVincolato;
	private String flagFondoSvalutazioneCrediti;
	//eliminato fase 4
	private String flagTrasferimentoOrganiComunitari;
	private String flagPerMemoria;
	private String flagAssegnabile;
	private String flagFunzioniDelegate;
	private String flagRilevanteIva;
	
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

	public String getDescrizioneCapitolo() {
		return descrizioneCapitolo;
	}

	public void setDescrizioneCapitolo(String descrizioneCapitolo) {
		this.descrizioneCapitolo = descrizioneCapitolo;
	}

	public String getCodiceMissione() {
		return codiceMissione;
	}

	public void setCodiceMissione(String codiceMissione) {
		this.codiceMissione = codiceMissione;
	}

	public String getCodiceProgramma() {
		return codiceProgramma;
	}

	public void setCodiceProgramma(String codiceProgramma) {
		this.codiceProgramma = codiceProgramma;
	}

	public String getCodiceTitoloUscita() {
		return codiceTitoloUscita;
	}

	public void setCodiceTitoloUscita(String codiceTitoloUscita) {
		this.codiceTitoloUscita = codiceTitoloUscita;
	}

	public String getCodiceMacroaggregato() {
		return codiceMacroaggregato;
	}

	public void setCodiceMacroaggregato(String codiceMacroaggregato) {
		this.codiceMacroaggregato = codiceMacroaggregato;
	}

	/*public String getStrutturaOrganizzativaCodice() {
		return strutturaOrganizzativaCodice;
	}

	public void setStrutturaOrganizzativaCodice(
			String strutturaOrganizzativaCodice) {
		this.strutturaOrganizzativaCodice = strutturaOrganizzativaCodice;
	}*/
	
	

	public String getCodicePianoDeiConti() {
		return codicePianoDeiConti;
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

	public void setCodicePianoDeiConti(String pianoDeiConti) {
		this.codicePianoDeiConti = pianoDeiConti;
	}

	public String getCodiceTipoFinanziamento() {
		return codiceTipoFinanziamento;
	}

	public void setCodiceTipoFinanziamento(String tipoFinanziamento) {
		this.codiceTipoFinanziamento = tipoFinanziamento;
	}



	public String getCodiceTipoFondo() {
		return codiceTipoFondo;
	}

	public void setCodiceTipoFondo(String tipoFondo) {
		this.codiceTipoFondo = tipoFondo;
	}

	public String getCodiceTipoVincolo() {
		return codiceTipoVincolo;
	}

	public void setCodiceTipoVincolo(String tipoVincolo) {
		this.codiceTipoVincolo = tipoVincolo;
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

	
	
	public String getCodiceCofog() {
		return codiceCofog;
	}

	public void setCodiceCofog(String codiceCofog) {
		this.codiceCofog = codiceCofog;
	}

	public String getCodiceTipoCofog() {
		return codiceTipoCofog;
	}

	public void setCodiceTipoCofog(String codiceTipoCofog) {
		this.codiceTipoCofog = codiceTipoCofog;
	}

	public String getFlagFondoPluriennaleVincolato() {
		return flagFondoPluriennaleVincolato;
	}

	public void setFlagFondoPluriennaleVincolato(
			String flagFondoPluriennaleVincolato) {
		this.flagFondoPluriennaleVincolato = flagFondoPluriennaleVincolato;
	}

	
	public String getFlagFondoSvalutazioneCrediti() {
		return flagFondoSvalutazioneCrediti;
	}

	public void setFlagFondoSvalutazioneCrediti(String flagFondoSvalutazioneCrediti) {
		this.flagFondoSvalutazioneCrediti = flagFondoSvalutazioneCrediti;
	}
	
	public void setFlagFondoSvalutazioneCrediti(boolean flagFondoSvalutazioneCrediti) {
		this.flagFondoSvalutazioneCrediti = flagFondoSvalutazioneCrediti?"S":"N";
	}

	public String getFlagTrasferimentoOrganiComunitari() {
		return flagTrasferimentoOrganiComunitari;
	}

	public void setFlagTrasferimentoOrganiComunitari(String flagTrasferimentoOrganiComunitari) {
		this.flagTrasferimentoOrganiComunitari = flagTrasferimentoOrganiComunitari;
	}
	
	public void setFlagTrasferimentoOrganiComunitari(boolean flagTrasferimentoOrganiComunitari) {
		this.flagTrasferimentoOrganiComunitari = flagTrasferimentoOrganiComunitari?"S":"N";
	}

	public String getFlagPerMemoria() {
		return flagPerMemoria;
	}

	public void setFlagPerMemoria(String flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria;
	}
	
	public void setFlagPerMemoria(boolean flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria?"S":"N";
	}

	public String getFlagAssegnabile() {
		return flagAssegnabile;
	}

	public void setFlagAssegnabile(String flagAssegnabile) {
		this.flagAssegnabile = flagAssegnabile;
	}
	
	public void setFlagAssegnabile(boolean flagAssegnabile) {
		this.flagAssegnabile = flagAssegnabile?"S":"N";
	}

	public String getFlagFunzioniDelegate() {
		return flagFunzioniDelegate;
	}

	public void setFlagFunzioniDelegate(String flagFunzioniDelegate) {
		this.flagFunzioniDelegate = flagFunzioniDelegate;
	}
	
	public void setFlagFunzioniDelegate(boolean flagFunzioniDelegate) {
		this.flagFunzioniDelegate = flagFunzioniDelegate?"S":"N";
	}

	public String getFlagRilevanteIva() {
		return flagRilevanteIva;
	}

	public void setFlagRilevanteIva(String flagRilevanteIva) {
		this.flagRilevanteIva = flagRilevanteIva;
	}
	
	public void setFlagRilevanteIva(boolean flagRilevanteIva) {
		this.flagRilevanteIva = flagRilevanteIva?"S":"N";
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

	public StatoOperativoElementoDiBilancio getStatoOperativo() {
		return statoOperativo;
	}

	public void setStatoOperativo(StatoOperativoElementoDiBilancio stato) {
		this.statoOperativo = stato;
	}

	public Integer getNumeroUEB() {
		return numeroUEB;
	}

	public void setNumeroUEB(Integer numeroUEB) {
		this.numeroUEB = numeroUEB;
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

	public String getCodiceSiopeSpesa() {
		return codiceSiopeSpesa;
	}

	public void setCodiceSiopeSpesa(String codiceSiopeSpesa) {
		this.codiceSiopeSpesa = codiceSiopeSpesa;
	}

	public String getCodiceRicorrenteSpesa() {
		return codiceRicorrenteSpesa;
	}

	public void setCodiceRicorrenteSpesa(String codiceRicorrenteSpesa) {
		this.codiceRicorrenteSpesa = codiceRicorrenteSpesa;
	}

	public String getCodicePerimetroSanitarioSpesa() {
		return codicePerimetroSanitarioSpesa;
	}

	public void setCodicePerimetroSanitarioSpesa(String codicePerimetroSanitarioSpesa) {
		this.codicePerimetroSanitarioSpesa = codicePerimetroSanitarioSpesa;
	}

	public String getCodiceTransazioneUnioneEuropeaSpesa() {
		return codiceTransazioneUnioneEuropeaSpesa;
	}

	public void setCodiceTransazioneUnioneEuropeaSpesa(String codiceTransazioneUnioneEuropeaSpesa) {
		this.codiceTransazioneUnioneEuropeaSpesa = codiceTransazioneUnioneEuropeaSpesa;
	}

	public String getCodicePoliticheRegionaliUnitarie() {
		return codicePoliticheRegionaliUnitarie;
	}

	public void setCodicePoliticheRegionaliUnitarie(String codicePoliticheRegionaliUnitarie) {
		this.codicePoliticheRegionaliUnitarie = codicePoliticheRegionaliUnitarie;
	}

	public String getCodiceTipoSiopeSpesa() {
		return codiceTipoSiopeSpesa;
	}

	public void setCodiceTipoSiopeSpesa(String codiceTipoSiopeSpesa) {
		this.codiceTipoSiopeSpesa = codiceTipoSiopeSpesa;
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
	 * @return the codiceRisorsaAccantonata
	 */
	public String getCodiceRisorsaAccantonata() {
		return codiceRisorsaAccantonata;
	}

	/**
	 * @param codiceRisorsaAccantonata the codiceRisorsaAccantonata to set
	 */
	public void setCodiceRisorsaAccantonata(String codiceRisorsaAccantonata) {
		this.codiceRisorsaAccantonata = codiceRisorsaAccantonata;
	}
	//task-90
	public Integer getIdStrutturaAmmCont() {
		return idStrutturaAmmCont;
	}

	public void setIdStrutturaAmmCont(Integer idStrutturaAmmCont) {
		this.idStrutturaAmmCont = idStrutturaAmmCont;
	}
}
