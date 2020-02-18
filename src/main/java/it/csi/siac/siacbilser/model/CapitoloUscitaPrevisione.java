/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.wrapper.ImportiCapitoloPerComponente;

/**
 * CapitoloUscitaPrevisione
 * 
 * @author rmontuori
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class CapitoloUscitaPrevisione extends Capitolo<ImportiCapitoloUP,ImportiCapitoloUG> {

	private static final long serialVersionUID = -5086600904565576981L;

	private Boolean flagAssegnabile;
	private Boolean flagFondoSvalutazioneCred;
	private Boolean flagPerMemoria;
	private Boolean flagTrasferimentiOrgComunitari;
	private Boolean funzDelegateRegione;
	// Aggiunto RTI : Campo non presente su modello da CSI, ma presente su CDU
	@Deprecated private Boolean flagFondoPluriennaleVinc;

//	private ImportiCapitoloUP importiCapitoloUP;
//	private ImportiCapitoloUG importiCapitoloUG;
//	private List<ImportiCapitoloUP> listaImportiCapitoloUP = new ArrayList<ImportiCapitoloUP>();
	
//	private StrutturaAmministrativoContabile strutturaAmministrativoContabile;
//	private ElementoPianoDeiConti elementoPianoDeiConti;
	private ClassificazioneCofog classificazioneCofog;
	private ClassificazioneCofogProgramma classificazioneCofogProgramma;

	private Missione missione;
	private Programma programma;
	private TitoloSpesa titoloSpesa;
	private Macroaggregato macroaggregato;
	private PoliticheRegionaliUnitarie politicheRegionaliUnitarie;
	
	private List<VincoliCapitoloUEPrev> listaVincoliUEPrev = new ArrayList<VincoliCapitoloUEPrev>();	
	
	private RicorrenteSpesa ricorrenteSpesa;
	private PerimetroSanitarioSpesa perimetroSanitarioSpesa;
	private SiopeSpesa siopeSpesa;
	private TransazioneUnioneEuropeaSpesa transazioneUnioneEuropeaSpesa;
	//GESC0014
	private List<ImportiCapitoloPerComponente> importiComponentiCapitolo;
	
	
	public List<ImportiCapitoloPerComponente> getImportiComponentiCapitolo() {
		return importiComponentiCapitolo;
	}


	public void setImportiComponentiCapitolo(List<ImportiCapitoloPerComponente> importiComponentiCapitolo) {
		this.importiComponentiCapitolo = importiComponentiCapitolo;
	}


	public CapitoloUscitaPrevisione(){
		super(TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	

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
	

	/**
	 * @return the flagAssegnabile
	 */
	public Boolean getFlagAssegnabile() {
		return flagAssegnabile;
	}

	/**
	 * @return the flagFondoSvalutazioneCred
	 */
	public Boolean getFlagFondoSvalutazioneCred() {
		return flagFondoSvalutazioneCred;
	}

	/**
	 * @return the flagPerMemoria
	 */
	public Boolean getFlagPerMemoria() {
		return flagPerMemoria;
	}

	/**
	 * @return the flagTrasferimentiOrgComunitari
	 */
	public Boolean getFlagTrasferimentiOrgComunitari() {
		return flagTrasferimentiOrgComunitari;
	}

	/**
	 * @return the flagFondoPluriennaleVinc
	 */
	@Deprecated
	public Boolean getFlagFondoPluriennaleVinc() {
		return flagFondoPluriennaleVinc;
	}

	public Boolean isFlagAssegnabile() {
		return flagAssegnabile;
	}

	public void setFlagAssegnabile(Boolean flagAssegnabile) {
		this.flagAssegnabile = flagAssegnabile;
	}

	public Boolean isFlagFondoSvalutazioneCred() {
		return flagFondoSvalutazioneCred;
	}

	public void setFlagFondoSvalutazioneCred(Boolean flagFondoSvalutazioneCred) {
		this.flagFondoSvalutazioneCred = flagFondoSvalutazioneCred;
	}

	public Boolean isFlagPerMemoria() {
		return flagPerMemoria;
	}

	public void setFlagPerMemoria(Boolean flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria;
	}

	public Boolean isFlagTrasferimentiOrgComunitari() {
		return flagTrasferimentiOrgComunitari;
	}

	public void setFlagTrasferimentiOrgComunitari(
			Boolean flagTrasferimentiOrgComunitari) {
		this.flagTrasferimentiOrgComunitari = flagTrasferimentiOrgComunitari;
	}
	
	/**
	 * @return the funzDelegateRegione
	 */
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

