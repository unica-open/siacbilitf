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
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloEG;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siacbilser.model.TipologiaTitolo;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.VincoliCapitoloUEGest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.FaseEStatoAttualeBilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Risposta al metodo
 * BIL.CapitoloEntrataGestioneService.ricercaDettaglioCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioCapitoloEntrataGestioneResponse extends
		ServiceResponse {

	private CapitoloEntrataGestione capitoloEntrataGestione = new CapitoloEntrataGestione();
//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
//	private List<ImportiCapitoloEG> listaImportiCapitoloEG;
//	private ImportiCapitoloEP importiCapitoloEP;
//	private TitoloEntrata titoloEntrata;
//	private TipologiaTitolo tipologiaTitolo;
//	private CategoriaTipologiaTitolo categoriaTipologiaTitolo;
//	private ElementoPianoDeiConti elementoPdC;
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private List<VincoliCapitoloUEGest> listaVincoliUEGestione = new ArrayList<VincoliCapitoloUEGest>();
//	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
//	private TipoFinanziamento tipoFinanziamento;
//	private TipoFondo tipoFondo;
//	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();

	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}
	
	public void setCapitoloEntrataGestione(
			CapitoloEntrataGestione c) {
//		this.capitoloEntrataGestione = capitoloEntrataGestione;
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloEntrataGestione);
	}
	
	
	@XmlTransient
	public Bilancio getBilancio() {
		return getCapitoloEntrataGestione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
//		FaseEStatoAttualeBilancio fase = getFaseEStatoAttualeBilancio();
		this.getCapitoloEntrataGestione().setBilancio(bilancio);
//		setFaseEStatoAttualeBilancio(fase);
		
	}

	@XmlTransient
	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		return getCapitoloEntrataGestione().getBilancio().getFaseEStatoAttualeBilancio();
	}

	public void setFaseEStatoAttualeBilancio(
			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
		
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		getCapitoloEntrataGestione().getBilancio().setFaseEStatoAttualeBilancio(faseEStatoAttualeBilancio);
	}

	@XmlTransient
	public List<ImportiCapitoloEG> getListaImportiCapitoloEG() {
		return getCapitoloEntrataGestione().getListaImportiCapitoloEG();
	}

	public void setListaImportiCapitoloEG(
			List<ImportiCapitoloEG> listaImportiCapitoloEG) {
		getCapitoloEntrataGestione().setListaImportiCapitoloEG(listaImportiCapitoloEG);
	}

	public void addImportoCapitoloEG(ImportiCapitoloEG importoCapitoloEG) {
		
		getCapitoloEntrataGestione().addImportoCapitoloEG(importoCapitoloEG);
		
//		if(this.listaImportiCapitoloEG==null) {
//			this.listaImportiCapitoloEG = new ArrayList<ImportiCapitoloEG>();
//		}
//		if(importoCapitoloEG!=null) {
//			listaImportiCapitoloEG.add(importoCapitoloEG);
//		}
	}
	@XmlTransient
	public TitoloEntrata getTitoloEntrata() {
		return getCapitoloEntrataGestione().getTitoloEntrata();
	}

	public void setTitoloEntrata(TitoloEntrata titoloEntrata) {
		getCapitoloEntrataGestione().setTitoloEntrata(titoloEntrata);
	}
	@XmlTransient
	public ImportiCapitoloEG getImportiCapitoloEquivalente() {
		return getCapitoloEntrataGestione().getImportiCapitoloEquivalente();
	}

	public void setImportiCapitoloEquivalente(
			ImportiCapitoloEG importiCapitoloEGAnnoPrecdente) {
		getCapitoloEntrataGestione().setImportiCapitoloEquivalente(importiCapitoloEGAnnoPrecdente);
	}
	@XmlTransient
	public TipologiaTitolo getTipologiaTitolo() {
		return getCapitoloEntrataGestione().getTipologiaTitolo();
	}

	public void setTipologiaTitolo(TipologiaTitolo tipologiaTitolo) {
		getCapitoloEntrataGestione().setTipologiaTitolo(tipologiaTitolo);
	}
	@XmlTransient
	public CategoriaTipologiaTitolo getCategoriaTipologiaTitolo() {
		return getCapitoloEntrataGestione().getCategoriaTipologiaTitolo();
	}

	public void setCategoriaTipologiaTitolo(
			CategoriaTipologiaTitolo categoriaTipologiaTitolo) {
		getCapitoloEntrataGestione().setCategoriaTipologiaTitolo(categoriaTipologiaTitolo);
	}
	@XmlTransient
	public ElementoPianoDeiConti getElementoPdC() {
		return getCapitoloEntrataGestione().getElementoPianoDeiConti();
	}

	public void setElementoPdC(ElementoPianoDeiConti elementoPdC) {
		getCapitoloEntrataGestione().setElementoPianoDeiConti(elementoPdC);
	}
	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return getCapitoloEntrataGestione().getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile struttAmmContabile) {
		getCapitoloEntrataGestione().setStrutturaAmministrativoContabile(struttAmmContabile);
	}
	@XmlTransient
	public List<VincoliCapitoloUEGest> getListaVincoliUEGestione() {
		return getCapitoloEntrataGestione().getListaVincoliUEGestione();
	}

	public void setListaVincoliUEGestione(
			List<VincoliCapitoloUEGest> listaVincoliUEGestione) {
		getCapitoloEntrataGestione().setListaVincoliUEGestione(listaVincoliUEGestione);
	}
	@XmlTransient
	public List<AttoDiLeggeCapitolo> getListaAttiDiLeggeCapitolo() {
		return getCapitoloEntrataGestione().getListaAttiDiLeggeCapitolo();
	}

	public void setListaAttiDiLeggeCapitolo(
			List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo) {
		getCapitoloEntrataGestione().setListaAttiDiLeggeCapitolo(listaAttiDiLeggeCapitolo);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return getCapitoloEntrataGestione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		getCapitoloEntrataGestione().setTipoFinanziamento(tipoFinanziamento);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return getCapitoloEntrataGestione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		getCapitoloEntrataGestione().setTipoFondo(tipoFondo);
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getListaClassificatori() {
		return getCapitoloEntrataGestione().getClassificatoriGenerici();
	}

	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
		getCapitoloEntrataGestione().setClassificatoriGenerici(listaClassificatori);
	}

}
