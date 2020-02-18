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
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.model.ClassificazioneCofog;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siacbilser.model.ImportiCapitoloUP;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siacbilser.model.VincoliCapitoloUEPrev;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.FaseEStatoAttualeBilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Risposta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaDettaglioCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioCapitoloUscitaPrevisioneResponse extends
		ServiceResponse {

	private CapitoloUscitaPrevisione capitoloUscitaPrevisione = new CapitoloUscitaPrevisione();
//	private Bilancio bilancio;
//	private List<ImportiCapitoloUP> listaImportiCapitoloUP;
//	private ElementoPianoDeiConti elementoPianoDeiConti;
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private Missione missione;
//	private Programma programma;
//	private ClassificazioneCofog classificazioneCofog;
//	private TitoloSpesa titoloSpesa;
//	private Macroaggregato macroaggregato;
//	private TipoFinanziamento tipoFinanziamento;
//	private TipoFondo tipoFondo;
//	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();
	
//	private ImportiCapitoloUG importiCapitoloUG;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;	
//	private List<VincoliCapitoloUEPrev> listaVincoliUEPrev = new ArrayList<VincoliCapitoloUEPrev>();
//	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
	
	
	public CapitoloUscitaPrevisione getCapitoloUscitaPrevisione() {
		return capitoloUscitaPrevisione;
	}

	public void setCapitoloUscitaPrevisione(
			CapitoloUscitaPrevisione capitoloUscitaPrevisione) {
//		this.capitoloUscitaPrevisione = capitoloUscitaPrevisione;
		DummyMapper.mapNotNullNotEmpty(capitoloUscitaPrevisione, this.capitoloUscitaPrevisione);
	}
	
	@XmlTransient
	public List<ImportiCapitoloUP> getListaImportiCapitoloUP() {
//		return listaImportiCapitoloUP;
		return getCapitoloUscitaPrevisione().getListaImportiCapitoloUP();
	}

	public void setListaImportiCapitoloUP(
			List<ImportiCapitoloUP> listaImportiCapitoloUP) {
//		this.listaImportiCapitoloUP = listaImportiCapitoloUP;
		getCapitoloUscitaPrevisione().setListaImportiCapitoloUP(listaImportiCapitoloUP);
	}
	
	
	public void addImportoCapitoloUP(ImportiCapitoloUP importoCapitoloUp) {
		
		getCapitoloUscitaPrevisione().addImportoCapitoloUP(importoCapitoloUp);
		
//		if(this.listaImportiCapitoloUP==null) {
//			this.listaImportiCapitoloUP = new ArrayList<ImportiCapitoloUP>();
//		}
//		if(importoCapitoloUp!=null) {
//			listaImportiCapitoloUP.add(importoCapitoloUp);
//		}
//		
//		if(getListaImportiCapitoloUP()==null) {
//			setListaImportiCapitoloUP(new ArrayList<ImportiCapitoloUP>());
//		}
//		if(importoCapitoloUp!=null) {
//			getListaImportiCapitoloUP().add(importoCapitoloUp);
//		}
	}

	@XmlTransient
	public ImportiCapitoloUG getImportiCapitoloUG() {
//		return importiCapitoloUG;
		return getCapitoloUscitaPrevisione().getImportiCapitoloUG();
	}

	public void setImportiCapitoloUG(ImportiCapitoloUG importiCapitoloUG) {
//		this.importiCapitoloUG = importiCapitoloUG;
		getCapitoloUscitaPrevisione().setImportiCapitoloUG(importiCapitoloUG);
	}

	@XmlTransient
	public ClassificazioneCofog getClassificazioneCofog() {
//		return classificazioneCofog;
		return getCapitoloUscitaPrevisione().getClassificazioneCofog();
	}

	public void setClassificazioneCofog(
			ClassificazioneCofog classificazioneCofog) {
//		this.classificazioneCofog = classificazioneCofog;
		getCapitoloUscitaPrevisione().setClassificazioneCofog(classificazioneCofog);
	}

	@XmlTransient
	public TitoloSpesa getTitoloSpesa() {
//		return titoloSpesa;
		return getCapitoloUscitaPrevisione().getTitoloSpesa();
	}

	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
//		this.titoloSpesa = titoloSpesa;
		getCapitoloUscitaPrevisione().setTitoloSpesa(titoloSpesa);
	}

	@XmlTransient
	public Macroaggregato getMacroaggregato() {
//		return macroaggregato;
		return getCapitoloUscitaPrevisione().getMacroaggregato();
	}

	public void setMacroaggregato(Macroaggregato macroaggregato) {
//		this.macroaggregato = macroaggregato;
		getCapitoloUscitaPrevisione().setMacroaggregato(macroaggregato);
	}

	@XmlTransient
	public List<VincoliCapitoloUEPrev> getListaVincoliUEPrev() {
//		return listaVincoliUEPrev;
		return getCapitoloUscitaPrevisione().getListaVincoliUEPrev();
	}

	public void setListaVincoliUEPrev(
			List<VincoliCapitoloUEPrev> listaVincoliUEPrev) {
//		this.listaVincoliUEPrev = listaVincoliUEPrev;
		getCapitoloUscitaPrevisione().setListaVincoliUEPrev(listaVincoliUEPrev);
	}

	@XmlTransient
	public List<ClassificatoreGenerico> getListaClassificatori() {
//		return listaClassificatori;
		return getCapitoloUscitaPrevisione().getClassificatoriGenerici();
	}

	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
