/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.business.utility.ElaborazioneEnum;
import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Ambito;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ElaborazioneWrapper {
	
	private ElaborazioneEnum elaborazione;
	private Integer uid;
	private Class<?> classeChiamante;
	private Class<?> classeEntitaInElaborazione; 
	private Ambito ambito;

	public ElaborazioneWrapper() {
	}
	
	public ElaborazioneWrapper(ElaborazioneEnum elaborazione, Integer uid, Class<?> classeChiamante,
			Class<?> classeEntitaInElaborazione, Ambito ambito) {

		this.elaborazione = elaborazione;
		this.uid = uid;
		this.classeChiamante = classeChiamante;
		this.classeEntitaInElaborazione = classeEntitaInElaborazione;
		this.setAmbito(ambito);
	}
	
	public ElaborazioneEnum getElaborazione() {
		return elaborazione;
	}
	public void setElaborazione(ElaborazioneEnum elaborazione) {
		this.elaborazione = elaborazione;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Class<?> getClasseChiamante() {
		return classeChiamante;
	}
	public void setClasseChiamante(Class<?> classeChiamante) {
		this.classeChiamante = classeChiamante;
	}
	public Class<?> getClasseEntitaInElaborazione() {
		return classeEntitaInElaborazione;
	}
	public void setClasseEntitaInElaborazione(Class<?> classeEntitaInElaborazione) {
		this.classeEntitaInElaborazione = classeEntitaInElaborazione;
	}

	public Ambito getAmbito() {
		return ambito;
	}

	public void setAmbito(Ambito ambito) {
		this.ambito = ambito;
	}
}
