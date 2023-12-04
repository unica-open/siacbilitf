/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.fcde.AccantonamentoFondiDubbiaEsigibilita;

/**
 * CapitoloEntrataPrevisione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class CapitoloEntrataPrevisione extends Capitolo<ImportiCapitoloEP,ImportiCapitoloEG> {

	private static final long serialVersionUID = 7744961258891576625L;

	private Boolean flagEntrateRicorrenti;
	private Boolean flagPerMemoria;
	private BigDecimal percEntrataRicorrente;

	private TitoloEntrata titoloEntrata;
	private TipologiaTitolo tipologiaTitolo;
	private CategoriaTipologiaTitolo categoriaTipologiaTitolo;
	
	private List<VincoliCapitoloUEPrev> listaVincoliUEPrev = new ArrayList<VincoliCapitoloUEPrev>();

	private RicorrenteEntrata ricorrenteEntrata;
	private PerimetroSanitarioEntrata perimetroSanitarioEntrata;
	private SiopeEntrata siopeEntrata;
	private TransazioneUnioneEuropeaEntrata transazioneUnioneEuropeaEntrata;
	
	// CR-4088
	private AccantonamentoFondiDubbiaEsigibilita accantonamentoFondiDubbiaEsigibilita;
	// SIAC-5582
	private Boolean flagAccertatoPerCassa;
	// SIAC-7858
	private Boolean flagEntrataDubbiaEsigFCDE;
	
	
	public CapitoloEntrataPrevisione(){
		super(TipoCapitolo.CAPITOLO_ENTRATA_PREVISIONE);
	}

	public Boolean isFlagEntrateRicorrenti() {
		return flagEntrateRicorrenti;
	}

	public void setFlagEntrateRicorrenti(Boolean flagEntrataRicorrente) {
		this.flagEntrateRicorrenti = flagEntrataRicorrente;
	}

	public Boolean isFlagPerMemoria() {
		return flagPerMemoria;
	}

	public void setFlagPerMemoria(Boolean flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria;
	}

	public BigDecimal getPercEntrataRicorrente() {
		return percEntrataRicorrente;
	}

	public Boolean getFlagEntrateRicorrenti() {
		return flagEntrateRicorrenti;
	}

	public Boolean getFlagPerMemoria() {
		return flagPerMemoria;
	}

	public void setPercEntrataRicorrente(BigDecimal percEntrataRicorrente) {
		this.percEntrataRicorrente = percEntrataRicorrente;
	}

	public TitoloEntrata getTitoloEntrata() {
		return titoloEntrata;
	}

	public void setTitoloEntrata(TitoloEntrata titoloEntrata) {
		this.titoloEntrata = titoloEntrata;
	}

	public TipologiaTitolo getTipologiaTitolo() {
		return tipologiaTitolo;
	}

	public void setTipologiaTitolo(TipologiaTitolo tipologiaTitolo) {
		this.tipologiaTitolo = tipologiaTitolo;
	}

	public CategoriaTipologiaTitolo getCategoriaTipologiaTitolo() {
		return categoriaTipologiaTitolo;
	}

	public void setCategoriaTipologiaTitolo(CategoriaTipologiaTitolo categoriaTipologiaTitolo) {
		this.categoriaTipologiaTitolo = categoriaTipologiaTitolo;
	}

	public List<VincoliCapitoloUEPrev> getListaVincoliUEPrev() {
		return listaVincoliUEPrev;
	}

	public void setListaVincoliUEPrev(List<VincoliCapitoloUEPrev> listaVincoliUEPrev) {
		this.listaVincoliUEPrev = listaVincoliUEPrev;
	}

	public ImportiCapitoloEG getImportiCapitoloEG() {
		return getImportiCapitoloEquivalente();
	}

	public void setImportiCapitoloEG(ImportiCapitoloEG importiCapitoloEG) {
		setImportiCapitoloEquivalente(importiCapitoloEG);
	}
	
	public List<ImportiCapitoloEP> getListaImportiCapitoloEP() {
		if(getListaImportiCapitolo()==null) {
			setListaImportiCapitolo(new ArrayList<ImportiCapitoloEP>());
		}
		return getListaImportiCapitolo();
	}

	public void setListaImportiCapitoloEP(List<ImportiCapitoloEP> listaImportiCapitoloEP) {
		setListaImportiCapitolo(listaImportiCapitoloEP);
	}
	
	public ImportiCapitoloEP getImportiCapitoloEP() {
		return getImportiCapitolo();
	}

	public void setImportiCapitoloEP(ImportiCapitoloEP importiCapitoloEP) {
		setImportiCapitolo(importiCapitoloEP);
	}

	public void addImportoCapitoloEP(ImportiCapitoloEP importoCapitoloEP) {
		if (importoCapitoloEP != null) {
			getListaImportiCapitoloEP().add(importoCapitoloEP);
		}
	}

	public RicorrenteEntrata getRicorrenteEntrata() {
		return ricorrenteEntrata;
	}

	public void setRicorrenteEntrata(RicorrenteEntrata ricorrenteEntrata) {
		this.ricorrenteEntrata = ricorrenteEntrata;
	}

	public PerimetroSanitarioEntrata getPerimetroSanitarioEntrata() {
		return perimetroSanitarioEntrata;
	}

	public void setPerimetroSanitarioEntrata(PerimetroSanitarioEntrata perimetroSanitarioEntrata) {
		this.perimetroSanitarioEntrata = perimetroSanitarioEntrata;
	}

	public SiopeEntrata getSiopeEntrata() {
		return siopeEntrata;
	}

	public void setSiopeEntrata(SiopeEntrata siopeEntrata) {
		this.siopeEntrata = siopeEntrata;
	}

	public TransazioneUnioneEuropeaEntrata getTransazioneUnioneEuropeaEntrata() {
		return transazioneUnioneEuropeaEntrata;
	}

	public void setTransazioneUnioneEuropeaEntrata(TransazioneUnioneEuropeaEntrata transazioneUnioneEuropeaEntrata) {
		this.transazioneUnioneEuropeaEntrata = transazioneUnioneEuropeaEntrata;
	}

	/**
	 * @return the accantonamentoFondiDubbiaEsigibilita
	 */
	public AccantonamentoFondiDubbiaEsigibilita getAccantonamentoFondiDubbiaEsigibilita() {
		return accantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @param accantonamentoFondiDubbiaEsigibilita the accantonamentoFondiDubbiaEsigibilita to set
	 */
	public void setAccantonamentoFondiDubbiaEsigibilita(
			AccantonamentoFondiDubbiaEsigibilita accantonamentoFondiDubbiaEsigibilita) {
		this.accantonamentoFondiDubbiaEsigibilita = accantonamentoFondiDubbiaEsigibilita;
	}

	/**
	 * @return the flagAccertatoPerCassa
	 */
	public Boolean getFlagAccertatoPerCassa() {
		return this.flagAccertatoPerCassa;
	}

	/**
	 * @param flagAccertatoPerCassa the flagAccertatoPerCassa to set
	 */
	public void setFlagAccertatoPerCassa(Boolean flagAccertatoPerCassa) {
		this.flagAccertatoPerCassa = flagAccertatoPerCassa;
	}

	/**
	 * @return the flagEntrataDubbiaEsigFCDE
	 */
	public Boolean getFlagEntrataDubbiaEsigFCDE() {
		return this.flagEntrataDubbiaEsigFCDE;
	}

	/**
	 * @param flagEntrataDubbiaEsigFCDE the flagEntrataDubbiaEsigFCDE to set
	 */
	public void setFlagEntrataDubbiaEsigFCDE(Boolean flagEntrataDubbiaEsigFCDE) {
		this.flagEntrataDubbiaEsigFCDE = flagEntrataDubbiaEsigFCDE;
	}
	
}
