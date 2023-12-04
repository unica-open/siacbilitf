/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClassePiano;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class LeggiTreeCodiceBilancio extends ServiceRequest {

	private ClassePiano classePiano;
	private Integer anno;
	private Integer idCodificaPadre;

	/**
	 * @return the classePiano
	 */
	public ClassePiano getClassePiano() {
		return classePiano;
	}

	/**
	 * @param classePiano the classePiano to set
	 */
	public void setClassePiano(ClassePiano classePiano) {
		this.classePiano = classePiano;
	}

	/**
	 * @return the anno
	 */
	public Integer getAnno() {
		return anno;
	}

	/**
	 * @param anno the anno to set
	 */
	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	/**
	 * @return the idCodificaPadre
	 */
	public Integer getIdCodificaPadre() {
		return idCodificaPadre;
	}

	/**
	 * @param idCodificaPadre the idCodificaPadre to set
	 */
	public void setIdCodificaPadre(Integer idCodificaPadre) {
		this.idCodificaPadre = idCodificaPadre;
	}
	
	
	
	
}
