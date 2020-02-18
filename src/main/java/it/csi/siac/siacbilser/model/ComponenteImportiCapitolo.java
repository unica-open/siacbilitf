/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ComponenteImportiCapitolo extends Entita {

	private static final long serialVersionUID = -5362818479227416554L;

	private TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo;
	
	private ImportiCapitolo importiCapitolo;
	
	@XmlElementWrapper(name = "listaDettaglioComponenteImportiCapitolo")
	@XmlElement(name = "dettaglioComponenteImportiCapitolo")
	private List<DettaglioComponenteImportiCapitolo> listaDettaglioComponenteImportiCapitolo = new ArrayList<DettaglioComponenteImportiCapitolo>();
	
	private Boolean hasVariazioni;

	public ComponenteImportiCapitolo() {
	}
	public ComponenteImportiCapitolo(int uid) {
		setUid(uid);
	}
	/**
	 * @return the tipoComponenteImportiCapitolo
	 */
	public TipoComponenteImportiCapitolo getTipoComponenteImportiCapitolo() {
		return tipoComponenteImportiCapitolo;
	}

	/**
	 * @param tipoComponenteImportiCapitolo
	 *            the tipoComponenteImportiCapitolo to set
	 */
	public void setTipoComponenteImportiCapitolo(TipoComponenteImportiCapitolo tipoComponenteImportiCapitolo) {
		this.tipoComponenteImportiCapitolo = tipoComponenteImportiCapitolo;
	}

	/**
	 * @return the importiCapitolo
	 */
	public ImportiCapitolo getImportiCapitolo() {
		return importiCapitolo;
	}

	/**
	 * @param importiCapitolo
	 *            the importiCapitolo to set
	 */
	public void setImportiCapitolo(ImportiCapitolo importiCapitolo) {
		this.importiCapitolo = importiCapitolo;
	}

	/**
	 * @return the listaDettaglioComponenteImportiCapitolo
	 */
	@XmlTransient
	public List<DettaglioComponenteImportiCapitolo> getListaDettaglioComponenteImportiCapitolo() {
		return listaDettaglioComponenteImportiCapitolo;
	}

	/**
	 * @param listaDettaglioComponenteImportiCapitolo the listaDettaglioComponenteImportiCapitolo to set
	 */
	public void setListaDettaglioComponenteImportiCapitolo(List<DettaglioComponenteImportiCapitolo> listaDettaglioComponenteImportiCapitolo) {
		this.listaDettaglioComponenteImportiCapitolo = listaDettaglioComponenteImportiCapitolo != null ? listaDettaglioComponenteImportiCapitolo : new ArrayList<DettaglioComponenteImportiCapitolo>();
	}

	/**
	 * @return the hasVariazioni
	 */
	public Boolean getHasVariazioni() {
		return this.hasVariazioni;
	}
	/**
	 * @param hasVariazioni the hasVariazioni to set
	 */
	public void setHasVariazioni(Boolean hasVariazioni) {
		this.hasVariazioni = hasVariazioni;
	}
	/**
	 * Calcola l'importo della componente per tipo di dettaglio associato
	 * @param tipoDettaglio il tipo di dettaglio
	 * @return l'importo
	 */
	public BigDecimal computeImportoByTipoDettaglio(TipoDettaglioComponenteImportiCapitolo tipoDettaglio) {
		BigDecimal result = BigDecimal.ZERO;
		for(DettaglioComponenteImportiCapitolo dcic : listaDettaglioComponenteImportiCapitolo) {
			if(tipoDettaglio.equals(dcic.getTipoDettaglioComponenteImportiCapitolo())) {
				result = result.add(dcic.getImporto());
			}
		}
		return result;
	}

	/**
	 * Imposta l'importo della componente sul tipo di dettaglio associato
	 * @param importo l'importo da impostare
	 * @param tipoDettaglio il tipo di dettaglio
	 */
	public void impostaImportoByTipoDettaglio(BigDecimal importo, TipoDettaglioComponenteImportiCapitolo tipoDettaglio) {
		for(DettaglioComponenteImportiCapitolo dcic : listaDettaglioComponenteImportiCapitolo) {
			if(tipoDettaglio.equals(dcic.getTipoDettaglioComponenteImportiCapitolo())) {
				dcic.setImporto(importo);
			}
		}
	}
}
