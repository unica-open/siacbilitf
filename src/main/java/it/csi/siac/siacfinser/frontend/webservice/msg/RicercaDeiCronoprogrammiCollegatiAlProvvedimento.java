/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDeiCronoprogrammiCollegatiAlProvvedimento extends ServiceRequest {

	private BigInteger numeroAttoAmm;
	private Integer annoAttoAmm;

	private Integer idTipoProvvedimento;
	private Integer idStrutturaAmministrativoContabile;	
	
	public BigInteger getNumeroAttoAmm() {
		return numeroAttoAmm;
	}

	public void setNumeroAttoAmm(BigInteger numeroAttoAmm) {
		this.numeroAttoAmm = numeroAttoAmm;
	}

	public Integer getAnnoAttoAmm() {
		return annoAttoAmm;
	}

	public void setAnnoAttoAmm(Integer annoAttoAmm) {
		this.annoAttoAmm = annoAttoAmm;
	}

	public Integer getIdTipoProvvedimento() {
		return idTipoProvvedimento;
	}

	public void setIdTipoProvvedimento(Integer idTipoProvvedimento) {
		this.idTipoProvvedimento = idTipoProvvedimento;
	}

	public Integer getIdStrutturaAmministrativoContabile() {
		return idStrutturaAmministrativoContabile;
	}

	public void setIdStrutturaAmministrativoContabile(Integer idStrutturaAmministrativoContabile) {
		this.idStrutturaAmministrativoContabile = idStrutturaAmministrativoContabile;
	}

}
