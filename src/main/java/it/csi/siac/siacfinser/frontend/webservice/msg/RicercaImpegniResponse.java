/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;

/**
 * Risposta al metodo FIN.ImpegnoService.ricercaImpegni()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaImpegniResponse extends ServiceResponse {

	private List<Impegno> impegni = new ArrayList<Impegno>();

	public List<Impegno> getImpegni() {
		return impegni;
	}

	public void setImpegni(List<Impegno> impegni) {
		this.impegni = impegni;
	}

}