//		this.listaClassificatori = listaClassificatori;
		getCapitoloUscitaPrevisione().setClassificatoriGenerici(listaClassificatori);
	}

	@XmlTransient
	public Bilancio getBilancio() {
//		return bilancio;
		return getCapitoloUscitaPrevisione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;		
//		FaseEStatoAttualeBilancio fase = getFaseEStatoAttualeBilancio();
		this.getCapitoloUscitaPrevisione().setBilancio(bilancio);
//		setFaseEStatoAttualeBilancio(fase);
		
	}

	@XmlTransient
	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		return getCapitoloUscitaPrevisione().getBilancio().getFaseEStatoAttualeBilancio();
	}

	public void setFaseEStatoAttualeBilancio(
			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
		
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		getCapitoloUscitaPrevisione().getBilancio().setFaseEStatoAttualeBilancio(faseEStatoAttualeBilancio);
	}



	@XmlTransient
	public Missione getMissione() {
//		return missione;
		return getCapitoloUscitaPrevisione().getMissione();
	}

	public void setMissione(Missione missione) {
//		this.missione = missione;
		getCapitoloUscitaPrevisione().setMissione(missione);
	}

	@XmlTransient
	public Programma getProgramma() {
//		return programma;
		return getCapitoloUscitaPrevisione().getProgramma();
	}

	public void setProgramma(Programma programma) {
//		this.programma = programma;
		getCapitoloUscitaPrevisione().setProgramma(programma);
	}

	@XmlTransient
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
//		return elementoPianoDeiConti;
		return getCapitoloUscitaPrevisione().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(
			ElementoPianoDeiConti elementoPianoDeiConti) {
//		this.elementoPianoDeiConti = elementoPianoDeiConti;
		getCapitoloUscitaPrevisione().setElementoPianoDeiConti(elementoPianoDeiConti);
	}

	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
//		return struttAmmContabile;
		return getCapitoloUscitaPrevisione().getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile struttAmmContabile) {
//		this.struttAmmContabile = struttAmmContabile;
		getCapitoloUscitaPrevisione().setStrutturaAmministrativoContabile(struttAmmContabile);
	}

	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
//		return tipoFinanziamento;
		return getCapitoloUscitaPrevisione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
//		this.tipoFinanziamento = tipoFinanziamento;
		getCapitoloUscitaPrevisione().setTipoFinanziamento(tipoFinanziamento);
	}

	@XmlTransient
	public TipoFondo getTipoFondo() {
//		return tipoFondo;
		return getCapitoloUscitaPrevisione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
//		this.tipoFondo = tipoFondo;
		getCapitoloUscitaPrevisione().setTipoFondo(tipoFondo);
	}

	@XmlTransient
	public List<AttoDiLeggeCapitolo> getListaAttiDiLeggeCapitolo() {
//		return listaAttiDiLeggeCapitolo;
		return getCapitoloUscitaPrevisione().getListaAttiDiLeggeCapitolo();
	}

	public void setListaAttiDiLeggeCapitolo(
			List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo) {
//		this.listaAttiDiLeggeCapitolo = listaAttiDiLeggeCapitolo;
		getCapitoloUscitaPrevisione().setListaAttiDiLeggeCapitolo(listaAttiDiLeggeCapitolo);
	}

}
