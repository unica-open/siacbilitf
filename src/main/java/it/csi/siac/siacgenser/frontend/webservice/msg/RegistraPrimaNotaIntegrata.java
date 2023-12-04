/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CheckOnlyElaborazioneAttiva;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassificatoreGSA;
import it.csi.siac.siacgenser.model.PrimaNota;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RegistraPrimaNotaIntegrata extends ServiceRequest {

	private PrimaNota primaNota;
	private Boolean isDaValidare;
	private Boolean isAggiornamento;

	private Boolean checkOnlyElaborazioneAttiva = Boolean.FALSE;
	
	// SIAC-5336
	private ClassificatoreGSA classificatoreGSA;
	
	/**
	 * @return the primaNota
	 */
	public PrimaNota getPrimaNota() {
		return primaNota;
	}

	/**
	 * @param primaNota the primaNota to set
	 */
	public void setPrimaNota(PrimaNota primaNota) {
		this.primaNota = primaNota;
	}

	/**
	 * @return the isDaValidare
	 */
	public Boolean getIsDaValidare() {
		return isDaValidare;
	}

	/**
	 * @param isDaValidare the isDaValidare to set
	 */
	public void setIsDaValidare(Boolean isDaValidare) {
		this.isDaValidare = isDaValidare;
	}

	/**
	 * @return the isAggiornamento
	 */
	public Boolean getIsAggiornamento() {
		return isAggiornamento;
	}

	/**
	 * @param isAggiornamento the isAggiornamento to set
	 */
	public void setIsAggiornamento(Boolean isAggiornamento) {
		this.isAggiornamento = isAggiornamento;
	}

	/**
	 * @return the checkElaborazioneAttiva
	 */
	@CheckOnlyElaborazioneAttiva
	public Boolean getCheckOnlyElaborazioneAttiva() {
		return checkOnlyElaborazioneAttiva;
	}

	/**
	 * @param checkElaborazioneAttiva the checkElaborazioneAttiva to set
	 */
	public void setCheckOnlyElaborazioneAttiva(Boolean checkElaborazioneAttiva) {
		this.checkOnlyElaborazioneAttiva = checkElaborazioneAttiva;
	}

	/**
	 * @return the classificatoreGSA
	 */
	public ClassificatoreGSA getClassificatoreGSA() {
		return this.classificatoreGSA;
	}

	/**
	 * @param classificatoreGSA the classificatoreGSA to set
	 */
	public void setClassificatoreGSA(ClassificatoreGSA classificatoreGSA) {
		this.classificatoreGSA = classificatoreGSA;
	}

	
	
}
