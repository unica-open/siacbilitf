/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class AttivitaIva extends Codifica {
	
	// siac_t_iva_attivita
	
	private static final long serialVersionUID = 1150579847382832360L;
	
	private Boolean flagRilevanteIRAP = Boolean.FALSE;
	private GruppoAttivitaIva gruppoAttivitaIva;
	private List<Capitolo<?, ?>> listaCapitolo = new ArrayList<Capitolo<?, ?>>();
	private Ente ente;
	
	/**
	 * @return the flagRilevanteIRAP
	 */
	public Boolean getFlagRilevanteIRAP() {
		return flagRilevanteIRAP;
	}
	/**
	 * @param flagRilevanteIRAP the flagRilevanteIRAP to set
	 */
	public void setFlagRilevanteIRAP(Boolean flagRilevanteIRAP) {
		this.flagRilevanteIRAP = flagRilevanteIRAP;
	}
	/**
	 * @return the gruppoAttivitaIva
	 */
	public GruppoAttivitaIva getGruppoAttivitaIva() {
		return gruppoAttivitaIva;
	}
	/**
	 * @param gruppoAttivitaIva the gruppoAttivitaIva to set
	 */
	public void setGruppoAttivitaIva(GruppoAttivitaIva gruppoAttivitaIva) {
		this.gruppoAttivitaIva = gruppoAttivitaIva;
	}
	/**
	 * @return the listaCapitolo
	 */
	public List<Capitolo<?, ?>> getListaCapitolo() {
		return listaCapitolo;
	}
	/**
	 * @param listaCapitolo the listaCapitolo to set
	 */
	public void setListaCapitolo(List<Capitolo<?, ?>> listaCapitolo) {
		this.listaCapitolo = listaCapitolo != null ? listaCapitolo : new ArrayList<Capitolo<?,?>>();
	}
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
	
	
}
