/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacfinser.model.Impegno;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImpegnoAssociatoMutuo extends MovimentoGestioneAssociatoMutuo<Impegno> {

	private static final long serialVersionUID = 398344293280688474L;
	

	public Impegno getImpegno() {
		return getMovimentoGestione();
	}

	public void setImpegno(Impegno impegno) {
		setMovimentoGestione(impegno);
	}


}
