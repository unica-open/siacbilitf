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
public class CapitoloMassivaUscitaPrevisione extends CapitoloUscitaPrevisione {

	private static final long serialVersionUID = -6613095181422300395L;
	
	private List<CapitoloUscitaPrevisione> elencoCapitoli = new ArrayList<CapitoloUscitaPrevisione>();
	
//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
//	private List<ImportiCapitoloUP> listaImportiCapitoloUP = new ArrayList<ImportiCapitoloUP>();
//	private ImportiCapitoloUG importiCapitoloUG;
//	private List<VincoliCapitoloUEPrev> listaVincoliUEPrev = new ArrayList<VincoliCapitoloUEPrev>();
//	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
//	private TipoFinanziamento tipoFinanziamento;
//	private TipoFondo tipoFondo;
//	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();


	public List<CapitoloUscitaPrevisione> getElencoCapitoli() {
		return elencoCapitoli;
	}

	public void setElencoCapitoli(List<CapitoloUscitaPrevisione> elencoCapitoli) {
		this.elencoCapitoli = elencoCapitoli;
	}
	
	public void addCapitolo(CapitoloUscitaPrevisione toAdd) {
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
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		return getBilancio().getFaseEStatoAttualeBilancio();
	}

	public void setFaseEStatoAttualeBilancio(
			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
		
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		this.getBilancio().setFaseEStatoAttualeBilancio(faseEStatoAttualeBilancio);
	}
	
	

//	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
//		
//		return faseEStatoAttualeBilancio;
//	}
//
//	public void setFaseEStatoAttualeBilancio(
//			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
//	}

//	public List<ImportiCapitoloUP> getListaImportiCapitoloUP() {
//		return listaImportiCapitoloUP;
//	}
//
//	public void setListaImportiCapitoloUP(
//			List<ImportiCapitoloUP> listaImportiCapitoloUP) {
//		this.listaImportiCapitoloUP = listaImportiCapitoloUP;
//	}
//
//	public ImportiCapitoloUG getImportiCapitoloUG() {
//		return importiCapitoloUG;
//	}
//
//	public void setImportiCapitoloUG(ImportiCapitoloUG importiCapitoloUG) {
//		this.importiCapitoloUG = importiCapitoloUG;
//	}
//
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
		
		return getClassificatoriGenerici();
//		return listaClassificatori;
	}

	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
//		this.listaClassificatori = listaClassificatori;
		setClassificatoriGenerici(listaClassificatori);
		
	}
	
	
}
