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
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

/**
 * Risposta al metodo FIN.ImpegnoService.ricercaImpegni()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaSediSecondarieResponse extends ServiceResponse {

	private List<SedeSecondariaSoggetto> sedi = new ArrayList<SedeSecondariaSoggetto>();

	public List<SedeSecondariaSoggetto> getSedi() {
		return sedi;
	}

	public void setSedi(List<SedeSecondariaSoggetto> sedi) {
		this.sedi = sedi;
	}

}
