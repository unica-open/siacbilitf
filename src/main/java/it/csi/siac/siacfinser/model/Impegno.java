/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

//import it.csi.siac.siaccorser.model.Bilancio;
//import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
//import it.csi.siac.siacbilser.model.ClassificazioneCofog;
//import it.csi.siac.siacbilser.model.ElementoPianoDeiConti;
//import it.csi.siac.siacbilser.model.Programma;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacfinser.model.movgest.VincoloImpegno;
import it.csi.siac.siacfinser.model.mutuo.Mutuo;

/**
 * Impegno
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Impegno extends ImpegnoAbstract {

	private static final long serialVersionUID = 4018851672615937060L;

	private CapitoloUscitaGestione capitoloUscitaGestione;
	private List<SubImpegno> elencoSubImpegni;
	private List<VincoloImpegno> vincoliImpegno;
	private List<Mutuo> elencoMutui;
	

	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	public void setCapitoloUscitaGestione(
			CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
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

	public List<Mutuo> getElencoMutui() {
		return elencoMutui;
	}

	public void setElencoMutui(List<Mutuo> elencoMutui) {
		this.elencoMutui = elencoMutui;
	}
}
