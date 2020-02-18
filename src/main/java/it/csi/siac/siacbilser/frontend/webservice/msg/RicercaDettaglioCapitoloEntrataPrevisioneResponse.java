/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.DummyMapper;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.AttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloEG;
import it.csi.siac.siacbilser.model.ImportiCapitoloEP;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siacbilser.model.TipologiaTitolo;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.VincoliCapitoloUEPrev;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.FaseEStatoAttualeBilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Risposta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaDettaglioCapitoloEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioCapitoloEntrataPrevisioneResponse extends
		ServiceResponse {

	private CapitoloEntrataPrevisione capitoloEntrataPrevisione = new CapitoloEntrataPrevisione();
//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
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

	
	public CapitoloEntrataPrevisione getCapitoloEntrataPrevisione() {
		return capitoloEntrataPrevisione;
	}

	public void setCapitoloEntrataPrevisione(
			CapitoloEntrataPrevisione c) {
//		this.capitoloEntrataPrevisione = capitoloEntrataPrevisione;
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloEntrataPrevisione);
	}
	
	
	@XmlTransient
	public Bilancio getBilancio() {
		return getCapitoloEntrataPrevisione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
//		FaseEStatoAttualeBilancio fase = getFaseEStatoAttualeBilancio();
		this.getCapitoloEntrataPrevisione().setBilancio(bilancio);
//		setFaseEStatoAttualeBilancio(fase);
		
	}

	@XmlTransient
	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		return getCapitoloEntrataPrevisione().getBilancio().getFaseEStatoAttualeBilancio();
	}

	public void setFaseEStatoAttualeBilancio(
			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
		
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		getCapitoloEntrataPrevisione().getBilancio().setFaseEStatoAttualeBilancio(faseEStatoAttualeBilancio);
	}
	
	@XmlTransient
	public TitoloEntrata getTitoloEntrata() {
		return getCapitoloEntrataPrevisione().getTitoloEntrata();
	}

	public void setTitoloEntrata(TitoloEntrata titoloEntrata) {
		getCapitoloEntrataPrevisione().setTitoloEntrata(titoloEntrata);
	}
	@XmlTransient
	public CategoriaTipologiaTitolo getCategoriaTipTitolo() {
		return getCapitoloEntrataPrevisione().getCategoriaTipologiaTitolo();
	}

	public void setCategoriaTipTitolo(
			CategoriaTipologiaTitolo categoriaTipTitolo) {
		getCapitoloEntrataPrevisione().setCategoriaTipologiaTitolo(categoriaTipTitolo);
	}
	@XmlTransient
	public ElementoPianoDeiConti getElementoPdC() {
		return getCapitoloEntrataPrevisione().getElementoPianoDeiConti();
	}

	public void setElementoPdC(ElementoPianoDeiConti elementoPdC) {
		getCapitoloEntrataPrevisione().setElementoPianoDeiConti(elementoPdC);
	}
	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return getCapitoloEntrataPrevisione().getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile struttAmmContabile) {
		getCapitoloEntrataPrevisione().setStrutturaAmministrativoContabile(struttAmmContabile);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return getCapitoloEntrataPrevisione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		getCapitoloEntrataPrevisione().setTipoFinanziamento(tipoFinanziamento);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return getCapitoloEntrataPrevisione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		getCapitoloEntrataPrevisione().setTipoFondo(tipoFondo);
	}
	
	public void addImportoCapitoloEP(ImportiCapitoloEP importoCapitoloEP) {
		getCapitoloEntrataPrevisione().addImportoCapitoloEP(importoCapitoloEP);
		
//		if(this.listaImportiCapitoloEP==null) {
//			this.listaImportiCapitoloEP = new ArrayList<ImportiCapitoloEP>();
//		}
//		if(importoCapitoloEP!=null) {
//			listaImportiCapitoloEP.add(importoCapitoloEP);
//		}
	}
	@XmlTransient
	public List<ImportiCapitoloEP> getListaImportiCapitoloEP() {
		return getCapitoloEntrataPrevisione().getListaImportiCapitoloEP();
	}

	public void setListaImportiCapitoloEP(
			List<ImportiCapitoloEP> listaImportiCapitoloEP) {
		getCapitoloEntrataPrevisione().setListaImportiCapitoloEP(listaImportiCapitoloEP);
	}
	@XmlTransient
	public ImportiCapitoloEG getImportiCapitoloEG() {
		return getCapitoloEntrataPrevisione().getImportiCapitoloEG();
	}

	public void setImportiCapitoloEG(
			ImportiCapitoloEG importiCapitoloEGAnnoPrecedente) {
		getCapitoloEntrataPrevisione().setImportiCapitoloEG(importiCapitoloEGAnnoPrecedente);
	}
	@XmlTransient
	public List<VincoliCapitoloUEPrev> getListaVincoliUEPrev() {
		return getCapitoloEntrataPrevisione().getListaVincoliUEPrev();
	}

	public void setListaVincoliUEPrev(
			List<VincoliCapitoloUEPrev> listaVincoliUEPrev) {
		getCapitoloEntrataPrevisione().setListaVincoliUEPrev(listaVincoliUEPrev);
	}
	@XmlTransient
	public List<AttoDiLeggeCapitolo> getListaAttiDiLeggeCapitolo() {
		return getCapitoloEntrataPrevisione().getListaAttiDiLeggeCapitolo();
	}

	public void setListaAttiDiLeggeCapitolo(
			List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo) {
		getCapitoloEntrataPrevisione().setListaAttiDiLeggeCapitolo(listaAttiDiLeggeCapitolo);
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getListaClassificatori() {
		return getCapitoloEntrataPrevisione().getClassificatoriGenerici();
	}

	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
		getCapitoloEntrataPrevisione().setClassificatoriGenerici(listaClassificatori);
	}
	@XmlTransient
	public TipologiaTitolo getTipologiaTitolo() {
		return getCapitoloEntrataPrevisione().getTipologiaTitolo();
	}

	public void setTipologiaTitolo(TipologiaTitolo tipologiaTitolo) {
		getCapitoloEntrataPrevisione().setTipologiaTitolo(tipologiaTitolo);
	}

}
