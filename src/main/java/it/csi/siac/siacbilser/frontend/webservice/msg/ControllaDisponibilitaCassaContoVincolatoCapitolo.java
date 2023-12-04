/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfin2ser.model.ContoTesoreria;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;


/**
 * The Class ControllaDisponibilitaCassaContoVincolatoCapitolo.
 *
 * @author elisa
 * @version 1.0.0 12 gen 2022
 */
public class ControllaDisponibilitaCassaContoVincolatoCapitolo extends ServiceRequest {
	
	private ContoTesoreria contoTesoreria;
	private CapitoloUscitaGestione capitoloUscitaGestione;
	private Liquidazione liquidazione;
	private List<Integer> idsSubdocumentiSpesa = new ArrayList<Integer>();
	private Impegno impegno;
	private CapitoloEntrataGestione capitoloEntrataGestione;
	private Accertamento accertamento;
	private List<Integer> idsSubdocumentiEntrata = new ArrayList<Integer>();

	public ContoTesoreria getContoTesoreria() {
		return contoTesoreria;
	}
	public void setContoTesoreria(ContoTesoreria contoTesoreria) {
		this.contoTesoreria = contoTesoreria;
	}
	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}
	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
	}
	public Liquidazione getLiquidazione() {
		return liquidazione;
	}
	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}
	public Impegno getImpegno() {
		return impegno;
	}
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}
	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}
	public void setCapitoloEntrataGestione(CapitoloEntrataGestione capitoloEntrataGestione) {
		this.capitoloEntrataGestione = capitoloEntrataGestione;
	}
	public Accertamento getAccertamento() {
		return accertamento;
	}
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}
	public List<Integer> getIdsSubdocumentiSpesa() {
		return idsSubdocumentiSpesa;
	}
	public void setIdsSubdocumentiSpesa(List<Integer> idsSubdocumentiSpesa) {
		this.idsSubdocumentiSpesa = idsSubdocumentiSpesa;
	}
	public List<Integer> getIdsSubdocumentiEntrata() {
		return idsSubdocumentiEntrata;
	}
	public void setIdsSubdocumentiEntrata(List<Integer> idsSubdocumentiEntrata) {
		this.idsSubdocumentiEntrata = idsSubdocumentiEntrata;
	}
	
	public void impostaContoTesoreriaFromContoTesoreriaBil(it.csi.siac.siacfin2ser.model.ContoTesoreria contoTesoreria) {
		if(contoTesoreria == null) {
			this.contoTesoreria = null;
			return;
		} 
		ContoTesoreria ct = new ContoTesoreria();
		ct.setUid(contoTesoreria.getUid());
		ct.setCodice(contoTesoreria.getCodice());
		ct.setDescrizione(contoTesoreria.getDescrizione()); 
		this.contoTesoreria = ct;
	}
	
	
}
