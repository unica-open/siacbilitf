/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.UnitaElementareGestioneEntrata;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Richiesta al metodo FIN.AccertamentoService.aggiornaAccertamento()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaAccertamento extends ServiceRequest {

	private Accertamento accertamento;
	private Ente ente;
	private Bilancio bilancio;
	private Soggetto creditoreAccertamento;
	private UnitaElementareGestioneEntrata unitaElementareGestioneE;
	private boolean saltaInserimentoPrimaNotaSuSub;

	private boolean saltaInserimentoPrimaNota;
	/**
	 * Gets the accertamento.
	 *
	 * @return the accertamento
	 */
	public Accertamento getAccertamento() {
		return accertamento;
	}

	/**
	 * Sets the accertamento.
	 *
	 * @param accertamento the new accertamento
	 */
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	/**
	 * Gets the unita elementare gestione E.
	 *
	 * @return the unita elementare gestione E
	 */
	public UnitaElementareGestioneEntrata getUnitaElementareGestioneE() {
		return unitaElementareGestioneE;
	}

	/**
	 * Sets the unita elementare gestione E.
	 *
	 * @param unitaElementareGestioneE the new unita elementare gestione E
	 */
	public void setUnitaElementareGestioneE(UnitaElementareGestioneEntrata unitaElementareGestioneE) {
		this.unitaElementareGestioneE = unitaElementareGestioneE;
	}

	/**
	 * Gets the ente.
	 *
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * Sets the ente.
	 *
	 * @param ente the new ente
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * Gets the bilancio.
	 *
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * Sets the bilancio.
	 *
	 * @param bilancio the new bilancio
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * Gets the creditore accertamento.
	 *
	 * @return the creditore accertamento
	 */
	public Soggetto getCreditoreAccertamento() {
		return creditoreAccertamento;
	}

	/**
	 * Sets the creditore accertamento.
	 *
	 * @param creditoreAccertamento the new creditore accertamento
	 */
	public void setCreditoreAccertamento(Soggetto creditoreAccertamento) {
		this.creditoreAccertamento = creditoreAccertamento;
	}
	
	/**
	 * Checks if is salta inserimento prima nota su sub.
	 *
	 * @return the saltaInserimentoPrimaNota
	 */
	public boolean isSaltaInserimentoPrimaNotaSuSub() {
		return saltaInserimentoPrimaNotaSuSub;
	}

	/**
	 * Sets the salta inserimento prima nota su sub.
	 *
	 * @param saltaInserimentoPrimaNotaSuSub the new salta inserimento prima nota su sub
	 */
	public void setSaltaInserimentoPrimaNotaSuSub(boolean saltaInserimentoPrimaNotaSuSub) {
		this.saltaInserimentoPrimaNotaSuSub = saltaInserimentoPrimaNotaSuSub;
	}

	public boolean isSaltaInserimentoPrimaNota() {
		return saltaInserimentoPrimaNota;
	}

	public void setSaltaInserimentoPrimaNota(boolean saltaInserimentoPrimaNota) {
		this.saltaInserimentoPrimaNota = saltaInserimentoPrimaNota;
	}

}
