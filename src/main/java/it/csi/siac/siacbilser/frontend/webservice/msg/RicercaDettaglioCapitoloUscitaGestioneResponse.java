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
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.ClassificazioneCofog;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.Missione;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siacbilser.model.VincoliCapitoloUEGest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.FaseEStatoAttualeBilancio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Risposta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaDettaglioCapitoloUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioCapitoloUscitaGestioneResponse extends
		ServiceResponse {

	private CapitoloUscitaGestione capitoloUscita = new CapitoloUscitaGestione();
//	private Bilancio bilancio;
//	private FaseEStatoAttualeBilancio faseEStatoAttualeBilancio;
//	private List<ImportiCapitoloUG> importiCapitoloUG = new ArrayList<ImportiCapitoloUG>();
//	private ImportiCapitoloUP importiCapitoloUP;
//	private Missione missione;
//	private Programma programma;
//	private TitoloSpesa titoloSpesaProgramma;
//	private Macroaggregato macroaggregatoTitolo;
//	private ElementoPianoDeiConti elementoPianoDeiConti;
//	private ClassificazioneCofog classificazioneCofog;
//	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
//	private List<VincoliCapitoloUEGest> listaVincoliUEGest = new ArrayList<VincoliCapitoloUEGest>();
//	private List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo = new ArrayList<AttoDiLeggeCapitolo>();
//	private TipoFinanziamento tipoFinanziamento;
//	private TipoFondo tipoFondo;
//	private List<ClassificatoreGenerico> listaClassificatori = new ArrayList<ClassificatoreGenerico>();

	
	public CapitoloUscitaGestione getCapitoloUscita() {
		return capitoloUscita;
	}

	public void setCapitoloUscita(CapitoloUscitaGestione c) {
//		this.capitoloUscita = capitoloUscita;
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloUscita);
	}

	@XmlTransient
	public Bilancio getBilancio() {
		return this.getCapitoloUscita().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
//		FaseEStatoAttualeBilancio fase = getFaseEStatoAttualeBilancio();
		this.getCapitoloUscita().setBilancio(bilancio);
//		setFaseEStatoAttualeBilancio(fase);
	}
	
	@XmlTransient
	public FaseEStatoAttualeBilancio getFaseEStatoAttualeBilancio() {
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		return getCapitoloUscita().getBilancio().getFaseEStatoAttualeBilancio();
	}

	public void setFaseEStatoAttualeBilancio(
			FaseEStatoAttualeBilancio faseEStatoAttualeBilancio) {
		
//		this.faseEStatoAttualeBilancio = faseEStatoAttualeBilancio;
		if(getBilancio()==null){
			setBilancio(new Bilancio());
		}
		this.getCapitoloUscita().getBilancio().setFaseEStatoAttualeBilancio(faseEStatoAttualeBilancio);
	}

	
	@XmlTransient
	public List<ImportiCapitoloUG> getListaImportiCapitoloUG() {
		return this.getCapitoloUscita().getListaImportiCapitoloUG();
	}

	public void setListaImportiCapitoloUG(List<ImportiCapitoloUG> importiCapitoloUG) {
		this.getCapitoloUscita().setListaImportiCapitoloUG(importiCapitoloUG);
	}

	public void addImportoCapitoloUG(ImportiCapitoloUG importoCapitoloUG) {
		
		this.getCapitoloUscita().addImportoCapitoloUG(importoCapitoloUG);
		
//		if(this.importiCapitoloUG==null) {
//			this.importiCapitoloUG = new ArrayList<ImportiCapitoloUG>();
//		}
//		if(importoCapitoloUG!=null) {
//			importiCapitoloUG.add(importoCapitoloUG);
//		}
	}
	@XmlTransient
	public Missione getMissione() {
		return this.getCapitoloUscita().getMissione();
	}

	public void setMissione(Missione missione) {
		this.getCapitoloUscita().setMissione(missione);
	}
	@XmlTransient
	public Programma getProgramma() {
		return this.getCapitoloUscita().getProgramma();
	}

	public void setProgramma(Programma programma) {
		this.getCapitoloUscita().setProgramma(programma);
	}
	@XmlTransient
	public TitoloSpesa getTitoloSpesaProgramma() {
		return this.getCapitoloUscita().getTitoloSpesa();
	}

	public void setTitoloSpesaProgramma(TitoloSpesa titoloSpesaProgramma) {
		this.getCapitoloUscita().setTitoloSpesa(titoloSpesaProgramma);
	}
	@XmlTransient
	public Macroaggregato getMacroaggregatoTitolo() {
		return this.getCapitoloUscita().getMacroaggregato();
	}

	public void setMacroaggregatoTitolo(Macroaggregato macroaggregatoTitolo) {
		this.getCapitoloUscita().setMacroaggregato(macroaggregatoTitolo);
	}
	@XmlTransient
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return this.getCapitoloUscita().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(
			ElementoPianoDeiConti elementoPianoDeiConti) {
		this.getCapitoloUscita().setElementoPianoDeiConti(elementoPianoDeiConti);
	}
	@XmlTransient
	public ClassificazioneCofog getClassificazioneCofog() {
		return this.getCapitoloUscita().getClassificazioneCofog();
	}

	public void setClassificazioneCofog(
			ClassificazioneCofog classificazioneCofog) {
		this.getCapitoloUscita().setClassificazioneCofog(classificazioneCofog);
	}
	@XmlTransient
	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
		return this.getCapitoloUscita().getStrutturaAmministrativoContabile();
	}

	public void setStrutturaAmministrativoContabile(
			StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
		this.getCapitoloUscita().setStrutturaAmministrativoContabile(strutturaAmministrativoContabile);
	}
	@XmlTransient
	public List<VincoliCapitoloUEGest> getListaVincoliUEGest() {
		return this.getCapitoloUscita().getListaVincoliUEGest();
	}

	public void setListaVincoliUEGest(
			List<VincoliCapitoloUEGest> listaVincoliUEGest) {
		this.getCapitoloUscita().setListaVincoliUEGest(listaVincoliUEGest);
	}
	@XmlTransient
	public List<AttoDiLeggeCapitolo> getListaAttiDiLeggeCapitolo() {
		return this.getCapitoloUscita().getListaAttiDiLeggeCapitolo();
	}

	public void setListaAttiDiLeggeCapitolo(
			List<AttoDiLeggeCapitolo> listaAttiDiLeggeCapitolo) {
		this.getCapitoloUscita().setListaAttiDiLeggeCapitolo(listaAttiDiLeggeCapitolo);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return this.getCapitoloUscita().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		this.getCapitoloUscita().setTipoFinanziamento(tipoFinanziamento);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return this.getCapitoloUscita().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		this.getCapitoloUscita().setTipoFondo(tipoFondo);
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getListaClassificatori() {
		return this.getCapitoloUscita().getClassificatoriGenerici();
	}

	public void setListaClassificatori(
			List<ClassificatoreGenerico> listaClassificatori) {
		this.getCapitoloUscita().setClassificatoriGenerici(listaClassificatori);
	}
	@XmlTransient
	public ImportiCapitoloUG getImportiCapitoloEquivalente() {
		return this.getCapitoloUscita().getImportiCapitoloEquivalente();
	}

	public void setImportiCapitoloEquivalente(
			ImportiCapitoloUG importiCapitoloUGAnnoPrecedente) {
		 this.getCapitoloUscita().setImportiCapitoloEquivalente(importiCapitoloUGAnnoPrecedente);
	}

}
