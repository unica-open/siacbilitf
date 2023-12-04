/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.model.AttoAmministrativo;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.StrutturaAmministrativoContabile;
import it.csi.siac.siacfinser.model.movgest.ComponenteBilancioImpegno;
import it.csi.siac.siacfinser.model.movgest.VincoloImpegno;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Impegno extends ImpegnoAbstract {

	private static final long serialVersionUID = 4018851672615937060L;

//CANCELLAMI
//	private CapitoloUscitaGestione capitoloUscitaGestione;
	//SIAC_7349
//	private ComponenteBilancioImpegno componenteBilancioImpegno;
	
	private List<SubImpegno> elencoSubImpegni;
	private List<VincoloImpegno> vincoliImpegno;
	private StrutturaAmministrativoContabile strutturaCompetenteLetta;
	
	//SIAC-7349 - Inizio - SR90 - MR - 03/2020 - Aggiunta property per controllo BE
	private BigDecimal disponibilitaImpegnareComponente;
	//SIAC-7349 - Fine
	
	// SIAC-7349 GS 13/07/2020 INIZIO - Aggiunto flag per bypassare i controlli di disponibilità in caso di aggiornamento di una modifica di impegno 
	private boolean aggiornaTabModificheImpegno = false;
	// SIAC-7349 GS 13/07/2020 FINE
	


//SIAC-6865
	private Impegno impegnoPrenotazioneOrigine;
	private boolean hasModificheAggiudicazione;
	//SIAC-6865
	private String annoPrenotazioneOrigine;
	private AttoAmministrativo attoAmministrativoAggiudicazione;
	

	private DettaglioImportiImpegno dettaglioImportiImpegno;
	

	public Impegno(MovimentoGestione movimentoGestione) {
		super(movimentoGestione);
	}

	public Impegno() {
		super();
	}

	private DettaglioImportiImpegno getDettaglioImportiImpegnoInstance() {
		if (dettaglioImportiImpegno == null) {
			dettaglioImportiImpegno = new DettaglioImportiImpegno();
		}
		return dettaglioImportiImpegno;
	}   
	
	public void setImportoLiquidato(BigDecimal importoLiquidato) {
		getDettaglioImportiImpegnoInstance().setImpLiq(new RiepilogoImportoNumero(importoLiquidato));
	}
	
	public BigDecimal getImportoLiquidato() {
		try {
			return dettaglioImportiImpegno.getImpLiq().getImporto();
		}
		catch (NullPointerException e) {
			return null;
		}
	}
	
	/**
	 * @return the strutturaCompetenteLetta
	 */
	public StrutturaAmministrativoContabile getStrutturaCompetenteLetta() {
		return strutturaCompetenteLetta;
	}

	/**
	 * @param strutturaCompetenteLetta the strutturaCompetenteLetta to set
	 */
	public void setStrutturaCompetenteLetta(StrutturaAmministrativoContabile strutturaCompetenteLetta) {
		this.strutturaCompetenteLetta = strutturaCompetenteLetta;
	}

	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return (CapitoloUscitaGestione)super.capitolo;
	}

	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitoloUscitaGestione) {
		super.capitolo = capitoloUscitaGestione;
	}
	
	public ComponenteBilancioImpegno getComponenteBilancioImpegno() {
		return (ComponenteBilancioImpegno)super.componenteBilancioMovimentoGestione;
	}

	public void setComponenteBilancioImpegno(ComponenteBilancioImpegno componenteBilancioImpegno) {
		super.componenteBilancioMovimentoGestione = componenteBilancioImpegno;
	}

	public List<SubImpegno> getElencoSubImpegni() {
		return elencoSubImpegni;
	}

	public void setElencoSubImpegni(List<SubImpegno> elencoSubImpegni) {
		this.elencoSubImpegni = elencoSubImpegni;
	}


	public List<VincoloImpegno> getVincoliImpegno() {
		return vincoliImpegno;
	}

	public void setVincoliImpegno(List<VincoloImpegno> vincoliImpegno) {
		this.vincoliImpegno = vincoliImpegno;
	}


	public BigDecimal getDisponibilitaImpegnareComponente() {
		return disponibilitaImpegnareComponente;
	}

	public void setDisponibilitaImpegnareComponente(BigDecimal disponibilitaImpegnareComponente) {
		this.disponibilitaImpegnareComponente = disponibilitaImpegnareComponente;
	}

	/**
	 * @return the impegnoPrenotazioneOrigine
	 */
	public Impegno getImpegnoPrenotazioneOrigine() {
		return impegnoPrenotazioneOrigine;
	}
	// SIAC-7349 GS 13/07/2020 INIZIO - Aggiunto flag per bypassare i controlli di disponibilità in caso di aggiornamento di una modifica di impegno 
	public boolean isAggiornaTabModificheImpegno() {
		return aggiornaTabModificheImpegno;
	}

	public void setAggiornaTabModificheImpegno(boolean aggiornaTabModificheImpegno) {
		this.aggiornaTabModificheImpegno = aggiornaTabModificheImpegno;
	}
	// SIAC-7349 GS 13/07/2020 FINE
	/**
	 * @param impegnoPrenotazioneOrigine the impegnoPrenotazioneOrigine to set
	 */
	public void setImpegnoPrenotazioneOrigine(Impegno impegnoPrenotazioneOrigine) {
		this.impegnoPrenotazioneOrigine = impegnoPrenotazioneOrigine;
	}

	/**
	 * @return the hasModificheAggiudicazione
	 */
	public boolean isHasModificheAggiudicazione() {
		return hasModificheAggiudicazione;
	}

	/**
	 * @param hasModificheAggiudicazione the hasModificheAggiudicazione to set
	 */
	public void setHasModificheAggiudicazione(boolean hasModificheAggiudicazione) {
		this.hasModificheAggiudicazione = hasModificheAggiudicazione;
	}
	/**
	 * @return the annoPrenotazioneOrigine
	 */
	public String getAnnoPrenotazioneOrigine() {
		return annoPrenotazioneOrigine;
	}

	/**
	 * @param annoPrenotazioneOrigine the annoPrenotazioneOrigine to set
	 */
	public void setAnnoPrenotazioneOrigine(String annoPrenotazioneOrigine) {
		this.annoPrenotazioneOrigine = annoPrenotazioneOrigine;
	}

	/**
	 * @return the attoAmministrativoPrenotazioneOrigine
	 */
	public AttoAmministrativo getAttoAmministrativoAggiudicazione() {
		return attoAmministrativoAggiudicazione;
	}

	/**
	 * Sets the atto amministrativo aggiudicazione.
	 *
	 * @param attoAmministrativoAggiudicazione the new atto amministrativo aggiudicazione
	 */
	public void setAttoAmministrativoAggiudicazione(AttoAmministrativo attoAmministrativoAggiudicazione) {
		this.attoAmministrativoAggiudicazione = attoAmministrativoAggiudicazione;
	}

	public DettaglioImportiImpegno getDettaglioImportiImpegno() {
		return dettaglioImportiImpegno;
	}

	public void setDettaglioImportiImpegno(DettaglioImportiImpegno dettaglioImportiImpegno) {
		this.dettaglioImportiImpegno = dettaglioImportiImpegno;
	}

	@SuppressWarnings("unchecked")
	public List<Impegno> getDettagliPerBilancio() {
		return (List<Impegno>) super.getDettagliPerBilancio();
		
	}
	

}
