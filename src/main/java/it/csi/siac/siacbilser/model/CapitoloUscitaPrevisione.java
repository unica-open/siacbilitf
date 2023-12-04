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
	//SIAC-7192
	private RisorsaAccantonata risorsaAccantonata;
	
	/**
	 * Instantiates a new capitolo uscita previsione.
	 */
	public CapitoloUscitaPrevisione(){
		super(TipoCapitolo.CAPITOLO_USCITA_PREVISIONE);
	}
	

	/**
	 * Gets the missione.
	 *
	 * @return the missione
	 */
	public Missione getMissione() {
		return missione;
	}

	/**
	 * Sets the missione.
	 *
	 * @param missione the new missione
	 */
	public void setMissione(Missione missione) {
		this.missione = missione;
	}

	/**
	 * Gets the programma.
	 *
	 * @return the programma
	 */
	public Programma getProgramma() {
		return programma;
	}

	/**
	 * Sets the programma.
	 *
	 * @param programma the new programma
	 */
	public void setProgramma(Programma programma) {
		this.programma = programma;
	}

	/**
	 * Gets the titolo spesa.
	 *
	 * @return the titolo spesa
	 */
	public TitoloSpesa getTitoloSpesa() {
		return titoloSpesa;
	}

	/**
	 * Sets the titolo spesa.
	 *
	 * @param titoloSpesa the new titolo spesa
	 */
	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
		this.titoloSpesa = titoloSpesa;
	}

	/**
	 * Gets the macroaggregato.
	 *
	 * @return the macroaggregato
	 */
	public Macroaggregato getMacroaggregato() {
		return macroaggregato;
	}

	/**
	 * Sets the macroaggregato.
	 *
	 * @param macroaggregato the new macroaggregato
	 */
	public void setMacroaggregato(Macroaggregato macroaggregato) {
		this.macroaggregato = macroaggregato;
	}

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

	/**
	 * Checks if is flag assegnabile.
	 *
	 * @return the boolean
	 */
	public Boolean isFlagAssegnabile() {
		return flagAssegnabile;
	}

	/**
	 * Sets the flag assegnabile.
	 *
	 * @param flagAssegnabile the new flag assegnabile
	 */
	public void setFlagAssegnabile(Boolean flagAssegnabile) {
		this.flagAssegnabile = flagAssegnabile;
	}

	/**
	 * Checks if is flag fondo svalutazione cred.
	 *
	 * @return the boolean
	 */
	public Boolean isFlagFondoSvalutazioneCred() {
		return flagFondoSvalutazioneCred;
	}

	/**
	 * Sets the flag fondo svalutazione cred.
	 *
	 * @param flagFondoSvalutazioneCred the new flag fondo svalutazione cred
	 */
	public void setFlagFondoSvalutazioneCred(Boolean flagFondoSvalutazioneCred) {
		this.flagFondoSvalutazioneCred = flagFondoSvalutazioneCred;
	}

	/**
	 * Checks if is flag per memoria.
	 *
	 * @return the boolean
	 */
	public Boolean isFlagPerMemoria() {
		return flagPerMemoria;
	}

	/**
	 * Sets the flag per memoria.
	 *
	 * @param flagPerMemoria the new flag per memoria
	 */
	public void setFlagPerMemoria(Boolean flagPerMemoria) {
		this.flagPerMemoria = flagPerMemoria;
	}

	/**
	 * Checks if is flag trasferimenti org comunitari.
	 *
	 * @return the boolean
	 */
	public Boolean isFlagTrasferimentiOrgComunitari() {
		return flagTrasferimentiOrgComunitari;
	}

	/**
	 * Sets the flag trasferimenti org comunitari.
	 *
	 * @param flagTrasferimentiOrgComunitari the new flag trasferimenti org comunitari
	 */
	public void setFlagTrasferimentiOrgComunitari(
			Boolean flagTrasferimentiOrgComunitari) {
		this.flagTrasferimentiOrgComunitari = flagTrasferimentiOrgComunitari;
	}
	
	/**
	 * Gets the funz delegate regione.
	 *
	 * @return the funzDelegateRegione
	 */
	public Boolean getFunzDelegateRegione() {
		return funzDelegateRegione;
	}

	/**
	 * Checks if is funz delegate regione.
	 *
	 * @return the boolean
	 */
	public Boolean isFunzDelegateRegione() {
		return funzDelegateRegione;
	}

	/**
	 * Sets the funz delegate regione.
	 *
	 * @param funzDelegateRegione the new funz delegate regione
	 */
	public void setFunzDelegateRegione(Boolean funzDelegateRegione) {
		this.funzDelegateRegione = funzDelegateRegione;
	}

	/**
	 * Checks if is flag fondo pluriennale vinc.
	 *
	 * @return the boolean
	 */
	@Deprecated
	public Boolean isFlagFondoPluriennaleVinc() {
		return flagFondoPluriennaleVinc;
	}

	/**
	 * Sets the flag fondo pluriennale vinc.
	 *
	 * @param flagFondoPluriennaleVinc the new flag fondo pluriennale vinc
	 */
	@Deprecated
	public void setFlagFondoPluriennaleVinc(Boolean flagFondoPluriennaleVinc) {
		this.flagFondoPluriennaleVinc = flagFondoPluriennaleVinc;
	}

	/**
	 * Gets the classificazione cofog.
	 *
	 * @return the classificazione cofog
	 */
	public ClassificazioneCofog getClassificazioneCofog() {
		return classificazioneCofog;
	}

	/**
	 * Sets the classificazione cofog.
	 *
	 * @param classificazioneCofog the new classificazione cofog
	 */
	public void setClassificazioneCofog(ClassificazioneCofog classificazioneCofog) {
		this.classificazioneCofog = classificazioneCofog;
	}

	/**
	 * Gets the classificazione cofog programma.
	 *
	 * @return the classificazione cofog programma
	 */
	public ClassificazioneCofogProgramma getClassificazioneCofogProgramma() {
		return classificazioneCofogProgramma;
	}


	/**
	 * Sets the classificazione cofog programma.
	 *
	 * @param classificazioneCofogProgramma the new classificazione cofog programma
	 */
	public void setClassificazioneCofogProgramma(ClassificazioneCofogProgramma classificazioneCofogProgramma) {
		this.classificazioneCofogProgramma = classificazioneCofogProgramma;
	}

	/**
	 * Gets the lista vincoli UE prev.
	 *
	 * @return the lista vincoli UE prev
	 */
	public List<VincoliCapitoloUEPrev> getListaVincoliUEPrev() {
		return listaVincoliUEPrev;
	}


	/**
	 * Sets the lista vincoli UE prev.
	 *
	 * @param listaVincoliUEPrev the new lista vincoli UE prev
	 */
	public void setListaVincoliUEPrev(List<VincoliCapitoloUEPrev> listaVincoliUEPrev) {
		this.listaVincoliUEPrev = listaVincoliUEPrev;
	}
	
	
	/////////////////////////////////////////////////
	
	/**
	 * Gets the importi capitolo UP.
	 *
	 * @return the importi capitolo UP
	 */
	//@XmlTransient //NO
	public ImportiCapitoloUP getImportiCapitoloUP() {
		return getImportiCapitolo();
	}

	/**
	 * Sets the importi capitolo UP.
	 *
	 * @param importiCapitoloUP the new importi capitolo UP
	 */
	public void setImportiCapitoloUP(ImportiCapitoloUP importiCapitoloUP) {
		setImportiCapitolo(importiCapitoloUP);
	}

	/**
	 * Gets the lista importi capitolo UP.
	 *
	 * @return the lista importi capitolo UP
	 */
	//@XmlTransient //NO
	public List<ImportiCapitoloUP> getListaImportiCapitoloUP() {
		if(getListaImportiCapitolo()==null) {
			setListaImportiCapitoloUP(new ArrayList<ImportiCapitoloUP>());
		}
		return getListaImportiCapitolo();
	}


	/**
	 * Sets the lista importi capitolo UP.
	 *
	 * @param listaImportiCapitoloUP the new lista importi capitolo UP
	 */
	public void setListaImportiCapitoloUP(List<ImportiCapitoloUP> listaImportiCapitoloUP) {
		setListaImportiCapitolo(listaImportiCapitoloUP);
	}
	
	/**
	 * Adds the importo capitolo UP.
	 *
	 * @param importoCapitoloUp the importo capitolo up
	 */
	public void addImportoCapitoloUP(ImportiCapitoloUP importoCapitoloUp) {		
		if(importoCapitoloUp!=null) {
			getListaImportiCapitoloUP().add(importoCapitoloUp);
		}		
	}
	
	
	/**
	 * Gets the importi capitolo UG.
	 *
	 * @return the importi capitolo UG
	 */
	//@XmlTransient //NO
	public ImportiCapitoloUG getImportiCapitoloUG() {
		return getImportiCapitoloEquivalente();
	}


	/**
	 * Sets the importi capitolo UG.
	 *
	 * @param importiCapitoloUG the new importi capitolo UG
	 */
	public void setImportiCapitoloUG(ImportiCapitoloUG importiCapitoloUG) {
		setImportiCapitoloEquivalente(importiCapitoloUG);
	}


	/**
	 * Gets the politiche regionali unitarie.
	 *
	 * @return the politiche regionali unitarie
	 */
	public PoliticheRegionaliUnitarie getPoliticheRegionaliUnitarie() {
		return politicheRegionaliUnitarie;
	}


	/**
	 * Sets the politiche regionali unitarie.
	 *
	 * @param politicheRegionaliUnitarie the new politiche regionali unitarie
	 */
	public void setPoliticheRegionaliUnitarie(PoliticheRegionaliUnitarie politicheRegionaliUnitarie) {
		this.politicheRegionaliUnitarie = politicheRegionaliUnitarie;
	}


	/**
	 * Gets the ricorrente spesa.
	 *
	 * @return the ricorrente spesa
	 */
	public RicorrenteSpesa getRicorrenteSpesa() {
		return ricorrenteSpesa;
	}


	/**
	 * Sets the ricorrente spesa.
	 *
	 * @param ricorrenteSpesa the new ricorrente spesa
	 */
	public void setRicorrenteSpesa(RicorrenteSpesa ricorrenteSpesa) {
		this.ricorrenteSpesa = ricorrenteSpesa;
	}


	/**
	 * Gets the perimetro sanitario spesa.
	 *
	 * @return the perimetro sanitario spesa
	 */
	public PerimetroSanitarioSpesa getPerimetroSanitarioSpesa() {
		return perimetroSanitarioSpesa;
	}


	/**
	 * Sets the perimetro sanitario spesa.
	 *
	 * @param perimetroSanitarioSpesa the new perimetro sanitario spesa
	 */
	public void setPerimetroSanitarioSpesa(PerimetroSanitarioSpesa perimetroSanitarioSpesa) {
		this.perimetroSanitarioSpesa = perimetroSanitarioSpesa;
	}


	/**
	 * Gets the siope spesa.
	 *
	 * @return the siope spesa
	 */
	public SiopeSpesa getSiopeSpesa() {
		return siopeSpesa;
	}


	/**
	 * Sets the siope spesa.
	 *
	 * @param siopeSpesa the new siope spesa
	 */
	public void setSiopeSpesa(SiopeSpesa siopeSpesa) {
		this.siopeSpesa = siopeSpesa;
	}


	/**
	 * Gets the transazione unione europea spesa.
	 *
	 * @return the transazione unione europea spesa
	 */
	public TransazioneUnioneEuropeaSpesa getTransazioneUnioneEuropeaSpesa() {
		return transazioneUnioneEuropeaSpesa;
	}


	/**
	 * Sets the transazione unione europea spesa.
	 *
	 * @param transazioneUnioneEuropeaSpesa the new transazione unione europea spesa
	 */
	public void setTransazioneUnioneEuropeaSpesa(TransazioneUnioneEuropeaSpesa transazioneUnioneEuropeaSpesa) {
		this.transazioneUnioneEuropeaSpesa = transazioneUnioneEuropeaSpesa;
	}
	

	/**
	 * Gets the importi componenti capitolo.
	 *
	 * @return the importi componenti capitolo
	 */
	public List<ImportiCapitoloPerComponente> getImportiComponentiCapitolo() {
		return importiComponentiCapitolo;
	}


	/**
	 * Sets the importi componenti capitolo.
	 *
	 * @param importiComponentiCapitolo the new importi componenti capitolo
	 */
	public void setImportiComponentiCapitolo(List<ImportiCapitoloPerComponente> importiComponentiCapitolo) {
		this.importiComponentiCapitolo = importiComponentiCapitolo;
	}



	/**
	 * Gets the disavanzo da debito.
	 *
	 * @return the risorsaAccantonata
	 */
	public RisorsaAccantonata getRisorsaAccantonata() {
		return risorsaAccantonata;
	}


	/**
	 * @param risorsaAccantonata the risorsaAccantonata to set
	 */
	public void setRisorsaAccantonata(RisorsaAccantonata risorsaAccantonata) {
		this.risorsaAccantonata = risorsaAccantonata;
	}
	
	

	

}