//	public ImportiCapitoloUP getImportiCapitoloUP() {
//		return importiCapitoloUP;
//	}
//
//	public void setImportiCapitoloUP(ImportiCapitoloUP importiCapitoloUP) {
//		this.importiCapitoloUP = importiCapitoloUP;
//	}
//
//	public List<ImportiCapitoloUP> getListaImportiCapitoloUP() {
//		return listaImportiCapitoloUP;
//	}
//
//
//	public void setListaImportiCapitoloUP(List<ImportiCapitoloUP> listaImportiCapitoloUP) {
//		this.listaImportiCapitoloUP = listaImportiCapitoloUP;
//	}
//	
//	public void addImportoCapitoloUP(ImportiCapitoloUP importoCapitoloUp) {
//		if(this.listaImportiCapitoloUP==null) {
//			this.listaImportiCapitoloUP = new ArrayList<ImportiCapitoloUP>();
//		}
//		if(importoCapitoloUp!=null) {
//			listaImportiCapitoloUP.add(importoCapitoloUp);
//		}		
//	}
//	
//	public ImportiCapitoloUG getImportiCapitoloUG() {
//		return importiCapitoloUG;
//	}
//
//
//	public void setImportiCapitoloUG(ImportiCapitoloUG importiCapitoloUG) {
//		this.importiCapitoloUG = importiCapitoloUG;
//	}



	public ClassificazioneCofogProgramma getClassificazioneCofogProgramma() {
		return classificazioneCofogProgramma;
	}


	public void setClassificazioneCofogProgramma(ClassificazioneCofogProgramma classificazioneCofogProgramma) {
		this.classificazioneCofogProgramma = classificazioneCofogProgramma;
	}

	public List<VincoliCapitoloUEPrev> getListaVincoliUEPrev() {
		return listaVincoliUEPrev;
	}


	public void setListaVincoliUEPrev(List<VincoliCapitoloUEPrev> listaVincoliUEPrev) {
		this.listaVincoliUEPrev = listaVincoliUEPrev;
	}
	
	
	/////////////////////////////////////////////////
	
	//@XmlTransient //NO
	public ImportiCapitoloUP getImportiCapitoloUP() {
		return getImportiCapitolo();
	}

	public void setImportiCapitoloUP(ImportiCapitoloUP importiCapitoloUP) {
		setImportiCapitolo(importiCapitoloUP);
	}

	//@XmlTransient //NO
	public List<ImportiCapitoloUP> getListaImportiCapitoloUP() {
		if(getListaImportiCapitolo()==null) {
			setListaImportiCapitoloUP(new ArrayList<ImportiCapitoloUP>());
		}
		return getListaImportiCapitolo();
	}


	public void setListaImportiCapitoloUP(List<ImportiCapitoloUP> listaImportiCapitoloUP) {
		setListaImportiCapitolo(listaImportiCapitoloUP);
	}
	
	public void addImportoCapitoloUP(ImportiCapitoloUP importoCapitoloUp) {		
		if(importoCapitoloUp!=null) {
			getListaImportiCapitoloUP().add(importoCapitoloUp);
		}		
	}
	
	
	//@XmlTransient //NO
	public ImportiCapitoloUG getImportiCapitoloUG() {
		return getImportiCapitoloEquivalente();
	}


	public void setImportiCapitoloUG(ImportiCapitoloUG importiCapitoloUG) {
		setImportiCapitoloEquivalente(importiCapitoloUG);
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

	

}
