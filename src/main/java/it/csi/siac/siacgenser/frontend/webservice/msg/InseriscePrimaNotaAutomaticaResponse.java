/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class InseriscePrimaNotaAutomaticaResponse extends ServiceResponse {
	
	private List<RegistrazioneMovFin> registrazioniMovFinScartate = new ArrayList<RegistrazioneMovFin>();

	private PrimaNota primaNota;


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
	 * Elenco delle registrazioni da cui non e' stato possibile dedurre in automatico la CausaleEP e 
	 * che quindi non hanno generato un MovimentoEP nella PrimaNota (qualora creata).
	 *
	 * @return the registrazioniMovFinScartate
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinScartate() {
		return registrazioniMovFinScartate;
	}

	/**
	 * @param registrazioniMovFinScartate the registrazioniMovFinScartate to set
	 */
	public void setRegistrazioniMovFinScartate(List<RegistrazioneMovFin> registrazioniMovFinScartate) {
		this.registrazioniMovFinScartate = registrazioniMovFinScartate!=null? registrazioniMovFinScartate: new ArrayList<RegistrazioneMovFin>();
	}
	
	/**
	 * @param registrazioniMovFinScartate the registrazioniMovFinScartate to set
	 */
	public void addRegistrazioneMovFinScartata(RegistrazioneMovFin registrazioneMovFinScartata) {
		getRegistrazioniMovFinScartate().add(registrazioneMovFinScartata);
	}
	
	
	
}
