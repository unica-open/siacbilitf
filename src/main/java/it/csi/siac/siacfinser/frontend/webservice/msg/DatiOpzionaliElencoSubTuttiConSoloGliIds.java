/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class DatiOpzionaliElencoSubTuttiConSoloGliIds implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private boolean caricaDisponibileFinanziare=false;
	private boolean caricaDisponibileLiquidareEDisponibilitaInModifica=false;
	private boolean caricaDisponibilePagare=false;
	
	private boolean caricaElencoModificheMovGest =false;
	
	//di tipo t_attr:
	private boolean caricaCig=false;
	private boolean caricaCup=false;
	private boolean caricaFlagAttivaGsa=false;
	//
	
	private boolean escludiAnnullati=false;
	private String filtroSubSoloInQuestoStato=null;


	public boolean isCaricaDisponibileLiquidareEDisponibilitaInModifica() {
		return caricaDisponibileLiquidareEDisponibilitaInModifica;
	}

	public void setCaricaDisponibileLiquidareEDisponibilitaInModifica(
			boolean caricaDisponibileLiquidareEDisponibilitaInModifica) {
		this.caricaDisponibileLiquidareEDisponibilitaInModifica = caricaDisponibileLiquidareEDisponibilitaInModifica;
	}


	public boolean isCaricaElencoModificheMovGest() {
		return caricaElencoModificheMovGest;
	}

	public void setCaricaElencoModificheMovGest(boolean caricaElencoModificheMovGest) {
		this.caricaElencoModificheMovGest = caricaElencoModificheMovGest;
	}

	public boolean isEscludiAnnullati() {
		return escludiAnnullati;
	}

	public void setEscludiAnnullati(boolean escludiAnnullati) {
		this.escludiAnnullati = escludiAnnullati;
	}

	public boolean isCaricaCig() {
		return caricaCig;
	}

	public void setCaricaCig(boolean caricaCig) {
		this.caricaCig = caricaCig;
	}

	public boolean isCaricaCup() {
		return caricaCup;
	}

	public void setCaricaCup(boolean caricaCup) {
		this.caricaCup = caricaCup;
	}

	public boolean isCaricaDisponibileFinanziare() {
		return caricaDisponibileFinanziare;
	}

	public void setCaricaDisponibileFinanziare(boolean caricaDisponibileFinanziare) {
		this.caricaDisponibileFinanziare = caricaDisponibileFinanziare;
	}

	public boolean isCaricaDisponibilePagare() {
		return caricaDisponibilePagare;
	}

	public void setCaricaDisponibilePagare(boolean caricaDisponibilePagare) {
		this.caricaDisponibilePagare = caricaDisponibilePagare;
	}

	public String getFiltroSubSoloInQuestoStato() {
		return filtroSubSoloInQuestoStato;
	}

	public void setFiltroSubSoloInQuestoStato(String filtroSubSoloInQuestoStato) {
		this.filtroSubSoloInQuestoStato = filtroSubSoloInQuestoStato;
	}

	public boolean isCaricaFlagAttivaGsa() {
		return caricaFlagAttivaGsa;
	}

	public void setCaricaFlagAttivaGsa(boolean caricaFlagAttivaGsa) {
		this.caricaFlagAttivaGsa = caricaFlagAttivaGsa;
	}
	
}
