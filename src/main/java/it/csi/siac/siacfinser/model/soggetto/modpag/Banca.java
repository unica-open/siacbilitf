/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto.modpag;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Banca extends EntitaEnte {

	private static final long serialVersionUID = -4018182799322422916L;

	private String abi;
	private String cab;

	private String descrizione;

	private String descrizioneFiliale;

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizioneFiliale() {
		return descrizioneFiliale;
	}

	public void setDescrizioneFiliale(String descrizioneFiliale) {
		this.descrizioneFiliale = descrizioneFiliale;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

	public String getCab() {
		return cab;
	}

	public void setCab(String cab) {
		this.cab = cab;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
