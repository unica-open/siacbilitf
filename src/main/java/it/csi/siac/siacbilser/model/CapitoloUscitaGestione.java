/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

/**
 * CapitoloUscita
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class CapitoloUscitaGestione extends Capitolo<ImportiCapitoloUG,ImportiCapitoloUG> {

	private static final long serialVersionUID = 7592920796649429166L;

	private Boolean flagAssegnabile;
	@Deprecated private Boolean flagFondoPluriennaleVinc;
	private Boolean flagFondoSvalutazioneCred;
	private Boolean flagTrasferimentiOrgComunitari;
	private Boolean funzDelegateRegione;

	
//	private ImportiCapitoloUG importiCapitoloUG;
//	private ImportiCapitoloUP importiCapitoloUP;
//	private List<ImportiCapitoloUG> listaImportiCapitoloUG = new ArrayList<ImportiCapitoloUG>();
	
	
//	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
//	private ElementoPianoDeiConti elementoPianoDeiConti;
	private ClassificazioneCofog classificazioneCofog;
	private ClassificazioneCofogProgramma classificazioneCofogProgramma;
	
	private Missione missione;
	private Programma programma;
	private TitoloSpesa titoloSpesa;	
	private Macroaggregato macroaggregato;
	private PoliticheRegionaliUnitarie politicheRegionaliUnitarie;
	
	private List<VincoliCapitoloUEGest> listaVincoliUEGest = new ArrayList<VincoliCapitoloUEGest>();
	
	private RicorrenteSpesa ricorrenteSpesa;
	private PerimetroSanitarioSpesa perimetroSanitarioSpesa;
	private SiopeSpesa siopeSpesa;
	private TransazioneUnioneEuropeaSpesa transazioneUnioneEuropeaSpesa;	
	
	
	
	public CapitoloUscitaGestione() {
		super(TipoCapitolo.CAPITOLO_USCITA_GESTIONE);
	}



//	public StrutturaAmministrativoContabile getStrutturaAmministrativoContabile() {
//		return strutturaAmministrativoContabile;
//	}
//
//	public void setStrutturaAmministrativoContabile(
//			StrutturaAmministrativoContabile strutturaAmministrativoContabile) {
//		this.strutturaAmministrativoContabile = strutturaAmministrativoContabile;
//	}
//
//	public ElementoPianoDeiConti getElementoPianoDeiConti() {
//		return elementoPianoDeiConti;
//	}
//
//	public void setElementoPianoDeiConti(
//			ElementoPianoDeiConti elementoPianoDeiConti) {
//		this.elementoPianoDeiConti = elementoPianoDeiConti;
//	}

	public Missione getMissione() {
		return missione;
	}

	public void setMissione(Missione missione) {
		this.missione = missione;
	}

	public Programma getProgramma() {
		return programma;
	}

	public void setProgramma(Programma programma) {
		this.programma = programma;
	}

	public TitoloSpesa getTitoloSpesa() {
		return titoloSpesa;
	}

	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
		this.titoloSpesa = titoloSpesa;
	}

	public Macroaggregato getMacroaggregato() {
		return macroaggregato;
	}

	public void setMacroaggregato(Macroaggregato macroaggregato) {
		this.macroaggregato = macroaggregato;
	}

	

	public Boolean getFlagAssegnabile() {
		return flagAssegnabile;
	}
	
	public Boolean isFlagAssegnabile() {
		return flagAssegnabile;
	}

	public void setFlagAssegnabile(Boolean flagAssegnabile) {
		this.flagAssegnabile = flagAssegnabile;
	}
	
	public Boolean getFlagFondoSvalutazioneCred() {
		return flagFondoSvalutazioneCred;
	}

	public Boolean isFlagFondoSvalutazioneCred() {
		return flagFondoSvalutazioneCred;
	}

	public void setFlagFondoSvalutazioneCred(Boolean flagFondoSvalutazioneCred) {
		this.flagFondoSvalutazioneCred = flagFondoSvalutazioneCred;
	}

	public Boolean getFlagTrasferimentiOrgComunitari() {
		return flagTrasferimentiOrgComunitari;
	}
	
	public Boolean isFlagTrasferimentiOrgComunitari() {
		return flagTrasferimentiOrgComunitari;
	}

	public void setFlagTrasferimentiOrgComunitari(
			Boolean flagTrasferimentiOrgComunitari) {
		this.flagTrasferimentiOrgComunitari = flagTrasferimentiOrgComunitari;
	}
	
	public Boolean getFunzDelegateRegione() {
		return funzDelegateRegione;
	}

	public Boolean isFunzDelegateRegione() {
		return funzDelegateRegione;
	}

	public void setFunzDelegateRegione(Boolean funzDelegateRegione) {
		this.funzDelegateRegione = funzDelegateRegione;
	}
	
	@Deprecated
	public Boolean getFlagFondoPluriennaleVinc() {
		return flagFondoPluriennaleVinc;
	}

	@Deprecated
	public Boolean isFlagFondoPluriennaleVinc() {
		return flagFondoPluriennaleVinc;
	}

	@Deprecated
	public void setFlagFondoPluriennaleVinc(Boolean flagFondoPluriennaleVinc) {
		this.flagFondoPluriennaleVinc = flagFondoPluriennaleVinc;
	}

	public ClassificazioneCofog getClassificazioneCofog() {
		return classificazioneCofog;
	}

	public void setClassificazioneCofog(ClassificazioneCofog classificazioneCofog) {
		this.classificazioneCofog = classificazioneCofog;
	}

	

	public ClassificazioneCofogProgramma getClassificazioneCofogProgramma() {
		return classificazioneCofogProgramma;
	}

	public void setClassificazioneCofogProgramma(ClassificazioneCofogProgramma classificazioneCofogProgramma) {
		this.classificazioneCofogProgramma = classificazioneCofogProgramma;
	}



	public List<VincoliCapitoloUEGest> getListaVincoliUEGest() {
		return listaVincoliUEGest;
	}

	public void setListaVincoliUEGest(List<VincoliCapitoloUEGest> listaVincoliUEGest) {
		this.listaVincoliUEGest = listaVincoliUEGest;
	}

	
	//@XmlTransient //NO
	public List<ImportiCapitoloUG> getListaImportiCapitoloUG() {	
		if(getListaImportiCapitolo()==null) {
			setListaImportiCapitolo(new ArrayList<ImportiCapitoloUG>());
		}
		return getListaImportiCapitolo();
	}

	public void setListaImportiCapitoloUG(List<ImportiCapitoloUG> listaImportiCapitoloUG) {
		setListaImportiCapitolo(listaImportiCapitoloUG);
	}
	
	//@XmlTransient //NO
	public ImportiCapitoloUG getImportiCapitoloUG() {
		return getImportiCapitolo();
	}

	public void setImportiCapitoloUG(ImportiCapitoloUG importiCapitoloUG) {
		setImportiCapitolo(importiCapitoloUG);
	}
	
	public void addImportoCapitoloUG(ImportiCapitoloUG importoCapitoloUG) {	
		
		if(importoCapitoloUG!=null) {
			getListaImportiCapitoloUG().add(importoCapitoloUG);
		}
	}

	public PoliticheRegionaliUnitarie getPoliticheRegionaliUnitarie() {
		return politicheRegionaliUnitarie;
	}

	public void setPoliticheRegionaliUnitarie(PoliticheRegionaliUnitarie politicheRegionaliUnitarie) {
		this.politicheRegionaliUnitarie = politicheRegionaliUnitarie;
	}



	public RicorrenteSpesa getRicorrenteSpesa() {
		return ricorrenteSpesa;
	}



	public void setRicorrenteSpesa(RicorrenteSpesa ricorrenteSpesa) {
		this.ricorrenteSpesa = ricorrenteSpesa;
	}



	public PerimetroSanitarioSpesa getPerimetroSanitarioSpesa() {
		return perimetroSanitarioSpesa;
	}



	public void setPerimetroSanitarioSpesa(PerimetroSanitarioSpesa perimetroSanitarioSpesa) {
		this.perimetroSanitarioSpesa = perimetroSanitarioSpesa;
	}



	public SiopeSpesa getSiopeSpesa() {
		return siopeSpesa;
	}



	public void setSiopeSpesa(SiopeSpesa siopeSpesa) {
		this.siopeSpesa = siopeSpesa;
	}



	public TransazioneUnioneEuropeaSpesa getTransazioneUnioneEuropeaSpesa() {
		return transazioneUnioneEuropeaSpesa;
	}



	public void setTransazioneUnioneEuropeaSpesa(TransazioneUnioneEuropeaSpesa transazioneUnioneEuropeaSpesa) {
		this.transazioneUnioneEuropeaSpesa = transazioneUnioneEuropeaSpesa;
	}
	
//	@XmlTransient
//	public ImportiCapitoloUP getImportiCapitoloUP() {
//		return getImportiCapitoloEquivalente();
//	}
//
//	public void setImportiCapitoloUP(ImportiCapitoloUP importiCapitoloUP) {
//		setImportiCapitoloEquivalente(importiCapitoloUP);
//	}
	
	
	
	

}
