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
public class AggiornaCapitoloDiUscitaPrevisione extends ServiceRequest {

//	private Ente ente;
//	private Bilancio bilancio;
	private CapitoloUscitaPrevisione capitoloUscitaPrevisione= new CapitoloUscitaPrevisione();

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
//		this.capitoloUscitaPrevisione = capitoloUscitaPrevisione;
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloUscitaPrevisione);
	}
	


	@XmlTransient
	public Ente getEnte() {
//		return ente;
		return getCapitoloUscitaPrevisione().getEnte();
	}

	public void setEnte(Ente ente) {
//		this.ente = ente;
		getCapitoloUscitaPrevisione().setEnte(ente);
	}

	@XmlTransient
	public Bilancio getBilancio() {
//		return bilancio;
		return getCapitoloUscitaPrevisione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
//		this.bilancio = bilancio;
		getCapitoloUscitaPrevisione().setBilancio(bilancio);
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
	public TipoFinanziamento getTipoFinanziamento() {
//		return tipoFinanziamento;
		return getCapitoloUscitaPrevisione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
//		this.tipoFinanziamento = tipoFinanziamento;
		getCapitoloUscitaPrevisione().setTipoFinanziamento(tipoFinanziamento);
	}

	@XmlTransient
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
//		return classificatoriGenerici;
		return getCapitoloUscitaPrevisione().getClassificatoriGenerici();
	}

	public void setClassificatoriGenerici(
			List<ClassificatoreGenerico> listaClassificatori) {
//		this.classificatoriGenerici = listaClassificatori;
		getCapitoloUscitaPrevisione().setClassificatoriGenerici(listaClassificatori);
	}

	@XmlTransient
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
//		return elementoPianoDeiConti;
		return getCapitoloUscitaPrevisione().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(ElementoPianoDeiConti elementoPdC) {
//		this.elementoPianoDeiConti = elementoPdC;
		getCapitoloUscitaPrevisione().setElementoPianoDeiConti(elementoPdC);
	}

	@XmlTransient
	public StrutturaAmministrativoContabile getStruttAmmContabile() {
//		return struttAmmContabile;
		return getCapitoloUscitaPrevisione().getStrutturaAmministrativoContabile();
	}

	public void setStruttAmmContabile(
			StrutturaAmministrativoContabile strutturaAmminContabile) {
//		this.struttAmmContabile = strutturaAmminContabile;
		getCapitoloUscitaPrevisione().setStrutturaAmministrativoContabile(strutturaAmminContabile);
	}

	@XmlTransient
	public ClassificazioneCofogProgramma getClassificazioneCofogProgramma() {
//		return classificazioneCofogProgramma;
		return getCapitoloUscitaPrevisione().getClassificazioneCofogProgramma();
	}

	public void setClassificazioneCofogProgramma(
			ClassificazioneCofogProgramma classificazioneCofogProgramma) {
//		this.classificazioneCofogProgramma = classificazioneCofogProgramma;
		getCapitoloUscitaPrevisione().setClassificazioneCofogProgramma(classificazioneCofogProgramma);
	}

	@XmlTransient
	public List<ImportiCapitoloUP> getImportiCapitoloUP() {
//		return importiCapitoloUP;
		return getCapitoloUscitaPrevisione().getListaImportiCapitoloUP();
	}

	public void setImportiCapitoloUP(List<ImportiCapitoloUP> listaImportiCapitoloUP) {
//		this.importiCapitoloUP = listaImportiCapitoloUP;
		getCapitoloUscitaPrevisione().setListaImportiCapitoloUP(listaImportiCapitoloUP);
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
	public Programma getProgramma() {
//		return programma;
		return getCapitoloUscitaPrevisione().getProgramma();
	}

	public void setProgramma(Programma programma) {
//		this.programma = programma;
		getCapitoloUscitaPrevisione().setProgramma(programma);
	}

}
