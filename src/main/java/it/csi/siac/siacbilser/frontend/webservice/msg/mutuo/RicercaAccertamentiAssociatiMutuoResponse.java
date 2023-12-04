/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.siacbilser.frontend.webservice.msg.mutuo;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.mutuo.AccertamentoAssociatoMutuo;
import it.csi.siac.siacfinser.model.Accertamento;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaAccertamentiAssociatiMutuoResponse extends RicercaMovimentiGestioneAssociatiMutuoResponse<Accertamento, AccertamentoAssociatoMutuo> {
	
	public void setAccertamentiAssociatiMutuo(List<AccertamentoAssociatoMutuo> listaAccertamentiAssociatiMutuo) {
		setMovimentiAssociati(listaAccertamentiAssociatiMutuo);
	}
	
	@XmlTransient
	public List<AccertamentoAssociatoMutuo> getAccertamentiAssociatiMutuo() {
		return getMovimentiAssociati();
	}
	
}
