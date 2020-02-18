/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * VincoliCapitoloUscitaEntrataGestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class VincoliCapitoloUEGest extends Entita {

	private static final long serialVersionUID = -6895451455917779798L;

	private BigDecimal importo;
	private StatoOperativo statoOperativo;
	private List<ImportoVincoliCapitoloGestione> importoVincoliCapGest = new ArrayList<ImportoVincoliCapitoloGestione>();
	private TipoVincolo tipoVincolo;
	private CapitoloEntrataGestione capitoloEntratAGest;
	private CapitoloUscitaGestione capitoloUscitaGest;

	public CapitoloEntrataGestione getCapitoloEntratAGest() {
		return capitoloEntratAGest;
	}

	public void setCapitoloEntratAGest(
			CapitoloEntrataGestione capitoloEntratAGest) {
		this.capitoloEntratAGest = capitoloEntratAGest;
	}

	public CapitoloUscitaGestione getCapitoloUscitaGest() {
		return capitoloUscitaGest;
	}

	public void setCapitoloUscitaGest(CapitoloUscitaGestione capitoloUscitaGest) {
		this.capitoloUscitaGest = capitoloUscitaGest;
	}

	public List<ImportoVincoliCapitoloGestione> getImportoVincoliCapGest() {
		return importoVincoliCapGest;
	}

	public void setImportoVincoliCapGest(
			List<ImportoVincoliCapitoloGestione> importoVincoliCapGest) {
		this.importoVincoliCapGest = importoVincoliCapGest;
	}

	public TipoVincolo getTipoVincolo() {
		return tipoVincolo;
	}

	public void setTipoVincolo(TipoVincolo tipoVincolo) {
		this.tipoVincolo = tipoVincolo;
	}

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

}
