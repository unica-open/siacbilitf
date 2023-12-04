/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.FaseEStatoAttualeBilancio;

/**
 * CapitoloUscitaPrevisione
 * 
 * @author rmontuori
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class CapitoloMassivaEntrataGestione extends CapitoloEntrataGestione {

	private static final long serialVersionUID = -6613095181422300397L;
	
	private List<CapitoloEntrataGestione> elencoCapitoli = new ArrayList<CapitoloEntrataGestione>();
	
//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
//	private CapitoloEntrataGestione capitoloEntrataGestione;
//	private List<ImportiCapitoloEG> listaImportiCapitoloEG;
//	private ImportiCapitoloEP importiCapitoloEP;
//	private CategoriaTipologiaTitolo categoriaTipologiaTitolo;
//	private List<VincoliCapitoloUEGest> listaVincoliUEGestione = new ArrayList<VincoliCapitoloUEGest>();
//	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
//	private TipoFinanziamento tipoFinanziamento;
//	private TipoFondo tipoFondo;
//	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();


	public List<CapitoloEntrataGestione> getElencoCapitoli() {
		return elencoCapitoli;
	}

	public void setElencoCapitoli(List<CapitoloEntrataGestione> elencoCapitoli) {
		this.elencoCapitoli = elencoCapitoli;
	}
	
	public void addCapitolo(CapitoloEntrataGestione toAdd) {
		getElencoCapitoli().add(toAdd);
	}

//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}
	
	@XmlTransient
	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
		if(super.getBilancio()==null){
			super.setBilancio(new Bilancio());
		}
		return super.getBilancio().getFaseEStatoAttualeBilancio();
	}

	public void setFaseEStatoAttualeBilancio(
			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
		
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
		if(super.getBilancio()==null){
			super.setBilancio(new Bilancio());
		}
		super.getBilancio().setFaseEStatoAttualeBilancio(faseEStatoAttualeBilancio);
	}

//	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
//		return faseEStatoAttualeBilancio;
//	}
//
//	public void setFaseEStatoAttualeBilancio(
//			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
//	}

//	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
//		return capitoloEntrataGestione;
//	}
//
//	public void setCapitoloEntrataGestione(
//			CapitoloEntrataGestione capitoloEntrataGestione) {
//		this.capitoloEntrataGestione = capitoloEntrataGestione;
//	}

//	public List<ImportiCapitoloEG> getListaImportiCapitoloEG() {
//		return listaImportiCapitoloEG;
//	}
//
//	public void setListaImportiCapitoloEG(
//			List<ImportiCapitoloEG> listaImportiCapitoloEG) {
//		this.listaImportiCapitoloEG = listaImportiCapitoloEG;
//	}

//	public ImportiCapitoloEP getImportiCapitoloEP() {
//		return importiCapitoloEP;
//	}
//
//	public void setImportiCapitoloEP(ImportiCapitoloEP importiCapitoloEP) {
//		this.importiCapitoloEP = importiCapitoloEP;
//	}
//
//	public CategoriaTipologiaTitolo getCategoriaTipologiaTitolo() {
//		return categoriaTipologiaTitolo;
//	}
//
//	public void setCategoriaTipologiaTitolo(
//			CategoriaTipologiaTitolo categoriaTipologiaTitolo) {
//		this.categoriaTipologiaTitolo = categoriaTipologiaTitolo;
//	}
//
//	public List<VincoliCapitoloUEGest> getListaVincoliUEGestione() {
//		return listaVincoliUEGestione;
//	}
//
//	public void setListaVincoliUEGestione(
//			List<VincoliCapitoloUEGest> listaVincoliUEGestione) {
//		this.listaVincoliUEGestione = listaVincoliUEGestione;
//	}
//
//	public List<AttoDiLeggeCapitolo> getListaAttiDiLeggeCapitolo() {
//		return listaAttiDiLeggeCapitolo;
//	}
//
//	public void setListaAttiDiLeggeCapitolo(
//			List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo) {
//		this.listaAttiDiLeggeCapitolo = listaAttiDiLeggeCapitolo;
//	}
//
//	public TipoFinanziamento getTipoFinanziamento() {
//		return tipoFinanziamento;
//	}
//
//	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
//		this.tipoFinanziamento = tipoFinanziamento;
//	}
//
//	public TipoFondo getTipoFondo() {
//		return tipoFondo;
//	}
//
//	public void setTipoFondo(TipoFondo tipoFondo) {
//		this.tipoFondo = tipoFondo;
//	}

	@XmlTransient
	public List<ClassificatoreGenerico> getListaClassificatori() {
//		return listaClassificatori;
		return super.getClassificatoriGenerici();
	}

	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
//		this.listaClassificatori = listaClassificatori;
		super.setClassificatoriGenerici(listaClassificatori);
	}
	
	
}
