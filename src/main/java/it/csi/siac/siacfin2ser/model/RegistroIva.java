/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class RegistroIva extends Entita {
	
	// siac_t_iva_registro
	
	private static final long serialVersionUID = 6738324751282744777L;

	// PK
	private String codice;
	
	private String descrizione;
	
	// ivareg_tipo_id
	private TipoRegistroIva tipoRegistroIva;
	private Ente ente;
	private GruppoAttivitaIva gruppoAttivitaIva;
	private List<ContatoreRegistroIva> listaContatoreRegistroIva = new ArrayList<ContatoreRegistroIva>();

	// SIAC-6276 CR-1179B
	private Boolean flagLiquidazioneIva = Boolean.FALSE;
	
	// CR SIAC-3791
	private Boolean flagBloccato;
	
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	/**
	 * @return the tipoRegistroIva
	 */
	@XmlJavaTypeAdapter(TipoRegistroIva.TipoRegistroIvaAdapter.class)
	public TipoRegistroIva getTipoRegistroIva() {
		return tipoRegistroIva;
	}
	/**
	 * @param tipoRegistroIva the tipoRegistroIva to set
	 */
	public void setTipoRegistroIva(TipoRegistroIva tipoRegistroIva) {
		this.tipoRegistroIva = tipoRegistroIva;
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
	 * @return the listaContatoreRegistroIva
	 */
	public List<ContatoreRegistroIva> getListaContatoreRegistroIva() {
		return listaContatoreRegistroIva;
	}
	/**
	 * @param listaContatoreRegistroIva the listaContatoreRegistroIva to set
	 */
	public void setListaContatoreRegistroIva(List<ContatoreRegistroIva> listaContatoreRegistroIva) {
		this.listaContatoreRegistroIva = listaContatoreRegistroIva != null ? listaContatoreRegistroIva : new ArrayList<ContatoreRegistroIva>();
	}
	/**
	 * @return the flagLiquidazioneIva
	 */
	public Boolean getFlagLiquidazioneIva() {
		return flagLiquidazioneIva;
	}
	/**
	 * @param flagLiquidazioneIva the flagLiquidazioneIva to set
	 */
	public void setFlagLiquidazioneIva(Boolean flagLiquidazioneIva) {
		this.flagLiquidazioneIva = flagLiquidazioneIva;
	}
	/**
	 * @return the flagBloccato
	 */
	public Boolean getFlagBloccato() {
		return flagBloccato;
	}
	/**
	 * @param flagBloccato the flagBloccato to set
	 */
	public void setFlagBloccato(Boolean flagBloccato) {
		this.flagBloccato = flagBloccato;
	}
	
}
