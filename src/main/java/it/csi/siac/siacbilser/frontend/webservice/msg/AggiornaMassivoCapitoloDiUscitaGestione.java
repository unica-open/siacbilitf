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
 * BIL.CapitoloUscitaGestioneService.aggiornaCapitoloDiUscitaGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaMassivoCapitoloDiUscitaGestione extends ServiceRequest {

//	private Ente ente;
//	private Bilancio bilancio;
	private CapitoloUscitaGestione capitoloUscitaGestione = new CapitoloUscitaGestione();

//	private TipoFondo tipoFondo;
//	private TipoFinanziamento tipoFinanziamento;
//	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
//	private ElementoPianoDeiConti elementoPianoDeiConti;
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private ClassificazioneCofogProgramma classificazioneCofogProgramma;
//	private List<ImportiCapitoloUG> importiCapitoloUG = new ArrayList<ImportiCapitoloUG>();
//	private Macroaggregato macroaggregato;
//	private Programma programma;
	
	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	public void setCapitoloUscitaGestione(CapitoloUscitaGestione c) {
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloUscitaGestione);
		//this.capitoloUscitaGestione = c;
	}

	@XmlTransient
	public Ente getEnte() {
		return getCapitoloUscitaGestione().getEnte();
	}

	public void setEnte(Ente ente) {
		getCapitoloUscitaGestione().setEnte(ente);
	}
	@XmlTransient
	public Bilancio getBilancio() {
		return getCapitoloUscitaGestione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
		getCapitoloUscitaGestione().setBilancio(bilancio);
	}

	@XmlTransient
	public List<ImportiCapitoloUG> getImportiCapitoloUG() {
		return getCapitoloUscitaGestione().getListaImportiCapitoloUG();
	}

	public void setImportiCapitoloUG(List<ImportiCapitoloUG> listaImportiCapitoloUG) {
		getCapitoloUscitaGestione().setListaImportiCapitoloUG(listaImportiCapitoloUG);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return getCapitoloUscitaGestione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		//this.tipoFondo = tipoFondo;
		getCapitoloUscitaGestione().setTipoFondo(tipoFondo);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return getCapitoloUscitaGestione().getTipoFinanziamento();
		
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		getCapitoloUscitaGestione().setTipoFinanziamento(tipoFinanziamento);
		//this.tipoFinanziamento = tipoFinanziamento;
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return getCapitoloUscitaGestione().getClassificatoriGenerici();		
	}

	public void setClassificatoriGenerici(
			List<ClassificatoreGenerico> listaClassificatori) {
		getCapitoloUscitaGestione().setClassificatoriGenerici(listaClassificatori);
	}
	@XmlTransient
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return getCapitoloUscitaGestione().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(ElementoPianoDeiConti elementoPdC) {
		getCapitoloUscitaGestione().setElementoPianoDeiConti(elementoPdC);
	}
	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return getCapitoloUscitaGestione().getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile strutturaAmminContabile) {
		getCapitoloUscitaGestione().setStrutturaAmministrativoContabile(strutturaAmminContabile);
	}
	@XmlTransient
	public ClassificazioneCofogProgramma getClassificazioneCofogProgramma() {
		return getCapitoloUscitaGestione().getClassificazioneCofogProgramma();
	}

	public void setClassificazioneCofogProgramma(
			ClassificazioneCofogProgramma classificazioneCofogProgramma) {
		getCapitoloUscitaGestione().setClassificazioneCofogProgramma(classificazioneCofogProgramma);
	}
	@XmlTransient
	public Macroaggregato getMacroaggregato() {
		return getCapitoloUscitaGestione().getMacroaggregato();
	}

	public void setMacroaggregato(Macroaggregato macroaggregato) {
		getCapitoloUscitaGestione().setMacroaggregato(macroaggregato);
	}
	@XmlTransient
	public Programma getProgramma() {
		return getCapitoloUscitaGestione().getProgramma();
	}

	public void setProgramma(Programma programma) {
		getCapitoloUscitaGestione().setProgramma(programma);
	}

}
