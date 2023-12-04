/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.DummyMapper;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
import it.csi.siac.siacbilser.model.ImportiCapitoloEG;
import it.csi.siac.siacbilser.model.TipoFinanziamento;
import it.csi.siac.siacbilser.model.TipoFondo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;

/**
 * Richiesta al metodo
 * BIL.CapitoloEntrataGestioneService.inserisceCapitoloDiEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceCapitoloDiEntrataGestione extends ServiceRequest {

	private CapitoloEntrataGestione capitoloEntrataGestione = new CapitoloEntrataGestione();
//	private Ente ente;
//	private Bilancio bilancio;
//	private TipoFondo tipoFondo;
//	private TipoFinanziamento tipoFinanziamento;
//	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
//	private StrutturaAmministrativoContabile struttAmmContabile;
//	private ElementoPianoDeiConti elementoPianoDeiConti;
//	private List<ImportiCapitoloEG> importiCapitoloEG = new ArrayList<ImportiCapitoloEG>();
//	private CategoriaTipologiaTitolo categoriaTipologiaTitolo;
	
	
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
		getCapitoloEntrataGestione().setBilancio(bilancio);
	}
	
	@XmlTransient
	public Ente getEnte() {
		return getCapitoloEntrataGestione().getEnte();
	}

	public void setEnte(Ente ente) {
		getCapitoloEntrataGestione().setEnte(ente);
	}
	@XmlTransient
	public TipoFondo getTipoFondo() {
		return getCapitoloEntrataGestione().getTipoFondo();
	}

	public void setTipoFondo(TipoFondo tipoFondo) {
		getCapitoloEntrataGestione().setTipoFondo(tipoFondo);
	}
	@XmlTransient
	public TipoFinanziamento getTipoFinanziamento() {
		return getCapitoloEntrataGestione().getTipoFinanziamento();
	}

	public void setTipoFinanziamento(TipoFinanziamento tipoFinanziamento) {
		getCapitoloEntrataGestione().setTipoFinanziamento(tipoFinanziamento);
	}
	@XmlTransient
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return getCapitoloEntrataGestione().getClassificatoriGenerici();
	}

	public void setClassificatoriGenerici(
			List<ClassificatoreGenerico> listaClassificatori) {
		getCapitoloEntrataGestione().setClassificatoriGenerici(listaClassificatori);
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
	public ElementoPianoDeiConti getElementoPianoDeiConti() {
		return getCapitoloEntrataGestione().getElementoPianoDeiConti();
	}

	public void setElementoPianoDeiConti(
			ElementoPianoDeiConti elementoPianoDeiConti) {
		getCapitoloEntrataGestione().setElementoPianoDeiConti(elementoPianoDeiConti);
	}
	@XmlTransient
	public List<ImportiCapitoloEG> getImportiCapitoloEG() {
		return getCapitoloEntrataGestione().getListaImportiCapitoloEG();
	}

	public void setImportiCapitoloEG(
			List<ImportiCapitoloEG> listaImportiCapitoloEG) {
		getCapitoloEntrataGestione().setListaImportiCapitoloEG(listaImportiCapitoloEG);
	}

	@XmlTransient
	public CategoriaTipologiaTitolo getCategoriaTipologiaTitolo() {
		return getCapitoloEntrataGestione().getCategoriaTipologiaTitolo();
	}

	public void setCategoriaTipologiaTitolo(
			CategoriaTipologiaTitolo categoriaTipologiaTitolo) {
		getCapitoloEntrataGestione().setCategoriaTipologiaTitolo(categoriaTipologiaTitolo);
	}

}
