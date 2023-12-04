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
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.model.ClassificazioneCofogProgramma;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloUP;
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
 * BIL.CapitoloUscitaPrevisioneService.aggiornaCapitoloDiUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaMassivoCapitoloDiUscitaPrevisione extends ServiceRequest {

//	private Ente ente;
//	private Bilancio bilancio;
	private CapitoloUscitaPrevisione capitoloUscitaPrevisione = new CapitoloUscitaPrevisione();

//	private List<ImportiCapitoloUP> importiCapitoloUP = new ArrayList<ImportiCapitoloUP>();		
//	private TipoFondo tipoFondo;
//	private TipoFinanziamento tipoFinanziamento;
//	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private ElementoPianoDeiConti elementoPianoDeiConti;	
//	private ClassificazioneCofogProgramma classificazioneCofogProgramma;
//	private Programma programma;
//	private Macroaggregato macroaggregato;

	
	public CapitoloUscitaPrevisione getCapitoloUscitaPrevisione() {
		return capitoloUscitaPrevisione;
	}

	public void setCapitoloUscitaPrevisione(
			CapitoloUscitaPrevisione c) {
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloUscitaPrevisione);
		//this.capitoloUscitaPrevisione = capitoloUscitaPrevisione;
	}
	@XmlTransient
	public Ente getEnte() {
		return getCapitoloUscitaPrevisione().getEnte();
	}

	public void setEnte(Ente ente) {
		getCapitoloUscitaPrevisione().setEnte(ente);
	}
	@XmlTransient
	public Bilancio getBilancio() {
		return getCapitoloUscitaPrevisione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
		getCapitoloUscitaPrevisione().setBilancio(bilancio);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return getCapitoloUscitaPrevisione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		getCapitoloUscitaPrevisione().setTipoFondo(tipoFondo);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return getCapitoloUscitaPrevisione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		getCapitoloUscitaPrevisione().setTipoFinanziamento(tipoFinanziamento);
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return getCapitoloUscitaPrevisione().getClassificatoriGenerici();
	}

	public void setClassificatoriGenerici(
			List<ClassificatoreGenerico> listaClassificatori) {
		getCapitoloUscitaPrevisione().setClassificatoriGenerici(listaClassificatori);
	}
	@XmlTransient
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return getCapitoloUscitaPrevisione().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(ElementoPianoDeiConti elementoPdC) {
		getCapitoloUscitaPrevisione().setElementoPianoDeiConti(elementoPdC);
	}
	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
		return getCapitoloUscitaPrevisione().getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile strutturaAmminContabile) {
		getCapitoloUscitaPrevisione().setStrutturaAmministrativoContabile(strutturaAmminContabile);
	}
	@XmlTransient
	public ClassificazioneCofogProgramma getClassificazioneCofogProgramma() {
		return getCapitoloUscitaPrevisione().getClassificazioneCofogProgramma();
	}

	public void setClassificazioneCofogProgramma(
			ClassificazioneCofogProgramma classificazioneCofogProgramma) {
		getCapitoloUscitaPrevisione().setClassificazioneCofogProgramma(classificazioneCofogProgramma);
	}
	@XmlTransient
	public List<ImportiCapitoloUP> getImportiCapitoloUP() {
		return getCapitoloUscitaPrevisione().getListaImportiCapitoloUP();
	}

	public void setImportiCapitoloUP(List<ImportiCapitoloUP> listaImportiCapitoloUP) {
		getCapitoloUscitaPrevisione().setListaImportiCapitoloUP(listaImportiCapitoloUP);
	}
	@XmlTransient
	public Macroaggregato getMacroaggregato() {
		return getCapitoloUscitaPrevisione().getMacroaggregato();
	}

	public void setMacroaggregato(Macroaggregato macroaggregato) {
		getCapitoloUscitaPrevisione().setMacroaggregato(macroaggregato);
	}
	@XmlTransient
	public Programma getProgramma() {
		return getCapitoloUscitaPrevisione().getProgramma();
	}

	public void setProgramma(Programma programma) {
		getCapitoloUscitaPrevisione().setProgramma(programma);
	}

}
