/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * CapitoloEntrataGestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class CapitoloEntrataGestione extends Capitolo<ImportiCapitoloEG,ImportiCapitoloEG> {

	private static final long serialVersionUID = 5031976218844555011L;

	private Boolean flagEntrateRicorrenti;
	private BigDecimal percEntrataRicorrente;

	private TitoloEntrata titoloEntrata;
	private TipologiaTitolo tipologiaTitolo;
	private CategoriaTipologiaTitolo categoriaTipologiaTitolo;
	
	private List<VincoliCapitoloUEGest> listaVincoliUEGestione = new ArrayList<VincoliCapitoloUEGest>();
		
	private RicorrenteEntrata ricorrenteEntrata;
	private PerimetroSanitarioEntrata perimetroSanitarioEntrata;
	private SiopeEntrata siopeEntrata;
	private TransazioneUnioneEuropeaEntrata transazioneUnioneEuropeaEntrata;
	
	// SIAC-5582
	private Boolean flagAccertatoPerCassa;
	
	public CapitoloEntrataGestione() {
		super(TipoCapitolo.CAPITOLO_ENTRATA_GESTIONE);
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

	public void setCategoriaTipologiaTitolo(
			CategoriaTipologiaTitolo categoriaTipologiaTitolo) {
		this.categoriaTipologiaTitolo = categoriaTipologiaTitolo;
	}

	public Boolean getFlagEntrateRicorrenti() {
		return flagEntrateRicorrenti;
	}
	
	public Boolean isFlagEntrateRicorrenti() {
		return flagEntrateRicorrenti;
	}

	public void setFlagEntrateRicorrenti(Boolean flagEntrateRicorrenti) {
		this.flagEntrateRicorrenti = flagEntrateRicorrenti;
	}

	public BigDecimal getPercEntrataRicorrente() {
		return percEntrataRicorrente;
	}

	public void setPercEntrataRicorrente(BigDecimal percEntrataRicorrente) {
		this.percEntrataRicorrente = percEntrataRicorrente;
	}

	public List<VincoliCapitoloUEGest> getListaVincoliUEGestione() {
		return listaVincoliUEGestione;
	}


	public void setListaVincoliUEGestione(List<VincoliCapitoloUEGest> listaVincoliUEGestione) {
		this.listaVincoliUEGestione = listaVincoliUEGestione;
	}

	public ImportiCapitoloEG getImportiCapitoloEG() {
		return getImportiCapitolo();
	}

	public void setImportiCapitoloEG(
			ImportiCapitoloEG importiCapitoloEG) {
		setImportiCapitolo(importiCapitoloEG);
	}

	public List<ImportiCapitoloEG> getListaImportiCapitoloEG() {
		if(getListaImportiCapitolo()==null) {
			setListaImportiCapitolo(new ArrayList<ImportiCapitoloEG>());
		}
		return getListaImportiCapitolo();
	}

	public void setListaImportiCapitoloEG(List<ImportiCapitoloEG> listaImportiCapitoloEG) {
		setListaImportiCapitolo(listaImportiCapitoloEG);
	}

	public void addImportoCapitoloEG(ImportiCapitoloEG importoCapitoloEG) {	
		if(importoCapitoloEG!=null) {
			getListaImportiCapitoloEG().add(importoCapitoloEG);
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

}
