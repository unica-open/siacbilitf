/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class ControllaDisponibilitaCassaContoVincolatoCapitolo.
 *
 * @author elisa
 * @version 1.0.0 12 gen 2022
 */
public class LeggiSottoContiVincolatiCapitoloBySubdoc extends ServiceRequest {

	private List<Integer> idsSubdocumenti = new ArrayList<Integer>();

	// private CapitoloUscitaGestione capitoloUscitaGestione;
	// private Liquidazione liquidazione;
	// private Impegno impegno;
	// private CapitoloEntrataGestione capitoloEntrataGestione;
	// private Accertamento accertamento;

//	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
//		return capitoloUscitaGestione;
//	}
//
//	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitoloUscitaGestione) {
//		this.capitoloUscitaGestione = capitoloUscitaGestione;
//	}
//
//	public Liquidazione getLiquidazione() {
//		return liquidazione;
//	}
//
//	public void setLiquidazione(Liquidazione liquidazione) {
//		this.liquidazione = liquidazione;
//	}
//
//	public Impegno getImpegno() {
//		return impegno;
//	}
//
//	public void setImpegno(Impegno impegno) {
//		this.impegno = impegno;
//	}
//
//	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
//		return capitoloEntrataGestione;
//	}
//
//	public void setCapitoloEntrataGestione(CapitoloEntrataGestione capitoloEntrataGestione) {
//		this.capitoloEntrataGestione = capitoloEntrataGestione;
//	}
//
//	public Accertamento getAccertamento() {
//		return accertamento;
//	}
//
//	public void setAccertamento(Accertamento accertamento) {
//		this.accertamento = accertamento;
//	}

	public List<Integer> getIdsSubdocumenti() {
		return idsSubdocumenti;
	}

	public void setIdsSubdocumenti(List<Integer> idsSubdocumenti) {
		this.idsSubdocumenti = idsSubdocumenti;
	}

}
