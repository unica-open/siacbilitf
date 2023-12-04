/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.paginazione.ListaPaginata;
import it.csi.siac.siacfinser.model.Impegno;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaImpegniAssociabiliMutuoResponse extends RicercaMovimentiGestioneMutuoResponse<Impegno> {
	
	public void setImpegni(ListaPaginata<Impegno> listaImpegni) {
		setMovimenti(listaImpegni);
	}
	
	@XmlTransient
	public ListaPaginata<Impegno> getImpegni() {
		return getMovimenti();
	}
	
}
