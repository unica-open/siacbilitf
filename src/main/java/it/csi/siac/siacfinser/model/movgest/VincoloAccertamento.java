/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.movgest;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.Impegno;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class VincoloAccertamento extends VincoloMovimento {

	private static final long serialVersionUID = 1L;
	
	private Impegno impegno;
    
	public Impegno getImpegno() {
		return impegno;
	}
	
	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

}
