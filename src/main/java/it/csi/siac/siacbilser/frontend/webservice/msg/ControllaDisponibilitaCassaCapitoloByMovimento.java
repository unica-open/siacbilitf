/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Controllo sui fondi a dubbia e difficile esazione dell'anno precedente a quello di bilancio per il rendiconto
 * @author Marchino Alessandro
 */
public class ControllaDisponibilitaCassaCapitoloByMovimento extends ServiceRequest {
	
	List<Integer> idsSubdocumentiSpesa = new ArrayList<Integer>();
	List<Integer> idsElenchi = new ArrayList<Integer>();

	Bilancio bilancio;

	/**
	 * @return the idSubdocumentiSpesa
	 */
	public List<Integer> getIdsSubdocumentiSpesa() {
		return idsSubdocumentiSpesa;
	}

	/**
	 * Sets the ids subdocumenti spesa.
	 *
	 * @param idsSubdocumentiSpesa the new ids subdocumenti spesa
	 */
	public void setIdsSubdocumentiSpesa(List<Integer> idsSubdocumentiSpesa) {
		this.idsSubdocumentiSpesa = idsSubdocumentiSpesa;
	}

	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the idsElenchi
	 */
	public List<Integer> getIdsElenchi() {
		return idsElenchi;
	}

	/**
	 * @param idsElenchi the idsElenchi to set
	 */
	public void setIdsElenchi(List<Integer> idsElenchi) {
		this.idsElenchi = idsElenchi;
	}
	
	
}
