/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * VincoliCapitoloUscitaEntrataPrevisione (entit&agrave; condivisa da capitolo uscita e
 * entrata previsione)
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VincoliCapitoloUEPrev extends EntitaEnte {

	
	private static final long serialVersionUID = -6026544924981550131L;
	private BigDecimal importo;
	private int annoCompetenza;

	private StatoOperativo statoOperativo;

	// se stiamo ricercando il capitolo uscita previsione capitoloEntrataPrev
	// non sara' null se esistono vincoli, sara' null CapitoloUscitaPrevisione
	private CapitoloEntrataPrevisione capitoloEntrataPrev;

	// se stiamo ricercando il capitolo uscita previsione capitoloUscitaPrev non
	// sara' null se esistono vincoli, sara' null CapitoloEntrataPrevisione
	private CapitoloUscitaPrevisione capitoloUscitaPrev;

	private List<ImportoVincoliCapitoloPrevisone> importoVincoliCapPrev = new ArrayList<ImportoVincoliCapitoloPrevisone>();
	private TipoVincolo tipoVincolo;

	public BigDecimal getImporto() {
		return importo;
	}

	public void setImporto(BigDecimal importo) {
		this.importo = importo;
	}

	public StatoOperativo getStatoOperativo() {
		return statoOperativo;
	}

	public void setStatoOperativo(StatoOperativo statoOperativo) {
		this.statoOperativo = statoOperativo;
	}

	public List<ImportoVincoliCapitoloPrevisone> getImportoVincoliCapPrev() {
		return importoVincoliCapPrev;
	}

	public void setImportoVincoliCapPrev(
			List<ImportoVincoliCapitoloPrevisone> importoVincoliCapPrev) {
		this.importoVincoliCapPrev = importoVincoliCapPrev;
	}

	public CapitoloEntrataPrevisione getCapitoloEntrataPrev() {
		return capitoloEntrataPrev;
	}

	public void setCapitoloEntrataPrev(
			CapitoloEntrataPrevisione capitoloEntrataPrev) {
		this.capitoloEntrataPrev = capitoloEntrataPrev;
	}

	public TipoVincolo getTipoVincolo() {
		return tipoVincolo;
	}

	public void setTipoVincolo(TipoVincolo tipoVincolo) {
		this.tipoVincolo = tipoVincolo;
	}

	public CapitoloUscitaPrevisione getCapitoloUscitaPrev() {
		return capitoloUscitaPrev;
	}

	public void setCapitoloUscitaPrev(
			CapitoloUscitaPrevisione capitoloUscitaPrev) {
		this.capitoloUscitaPrev = capitoloUscitaPrev;
	}

	public int getAnnoCompetenza() {
		return annoCompetenza;
	}

	public void setAnnoCompetenza(int annoCompetenza) {
		this.annoCompetenza = annoCompetenza;
	}

}
