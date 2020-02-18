/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.Cespite;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.model.MovimentoDettaglio;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class AggiornaImportoCespiteRegistroACespite extends ServiceRequest {

	private MovimentoDettaglio movimentoDettaglio;
	private Cespite cespite;
	private BigDecimal importoSuRegistroA;
	
	/**
	 * @return the movimentoDettaglio
	 */
	public MovimentoDettaglio getMovimentoDettaglio() {
		return movimentoDettaglio;
	}
	/**
	 * @param movimentoDettaglio the movimentoDettaglio to set
	 */
	public void setMovimentoDettaglio(MovimentoDettaglio movimentoDettaglio) {
		this.movimentoDettaglio = movimentoDettaglio;
	}
	/**
	 * @return the cespite
	 */
	public Cespite getCespite() {
		return cespite;
	}
	/**
	 * @param cespite the cespite to set
	 */
	public void setCespite(Cespite cespite) {
		this.cespite = cespite;
	}
	/**
	 * @return the importoSuRegistroA
	 */
	public BigDecimal getImportoSuRegistroA() {
		return importoSuRegistroA;
	}
	/**
	 * @param importoSuRegistroA the importoSuRegistroA to set
	 */
	public void setImportoSuRegistroA(BigDecimal importoSuRegistroA) {
		this.importoSuRegistroA = importoSuRegistroA;
	}
	
}
