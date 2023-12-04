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
public class CapitoloMassivaUscitaGestione extends CapitoloUscitaGestione {

	private static final long serialVersionUID = -43232960421863838L;
	
//	private Bilancio bilancio;
//	private CapitoloUscitaGestione capitoloUscita;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
//	private List<ImportiCapitoloUG> importiCapitoloUG = new ArrayList<ImportiCapitoloUG>();
//	private ImportiCapitoloUP importiCapitoloUP;
//	private List<VincoliCapitoloUEGest> listaVincoliUEGest = new ArrayList<VincoliCapitoloUEGest>();
//	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
//	private TipoFinanziamento tipoFinanziamento;
//	private TipoFondo tipoFondo;
//	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();

	private List<CapitoloUscitaGestione> elencoCapitoli = new ArrayList<CapitoloUscitaGestione>();
	
	
	public List<CapitoloUscitaGestione> getElencoCapitoli() {
		return elencoCapitoli;
	}

	public void setElencoCapitoli(List<CapitoloUscitaGestione> elencoCapitoli) {
		this.elencoCapitoli = elencoCapitoli;
	}

	public void addCapitolo(CapitoloUscitaGestione capitoloCorrente) {
		elencoCapitoli.add(capitoloCorrente);
	}
	
	

//	public Bilancio getBilancio() {
//		return bilancio;
//	}
//
//	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
//	}

//	public CapitoloUscitaGestione getCapitoloUscita() {
//		return capitoloUscita;
//	}
//
//	public void setCapitoloUscita(CapitoloUscitaGestione capitoloUscita) {
//		this.capitoloUscita = capitoloUscita;
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

//	public List<ImportiCapitoloUG> getListaImportiCapitoloUG() {
//		return importiCapitoloUG;
//	}
//
//	public void setListaImportiCapitoloUG(List<ImportiCapitoloUG> importiCapitoloUG) {
//		this.importiCapitoloUG = importiCapitoloUG;
//	}

//	public ImportiCapitoloUP getImportiCapitoloUP() {
//		return importiCapitoloUP;
//	}
//
//	public void setImportiCapitoloUP(ImportiCapitoloUP importiCapitoloUP) {
//		this.importiCapitoloUP = importiCapitoloUP;
//	}

//	public List<VincoliCapitoloUEGest> getListaVincoliUEGest() {
//		return listaVincoliUEGest;
//	}
//
//	public void setListaVincoliUEGest(List<VincoliCapitoloUEGest> listaVincoliUEGest) {
//		this.listaVincoliUEGest = listaVincoliUEGest;
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
