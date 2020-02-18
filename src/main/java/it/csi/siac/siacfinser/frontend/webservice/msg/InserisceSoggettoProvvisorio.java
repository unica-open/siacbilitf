/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Richiesta al metodo FIN.SoggettoService.inserisceSoggettoProvvisorio()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceSoggettoProvvisorio extends InserisceSoggetto {
	public InserisceSoggettoProvvisorio() {
		// Costruttore vuoto
	}
	
	public InserisceSoggettoProvvisorio(InserisceSoggetto is) {
		setEnte(is.getEnte());
		setSoggetto(is.getSoggetto());
		setRichiedente(is.getRichiedente());
		setDataOra(is.getDataOra());
	}
}
