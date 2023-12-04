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
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloEP;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Richiesta al metodo
 * BIL.CapitoloEntrataPrevisioneService.inserisceCapitoloDiEntrataPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceCapitoloDiEntrataPrevisione extends ServiceRequest {

	private CapitoloEntrataPrevisione capitoloEntrataPrevisione = new CapitoloEntrataPrevisione();
//	private Ente ente;
//	private Bilancio bilancio;
//	private TipoFondo tipoFondo;
//	private TipoFinanziamento tipoFinanziamento;
//	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private ElementoPianoDeiConti elementoPianoDeiConti;
//	private List<ImportiCapitoloEP> importiCapitoloEP = new ArrayList<ImportiCapitoloEP>();
//	private CategoriaTipologiaTitolo categoriaTipologiaTitolo;
	
	public CapitoloEntrataPrevisione getCapitoloEntrataPrevisione() {
		return capitoloEntrataPrevisione;
	}

	public void setCapitoloEntrataPrevisione(CapitoloEntrataPrevisione c) {
//		this.capitoloEntrataPrevisione = capitoloEntrataPrevisione;
		DummyMapper.mapNotNullNotEmpty(c, this.capitoloEntrataPrevisione);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return getCapitoloEntrataPrevisione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		getCapitoloEntrataPrevisione().setTipoFondo(tipoFondo);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return getCapitoloEntrataPrevisione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		getCapitoloEntrataPrevisione().setTipoFinanziamento(tipoFinanziamento);
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return getCapitoloEntrataPrevisione().getClassificatoriGenerici();
	}

	public void setClassificatoriGenerici(
			List<ClassificatoreGenerico> listaClassificatori) {
		getCapitoloEntrataPrevisione().setClassificatoriGenerici(listaClassificatori);
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
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return getCapitoloEntrataPrevisione().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(
			ElementoPianoDeiConti elementoPianoDeiConti) {
		getCapitoloEntrataPrevisione().setElementoPianoDeiConti(elementoPianoDeiConti);
	}
	@XmlTransient
	public List<ImportiCapitoloEP> getImportiCapitoloEP() {
		return getCapitoloEntrataPrevisione().getListaImportiCapitoloEP();
	}

	public void setImportiCapitoloEP(
			List<ImportiCapitoloEP> listaImportiCapitoloEP) {
		getCapitoloEntrataPrevisione().setListaImportiCapitoloEP(listaImportiCapitoloEP);
	}
	@XmlTransient
	public CategoriaTipologiaTitolo getCategoriaTipologiaTitolo() {
		return getCapitoloEntrataPrevisione().getCategoriaTipologiaTitolo();
	}

	public void setCategoriaTipologiaTitolo(
			CategoriaTipologiaTitolo categoriaTipologiaTitolo) {
		getCapitoloEntrataPrevisione().setCategoriaTipologiaTitolo(categoriaTipologiaTitolo);
	}
	@XmlTransient
	public Ente getEnte() {
		return getCapitoloEntrataPrevisione().getEnte();
	}

	public void setEnte(Ente ente) {
		getCapitoloEntrataPrevisione().setEnte(ente);
	}
	@XmlTransient
	public Bilancio getBilancio() {
		return getCapitoloEntrataPrevisione().getBilancio();
	}

	public void setBilancio(Bilancio bilancio) {
		getCapitoloEntrataPrevisione().setBilancio(bilancio);
	}

	

}
