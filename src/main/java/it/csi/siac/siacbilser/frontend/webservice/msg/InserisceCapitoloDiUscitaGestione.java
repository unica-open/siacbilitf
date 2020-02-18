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
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.ClassificazioneCofogProgramma;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloUG;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Richiesta al metodo
 * BIL.CapitoloUscitaGestioneService.inserisceCapitoloDiUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceCapitoloDiUscitaGestione extends ServiceRequest {

//	private Ente ente;
//	private Bilancio bilancio;
	private CapitoloUscitaGestione capitoloUscitaGestione= new CapitoloUscitaGestione();
//	private TipoFondo tipoFondo;
//	private TipoFinanziamento tipoFinanziamento;
//	private List<ImportiCapitoloUG> importiCapitoloUG = new ArrayList<ImportiCapitoloUG>();
//	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private ElementoPianoDeiConti elementoPianoDeiConti;
//	private ClassificazioneCofogProgramma classificazioneCofogProgramma;
//	private Programma programma;
//	private Macroaggregato macroaggregato;
	
	
	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	public void setCapitoloUscitaGestione(
			CapitoloUscitaGestione c) {
//		this.capitoloUscitaGestione = capitoloUscitaGestione;
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloUscitaGestione);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return this.getCapitoloUscitaGestione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		this.getCapitoloUscitaGestione().setTipoFondo(tipoFondo);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return this.getCapitoloUscitaGestione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		this.getCapitoloUscitaGestione().setTipoFinanziamento(tipoFinanziamento);
	}
	@XmlTransient
	public List<ImportiCapitoloUG> getImportiCapitoloUG() {
		return this.getCapitoloUscitaGestione().getListaImportiCapitoloUG();
	}

	public void setImportiCapitoloUG(List<ImportiCapitoloUG> importiCapitoloUG) {
		this.getCapitoloUscitaGestione().setListaImportiCapitoloUG(importiCapitoloUG);
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return this.getCapitoloUscitaGestione().getClassificatoriGenerici();
	}

	public void setClassificatoriGenerici(
			List<ClassificatoreGenerico> listaClassificatori) {
		this.getCapitoloUscitaGestione().setClassificatoriGenerici(listaClassificatori);
	}
	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return this.getCapitoloUscitaGestione().getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile struttAmmContabile) {
		this.getCapitoloUscitaGestione().setStrutturaAmministrativoContabile(struttAmmContabile);
	}
	@XmlTransient
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return this.getCapitoloUscitaGestione().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(
			ElementoPianoDeiConti elementoPianoDeiConti) {
		this.getCapitoloUscitaGestione().setElementoPianoDeiConti(elementoPianoDeiConti);
	}
	@XmlTransient
	public ClassificazioneCofogProgramma getClassificazioneCofogProgramma() {
		return this.getCapitoloUscitaGestione().getClassificazioneCofogProgramma();
	}

	public void setClassificazioneCofogProgramma(
			ClassificazioneCofogProgramma classificazioneCofogProgramma) {
		this.getCapitoloUscitaGestione().setClassificazioneCofogProgramma(classificazioneCofogProgramma);
	}
	@XmlTransient
	public Programma getProgramma() {
		return this.getCapitoloUscitaGestione().getProgramma();
	}

	public void setProgramma(Programma programma) {
		this.getCapitoloUscitaGestione().setProgramma(programma);
	}
	@XmlTransient
	public Macroaggregato getMacroaggregato() {
		return this.getCapitoloUscitaGestione().getMacroaggregato();
	}

	public void setMacroaggregato(Macroaggregato macroaggregato) {
		this.getCapitoloUscitaGestione().setMacroaggregato(macroaggregato);
	}
	@XmlTransient
	public Ente getEnte() {
		return this.getCapitoloUscitaGestione().getEnte();
	}

	public void setEnte(Ente ente) {
		this.getCapitoloUscitaGestione().setEnte(ente);
	}
	@XmlTransient
	public Bilancio getBilancio() {
		return this.getCapitoloUscitaGestione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
		this.getCapitoloUscitaGestione().setBilancio(bilancio);
	}
	

	

}
