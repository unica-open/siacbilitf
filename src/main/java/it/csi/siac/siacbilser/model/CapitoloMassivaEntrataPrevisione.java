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
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * CapitoloUscitaPrevisione
 * 
 * @author rmontuori
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class CapitoloMassivaEntrataPrevisione extends CapitoloEntrataPrevisione {

	private static final long serialVersionUID = -6613095181422300395L;
	
	private List<CapitoloEntrataPrevisione> elencoCapitoli = new ArrayList<CapitoloEntrataPrevisione>();
	
//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
//	private CapitoloEntrataPrevisione capitoloEntrataPrevisione;
//	private List<ImportiCapitoloEP> listaImportiCapitoloEP;
//	private ImportiCapitoloEG importiCapitoloEG;
//	private TitoloEntrata titoloEntrata;
//	private TipologiaTitolo tipologiaTitolo;
//	private CategoriaTipologiaTitolo categoriaTipTitolo;
//	private ElementoPianoDeiConti elementoPdC;
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private List<VincoliCapitoloUEPrev> listaVincoliUEPrev = new ArrayList<VincoliCapitoloUEPrev>();
//	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
//	private TipoFinanziamento tipoFinanziamento;
//	private TipoFondo tipoFondo;
//	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();

	public List<CapitoloEntrataPrevisione> getElencoCapitoli() {
		return elencoCapitoli;
	}

	public void setElencoCapitoli(List<CapitoloEntrataPrevisione> elencoCapitoli) {
		this.elencoCapitoli = elencoCapitoli;
	}
	
	public void addCapitolo(CapitoloEntrataPrevisione toAdd) {
		getElencoCapitoli().add(toAdd);
	}

//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}

//	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
//		return faseEStatoAttualeBilancio;
//	}
//
//	public void setFaseEStatoAttualeBilancio(
//			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
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

//	public CapitoloEntrataPrevisione getCapitoloEntrataPrevisione() {
//		return capitoloEntrataPrevisione;
//	}
//
//	public void setCapitoloEntrataPrevisione(
//			CapitoloEntrataPrevisione capitoloEntrataPrevisione) {
//		this.capitoloEntrataPrevisione = capitoloEntrataPrevisione;
//	}

//	public List<ImportiCapitoloEP> getListaImportiCapitoloEP() {
//		return listaImportiCapitoloEP;
//	}
//
//	public void setListaImportiCapitoloEP(
//			List<ImportiCapitoloEP> listaImportiCapitoloEP) {
//		this.listaImportiCapitoloEP = listaImportiCapitoloEP;
//	}
//
//	public ImportiCapitoloEG getImportiCapitoloEG() {
//		return importiCapitoloEG;
//	}
//
//	public void setImportiCapitoloEG(ImportiCapitoloEG importiCapitoloEG) {
//		this.importiCapitoloEG = importiCapitoloEG;
//	}
//
//	public TitoloEntrata getTitoloEntrata() {
//		return titoloEntrata;
//	}

//	public void setTitoloEntrata(TitoloEntrata titoloEntrata) {
//		this.titoloEntrata = titoloEntrata;
//	}
//
//	public TipologiaTitolo getTipologiaTitolo() {
//		return tipologiaTitolo;
//	}
//
//	public void setTipologiaTitolo(TipologiaTitolo tipologiaTitolo) {
//		this.tipologiaTitolo = tipologiaTitolo;
//	}
	@XmlTransient
	public CategoriaTipologiaTitolo getCategoriaTipTitolo() {
//		return categoriaTipTitolo;
		return super.getCategoriaTipologiaTitolo();
		
	}

	public void setCategoriaTipTitolo(CategoriaTipologiaTitolo categoriaTipTitolo) {
//		this.categoriaTipTitolo = categoriaTipTitolo;
		super.setCategoriaTipologiaTitolo(categoriaTipTitolo);
	}
	@XmlTransient
	public ElementoPianoDeiConti getElementoPdC() {
//		return elementoPdC;
		return super.getElementoPianoDeiConti();
	}

	public void setElementoPdC(ElementoPianoDeiConti elementoPdC) {
//		this.elementoPdC = elementoPdC;
		super.setElementoPianoDeiConti(elementoPdC);
	}
	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
//		return struttAmmContabile;
		return super.getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile struttAmmContabile) {
		super.setStrutturaAmministrativoContabile(struttAmmContabile);
//		this.struttAmmContabile = struttAmmContabile;
	}

//	public List<VincoliCapitoloUEPrev> getListaVincoliUEPrev() {
//		return listaVincoliUEPrev;
//	}
//
//	public void setListaVincoliUEPrev(List<VincoliCapitoloUEPrev> listaVincoliUEPrev) {
//		this.listaVincoliUEPrev = listaVincoliUEPrev;
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
		return getClassificatoriGenerici();
	}

	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
//		this.listaClassificatori = listaClassificatori;
		setClassificatoriGenerici(listaClassificatori);
	}
	
	
}
