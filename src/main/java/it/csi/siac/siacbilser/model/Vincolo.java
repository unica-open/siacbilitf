/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.EntitaEnte;

public class Vincolo extends EntitaEnte {
	
	private static final long serialVersionUID = 4872810308171314502L;
	
	private Bilancio bilancio;
	private String codice;
	private String descrizione;
	private String note;
	private Boolean flagTrasferimentiVincolati;
	
	private StatoOperativo statoOperativo;
	private TipoVincoloCapitoli tipoVincoloCapitoli;
	
	//SIAC-5076
	private GenereVincolo genereVincolo;
	
	//SIAC-7192
	private RisorsaVincolata risorsaVincolata;
	
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Boolean getFlagTrasferimentiVincolati() {
		return flagTrasferimentiVincolati;
	}
	public void setFlagTrasferimentiVincolati(Boolean flagTrasferimentiVincolati) {
		this.flagTrasferimentiVincolati = flagTrasferimentiVincolati;
	}
	public StatoOperativo getStatoOperativo() {
		return statoOperativo;
	}
	public void setStatoOperativo(StatoOperativo statoOperativo) {
		this.statoOperativo = statoOperativo;
	}	
	public TipoVincoloCapitoli getTipoVincoloCapitoli() {
		return tipoVincoloCapitoli;
	}
	public void setTipoVincoloCapitoli(TipoVincoloCapitoli tipoVincoloCapitoli) {
		this.tipoVincoloCapitoli = tipoVincoloCapitoli;
	}
	
	
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the genereVincolo
	 */
	public GenereVincolo getGenereVincolo() {
		return genereVincolo;
	}
	/**
	 * @param genereVincolo the genereVincolo to set
	 */
	public void setGenereVincolo(GenereVincolo genereVincolo) {
		this.genereVincolo = genereVincolo;
	}
	/**
	 * @return the risorsaVincolata
	 */
	public RisorsaVincolata getRisorsaVincolata() {
		return risorsaVincolata;
	}
	/**
	 * @param risorsaVincolata the risorsaVincolata to set
	 */
	public void setRisorsaVincolata(RisorsaVincolata risorsaVincolata) {
		this.risorsaVincolata = risorsaVincolata;
	}
	
}
