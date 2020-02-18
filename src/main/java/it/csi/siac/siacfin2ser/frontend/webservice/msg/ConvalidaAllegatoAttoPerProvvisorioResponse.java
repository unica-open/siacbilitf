/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;
import it.csi.siac.siacfinser.model.provvisoriDiCassa.ProvvisorioDiCassa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class ConvalidaAllegatoAttoPerProvvisorioResponse extends ConvalidaAllegatoAttoResponse {
	
	private ProvvisorioDiCassa provvisorioDiCassa;
	
	private List<AllegatoAtto> allegatiAtto  = new ArrayList<AllegatoAtto>();
	
	
	private List<AllegatoAtto> allegatiAttoScartati = new ArrayList<AllegatoAtto>();
	

	/**
	 * @return the provvisorioDiCassa
	 */
	public ProvvisorioDiCassa getProvvisorioDiCassa() {
		return provvisorioDiCassa;
	}

	/**
	 * @param provvisorioDiCassa the provvisorioDiCassa to set
	 */
	public void setProvvisorioDiCassa(ProvvisorioDiCassa provvisorioDiCassa) {
		this.provvisorioDiCassa = provvisorioDiCassa;
	}

	/**
	 * @return the allegatiAtto
	 */
	public List<AllegatoAtto> getAllegatiAtto() {
		return allegatiAtto;
	}

	/**
	 * @param allegatiAtto the allegatiAtto to set
	 */
	public void setAllegatiAtto(List<AllegatoAtto> allegatiAtto) {
		this.allegatiAtto = allegatiAtto != null ? allegatiAtto : new ArrayList<AllegatoAtto>();
	}

	/**
	 * @return the allegatiAttoScartati
	 */
	public List<AllegatoAtto> getAllegatiAttoScartati() {
		return allegatiAttoScartati;
	}

	/**
	 * @param allegatiAttoScartati the allegatiAttoScartati to set
	 */
	public void setAllegatiAttoScartati(List<AllegatoAtto> allegatiAttoScartati) {
		this.allegatiAttoScartati = allegatiAttoScartati != null ? allegatiAttoScartati : new ArrayList<AllegatoAtto>();
	}

	/**
	 * Indica se sono presenti delle quote scartate.
	 *
	 * @return true, if successful
	 */
	@Override
	public boolean sonoPresentiQuoteScartate() {
		return !getAllegatiAttoScartati().isEmpty() 
				|| super.sonoPresentiQuoteScartate();
	}
	
	

}
