/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class GruppoAttivitaIva extends Entita {
	
	// siac_t_iva_gruppo
	
	private static final long serialVersionUID = -8961281604562975696L;
	
	private String codice;
	private String descrizione;
	
	private TipoChiusura tipoChiusura;
	private TipoAttivita tipoAttivita;
	private Ente ente;
	
	private List<RegistroIva> listaRegistroIva = new ArrayList<RegistroIva>();
	private List<AttivitaIva> listaAttivitaIva = new ArrayList<AttivitaIva>();
	private List<ProRataEChiusuraGruppoIva> listaProRataEChiusuraGruppoIva =
			new ArrayList<ProRataEChiusuraGruppoIva>();
	
	// Campo di utilita: serve per impostare i dati dell'annualizzazione, si' che nei converter il dato sia presente e utilizzabile
	private Integer annualizzazione;
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
	 * @return the tipoChiusura
	 */
	public TipoChiusura getTipoChiusura() {
		return tipoChiusura;
	}
	/**
	 * @param tipoChiusura the tipoChiusura to set
	 */
	public void setTipoChiusura(TipoChiusura tipoChiusura) {
		this.tipoChiusura = tipoChiusura;
	}
	/**
	 * @return the tipoAttivita
	 */
	public TipoAttivita getTipoAttivita() {
		return tipoAttivita;
	}
	/**
	 * @param tipoAttivita the tipoAttivita to set
	 */
	public void setTipoAttivita(TipoAttivita tipoAttivita) {
		this.tipoAttivita = tipoAttivita;
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
	 * @return the listaRegistroIva
	 */
	public List<RegistroIva> getListaRegistroIva() {
		return listaRegistroIva;
	}
	/**
	 * @param listaRegistroIva the listaRegistroIva to set
	 */
	public void setListaRegistroIva(List<RegistroIva> listaRegistroIva) {
		this.listaRegistroIva = listaRegistroIva != null ? listaRegistroIva : new ArrayList<RegistroIva>();
	}
	/**
	 * @return the listaAttivitaIva
	 */
	public List<AttivitaIva> getListaAttivitaIva() {
		return listaAttivitaIva;
	}
	/**
	 * @param listaAttivitaIva the listaAttivitaIva to set
	 */
	public void setListaAttivitaIva(List<AttivitaIva> listaAttivitaIva) {
		this.listaAttivitaIva = listaAttivitaIva != null ? listaAttivitaIva : new ArrayList<AttivitaIva>();
	}
	/**
	 * @return the listaProRataEChiusuraGruppoIva
	 */
	public List<ProRataEChiusuraGruppoIva> getListaProRataEChiusuraGruppoIva() {
		return listaProRataEChiusuraGruppoIva;
	}
	/**
	 * @param listaProRataEChiusuraGruppoIva the listaProRataEChiusuraGruppoIva to set
	 */
	public void setListaProRataEChiusuraGruppoIva(List<ProRataEChiusuraGruppoIva> listaProRataEChiusuraGruppoIva) {
		this.listaProRataEChiusuraGruppoIva = listaProRataEChiusuraGruppoIva != null ? listaProRataEChiusuraGruppoIva : new ArrayList<ProRataEChiusuraGruppoIva>();
	}
	/**
	 * @return the annualizzazione
	 */
	public Integer getAnnualizzazione() {
		return annualizzazione;
	}
	/**
	 * @param annualizzazione the annualizzazione to set
	 */
	public void setAnnualizzazione(Integer annualizzazione) {
		this.annualizzazione = annualizzazione;
	}
	
	/**
	 * @return the ivaPrecedente
	 */
	@XmlTransient
	public BigDecimal getIvaPrecedente() {
		for(ProRataEChiusuraGruppoIva precgi : listaProRataEChiusuraGruppoIva) {
			if(precgi.getIvaPrecedente() != null) {
				return precgi.getIvaPrecedente();
			}
		}
		return BigDecimal.ZERO;
	}
	
}
